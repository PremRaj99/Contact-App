package com.cuteboy.contact.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.cuteboy.contact.components.AppBar
import com.cuteboy.contact.components.ContactCard
import com.cuteboy.contact.dummydata.Contact

@Composable
fun ContactScreen(data: MutableList<Contact>, navController: NavHostController, onClick: (contact : Contact) -> Unit) {
    Column (
        modifier = Modifier.fillMaxSize(1f).background(MaterialTheme.colorScheme.background)
    ){
        AppBar("Contact", navController)
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn(content = {
            items(data) {
                ContactCard(it, onClick)
            }
        })
    }

}
//
//@Preview(showBackground = true)
//@Composable
//fun ContactScreenPreview() {
//    ContactScreen(navController)
//}