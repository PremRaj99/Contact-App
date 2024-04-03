package com.cuteboy.contact.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cuteboy.contact.dummydata.Contact

@Composable
fun ContactCard(
    contact: Contact,
    onClick: (contact: Contact) -> Unit
) {
    Card(
        elevation = cardElevation(8.dp),
        modifier = Modifier
            .padding(10.dp)
            .clickable { onClick(contact) }
            .fillMaxWidth(1f),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = contact.photo,
                contentDescription = null,
                modifier = Modifier.size(60.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column(
                modifier = Modifier.fillMaxWidth(0.68f)
            ) {
                Text(
                    text = contact.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(bottom = 3.dp)
                )
                Text(
                    text = contact.phoneNumber.toString(),
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.secondary
                )
                Text(text = contact.email, fontStyle = FontStyle.Italic)
            }
            Image(
                imageVector = Icons.Default.Email,
                contentDescription = null,
                modifier = Modifier.size(45.dp).clip(CircleShape).clickable {  }.padding(4.dp),
                colorFilter = ColorFilter.tint(Color.Red)

            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
                imageVector = Icons.Default.Call,
                contentDescription = null,
                modifier = Modifier.size(45.dp).clip(CircleShape).clickable {  }.padding(4.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)

            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ContactCardPreview() {
//    ContactCard(
//        "Prem Raj",
//        "premraj299341@gmail.com",
//        Icons.Default.AccountCircle,
//        6200103129,
//        navController
//    )
//}