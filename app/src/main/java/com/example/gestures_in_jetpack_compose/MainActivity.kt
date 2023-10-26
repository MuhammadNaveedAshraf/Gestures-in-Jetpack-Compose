package com.example.gestures_in_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gestures_in_jetpack_compose.ui.theme.GesturesinJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GesturesinJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val photos = listOf<Photo>(
                        Photo(1, randomSizedPhotos[0], randomSizedPhotos[0],"photo"),
                        Photo(2, randomSizedPhotos[1], randomSizedPhotos[1],"photo"),
                        Photo(3, randomSizedPhotos[2], randomSizedPhotos[2],"photo"),
                        Photo(4, randomSizedPhotos[3], randomSizedPhotos[3],"photo"),
                        Photo(5, randomSizedPhotos[4], randomSizedPhotos[4],"photo"),
                        Photo(6, randomSizedPhotos[5], randomSizedPhotos[5],"photo"),
                        Photo(7, randomSizedPhotos[6], randomSizedPhotos[6],"photo"),
                        Photo(8, randomSizedPhotos[7], randomSizedPhotos[7],"photo"),
                        Photo(9, randomSizedPhotos[8], randomSizedPhotos[8],"photo"),
                        Photo(10, randomSizedPhotos[9], randomSizedPhotos[9],"photo"),
                        Photo(11, randomSizedPhotos[10], randomSizedPhotos[10],"photo"),
                        Photo(12, randomSizedPhotos[11], randomSizedPhotos[11],"photo"),
                    )
                    App(photos = photos)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GesturesinJetpackComposeTheme {

        val photos = listOf<Photo>(
            Photo(1, randomSizedPhotos[0], randomSizedPhotos[0],"photo"),
            Photo(2, randomSizedPhotos[1], randomSizedPhotos[1],"photo"),
            Photo(3, randomSizedPhotos[2], randomSizedPhotos[2],"photo"),
            Photo(4, randomSizedPhotos[3], randomSizedPhotos[3],"photo"),
            Photo(5, randomSizedPhotos[4], randomSizedPhotos[4],"photo"),
            Photo(6, randomSizedPhotos[5], randomSizedPhotos[5],"photo"),
            Photo(7, randomSizedPhotos[6], randomSizedPhotos[6],"photo"),
            Photo(8, randomSizedPhotos[7], randomSizedPhotos[7],"photo"),
            Photo(9, randomSizedPhotos[8], randomSizedPhotos[8],"photo"),
            Photo(10, randomSizedPhotos[9], randomSizedPhotos[9],"photo"),
            Photo(11, randomSizedPhotos[10], randomSizedPhotos[10],"photo"),
            Photo(12, randomSizedPhotos[11], randomSizedPhotos[11],"photo"),
        )
        App(photos = photos)
    }
}
private val randomSizedPhotos = listOf(
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 900, height = 1600),
    randomSampleImageUrl(width = 500, height = 500),
    randomSampleImageUrl(width = 300, height = 400),
    randomSampleImageUrl(width = 1600, height = 900),
    randomSampleImageUrl(width = 500, height = 500),
)
