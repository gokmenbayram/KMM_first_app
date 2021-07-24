package com.kmm_first_project

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}