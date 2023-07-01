package com.luiz.marsrover.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.luiz.marsrover.R
import com.luiz.marsrover.domain.roverUiModelList
import java.util.Date

@Composable
fun RoverList(){
    Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxSize()) {
        LazyColumn{
            items(roverUiModelList){
                Rover(name = it.name, img = it.img, ladingDate = it.landingDate, distanceTraveled = it.distance)
            }
        }
    }
}

@Composable
fun Rover(
    modifier: Modifier=Modifier,
    name:String,
    @DrawableRes img:Int,
    ladingDate: String,
    distanceTraveled:String
){
    Card(modifier = modifier.padding(16.dp)) {
        Column(modifier.padding(16.dp)) {
            Text(
                text = name,
                modifier=modifier.fillMaxWidth(),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
            Image(
                painter = painterResource(id = img),
                contentDescription = "Rover Image"
            )
            Text(
                text = "Credit: NASA/JPL",
                fontSize = 8.sp,
            )
            Text(
                text = "Lading date: $ladingDate",
                fontSize = 12.sp
            )
            Text(
                text = "Distance traveled: $distanceTraveled",
                fontSize = 12.sp
            )
        }
    }
}


@Preview
@Composable
fun RoverPreview(){
    Rover(name = "Perseverance", img = R.drawable.perseverance, ladingDate = "18  February 2021", distanceTraveled = "17.56 km")
}
