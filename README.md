# Nobel Prize App

Compose Multiplatform lab 1 — приложение со списком нобелевских лауреатов.

## Стек

- Kotlin Multiplatform
- Compose Multiplatform
- Navigation 3 (JetBrains: `org.jetbrains.androidx.navigation3:navigation3-ui`)
- Material 3

## Что реализовано

- Список из 20 лауреатов (моки по форме Nobel Prize API)
- Экран детали с информацией о премии
- Навигация с обратными переходами (`popTransitionSpec`)
- Локализация EN / RU через `composeResources`
- Переключение темы в памяти сессии
- Чистая архитектура: `data` / `domain` / `ui`
- Состояние экрана через ViewModel (`state` + `onIntent`)

## Запуск

```bash
./gradlew :desktopApp:run