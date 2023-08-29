package com.example.imagesplash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.imagesplash.constants.Destinations


@Composable
fun SplashScreenCompat(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Image(painter = painterResource(id = R.drawable.what), contentDescription ="Mayo Icon",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(96.dp)
                .padding(16.dp)
        )
        Spacer(modifier = Modifier.height(36.dp))
        Image(painter = painterResource(id = R.drawable.what), contentDescription ="Mayo Image",
            contentScale = ContentScale.FillBounds, modifier = Modifier
                .fillMaxWidth()
                .height(250.dp))
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = {
                    navController.navigate(Destinations.onBoardingScreen1)

            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 20.dp),
            shape = RoundedCornerShape(percent = 50),
            colors = ButtonDefaults.buttonColors(Color(0xFF039be5))
        ) {
            Text(text = "Get Started", fontWeight = FontWeight.Bold, style = TextStyle(Color.White))


        }
    }


}