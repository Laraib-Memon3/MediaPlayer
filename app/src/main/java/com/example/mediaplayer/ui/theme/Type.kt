package com.example.mediaplayer.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mediaplayer.R

private val nurtio = FontFamily(
    Font(R.font.Nunito_Regular, FontWeight.W400),
    Font(R.font.Nunito_Medium, FontWeight.W500),
    Font(R.font.Nunito_Bold, FontWeight.W600)



)
val OvertimeTextStyle = TextStyle(
    fontFamily = nurtio,
    fontWeight = FontWeight.Normal,
    fontSize = 10.sp
)

// Set of Material typography styles to start with
val NunitoTypography = Typography(
    
    
    displayLarge = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W500,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W500,
        fontSize = 24.sp
    ),
    displaySmall = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W400,
        fontSize = 20.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W400,
        fontSize = 18.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W400,
        fontSize = 16.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp
    ),
    titleMedium = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = nurtio,
        fontSize = 14.sp
    ),
    labelSmall = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W400,
        fontSize = 15.sp,
        color = Color.White
    ),
    labelLarge = TextStyle(
        fontFamily = nurtio,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp
    ),
/* Other default text styles to override
titleLarge = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 22.sp,
    lineHeight = 28.sp,
    letterSpacing = 0.sp
),
labelSmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 11.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.5.sp
)
*/
)