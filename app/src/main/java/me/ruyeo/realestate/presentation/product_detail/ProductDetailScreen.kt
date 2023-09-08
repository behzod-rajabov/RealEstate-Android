package me.ruyeo.realestate.presentation.product_detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.hilt.navigation.compose.hiltViewModel
import me.ruyeo.realestate.R
import me.ruyeo.realestate.presentation.ui.theme.MediumGray
import me.ruyeo.realestate.presentation.ui.theme.inter

@Composable
fun ProductDetailScreen(
    viewModel: ProductDetailViewModel = hiltViewModel(),
) {
//    val mapView =
    val verticalScrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .verticalScroll(
                state = verticalScrollState
            )
    ) {
        Row {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_back),
                contentDescription = "Back to home"
            )
        }

        Text(
            text = "",
            style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 22.sp,
                fontFamily = inter,
                fontWeight = FontWeight.Normal,
                color = MediumGray,
            )
        )

//        AndroidView(factory = {}) {
//
//        }

        Text(
            text = stringResource(id = R.string.about_apartment)
        )
    }
}

@Preview
@Composable
fun ProductDetailScreenContent() {

    ProductDetailScreen(

    )
}