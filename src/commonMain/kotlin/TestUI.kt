import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun Test() {
    var mCount by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .width(400.dp)
            .padding(16.dp)
    ) {
        Text(text = "$mCount")
        Button(onClick = {
            mCount++
        }) {
            Text("Add")
        }
    }

}
