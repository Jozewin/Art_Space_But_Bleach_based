package com.project.bleachcaptains

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.Light
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.bleachcaptains.ui.theme.BleachCaptainsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BleachCaptainsTheme {
                PrevBleachApp()
            }
        }
    }
}

@Composable
fun ButtonOptions(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .width(140.dp)
    ) {
        Text(
            text = text,
            fontSize = 16.sp,
            style = MaterialTheme.typography.displaySmall
        )
    }
}

@Composable
fun BleachApp() {

    var result by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when (result) {
            0 -> {
                ImageCard(Image = R.drawable.headcaptain)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.head_captain,
                    Name = R.string.head_captain_name,
                    Position = R.string.head_captain_position
                )
            }

            1 -> {
                ImageCard(Image = R.drawable.squad_2)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_2,
                    Name = R.string.squad_2_name,
                    Position = R.string.squad_2_position
                )

            }

            2 -> {
                ImageCard(Image = R.drawable.squad_3)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_3,
                    Name = R.string.squad_3_name,
                    Position = R.string.squad_3_position
                )

            }

            3 -> {
                ImageCard(Image = R.drawable.squad_4)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_4,
                    Name = R.string.squad_4_name,
                    Position = R.string.squad_4_position
                )

            }

            4 -> {
                ImageCard(Image = R.drawable.squad_5)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_5,
                    Name = R.string.squad_5_name,
                    Position = R.string.squad_5_position
                )

            }

            5 -> {
                ImageCard(Image = R.drawable.squad_6)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_6,
                    Name = R.string.squad_6_name,
                    Position = R.string.squad_6_position
                )

            }

            6 -> {
                ImageCard(Image = R.drawable.squad_7)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_7,
                    Name = R.string.squad_7_name,
                    Position = R.string.squad_7_position
                )

            }

            7 -> {
                ImageCard(Image = R.drawable.squad_8)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_8,
                    Name = R.string.squad_8_name,
                    Position = R.string.squad_8_position
                )

            }

            8 -> {
                ImageCard(Image = R.drawable.squad_9)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_9,
                    Name = R.string.squad_9_name,
                    Position = R.string.squad_9_position
                )

            }

            9 -> {
                ImageCard(Image = R.drawable.squad_10)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_10,
                    Name = R.string.squad_10_name,
                    Position = R.string.squad_10_position
                )

            }

            10 -> {
                ImageCard(Image = R.drawable.squad_11)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_11,
                    Name = R.string.squad_11_name,
                    Position = R.string.squad_11_position
                )
            }

            11 -> {
                ImageCard(Image = R.drawable.squad_12)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_12,
                    Name = R.string.squad_12_name,
                    Position = R.string.squad_12_position
                )
            }

            12 -> {
                ImageCard(Image = R.drawable.squad_13)
                Spacer(modifier = Modifier.height(40.dp))
                CaptainDetails(
                    Detail = R.string.squad_13,
                    Name = R.string.squad_13_name,
                    Position = R.string.squad_13_position
                )
            }


        }
    }



    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        ButtonOptions(

            onClick = {
                if (result > 0) result--
                else    result = 12
            },

            text = "Previous"

        )
        ButtonOptions(
            onClick = {
                if (result < 12) result++
                else    result = 0
            }, text = "Next"
        )

    }
}


@Preview
@Composable
fun PrevBleachApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        BleachApp()

    }
}

@Composable
fun ImageCard(
    @DrawableRes Image: Int,
) {
    Box(
        modifier = Modifier
            .height(450.dp)
            .shadow(3.dp, RectangleShape)
            .background(Color.White)

    )

    {
        Image(
            painter = painterResource(id = Image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(40.dp)
        )
    }
}

@Composable
fun CaptainDetails(
    @StringRes Detail: Int,
    @StringRes Name: Int,
    @StringRes Position: Int
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = stringResource(Detail),
                fontSize = 26.sp,
                style = MaterialTheme.typography.displaySmall,
                fontWeight = Light
            )

            Row {
                Text(
                    text = stringResource(id = Name),
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(end = 8.dp)
                )

                Text(
                    text = "(${stringResource(id = Position)})",
                    style = MaterialTheme.typography.labelSmall,
                )
            }
        }

    }
}