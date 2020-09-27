package com.example.android_example_4

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminderTable")
    suspend fun getAllReminders(): LiveData<List<Reminder>>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)

}


