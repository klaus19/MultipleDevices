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
import com.example.imagesplash.ui.theme.ImageSplashTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageSplashTheme {
                val windowInfo = rememberWindowInfo()

                if(windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact){
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        SplashScreenCompat()
                    }
                }else if  (windowInfo.screenWidthInfo is WindowInfo.WindowType.Medium){
                     Surface(modifier = Modifier.fillMaxSize(),
                         color = MaterialTheme.colorScheme.background) {
                         SplashScreenMedium()
                     }

                }else {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                       SplashScreenExpanded()

                    }
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