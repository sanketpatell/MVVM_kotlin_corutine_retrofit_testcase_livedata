package com.example.rickandmorty.data.remote

import com.example.rickandmorty.data.entities.Character
import com.example.rickandmorty.data.entities.CharacterList
import com.example.rickandmorty.data.entities.SensorList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    @GET("character")
    suspend fun getAllCharacters() : Response<CharacterList>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<Character>

    @GET("sensornames")
    suspend fun getAllSensorNames() : Response<SensorList>
}