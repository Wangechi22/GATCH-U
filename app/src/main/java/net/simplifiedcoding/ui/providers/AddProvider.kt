package net.simplifiedcoding.ui.providers

import androidx.navigation.NavController


import android.annotation.SuppressLint
import android.content.Context
import android.text.TextUtils
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore

import net.simplifiedcoding.Provider
import net.simplifiedcoding.ui.auth.AuthViewModel



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Providerscreen(viewModel: AuthViewModel, navController: NavController){

    Surface(
        // on below line we are specifying modifier and color for our app
        modifier = Modifier.fillMaxSize(),
    ) {
        // on the below line we are specifying the theme as the scaffold.
        Scaffold(
            // in scaffold we are specifying the top bar.
            topBar = {
                // inside top bar we are specifying background color.
                SmallTopAppBar(
                    // along with that we are specifying
                    // title for our top bar.
                    title = {
                        // in the top bar we are
                        // specifying tile as a text
                        Text(
                            // on below line we are specifying
                            // text to display in top app bar
                            text = "As a Service Provider, fill in the following spaces",
                            // on below line we are specifying
                            // modifier to fill max width
                            modifier = Modifier.fillMaxWidth(),
                            // on below line we are
                            // specifying text alignment
                            textAlign = TextAlign.Center,
                            // on below line we are specifying
                            // color for our text.
                            color = Color.White
                        )
                    })
            }) {
            // on below line we are calling
            // method to display UI
            firebaseUI(LocalContext.current)
        }
    }



}






@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun firebaseUI(context: Context) {

    // on below line creating variable for course name,
    // course duration and course description.
    val name = remember {
        mutableStateOf("")
    }

    val location= remember {
        mutableStateOf("")
    }

    val phonenumber = remember {
        mutableStateOf("")
    }
    val occupation = remember {
        mutableStateOf("")
    }
    val servicefee = remember {
        mutableStateOf("")
    }


    // on below line creating a column
    // to display our retrieved image view.
    Column(
        // adding modifier for our column
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.White),
        // on below line adding vertical and
        // horizontal alignment for column.
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {


        TextField(
            // on below line we are specifying
            // value for our course name text field.
            value = name.value,

            // on below line we are adding on
            // value change for text field.
            onValueChange = { name.value = it },

            // on below line we are adding place holder
            // as text as "Enter your course name"
            placeholder = { Text(text = "Enter your full names ") },

            // on below line we are adding modifier to it
            // and adding padding to it and filling max width
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),

            // on below line we are adding text style
            // specifying color and font size to it.
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),

            // on below line we are adding
            // single line to it.
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            // on below line we are specifying
            // value for our course duration text field.
            value = location.value,

            // on below line we are adding on
            // value change for text field.
            onValueChange = { location.value = it },

            // on below line we are adding place holder
            // as text as "Enter your course duration"
            placeholder = { Text(text = "Enter your location") },

            // on below line we are adding modifier to it
            // and adding padding to it and filling max width
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),

            // on below line we are adding text style
            // specifying color and font size to it.
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),

            // on below line we are adding
            // single line to it.
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            // on below line we are specifying
            // value for our course description text field.
            value = phonenumber.value,

            // on below line we are adding on
            // value change for text field.
            onValueChange = { phonenumber.value = it },

            // on below line we are adding place holder
            // as text as "Enter your course description"
            placeholder = { Text(text = "Enter your phone number") },

            // on below line we are adding modifier to it
            // and adding padding to it and filling max width
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),

            // on below line we are adding text style
            // specifying color and font size to it.
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),

            // on below line we are adding
            // single line to it.
            singleLine = true,
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            // on below line we are specifying
            // value for our course duration text field.
            value = occupation.value,

            // on below line we are adding on
            // value change for text field.
            onValueChange = { occupation.value = it },

            // on below line we are adding place holder
            // as text as "Enter your course duration"
            placeholder = { Text(text = "Enter your occupation") },

            // on below line we are adding modifier to it
            // and adding padding to it and filling max width
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),

            // on below line we are adding text style
            // specifying color and font size to it.
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),

            // on below line we are adding
            // single line to it.
            singleLine = true,
        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            // on below line we are specifying
            // value for our course duration text field.
            value = servicefee.value,

            // on below line we are adding on
            // value change for text field.
            onValueChange = { servicefee.value = it },

            // on below line we are adding place holder
            // as text as "Enter your course duration"
            placeholder = { Text(text = "Enter your service fee per hour") },

            // on below line we are adding modifier to it
            // and adding padding to it and filling max width
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),

            // on below line we are adding text style
            // specifying color and font size to it.
            textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),

            // on below line we are adding
            // single line to it.
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))

        // on below line creating button to
        // add data to firebase firestore database.
        Button(
            onClick = {
                // on below line we are validating user input parameters.
                if (TextUtils.isEmpty(name.value.toString())) {
                    Toast.makeText(context, "Enter your full names", Toast.LENGTH_SHORT).show()
                } else if (TextUtils.isEmpty(location.value.toString())) {
                    Toast.makeText(context, "Your location is $location" , Toast.LENGTH_SHORT)
                        .show()
                } else if (TextUtils.isEmpty(phonenumber.value.toString())) {
                    Toast.makeText(context, "Enter your phone number", Toast.LENGTH_SHORT)
                        .show()
                }else if (TextUtils.isEmpty(occupation.value.toString())) {
                    Toast.makeText(context, "Enter your occupation", Toast.LENGTH_SHORT)
                        .show()
                }else if (TextUtils.isEmpty(servicefee.value.toString())) {
                    Toast.makeText(context, "Enter your service fee per hour", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    // on below line adding data to
                    // firebase firestore database.
                    addDataToFirebase(
                        name.value,
                        location.value,
                        phonenumber.value,
                        occupation .value,
                        servicefee.value,
                        context
                    )
                }
            },
            // on below line we are
            // adding modifier to our button.
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // on below line we are adding text for our button
            Text(text = "Upload Information", modifier = Modifier.padding(8.dp))
        }


    }
}

fun addDataToFirebase(
    name: String,
    location: String,
   phonenumber: String,
    occupation: String,
    servicefee: String,
    context: Context
) {
    // on below line creating an instance of firebase firestore.
    val db: FirebaseFirestore = FirebaseFirestore.getInstance()
    //creating a collection reference for our Firebase Firestore database.
    val dbCourses: CollectionReference = db.collection("Providers")
    //adding our data to our courses object class.
    val courses = Provider(name, location, phonenumber,occupation,servicefee)

    //below method is use to add data to Firebase Firestore.
    dbCourses.add(courses).addOnSuccessListener {
        // after the data addition is successful
        // we are displaying a success toast message.

        Toast.makeText(context, "Successfully Added Provider Details", Toast.LENGTH_SHORT)
            .show()

    }.addOnFailureListener { e ->
        // this method is called when the data addition process is failed.
        // displaying a toast message when data addition is failed.
        Toast.makeText(context, "Failed to add Data \n$e", Toast.LENGTH_SHORT).show()
    }

}