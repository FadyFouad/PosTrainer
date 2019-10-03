package com.bracketcove.postrainer.movementlist

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bracketcove.postrainer.R
import kotlin.Int
import kotlin.String

class MovementListFragmentDirections private constructor() {
    private data class ActionMovementListFragmentToMovementFragment(val movementId: String = "\"\"")
            : NavDirections {
        override fun getActionId(): Int = R.id.action_movementListFragment_to_movementFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("movementId", this.movementId)
            return result
        }
    }

    companion object {
        fun actionMovementListFragmentToReminderListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_movementListFragment_to_reminderListFragment)

        fun actionMovementListFragmentToMovementFragment(movementId: String = "\"\""): NavDirections
                = ActionMovementListFragmentToMovementFragment(movementId)

        fun actionMovementListFragmentToSettingsFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_movementListFragment_to_settingsFragment)
    }
}
