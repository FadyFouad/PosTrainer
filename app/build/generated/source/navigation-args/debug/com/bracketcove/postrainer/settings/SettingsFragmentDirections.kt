package com.bracketcove.postrainer.settings

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bracketcove.postrainer.R

class SettingsFragmentDirections private constructor() {
    companion object {
        fun actionSettingsFragmentToReminderListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_settingsFragment_to_reminderListFragment)

        fun actionSettingsFragmentToMovementListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_settingsFragment_to_movementListFragment)
    }
}
