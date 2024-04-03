package com.cuteboy.contact.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.navigation.NavHostController
import com.cuteboy.contact.dummydata.CollegeFriendContactList
import com.cuteboy.contact.dummydata.Contact
import com.cuteboy.contact.dummydata.FamilyContactList
import com.cuteboy.contact.dummydata.FriendsContactList
import com.cuteboy.contact.dummydata.HomeContactList
import com.cuteboy.contact.dummydata.OthersContactList
import com.cuteboy.contact.dummydata.SchoolsFriendsContactList
import com.cuteboy.contact.dummydata.TeachersContactList
import com.cuteboy.contact.screens.ContactDetailScreen
import com.cuteboy.contact.screens.ContactScreen

object ContactDataManager {
    var Famitydata = FamilyContactList
    var Friendsdata = FriendsContactList
    var Teachersdata = TeachersContactList
    var SchoolsFriendsdata = SchoolsFriendsContactList
    var Homedata = HomeContactList
    var CollegeFrienddata = CollegeFriendContactList
    var othersdata = OthersContactList

    var currentContact: Contact? = null
    var currentPage = mutableStateOf(Pages.LISTING)


    fun switchPages(contact: Contact?) {
        if(currentPage.value == Pages.LISTING) {
            currentContact = contact
            currentPage.value = Pages.DETAIL
        } else {
            currentPage.value = Pages.LISTING
        }
    }
}

@Composable
fun App(navController: NavHostController, category: String = "Friends") {
        if(ContactDataManager.currentPage.value == Pages.LISTING) {
            when(category) {
                "Family" -> {
                    ContactScreen(data = ContactDataManager.Famitydata, navController) {
                        ContactDataManager.switchPages(it)
                    }
                }
                "Friends" -> {
                    ContactScreen(data = ContactDataManager.Friendsdata, navController) {
                        ContactDataManager.switchPages(it)
                    }
                }
                "Teachers" -> {
                    ContactScreen(data = ContactDataManager.Teachersdata, navController) {
                        ContactDataManager.switchPages(it)
                    }
                }
                "School's Friend" -> {
                    ContactScreen(data = ContactDataManager.SchoolsFriendsdata, navController) {
                        ContactDataManager.switchPages(it)
                    }
                }
                "Home" -> {
                    ContactScreen(data = ContactDataManager.Homedata, navController) {
                        ContactDataManager.switchPages(it)
                    }
                }
                "College Friend" -> {
                    ContactScreen(data = ContactDataManager.CollegeFrienddata, navController) {
                        ContactDataManager.switchPages(it)
                    }
                }
                else -> {
                    ContactScreen(data = ContactDataManager.othersdata, navController) {
                        ContactDataManager.switchPages(it)
                    }
                }
            }
        }
        else {
            ContactDataManager.currentContact?.let { ContactDetailScreen(contact = it) }
        }


}