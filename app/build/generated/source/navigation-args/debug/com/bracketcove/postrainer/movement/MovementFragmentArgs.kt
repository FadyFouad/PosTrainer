package com.bracketcove.postrainer.movement

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class MovementFragmentArgs(val movementId: String = "\"\"") : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("movementId", this.movementId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): MovementFragmentArgs {
            bundle.setClassLoader(MovementFragmentArgs::class.java.classLoader)
            val __movementId : String?
            if (bundle.containsKey("movementId")) {
                __movementId = bundle.getString("movementId")
                if (__movementId == null) {
                    throw IllegalArgumentException("Argument \"movementId\" is marked as non-null but was passed a null value.")
                }
            } else {
                __movementId = "\"\""
            }
            return MovementFragmentArgs(__movementId)
        }
    }
}
