package com.example.imagesplash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
fun OnBoardingScreen3(navController: NavController) {
    // Add bold text below the image
    Spacer(modifier = Modifier.height(5.dp))
    Column(
        horizontalAlignment = Alignment.Start, // Align the text to the left
        modifier = Modifier.padding(start = 8.dp)
    ){
        // Back icon at the top-left corner
        IconButton(
            onClick = {
                navController.popBackStack()
            },
            modifier = Modifier.padding(start = 8.dp, top = 8.dp)
        ) {
            // You can use any icon you like for the back button
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null, tint = Color(0xFF039be5))
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(top = 36.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        // Image at the top-left corner
        Image(
            painter = painterResource(id = R.drawable.mobile),
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .padding(start = 16.dp, top = 16.dp),
            contentScale = ContentScale.Crop
        )

        // Add bold text below the image
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            horizontalAlignment = Alignment.Start, // Align the text to the left
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Text(
                text = "Risks",
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "There are minimal risks involved in the recording and sharing of your ECGs from your Apple Watch with Mayo Clinic.Mayo Clinic exceeds industry standards for safeguarding patient information. \n \nWhile your ECGs will be sent to your medical record and available for your care team to review, your ECGs will not be reviewed to assess your health as part of this study. The study team is reviewing the quality of recordings and not offering medical advice or support. If you have questions about your ECGs,please contact your care team for medical attention and advice.",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
            )
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        // Spacer to push the button to the bottom
        Spacer(modifier = Modifier.weight(1f))

        // Button centered at the bottom
        Button(
            onClick = {
                 navController.navigate(Destinations.onboardingScreen4)
            },
            modifier = Modifier
                .width(120.dp)
                .padding(top = 40.dp, bottom = 40.dp)
                .height(50.dp),
            shape = RoundedCornerShape(percent = 50),
            colors = ButtonDefaults.buttonColors(Color(0xFF039be5))
        ) {
            Text(text = "Next", fontWeight = FontWeight.Bold, style = TextStyle(Color.White))
        }
    }
}
