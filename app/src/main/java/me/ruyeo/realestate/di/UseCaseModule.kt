package me.ruyeo.realestate.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.ruyeo.realestate.domain.repository.AuthRepository
import me.ruyeo.realestate.domain.use_case.auth.AuthUseCases
import me.ruyeo.realestate.domain.use_case.auth.LoginUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideAuthUseCase(repository: AuthRepository): AuthUseCases {
        return AuthUseCases(
            loginUseCase = LoginUseCase(repository)
        )
    }

}