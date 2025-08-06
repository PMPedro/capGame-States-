package eu.learning.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import eu.learning.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    captainGame()
                }
            }
        }
    }
    @Composable
    fun captainGame() {
        val tresuresFound = remember { mutableStateOf(0) }
        val direction = remember { mutableStateOf("North") }
        val stormOrTreusure = remember { mutableStateOf("") }
        val hp = remember { mutableStateOf(1000) }

        
        Column {
            Text(text = "Tresures Found : ${tresuresFound.value}")
            Text(text = "Tresures Found : ${direction.value}")
            Text(text = stormOrTreusure.value)
            Text(text = "Hp : ${hp.value}" )

            Button(onClick = {
                direction.value = "East"
                if(Random.nextBoolean()){
                    tresuresFound.value += 1
                    stormOrTreusure.value = "TresureFound!"
                }else {
                    stormOrTreusure.value = "Storm Ahead!"
                    hp.value -=10
                }
            }) {
                Text(text = "Sail East")
            }

            Button(onClick = {
                direction.value = "North"
                if(Random.nextBoolean()){
                    tresuresFound.value += 1
                    stormOrTreusure.value = "TresureFound!"
                }else {
                    stormOrTreusure.value = "Storm Ahead!"
                    hp.value -=10
                }
            }) {
                Text(text = "Sail North")
            }

            Button(onClick = {
                direction.value = "West"
                if(Random.nextBoolean()){
                    tresuresFound.value += 1
                    stormOrTreusure.value = "TresureFound!"
                }else {
                    stormOrTreusure.value = "Storm Ahead!"
                    hp.value -=10
                }
            }) {
                Text(text = "Sail West")
            }

            Button(onClick = {
                direction.value = "South"
                if(Random.nextBoolean()){
                    tresuresFound.value += 1
                    stormOrTreusure.value = "TresureFound!"
                }else {
                    stormOrTreusure.value = "Storm Ahead!"
                    hp.value -=10
                }
            }) {
                Text(text = "Sail South")
            }

        }
    }
}



