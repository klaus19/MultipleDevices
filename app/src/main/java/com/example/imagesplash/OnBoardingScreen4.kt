package com.example.imagesplash

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
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
import kotlinx.coroutines.launch


@Composable
fun OnBoardingScreen4(navController: NavController) {

    var showDialog by remember { mutableStateOf(false) }
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
            text = "Notifications",
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp,
            modifier = Modifier.padding(start = 28.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "As part of using app for the research study,you can record ECGs whenever you want.If you's like , you can enable notifications and you will be notified every two weeks if you have not taken an ECGin that timeframe.",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 28.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "You can manage these notifications in Settings.",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 28.dp)
        )


    }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)){
        // Spacer to push the button to the bottom
        Spacer(modifier = Modifier.weight(1f))

        // Button centered at the bottom
        Button(
            onClick = {
                      showDialog=true

            },
            modifier = Modifier
                .width(120.dp)
                .padding(top = 50.dp, bottom = 40.dp)
                .height(50.dp),
            shape = RoundedCornerShape(percent = 50),
            colors = ButtonDefaults.buttonColors(Color(0xFF039be5))
        ) {
            Text(text = "Next", fontWeight = FontWeight.Bold, style = TextStyle(Color.White))
            // Error dialog
            if (showDialog) {
                AlertDialog(
                    onDismissRequest = { showDialog = false },
                    title = { Text(text = "Mayo Clinic Would Like to Send You Notifications.") },
                    text = { Text(text = "Notifications may include alerts,sounds and icon badges. These can be configured in Settings") },
                    confirmButton = {
                          Text(text = "Don't Allow", modifier = Modifier.clickable { showDialog=true })
                        },
                    dismissButton = {
                        Text(text = "Allow", modifier = Modifier.clickable { showDialog=false })
                    }

                )
            }
        }
        }

    }

