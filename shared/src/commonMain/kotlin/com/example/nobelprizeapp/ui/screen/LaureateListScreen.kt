package com.example.nobelprizeapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.nobelprizeapp.domain.model.Laureate
import nobelprizeapp.shared.generated.resources.Res
import nobelprizeapp.shared.generated.resources.laureates_list_title
import org.jetbrains.compose.resources.stringResource

@Composable
fun LaureateListScreen(
    state: NobelPrizeState,
    onIntent: (NobelPrizeIntent) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(stringResource(Res.string.laureates_list_title)) })
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.padding(padding).fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(state.laureates, key = { it.id }) { laureate ->
                LaureateCard(
                    laureate = laureate,
                    onClick = { onIntent(NobelPrizeIntent.SelectLaureate(laureate.id)) }
                )
            }
        }
    }
}

@Composable
fun LaureateCard(laureate: Laureate, onClick: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primaryContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = laureate.knownName.first().toString(),
                    style = MaterialTheme.typography.headlineMedium,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = laureate.knownName, style = MaterialTheme.typography.titleMedium)
                Text(
                    text = laureate.nobelPrizes.firstOrNull()?.category ?: "",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = laureate.nobelPrizes.firstOrNull()?.awardYear ?: "",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}