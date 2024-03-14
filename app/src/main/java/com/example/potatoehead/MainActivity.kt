package com.example.potatoehead

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.potatoehead.ui.theme.PotatoeHeadTheme
import java.util.zip.CheckedInputStream

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PotatoeHeadTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = "Mr. Potatoe Head",
            color = Color(0xFFEBECD0),
            fontSize = 40.sp

        )
          var img by remember {
              mutableStateOf(androidx.core.R.drawable.ic_call_decline)
          }

        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEBECD0)),
            ){


            Image(painter = painterResource(id = R.drawable.body), contentDescription = "Body")
            Image(painter = painterResource(id = R.drawable.arms), contentDescription = "arms")
            Image(painter = painterResource(id = R.drawable.ears), contentDescription = "Ears" )
            Image(painter = painterResource(id = R.drawable.eyes), contentDescription = "Eyes")
            Image(painter = painterResource(id = R.drawable.eyebrows), contentDescription ="Eyesbrows" )
            Image(painter = painterResource(id = R.drawable.hat), contentDescription = "Hat")
            Image(painter = painterResource(id = R.drawable.mouth), contentDescription = "Mouth")
            Image(painter = painterResource(id = R.drawable.shoes), contentDescription ="Shoes" )
            Image(painter = painterResource(id = R.drawable.mustache), contentDescription ="Moustaches" )

            Image(painter = painterResource(id = img), contentDescription ="nose" )
            Image(painter = painterResource(id = R.drawable.glasses), contentDescription = "glasses")

        }
        Row {
            var checkbox by remember {
                mutableStateOf(false)
            }
            Box(modifier = Modifier.fillMaxWidth()) {
                Checkbox(
                    checked = checkbox,
                    onCheckedChange = { checkbox = it },
                )

                if (checkbox == true) {

                      img = R.drawable.nose
                }
                else {
                        img = androidx.core.R.drawable.ic_call_decline
                }
            }



        }
    }


}

fun onStateChange(onStateChange: Boolean) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    PotatoeHeadTheme {
        Greeting("Android")
    }
}