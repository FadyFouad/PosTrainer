package com.bracketcove.postrainer.movement

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bracketcove.postrainer.R

class MovementFragmentDirections private constructor() {
    companion object {
        fun actionMovementFragmentToMovementListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_movementFragment_to_movementListFragment)
    }
}
