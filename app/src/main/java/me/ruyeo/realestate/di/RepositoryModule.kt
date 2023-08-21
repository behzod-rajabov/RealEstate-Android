package me.ruyeo.realestate.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.ruyeo.realestate.data.remote.ApiService
import me.ruyeo.realestate.data.remote.repository.AuthRepositoryImpl
import me.ruyeo.realestate.domain.repository.AuthRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideLoginRepository(apiService: ApiService): AuthRepository {
        return AuthRepositoryImpl(apiService)
    }

}