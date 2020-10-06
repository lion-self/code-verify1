package com.github.lion-self.codeverify1.services

import com.intellij.openapi.project.Project
import com.github.lion-self.codeverify1.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
