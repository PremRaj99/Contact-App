package com.cuteboy.contact.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cuteboy.contact.components.AppBar
import com.cuteboy.contact.components.ContactDetailCard
import com.cuteboy.contact.dummydata.Contact
import com.cuteboy.contact.utils.ContactDataManager

@Composable
fun ContactDetailScreen(contact: Contact) {

    BackHandler {
        ContactDataManager.switchPages(null)
    }
    Column (
        modifier = Modifier.fillMaxSize(1f).background(MaterialTheme.colorScheme.background)
    ){
        AppBar(contact.name)
        Box(modifier = Modifier.fillMaxSize(1f)) {
            ContactDetailCard(contact)
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ContactDetailScreenPreview() {
//    ContactDetailScreen()
//}