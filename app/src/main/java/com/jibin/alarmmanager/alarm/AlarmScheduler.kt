package com.jibin.alarmmanager.alarm

import com.jibin.alarmmanager.data.sources.local.Alarm

interface AlarmScheduler {

    fun schedule(alarm: Alarm)
    fun cancel(alarm: Alarm)
}