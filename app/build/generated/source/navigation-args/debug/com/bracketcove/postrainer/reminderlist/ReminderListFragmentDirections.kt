package com.bracketcove.postrainer.reminderlist

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bracketcove.postrainer.R
import kotlin.Int
import kotlin.String

class ReminderListFragmentDirections private constructor() {
    private data class ActionReminderListFragmentToReminderDetailFragment(val reminderId: String =
            "\"\"") : NavDirections {
        override fun getActionId(): Int = R.id.action_reminderListFragment_to_reminderDetailFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("reminderId", this.reminderId)
            return result
        }
    }

    companion object {
        fun actionReminderListFragmentToReminderDetailFragment(reminderId: String = "\"\""):
                NavDirections = ActionReminderListFragmentToReminderDetailFragment(reminderId)

        fun actionReminderListFragmentToMovementListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_reminderListFragment_to_movementListFragment)

        fun actionReminderListFragmentToSettingsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_reminderListFragment_to_settingsFragment)
    }
}
