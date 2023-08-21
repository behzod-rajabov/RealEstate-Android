package me.ruyeo.realestate.domain.use_case.auth

import kotlinx.coroutines.flow.Flow
import me.ruyeo.realestate.domain.repository.AuthRepository
import me.ruyeo.realestate.utils.UiStateObject

class LoginUseCase(
    val repository: AuthRepository
) {
   /* operator fun invoke(): Flow<UiStateObject<User>> {
        return repository.getGroups()
    }*/
}