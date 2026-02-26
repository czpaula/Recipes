package br.com.czp.recipes.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.czp.recipes.R
import br.com.czp.recipes.ui.theme.RecipesTheme


@Composable
fun YourName(modifier: Modifier = Modifier) {
    // Caixa de texto para nome do usuário
    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth(),
        label = {
            Text(
                text = stringResource(R.string.your_name),
                style = MaterialTheme.typography.labelSmall
            )
        },
        shape = RoundedCornerShape(16.dp),
        colors = OutlinedTextFieldDefaults
            .colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.primary
            ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = stringResource(R.string.person_icon),
                tint = MaterialTheme.colorScheme.tertiary
            )
        }
    )

}

@Preview
@Composable
private fun YourNamePreview() {
    RecipesTheme() {
        YourName()
    }
}
@Composable
fun YourEmail(modifier: Modifier = Modifier) {
    // Caixa de texto para email do usuário
    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth(),
        label = {
            Text(
                text = stringResource(R.string.your_email),
                style = MaterialTheme.typography.labelSmall
            )
        },
        shape = RoundedCornerShape(16.dp),
        colors = OutlinedTextFieldDefaults
            .colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.primary
            ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Mail,
                contentDescription = stringResource(R.string.email_icon),
                tint = MaterialTheme.colorScheme.tertiary
            )
        }
    )
}

@Preview
@Composable
private fun YourEmailPreview() {
    RecipesTheme() {
        YourEmail()
    }
}

@Composable
fun YourPassword(modifier: Modifier = Modifier) {
    // Caixa de texto para senha do usuário
    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth(),
        label = {
            Text(
                text = stringResource(R.string.your_password),
                style = MaterialTheme.typography.labelSmall
            )
        },
        shape = RoundedCornerShape(16.dp),
        colors = OutlinedTextFieldDefaults
            .colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.primary
            ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = stringResource(R.string.password_icon),
                tint = MaterialTheme.colorScheme.tertiary
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.RemoveRedEye,
                contentDescription = stringResource(R.string.password_icon),
                tint = MaterialTheme.colorScheme.tertiary
            )
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.NumberPassword,
            imeAction = ImeAction.Done
        )
    )
}

@Preview
@Composable
private fun YourPasswordPreview() {
    RecipesTheme() {
        YourPassword()
    }
    
}