package vn.sunasterisk.themoviedb.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import vn.sunasterisk.themoviedb.ui.screen.main.MainViewModel

val ViewModelModule = module {
    viewModel { MainViewModel() }
}