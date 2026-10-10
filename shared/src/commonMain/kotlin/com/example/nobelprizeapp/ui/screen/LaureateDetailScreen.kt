package com.example.nobelprizeapp.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nobelprizeapp.domain.model.Laureate
import nobelprizeapp.shared.generated.resources.Res
import nobelprizeapp.shared.generated.resources.back
import nobelprizeapp.shared.generated.resources.birth_date_label
import nobelprizeapp.shared.generated.resources.birth_place_label
import nobelprizeapp.shared.generated.resources.gender_label
import nobelprizeapp.shared.generated.resources.laureate_not_found
import nobelprizeapp.shared.generated.resources.prizes_title
import org.jetbrains.compose.resources.stringResource

@Composable
fun LaureateDetailScreen(
    laureate: Laureate?,
    onBack: () -> Unit
) {
    if (laureate == null) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(stringResource(Res.string.laureate_not_found))
        }
        return
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(laureate.knownName) },
                navigationIcon = {
                    // Простая текстовая кнопка вместо иконки — чтобы не тянуть material-icons
                    TextButton(onClick = onBack) {
                        Text("← ${stringResource(Res.string.back)}")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier.padding(padding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(laureate.fullName, style = MaterialTheme.typography.headlineSmall)
            Text("${stringResource(Res.string.birth_date_label)}: ${laureate.birthDate}")
            Text("${stringResource(Res.string.birth_place_label)}: ${laureate.birthPlace}")
            Text("${stringResource(Res.string.gender_label)}: ${laureate.gender}")
            HorizontalDivider()
            Text(stringResource(Res.string.prizes_title), style = MaterialTheme.typography.titleLarge)
            laureate.nobelPrizes.forEach { prize ->
                Card {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("${prize.category}, ${prize.awardYear}", style = MaterialTheme.typography.titleMedium)
                        Spacer(Modifier.height(4.dp))
                        Text(prize.motivation, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}