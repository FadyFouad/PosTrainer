package com.bracketcove.postrainer.reminder

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class ReminderDetailFragmentArgs(val reminderId: String = "\"\"") : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("reminderId", this.reminderId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): ReminderDetailFragmentArgs {
            bundle.setClassLoader(ReminderDetailFragmentArgs::class.java.classLoader)
            val __reminderId : String?
            if (bundle.containsKey("reminderId")) {
                __reminderId = bundle.getString("reminderId")
                if (__reminderId == null) {
                    throw IllegalArgumentException("Argument \"reminderId\" is marked as non-null but was passed a null value.")
                }
            } else {
                __reminderId = "\"\""
            }
            return ReminderDetailFragmentArgs(__reminderId)
        }
    }
}
