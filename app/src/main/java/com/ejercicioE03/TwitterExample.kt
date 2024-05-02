package com.ejercicioE03

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gjs.ejercicioe03.R

@Preview(
    name = "P1",
    showBackground = true,
    fontScale = 1.1f,
    showSystemUi = true,
    apiLevel = 34,
    device = Devices.NEXUS_6
)
@Composable
fun TwitterCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF181C24))
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .width(50.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "profileIMG",
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 16.dp)
                        .fillMaxWidth()
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        top = 16.dp
                    )
            ) {
                Row {
                    Column(
                        modifier = Modifier
                            .padding(end = 10.dp)
                    ) {
                        Text(
                            text = "Blanca",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(end = 10.dp)
                    ) {
                        Text(
                            text = "@BlancaDevs",
                            color = Color.Gray
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(end = 10.dp)
                    ) {
                        Text(
                            text = "6h",
                            color = Color.Gray
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 100.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_dots),
                            contentDescription = "iconoPuntos",
                            tint = Color.Gray,
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Lorem ipsum dolor sit amet consectetur adipisicing elit." +
                                " Architecto facere magni, animi adipisci, nesciunt modi vero impedit" +
                                " exercitationem debitis perspiciatis error quod praesentium illum dolor" +
                                " nulla dolorum quis quas esse!",
                        color = Color.White
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "imagenPerfil",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape(45.dp))
                            .padding(top = 15.dp, bottom = 15.dp)
                            .fillMaxWidth()
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column()
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_chat),
                            contentDescription = "iconoMensaje",
                            tint = Color.Gray
                        )
                    }
                    Column {
                        Text(
                            text = "2", color = Color.White,
                            modifier = Modifier
                                .padding(end = 65.dp)
                        )
                    }
                    Column()
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_rt),
                            contentDescription = "iconoRT",
                            tint = Color.Gray
                        )
                    }
                    Column()
                    {
                        Text(
                            text = "2", color = Color.White,
                            modifier = Modifier
                                .padding(end = 65.dp)
                        )
                    }
                    Column()
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_like),
                            contentDescription = "iconoMeGusta",
                            tint = Color.Gray
                        )
                    }
                    Column()
                    {
                        Text(text = "2", color = Color.White)
                    }
                }
            }
        }
    }
}