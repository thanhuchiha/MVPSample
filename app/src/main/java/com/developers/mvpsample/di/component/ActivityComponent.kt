package com.developers.mvpsample.di.component

import com.developers.mvpsample.di.PerActivity
import com.developers.mvpsample.di.module.ActivityModule
import com.developers.mvpsample.ui.main.MainActivity
import dagger.Component

@PerActivity
@Component(modules = arrayOf(ActivityModule::class),
        dependencies = arrayOf(AppComponent::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}