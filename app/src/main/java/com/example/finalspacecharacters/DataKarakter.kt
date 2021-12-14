package com.example.finalspacecharacters
class DataKarakter : ArrayList<DataKarakterItem>()

data class DataKarakterItem(
    val abilities: List<Any>,
    val alias: List<Any>,
    val gender: String,
    val hair: String,
    val id: Int,
    val img_url: String,
    val name: String,
    val origin: String,
    val species: String,
    val status: String
)
