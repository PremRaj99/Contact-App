package com.cuteboy.contact.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.cuteboy.contact.R

//@Composable
//fun LoginScreen(navController: NavHostController) {
//
//}
@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)

    ) {
        Image(
            painter = painterResource(id = R.drawable.contact),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 20.dp),
        )
        Box(
            modifier = Modifier
//            .background(Color.Black)
                .clip(CircleShape)
                .border(3.dp, MaterialTheme.colorScheme.primary, CircleShape)
        ) {
            Icon(
                imageVector = Icons.Rounded.Person,
                contentDescription = null,
                modifier = Modifier
                    .size(125.dp)
                    .padding(horizontal = 10.dp),
                tint = MaterialTheme.colorScheme.primary
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        var email by remember { mutableStateOf("") }
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            singleLine = true,
            modifier = Modifier
                .clip(CircleShape)
                .width(300.dp)
                .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)

        )
        var pass by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.padding(10.dp))
        TextField(
            value = pass,
            onValueChange = { pass = it },
            label = { Text("Password") },
            singleLine = true,
            visualTransformation = { inputAnnotatedString ->
                TransformedText(
                    text = AnnotatedString(
                        "*".repeat(inputAnnotatedString.text.length)
                    ), offsetMapping = OffsetMapping.Identity
                )
            },
            modifier = Modifier
                .clip(CircleShape)
                .width(300.dp)
                .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {
            if (email.isNotEmpty() && pass.isNotEmpty())
                navController.navigate("Category")
        },
            colors = ButtonDefaults
                .run { buttonColors(MaterialTheme.colorScheme.primary) }
        ) {
            Text(
                text = "Login",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Start
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Text(text = "Don't Remember Password? ",color = MaterialTheme.colorScheme.secondary)
        Text(text = "Click",
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.clickable { navController.navigate("Signup")}
        )
        Spacer(modifier = Modifier.padding(20.dp))

    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun LoginScreenPreview() {
//    LoginScreen()
//}