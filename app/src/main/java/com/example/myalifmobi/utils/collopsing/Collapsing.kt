package com.example.myalifmobi.utils.collopsing

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.ui.graphics.Color




import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Material3ScaffoldLibrary() {
    val listState = rememberScrollState()

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

    val isCollapsed: Boolean by remember {
        derivedStateOf {
            scrollBehavior.state.collapsedFraction == 1f
        }
    }
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {

            LibraryTopBar(scrollBehavior, isCollapsed) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(listState),
            ) {
            ExpandedTopBar()
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")
            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")
            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")
            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")
            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }
            Column(modifier = Modifier.height(40.dp)) {
                Text(text = "sabina")

            }


        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LibraryTopBar(scrollBehavior: TopAppBarScrollBehavior, isCollapsed: Boolean) =
    LargeTopAppBar(
        title = { Text(text = "Library") },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.White,
            scrolledContainerColor = MaterialTheme.colorScheme.background,
            titleContentColor = if (isCollapsed) {
                MaterialTheme.colorScheme.onBackground
            } else {
                MaterialTheme.colorScheme.onPrimary
            },
        ),
        scrollBehavior = scrollBehavior,
    )
@Composable
private fun CollapsedTopBar(modifier: Modifier = Modifier, isCollapsed: Boolean) {
    val color: Color by animateColorAsState(
        if (isCollapsed) androidx.compose.material.MaterialTheme.colors.background else androidx.compose.material.MaterialTheme.colors.primaryVariant,
        label = ""
    )
    Box(
        modifier = modifier
            .background(color)
            .fillMaxWidth()
            .height(56.dp)
            .padding(16.dp),
        contentAlignment = Alignment.BottomStart
    ) {
        AnimatedVisibility(visible = isCollapsed) {
            androidx.compose.material.Text(text = "Library")
        }
    }
}

@Composable
private fun ExpandedTopBar() {
    Box(
        modifier = Modifier
            .background(androidx.compose.material.MaterialTheme.colors.primaryVariant)
            .fillMaxWidth()
            .height(144.dp),
        contentAlignment = Alignment.BottomStart
    ) {
        androidx.compose.material.Text(
            modifier = Modifier.padding(16.dp),
            text = "Library",
            color = Color.White,
            style = androidx.compose.material.MaterialTheme.typography.h3,
        )
    }
}

@Preview
@Composable
private fun CollapsedTopBarPreview() {
    Column {
        CollapsedTopBar(isCollapsed = true)
        Spacer(Modifier.height(16.dp))
        CollapsedTopBar(isCollapsed = false)
    }
}

@Preview
@Composable
private fun ExpandedTopBarPreview() {
    ExpandedTopBar()
}
