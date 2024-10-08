package nextstep.shoppingcart.ui.common.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

const val CART_ITEM_COUNTER_DECREASE_TEST_TAG = "decreaseCartItemCounter"
const val CART_ITEM_COUNTER_INCREASE_TEST_TAG = "increaseCartItemCounter"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CartItemCounter(
    modifier: Modifier = Modifier,
    count: Int,
    onClickIncrease: () -> Unit,
    onClickDecrease: () -> Unit,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Card(
            onClick = onClickDecrease,
            shape = RoundedCornerShape(topStart = 4.dp, bottomStart = 4.dp),
            modifier = Modifier.size(42.dp).testTag(CART_ITEM_COUNTER_DECREASE_TEST_TAG),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                Text(
                    text = "-",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
        }

        Box (modifier = Modifier.size(42.dp).background(color = Color.White)) {
            Text(
                text = count.toString(),
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center),
            )
        }
        Card(
            onClick = onClickIncrease,
            shape = RoundedCornerShape(topEnd = 4.dp, bottomEnd = 4.dp),
            modifier = Modifier.size(42.dp).testTag(CART_ITEM_COUNTER_INCREASE_TEST_TAG),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                Text(
                    text = "+",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
        }
    }
}

@Preview
@Composable
private fun CartItemCounterPreview() {
    CartItemCounter(count = 1, onClickDecrease = {}, onClickIncrease = {})
}
