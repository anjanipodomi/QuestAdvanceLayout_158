package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilAnjani(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFDF6F6)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(60.dp))

        Image(
            painter = painterResource(id = R.drawable.sariii),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val iconSize = 50.dp
            val iconPadding = 10.dp

            Image(
                painter = painterResource(id = R.drawable.logofacebook),
                contentDescription = "Facebook",
                modifier = Modifier.size(iconSize).padding(iconPadding)
            )
            Image(
                painter = painterResource(id = R.drawable.logogoogle),
                contentDescription = "Email",
                modifier = Modifier.size(iconSize).padding(iconPadding)
            )
            Image(
                painter = painterResource(id = R.drawable.logolinkedln),
                contentDescription = "LinkedIn",
                modifier = Modifier.size(iconSize).padding(iconPadding)
            )
            Image(
                painter = painterResource(id = R.drawable.logo_x),
                contentDescription = "X (Twitter)",
                modifier = Modifier.size(iconSize).padding(iconPadding)
            )
        }
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Anjani Dihapsari Podomi",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = "@anjanipodomiii",
            fontSize = 14.sp,
            color = Color.DarkGray
        )
        Text(
            text = "InsyaAllah calon orang kaya",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3C3C3C)
        )
        Spacer(modifier = Modifier.height(20.dp))

        CardMenu(title = "Privasi", icon = Icons.Default.Lock)
        Spacer(modifier = Modifier.height(8.dp))
        CardMenu(title = "Riwayat Transaksi", icon = Icons.Default.Refresh)
        Spacer(modifier = Modifier.height(8.dp))
        CardMenu(title = "Pengaturan", icon = Icons.Default.Settings)

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "© 2025 Sari",
            color = Color.Gray,
            fontSize = 12.sp
        )

    }
}

@Composable
fun CardMenu(title: String, icon: androidx.compose.ui.graphics.vector.ImageVector) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.Black),
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .height(50.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = icon, contentDescription = null, tint = Color.White)
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = title, color = Color.White)
            }
            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}