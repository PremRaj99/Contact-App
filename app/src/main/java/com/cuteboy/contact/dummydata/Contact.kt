package com.cuteboy.contact.dummydata

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.ui.graphics.vector.ImageVector

data class Contact(
    val name: String,
    val phoneNumber: Number,
    val photo: ImageVector = Icons.Default.AccountCircle,
    val email: String
)

val FamilyContactList = mutableListOf<Contact>(
    Contact("Papa", 6200103129, email = "premraj299341@gmail.com"),
    Contact("Mummy", 6200103128, email = "ritik@gmail.com"),
    Contact("Dada Ji", 6200103129, email = "subham.kr@gmail.com"),
    Contact("DIdi", 6200103129, email = "ranju124@gmail.com"),
    Contact("Dadi Ji", 6200103129, email = "h.haldar@gmail.com"),
)
val FriendsContactList = mutableListOf<Contact>(
    Contact("Prem Raj", 6200103129, email = "premraj299341@gmail.com"),
    Contact("Ritik Sinha", 6200103128, email = "ritik@gmail.com"),
    Contact("Subham Kumar", 6200103129, email = "subham.kr@gmail.com"),
    Contact("Ranjan Kumar", 6200103129, email = "ranju124@gmail.com"),
    Contact("Himanshu Haldar", 6200103129, email = "h.haldar@gmail.com"),
    Contact("Adarsh Tripathi", 6200103129, email = "tripathi.adarsh@gmail.com"),
    Contact("Anshika Srivastav", 6200103129, email = "anshika235@gmail.com"),
)
val TeachersContactList = mutableListOf<Contact>(
    Contact("Teacher A", 6200103129, email = "premraj299341@gmail.com"),
    Contact("Teacher B", 6200103128, email = "ritik@gmail.com"),
    Contact("Teacher C", 6200103129, email = "subham.kr@gmail.com"),
    Contact("Teacher D", 6200103129, email = "ranju124@gmail.com"),
    Contact("Teacher E", 6200103129, email = "h.haldar@gmail.com"),
    Contact("Teacher F", 6200103129, email = "tripathi.adarsh@gmail.com"),
    Contact("Teacher G", 6200103129, email = "anshika235@gmail.com"),
    Contact("Teacher H", 6200103129, email = "anshika235@gmail.com"),
)
val SchoolsFriendsContactList = mutableListOf<Contact>(
    Contact("School Friend A", 6200103129, email = "premraj299341@gmail.com"),
    Contact("School Friend B", 6200103128, email = "ritik@gmail.com"),
    Contact("School Friend C", 6200103129, email = "subham.kr@gmail.com"),
    Contact("School Friend D", 6200103129, email = "ranju124@gmail.com"),
    Contact("School Friend E", 6200103129, email = "h.haldar@gmail.com"),
    Contact("School Friend F", 6200103129, email = "tripathi.adarsh@gmail.com"),
    Contact("School Friend G", 6200103129, email = "anshika235@gmail.com"),
)
val HomeContactList = mutableListOf<Contact>(
    Contact("Telephone no.", 6200103129, email = "premraj299341@gmail.com"),
    Contact("Mummy", 6200103128, email = "ritik@gmail.com")
)
val CollegeFriendContactList = mutableListOf<Contact>(
    Contact("Prem Raj", 6200103129, email = "premraj299341@gmail.com"),
    Contact("Ritik Sinha", 6200103128, email = "ritik@gmail.com"),
    Contact("Subham Kumar", 6200103129, email = "subham.kr@gmail.com"),
    Contact("Ranjan Kumar", 6200103129, email = "ranju124@gmail.com"),
    Contact("Himanshu Haldar", 6200103129, email = "h.haldar@gmail.com"),
    Contact("Adarsh Tripathi", 6200103129, email = "tripathi.adarsh@gmail.com"),
    Contact("Anshika Srivastav", 6200103129, email = "anshika235@gmail.com"),
)
val OthersContactList = mutableListOf<Contact>(
    Contact("Other 1", 6200103129, email = "premraj299341@gmail.com"),
    Contact("Other 2", 6200103128, email = "ritik@gmail.com"),
    Contact("Other 3", 6200103129, email = "subham.kr@gmail.com"),
    Contact("Other 4", 6200103129, email = "ranju124@gmail.com"),
    Contact("Other 5", 6200103129, email = "h.haldar@gmail.com"),
    Contact("Other 6", 6200103129, email = "tripathi.adarsh@gmail.com"),
    Contact("Other 7", 6200103129, email = "anshika235@gmail.com"),
    Contact("Other 8", 6200103129, email = "anshika235@gmail.com"),
    Contact("Other 9", 6200103129, email = "anshika235@gmail.com"),
)

