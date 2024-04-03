package com.cuteboy.contact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cuteboy.contact.screens.CategoryScreen
import com.cuteboy.contact.screens.ContactDetailScreen
import com.cuteboy.contact.screens.ContactScreen
import com.cuteboy.contact.ui.theme.ContactTheme
import com.cuteboy.contact.utils.CategoryDataManager
import com.cuteboy.contact.utils.Nav
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        CoroutineScope(Dispatchers.IO).launch {
//            delay(10000)
//            CategoryDataManager.LoadAssetsFromFile(applicationContext)
//        }
        setContent {
            ContactTheme {
                // A surface container using the 'background' color from the theme
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
//    CategoryScreen()
//    ContactScreen()
//    ContactDetailScreen()
    Nav()
}

@Preview(showBackground = true)
@Composable
fun MyAppPreivew() {
    MyApp()
}