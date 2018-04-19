1. cannot access cache (Build: Sync)
    Kotlin DSL?
    -> use kotlin base project HelloWorld
    
2. weird dependency warning and errors with incompatible jars

    -> use   compile "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
             compile "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
       in build.gradle

3. tests pass even though they should not when iterating
    -> make sure the label of "it" is UNIQUE
        as it is compiled into a closure, that is then cached.
