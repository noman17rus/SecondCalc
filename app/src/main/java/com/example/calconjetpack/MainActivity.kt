package com.example.calconjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calconjetpack.ui.theme.CalcOnJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calc()
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun Calc() {
        Column() {
            Column(
                modifier = Modifier
                    .weight(0.3f)
                    .fillMaxWidth(1f)
            ) {
                Text(
                    text = "current action", modifier = Modifier
                        .fillMaxWidth(1f)
                        .width(60.dp)
                        .weight(1f),
                    fontSize = 40.sp,
                    textAlign = TextAlign.End
                )
                Text(
                    text = "result",
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .weight(1f),
                    fontSize = 60.sp,
                    textAlign = TextAlign.End
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(1f)
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AddButton("C")
                    AddButton("del")
                    AddButton("+/-")
                    AddButton("*")
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AddButton("7")
                    AddButton("8")
                    AddButton("9")
                    AddButton("/")
                }

                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AddButton("4")
                    AddButton("5")
                    AddButton("6")
                    AddButton("-")
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AddButton("1")
                    AddButton("2")
                    AddButton("3")
                    AddButton("+")
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(1f),
                ) {
                    Row(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth(1f)
                    ) {
                        AddButton(".")
                        AddButton("0")
                    }
                    Row(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth(1f),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        AddResultButton()
                    }
                }

            }
        }

    }

}

@Composable
fun AddButton(i: String) {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .size(100.dp)
            .padding(4.dp),
        shape = RoundedCornerShape(5.dp)
    ) {
        Text(
            text = i,
            fontSize = 36.sp,
            modifier = Modifier.width(100.dp),
            textAlign = TextAlign.Center,
            maxLines = 1,
            softWrap = false
        )
    }
}

@Composable
fun AddResultButton() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth(1f)
            .height(100.dp)
            .padding(4.dp),
        shape = RoundedCornerShape(4.dp),
    ) {
        Text(
            text = "=",
            fontSize = 48.sp,
            modifier = Modifier.width(180.dp),
            textAlign = TextAlign.Center
        )
    }
}