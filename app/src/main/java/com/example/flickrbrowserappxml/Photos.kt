package com.example.flickrbrowserappxml

import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root
import java.io.Serializable


@Root(name = "photos", strict = false)
class Photos constructor() : Serializable   {
    @field:ElementList(inline = true, name = "photo" , required = false)
    var photo: List<Photo>? = null
}