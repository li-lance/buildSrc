package com.fate.buildsrc

/**
 * Author：lilingzhang on 2020/5/15 15:31
 * email：foryun@live.com
 */

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project

val Project.android: BaseExtension
    get() = project.extensions.getByName("android") as BaseExtension