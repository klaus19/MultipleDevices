package com.example.imagesplash


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.imagesplash.constants.Destinations


@Composable
fun OnBoardingScreen1(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        // Image at the top-left corner
        Image(
            painter = painterResource(id = R.drawable.heart),
            contentDescription = null,
            modifier = Modifier
                .height(128.dp)
                .width(128.dp)
                .padding(start = 16.dp, top = 16.dp),
            contentScale = ContentScale.Crop
        )

        // Add bold text below the image
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Welcome",
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp,
            modifier = Modifier.padding(start = 28.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Thank you for participating in the Mayo Clinic ECG study",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 28.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "The next few screens offer more information about the study",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 28.dp)
        )


    }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth().padding(20.dp)){
        // Spacer to push the button to the bottom
        Spacer(modifier = Modifier.weight(1f))

        // Button centered at the bottom
        Button(
            onClick = {
               navController.navigate(Destinations.onboardingScreen2)
            },
            modifier = Modifier
                .width(120.dp)
                .padding(top = 50.dp, bottom = 40.dp)
                .height(50.dp),
            shape = RoundedCornerShape(percent = 50),
            colors = ButtonDefaults.buttonColors(Color(0xFF039be5))
        ) {
            Text(text = "Next", fontWeight = FontWeight.Bold, style = TextStyle(Color.White))
        }

    }
}
