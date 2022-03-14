package com.kartikeya.triviaapp.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

import com.kartikeya.triviaapp.component.Questions

@Composable
fun TriviaHome(viewModel: QuestionsViewModel= hiltViewModel()){
    Questions(viewModel)
}