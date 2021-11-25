package com.example.testlibrary

import com.example.testplugin.PublicApi

class TestLibrary {

    fun test() {
        PublicApi.INSTANCE.someMethod()
    }
}