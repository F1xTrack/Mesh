# Дневник МЭШ

Приложение "Дневник МЭШ" - это мобильное приложение для Московской электронной школы.

## Требования

- Node.js >= 16
- Android SDK
- Java 8 или выше
- React Native CLI

## Установка

1. Установите зависимости:
```bash
npm install
```

2. Настройте Android SDK в `local.properties`:
```
sdk.dir=/path/to/your/android-sdk
```

3. Для сборки приложения:
```bash
# Установка зависимостей
npm install

# Запуск Metro bundler
npm start

# Сборка APK
cd android
./gradlew assembleRelease
```

## Структура проекта

- `android/` - Android нативная часть
- `app/` - Основное приложение
- `src/` - Исходный код React Native
- `App.js` - Главный компонент приложения

## Зависимости

Приложение использует множество библиотек:
- React Native 0.74.5
- Firebase для аналитики и push-уведомлений
- Huawei HMS для устройств Huawei
- RuStore SDK для российского рынка
- Yandex Maps для карт
- И многие другие

## Конфигурация

### Firebase
Файл `google-services.json` содержит конфигурацию Firebase.

### Huawei HMS
Файл `agconnect-services.json` содержит конфигурацию Huawei HMS.

### Push уведомления
Приложение поддерживает push-уведомления через:
- Firebase Cloud Messaging
- Huawei Push Kit
- RuStore Push
- VK Push

## Сборка

### Debug сборка
```bash
cd android
./gradlew assembleDebug
```

### Release сборка
```bash
cd android
./gradlew assembleRelease
```

## Примечания

- Приложение использует ProGuard для обфускации кода
- Поддерживается архитектура ARM64, ARMv7, x86, x86_64
- Используется Hermes JavaScript engine
- Поддерживается новая архитектура React Native (New Architecture)

## Лицензия

Этот проект является декомпилированной версией приложения "Дневник МЭШ".