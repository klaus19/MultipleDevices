package com.example.imagesplash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.imagesplash.constants.Destinations
import com.example.imagesplash.navigation.NavDestinations
import com.example.imagesplash.ui.theme.ImageSplashTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageSplashTheme {
                val navController = rememberNavController()
                val windowInfo = rememberWindowInfo()

                val content = when (windowInfo.screenWidthInfo) {
                    is WindowInfo.WindowType.Compact -> Destinations.SplashScreenCompat
                    is WindowInfo.WindowType.Medium -> Destinations.SplashScreenCompat
                    else ->Destinations.SplashScreenCompat
                }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    NavDestinations(navController, content)
                }

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ImageSplashTheme {

    }
}