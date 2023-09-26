package net.simplifiedcoding.ui.landing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import net.simplifiedcoding.navigation.ROUTE_PROVIDER
import net.simplifiedcoding.navigation.ROUTE_VIEWER
import net.simplifiedcoding.ui.auth.AuthViewModel


@Composable
fun LandingScreen(viewModel: AuthViewModel?, navController: NavHostController) {


//TWO BUTTONS

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {

            //color = MaterialTheme.colorScheme.onSurface

        }


        val services = LocalContext.current

        Button(
            onClick = {

              navController.navigate(ROUTE_VIEWER)
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)

        ) {
            Text(text = "Available Services")
        }

        //button two
        val provide = LocalContext.current

        Button(
            onClick = {

                navController.navigate(ROUTE_PROVIDER)

            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)

        ) {
            Text(text = "Upload your service")
        }




    }

}