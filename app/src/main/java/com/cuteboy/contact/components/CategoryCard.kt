
package com.cuteboy.contact.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun CategoryCard(icon: Int?, text: String, onclick: () -> Unit) {
    Box(modifier = Modifier
        .padding(20.dp)
        .clip(RoundedCornerShape(20.dp))
        .background(MaterialTheme.colorScheme.primary)
        .clickable { onclick() }
        .padding(20.dp)
        .size(150.dp, 100.dp),
        contentAlignment = Alignment.Center) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            icon?.let { painterResource(id = it) }?.let {
                Image(
                    painter = it,
                    contentDescription = null,
                    Modifier.size(50.dp),
                )
            }
            if (icon == null) {
                Image(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null,
                    Modifier.size(50.dp),
                    colorFilter = ColorFilter.tint(if (isSystemInDarkTheme()) MaterialTheme.colorScheme.background else Color.White)
                )
            }
            Text(
                text = text,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = if (isSystemInDarkTheme()) MaterialTheme.colorScheme.background else Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .width(100.dp)
                    .padding(top = 4.dp)
            )
        }
    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun CategoryCardPreview() {
//
//    CategoryCard(Icons.Default.AccountCircle, "Family", navController)
//}
