package com.example.flickrbrowserappxml

import com.google.gson.annotations.SerializedName
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import java.io.Serializable

@Root(name = "photo", strict = false)
class Photo @JvmOverloads constructor(
    @field:Element(name = "secret" , required = false)
    @param:Element(name = "secret")
    var secret: String? = null,

    @field:Element(name = "server" , required = false)
    @param:Element(name = "server")
    var server: String? = null,

    @field:Element(name = "id" , required = false)
    @param:Element(name = "id")
    var id: String? = null,

    @field:Element(name = "title" , required = false)
    @param:Element(name = "title")
    var title: String? = null,

    @field:Element(name = "farm" , required = false)
    @param:Element(name = "farm")
    var farm: String? = null,

) : Serializable {


}