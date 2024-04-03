package com.cuteboy.contact.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cuteboy.contact.dummydata.Contact

@Composable
fun ContactDetailCard(contact: Contact) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .padding(20.dp)
            .clickable { }
            .fillMaxWidth(1f),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(1f).padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                imageVector = contact.photo,
                contentDescription = null,
                modifier = Modifier.size(100.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = contact.name,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(bottom = 3.dp)
            )
            Text(
                text = contact.phoneNumber.toString(),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(text = contact.email, fontStyle = FontStyle.Italic)
            Row (
                modifier = Modifier.fillMaxWidth(1f).padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center
            ){
                Image(
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp).clip(CircleShape).clickable {  }.padding(4.dp),
                    colorFilter = ColorFilter.tint(Color.Red)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    imageVector = Icons.Default.Call,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp).clip(CircleShape).clickable {  }.padding(4.dp),
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ContactDetailCardPreview() {
//    ContactDetailCard(contact)
//}