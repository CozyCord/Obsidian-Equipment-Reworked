import gg.meza.stonecraft.mod

plugins {
    id("gg.meza.stonecraft")
}

modSettings {
    val useIdField = compareMcVersions(mod.minecraftVersion, "1.21") >= 0
    variableReplacements.put("itemIdentifier", if (useIdField) "id" else "item")
    variableReplacements.put("cookingResultOpen", if (useIdField) "{\"id\": " else "")
    variableReplacements.put("cookingResultClose", if (useIdField) "}" else "")
    val useBareIngredient = compareMcVersions(mod.minecraftVersion, "1.21.2") >= 0
    variableReplacements.put("ingOpen", if (useBareIngredient) "" else "{\"item\": ")
    variableReplacements.put("ingClose", if (useBareIngredient) "" else "}")
}

fun compareMcVersions(a: String, b: String): Int {
    val pa = a.split(".").map { it.toIntOrNull() ?: 0 }
    val pb = b.split(".").map { it.toIntOrNull() ?: 0 }
    val len = maxOf(pa.size, pb.size)
    for (i in 0 until len) {
        val x = pa.getOrElse(i) { 0 }
        val y = pb.getOrElse(i) { 0 }
        if (x != y) return x.compareTo(y)
    }
    return 0
}

repositories {
    mavenCentral()
}

dependencies {
    if (mod.isFabric) {
        modImplementation("net.fabricmc.fabric-api:fabric-api:${mod.prop("fabric_version")}")
    }
}

sourceSets {
    main {
        resources {
            srcDir("src/main/resources")
        }
    }
}

tasks.processResources {
    doLast {
        val versionDataDir = file("src/main/resources/data")
        if (versionDataDir.exists() && versionDataDir.isDirectory) {
            copy {
                from(versionDataDir)
                into(layout.buildDirectory.dir("resources/main/data"))
            }
        }
    }
}
