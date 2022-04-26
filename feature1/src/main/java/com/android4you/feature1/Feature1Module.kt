package com.android4you.feature1

import com.android4you.core.Screen1RouteContract
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Feature1Module {

    @Singleton
    @Provides
    fun providesFeatureARouteContract(): Screen1RouteContract = Feature1RouteContractImpl()
}
