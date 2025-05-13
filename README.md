## Alarm Manager
An Android application for scheduling, managing, and receiving alarms with a clean architecture approach.

## Project Structure
```
alarmmanager/
├── alarm/
│   ├── AlarmScheduler              # Interface for scheduling and managing alarms
│   └── AlarmSchedulerImpl          # Implementation using Android's AlarmManager to set/cancel alarms
│
├── data/
│   ├── repository/
│   │   ├── AlarmRepository         # Interface for alarm data operations (insert, delete, fetch)
│   │   └── AlarmRepositoryImpl     # Implementation interacting with the local data source
│   │
│   └── sources/
│       └── local/
│           ├── Alarm              # Room Entity representing an alarm
│           ├── AlarmDao           # DAO interface with methods for DB access
│           └── AlarmDatabase      # Room database setup providing DAO instance
│
├── di/
│   └── DatabaseModule              # DI module to provide DB and DAO via Hilt
│
├── receiver/
│   └── AlarmReceiver               # BroadcastReceiver triggered when alarm fires
│
├── ui/
│   └── main/
│       ├── AlarmActivity               # Activity to display and manage alarms
│       ├── AlarmActivityViewModel      # ViewModel holding LiveData and UI logic
│       ├── AlarmItemAdapter            # Adapter to bind alarm data to RecyclerView
│       └── SwipeItemHelper             # Enables swipe gestures on alarm list
│
├── utils/
│   ├── Constants                   # Global constants
│   └── Event                       # Wrapper for LiveData one-time events
│
└── AlarmApp                        # Application class for global setup (e.g., DI init)
```

## Features
* Schedule and manage alarms
* Store and display scheduled alarms in a RecyclerView with Room Database for persistence.
* Trigger a notification when the current time matches a scheduled alarm.



