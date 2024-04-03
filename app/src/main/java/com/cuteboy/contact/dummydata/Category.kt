package com.cuteboy.contact.dummydata

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import com.cuteboy.contact.R

data class Category(val name: String, val img: Int?)

val CategoryList1 = mutableListOf<Category>(
    Category("Family", R.drawable.family),
    Category("Friends", R.drawable.friends),
    Category("Teachers", R.drawable.teachers),
    Category("School's Friend", R.drawable.schoolfriends),
    Category("Home", R.drawable.home),
    Category("College Friend", R.drawable.collegefriends),
    Category("Others", R.drawable.others)
)

