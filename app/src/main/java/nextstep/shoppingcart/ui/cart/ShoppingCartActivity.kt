package nextstep.shoppingcart.ui.cart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import nextstep.shoppingcart.ui.theme.ShoppingCartTheme

class ShoppingCartActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingCartTheme {
                ShoppingCartScreen(onBack = { finish() })
            }
        }
    }
}
