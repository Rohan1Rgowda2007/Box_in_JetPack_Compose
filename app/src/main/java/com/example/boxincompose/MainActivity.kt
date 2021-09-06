package com.example.boxincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.boxincompose.ui.theme.BoxInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxInComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    EachPreview()
                }
            }
        }
    }
}

/*
   Note you should use Android studio 'Artic Fox' or "Cannary"
 */

@Preview(showBackground = true)
@Composable
fun EachPreview() {
    BoxInComposeTheme {
        Box(
            modifier =
            Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center

//            contentAlignment = Alignment.BottomCenter
        ) {
//            Text(text = "this is box in compose",fontSize = 34.sp) // this text is commented
            // because this is like frame layout new text will over lap

            // using 'string.xml' file string in this text box
            Text(text = stringResource(id = R.string.my_name),fontSize = 30.sp) // it will display my name
        }
        
    }
}