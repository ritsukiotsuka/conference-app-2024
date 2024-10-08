package io.github.droidkaigi.confsched.testing.data.auth

import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import io.github.droidkaigi.confsched.data.auth.AuthApi
import io.github.droidkaigi.confsched.data.di.AuthApiModule
import javax.inject.Singleton

@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [AuthApiModule::class],
)
@Module
class FakeAuthApiModule {
    @Provides
    @Singleton
    fun provideAuthApi(): AuthApi {
        return FakeAuthApi()
    }
}
