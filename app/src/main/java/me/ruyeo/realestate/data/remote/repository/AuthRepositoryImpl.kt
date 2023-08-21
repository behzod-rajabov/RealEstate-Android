package me.ruyeo.realestate.data.remote.repository

import me.ruyeo.realestate.data.remote.ApiService
import me.ruyeo.realestate.domain.repository.AuthRepository

class AuthRepositoryImpl(
    private val apiService: ApiService
): AuthRepository {
}