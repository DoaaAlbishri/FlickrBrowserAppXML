package com.example.flickrbrowserappxml

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import java.io.Serializable

@Root(name = "rsp", strict = false)
class Rsp constructor() : Serializable {
    @field:Element(name = "photos" , required = false)
    var photos: Photos? = null
}