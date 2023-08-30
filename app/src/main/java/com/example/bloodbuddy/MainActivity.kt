package com.example.bloodbuddy


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.bloodbuddy.ui.theme.BloodBuddyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloodBuddyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    //color = MaterialTheme.colorScheme.onBackground

                ) {

                    HomeScreen()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(

        topBar = {
            TopAppBar(
                

                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Menu, contentDescription = "Menu")
                    }
                },
                title = {
                    Text(text = "Blood Buddy")
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Red ),
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Person, "Profile")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Notifications, "Notification")
                    }
                },

            )
        },

        bottomBar = {

            BottomAppBar(
                //  backgroundColor = MaterialTheme.colorScheme.primary,

            ) {
                IconButton(onClick = { /*TODO*/ }, Modifier.padding(horizontal = 20.dp)) {

                    Icon(Icons.Filled.Home, contentDescription = "Home",)
                }
                IconButton(
                    onClick = { /*TODO*/ },
                    Modifier
                        .padding(horizontal = 20.dp)
                        .fillMaxWidth(0.8F)
                ) {
                    Icon(Icons.Filled.Search, contentDescription = "Donate")
                }
                IconButton(onClick = { /*TODO*/ }, Modifier.padding(horizontal = 20.dp)) {
                    Icon(Icons.Filled.AccountCircle, contentDescription = "Request")
                }

            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

                Card(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth()
                        .height(140.dp)
                    ,
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(text = "Card 1 Content")
                }

            LazyRow(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
                ){
                item {
                    Card(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .fillMaxWidth()
                            .height(140.dp), // Set the card height to 200.dp
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text(text = "Card 2A Content")
                    }
                }
                item {
                    Card(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .fillMaxWidth()
                            .height(140.dp), // Set the card height to 200.dp
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text(text = "Card 2B Content")
                    }
                }
            }
            LazyRow(modifier = Modifier
                .fillMaxWidth()
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                item {
                    Card(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .fillMaxWidth()
                            .height(140.dp), // Set the card height to 200.dp
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text(text = "Card 3A Content")
                    }
                }
                item {
                    Card(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .fillMaxWidth()
                            .height(140.dp), // Set the card height to 200.dp
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text(text = "Card 3B Content")
                    }
                }
                item {
                    Card(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .fillMaxWidth()
                            .height(140.dp), // Set the card height to 200.dp
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text(text = "Card 3C Content")
                    }
                }
            }




        }
    }
}




