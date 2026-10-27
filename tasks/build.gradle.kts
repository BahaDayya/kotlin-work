plugins { kotlin("jvm") version "2.4.10" }

repositories { mavenCentral() }

dependencies {
    implementation(libs.datetime.jvm)
    implementation(libs.mordant)
}

kotlin {
    val modules = rootDir.walkTopDown().maxDepth(3)
        .filter { it.isDirectory && File(it, "module.yaml").exists() }
        .toList()

    modules.forEach { m ->
        sourceSets["main"].kotlin.srcDir(File(m, "src"))
        if (File(m, "test").exists()) sourceSets["test"].kotlin.srcDir(File(m, "test"))
    }
}
