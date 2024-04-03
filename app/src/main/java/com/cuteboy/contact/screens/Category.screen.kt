package com.cuteboy.contact.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cuteboy.contact.components.AppBar
import com.cuteboy.contact.components.CategoryCard
import com.cuteboy.contact.utils.CategoryDataManager
import com.cuteboy.contact.utils.GifImage

@Composable
fun CategoryScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(MaterialTheme.colorScheme.background)
    ) {
        AppBar("Category")
        Spacer(modifier = Modifier.height(10.dp))
        if (CategoryDataManager.isDataLoded.value) {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 180.dp)
            ) {
                items(CategoryDataManager.CategoryList) {
                    CategoryCard(
                        icon = it.img,
                        text = it.name,
//                        navController
//                    )
                    ) { navController.navigate("Contact/${it.name}") }
                }
            }
        } else {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize(1f)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    GifImage()
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Loading...", style = MaterialTheme.typography.headlineLarge
                    )
                }


            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun CategoryScreenPreveiew() {
//    CategoryScreen(navController)
//}