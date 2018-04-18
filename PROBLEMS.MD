1. cannot access cache (Build: Sync)
    Kotlin DSL?
    -> use kotlin base project HelloWorld
    
2. weird dependency warning and errors with incompatible jars

    -> use   compile "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
             compile "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
       in build.gradle
