package com.nao20010128nao.LobiNotifier

import org.gradle.api.Project
import org.gradle.internal.reflect.Instantiator

/**
 * Created by nao on 2017/02/03.
 */
class LobiConfiguration {
    Project project

    LobiConfiguration(Instantiator instantiator, Project project) {
        this.project = project
    }


    LoginInfo login=new LoginInfo()

    LoginInfo login(Closure closure){
        login=new LoginInfo()
        project.configure(login,closure)
        return login
    }

    PostInfo post=new PostInfo()

    PostInfo post(Closure closure){
        post=new PostInfo()
        project.configure(post,closure)
        return post
    }
}