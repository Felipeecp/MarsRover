package com.luiz.marsrover

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.luiz.marsrover.ui.theme.MarsRoverTheme
import com.luiz.marsrover.view.RoverList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarsRoverTheme {
                RoverList()
            }
        }
    }
}