package com.jibin.alarmmanager.di

import android.content.Context
import androidx.room.Room
import com.jibin.alarmmanager.data.repository.AlarmRepositoryImpl
import com.jibin.alarmmanager.data.repository.AlarmRepository
import com.jibin.alarmmanager.data.sources.local.AlarmDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AlarmDatabase {
        return Room.databaseBuilder(
            context,
            AlarmDatabase::class.java,
            "alarmDB"
        ).build()
    }

    @Singleton
    @Provides
    fun getRepositoryImpl(alarmDatabase: AlarmDatabase): AlarmRepository {
        return AlarmRepositoryImpl(alarmDatabase)
    }
}


