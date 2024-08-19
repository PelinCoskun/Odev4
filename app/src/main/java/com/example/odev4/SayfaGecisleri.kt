package com.example.odev4

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SayfaGecisleri(){
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = "anasayfa"){
        composable("anasayfa"){
            Anasayfa(navController=navController )
        }
        composable("asayfasi"){
            ASayfasi(navController=navController)
        }
        composable("bsayfasi"){
            BSayfasi(navController=navController )
        }
        composable("xsayfasi"){
            XSayfasi(navController=navController)
        }
        composable("ysayfasi"){
            YSayfasi(navController=navController)
        }

    }


}