package com.example.melistore.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.example.melistore.R
import com.example.melistore.ui.theme.MeliStoreTheme

class PrincipalProductsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeliStoreTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(title = {
                                Text(text = stringResource(id = R.string.app_name))
                            }, actions = {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Search , contentDescription = null )
                            }})
                        }
                    ) { padding ->
                        ProductList(modifier = Modifier.padding(padding))
                    }
                }
            }
        }
    }
}

@Composable
fun ProductList(modifier: Modifier = Modifier) {
    LazyColumn(
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(100) {
            ProductItem()
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ProductItem() {
    Column() {
        Box(
            Modifier
                .height(200.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = rememberAsyncImagePainter("https://loremflickr.com/640/360"),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(16.dp)
        ) {
            Text(text = "Title 1", style = MaterialTheme.typography.h6)
        }

    }
}