package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard : Keyboard
    @Inject
    lateinit var monitor : Mouse
    @Inject
    lateinit var mouse : Monitor

    init {
        DaggerNewComponent.create().inject(this)
    }

}