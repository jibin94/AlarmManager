## Alarm Manager
An Android application for scheduling, managing, and receiving alarms with a clean architecture approach.

## Project Structure

alarmmanager/
├── alarm/
│   ├── AlarmScheduler          # Interface for scheduling alarms
│   └── AlarmSchedulerImpl      # Implementation of the alarm scheduling logic
├── data/
│   ├── repository/
│   │   ├── AlarmRepository     # Interface for alarm data operations
│   │   └── AlarmRepositoryImpl # Implementation of alarm data repository
│   └── sources/
│       ├── local/
│       │   ├── Alarm           # Local data model for alarms
│       │   ├── AlarmDao        # Data Access Object for database operations
│       │   └── AlarmDatabase   # Database configuration for alarms
├── di/
│   └── DatabaseModule          # Dependency injection module for database
├── receiver/
│   └── AlarmReceiver           # Broadcast receiver for alarm events
├── ui/
│   └── main/
│       ├── AlarmActivity           # Main activity for displaying alarms
│       ├── AlarmActivityViewModel  # ViewModel for the main activity
│       ├── AlarmItemAdapter        # Adapter for displaying alarm items in RecyclerView
│       └── SwipeItemHelper         # Helper for swipe actions on alarm items
└── utils/
    ├── Constants               # App-wide constants
    └── Event                   # Event wrapper class for LiveData
└── AlarmApp                    # Application class

## Features
* Schedule and manage alarms
* Store and display scheduled alarms in a RecyclerView with Room Database for persistence.
* Trigger a notification when the current time matches a scheduled alarm.



