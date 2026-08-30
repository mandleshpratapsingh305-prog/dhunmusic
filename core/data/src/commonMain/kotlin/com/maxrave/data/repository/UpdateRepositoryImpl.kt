package com.maxrave.data.repository

import com.maxrave.domain.data.model.update.UpdateData
import com.maxrave.domain.repository.UpdateRepository
import com.maxrave.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

internal class UpdateRepositoryImpl : UpdateRepository {
    override fun checkForGithubReleaseUpdate(): Flow<Resource<UpdateData>> = flow<Resource<UpdateData>> {
        // Disabled: No update check
    }.flowOn(Dispatchers.IO)

    override fun checkForFdroidUpdate(): Flow<Resource<UpdateData>> = flow<Resource<UpdateData>> {
        // Disabled: No update check
    }.flowOn(Dispatchers.IO)
}