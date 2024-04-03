package com.cuteboy.contact.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.cuteboy.contact.screens.ContactDetailScreen
import com.cuteboy.contact.screens.ContactScreen
import com.cuteboy.contact.ui.theme.SecondaryText
import com.cuteboy.contact.utils.App
import com.cuteboy.contact.utils.ContactDataManager
import com.cuteboy.contact.utils.Pages

@Composable
fun AppBar(text: String = "Category", navController: NavHostController? = null) {
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .background(if (isSystemInDarkTheme()) Color.Black else SecondaryText)
            .height(70.dp),
        verticalAlignment = Alignment.CenterVertically,

        ) {
        if (text != "Category") {
            Image(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .clickable {
                        if(ContactDataManager.currentPage.value == Pages.DETAIL) {
                            ContactDataManager.currentPage.value = Pages.LISTING
                        }
                        else {
                            navController?.popBackStack();
                        }
                    }
                    .padding(4.dp),
                colorFilter = ColorFilter.lighting(Color.White, Color.White)
            )
            Text(
                text = text,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(10.dp),
                textAlign = TextAlign.Center,
                color = Color.White
            )
        } else {
            Text(
                text = "Category",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(10.dp),
                textAlign = TextAlign.Center,
                color = Color.White
            )
        }


    }
}

//@Preview(showBackground = true)
//@Composable
//fun AppBarPreview() {
//    AppBar("Prem Raj")
//}