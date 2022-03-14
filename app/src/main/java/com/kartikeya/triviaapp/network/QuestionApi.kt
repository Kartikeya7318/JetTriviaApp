package com.kartikeya.triviaapp.network

import com.kartikeya.triviaapp.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): Question

}