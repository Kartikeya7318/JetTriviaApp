package com.kartikeya.triviaapp.di

import com.kartikeya.triviaapp.network.QuestionApi
import com.kartikeya.triviaapp.repository.QuestionRepository
import com.kartikeya.triviaapp.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideQuestionApi(): QuestionApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuestionApi::class.java)

    }

    @Singleton
    @Provides
    fun provideQuestionRepository(api: QuestionApi)=QuestionRepository(api)

    // can also be done like this
//    fun provideQuestionRepository(api: QuestionApi): QuestionRepository{
//        return QuestionRepository(api)
//    }
}