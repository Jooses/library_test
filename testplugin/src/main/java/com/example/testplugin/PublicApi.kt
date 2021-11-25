package com.example.testplugin

object PublicApi {

    internal var name: String? = null

    fun updateDefaultName() {
        name = "Default"
    }

    fun someMethod() {
        var a = 5
    }

    enum class NameType {
        SHORT,
        LONG
    }
}