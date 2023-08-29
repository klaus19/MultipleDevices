package com.example.imagesplash.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.imagesplash.OnBoardingScreen1
import com.example.imagesplash.OnBoardingScreen2
import com.example.imagesplash.OnBoardingScreen3
import com.example.imagesplash.OnBoardingScreen4
import com.example.imagesplash.SplashScreenCompat
import com.example.imagesplash.constants.Destinations


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavDestinations(navController: NavController,initalDestination:String){
    val navController = rememberNavController()

    Scaffold {
        NavHost(navController = navController, startDestination = initalDestination){

            composable(Destinations.SplashScreenCompat){
                SplashScreenCompat(navController)
            }
            composable(Destinations.onBoardingScreen1){
                OnBoardingScreen1(navController)
            }
            composable(Destinations.onboardingScreen2){
                OnBoardingScreen2(navController)
            }
            composable(Destinations.onboardingScreen3){
                OnBoardingScreen3(navController)
            }
            composable(Destinations.onboardingScreen4){
                OnBoardingScreen4(navController)
            }

        }
    }



}