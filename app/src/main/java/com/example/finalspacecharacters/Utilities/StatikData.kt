package com.example.finalspacecharacters.Utilities

import com.example.finalspacecharacters.DataKarakterItem

class StatikData {

    companion object{
        var abilities: List<Any> = listOf()
        var alias: List<Any> = listOf()
        var gender: String = ""
        var hair: String = ""
        var id: Int? = null
        var img_url: String = ""
        var name: String = ""
        var origin: String = ""
        var species: String= ""
        var status: String = ""

        fun fill (karakter : DataKarakterItem){
            abilities = karakter.abilities
            alias = karakter.alias
            gender = karakter.gender
            hair = karakter.hair
            id = karakter.id
            img_url = karakter.img_url
            name = karakter.name
            origin = karakter.origin
            species = karakter.species
            status = karakter.status

        }
    }
}