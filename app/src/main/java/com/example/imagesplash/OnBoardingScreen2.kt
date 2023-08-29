package com.example.imagesplash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
fun OnBoardingScreen2(navController: NavController) {
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
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        // Image at the top-left corner
        Image(
            painter = painterResource(id = R.drawable.lock),
            contentDescription = null,
            modifier = Modifier
                .height(128.dp)
                .width(128.dp)
                .padding(start = 16.dp, top = 16.dp),
            contentScale = ContentScale.Crop
        )

        // Add bold text below the image
        Spacer(modifier = Modifier.height(5.dp))
        Column(
            horizontalAlignment = Alignment.Start, // Align the text to the left
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Text(
                text = "Privacy",
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Data privacy is very important to Mayo Clinic. During the study,your ECGs will be transferred securely to Mayo clinic and stored safely behind the Mayo Clinic firewall.This means your data is protected and secured within Mayo clinic's digital network.The ECGs will be placed in your medical record accessible to your healthcare team. The data collected for this research study may also be used for future research.Any information shared will not be linked to you.Groups or individuals who receive information will not receive any information that could somehow identify you. \n\n If the results of this study are made public (for example, through scientific meetings, reports,or media),information that identifies you will not be used.",
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
                navController.navigate(Destinations.onboardingScreen3)
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
