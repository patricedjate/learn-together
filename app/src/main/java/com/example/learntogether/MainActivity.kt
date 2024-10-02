package com.example.learntogether

import android.os.Bundle
import android.print.PrintAttributes.Margins
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText1(modifier: Modifier = Modifier) {

        Text(
            text = "Jetpack Compose tutorial",
           fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )

}
@Composable
fun GreetingText2(modifier: Modifier = Modifier) {
    Text(
        text = "Jetpack Compose is a modern toolkit for " +
                "building native Android UI. " +
                "Compose simplifies and accelerates" +
                " UI development on Android with less code," +
                " powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp,0.dp,16.dp,0.dp)

        )
}
@Composable
fun GreetingText3(modifier: Modifier = Modifier) {

    Text(
        text = "In this tutorial, you build a simple UI" +
                " component with declarative functions. " +
                "You call Compose functions to say what elements " +
                "you want and the Compose compiler does the rest. " +
                "Compose is built around Composable functions. " +
                "These functions let you define your app\\'s UI " +
                "programmatically because they let you describe how" +
                " it should look and provide data dependencies," +
                " rather than focus on the process of the UI\\'s" +
                " construction, such as initializing an element" +
                " and then attaching it to a parent. To create a " +
                "Composable function, you add the @Composable " +
                "annotation to the function name.",
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp,0.dp,16.dp,0.dp)

    )
}
@Composable
fun GreetingImage(modifier : Modifier = Modifier ){
    val image = painterResource(id = R.drawable.bg)
    Column (

    ){

        Image(  painter = image ,
            contentDescription = null
        )
        GreetingText1()
        GreetingText2()
        GreetingText3()
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {

    }
}