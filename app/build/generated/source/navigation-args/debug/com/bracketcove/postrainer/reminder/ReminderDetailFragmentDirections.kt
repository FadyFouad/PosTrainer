package com.bracketcove.postrainer.reminder

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bracketcove.postrainer.R

class ReminderDetailFragmentDirections private constructor() {
    companion object {
        fun actionReminderDetailFragmentToReminderListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_reminderDetailFragment_to_reminderListFragment)
    }
}
