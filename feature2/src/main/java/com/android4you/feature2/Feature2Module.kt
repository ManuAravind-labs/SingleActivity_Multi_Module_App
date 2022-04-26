package com.android4you.feature2

import com.android4you.core.Screen2RouteContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Feature2Module {

    @Singleton
    @Provides
    fun providesFeature2RouteContract(): Screen2RouteContract = Feature2RouteContractImpl()
}
