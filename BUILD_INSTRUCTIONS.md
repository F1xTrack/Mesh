# Инструкции по сборке приложения "Дневник МЭШ"

## Что было восстановлено

Я восстановил все недостающие файлы для компиляции декомпилированного приложения:

### 1. Gradle файлы
- ✅ `build.gradle` (корневой) - с плагинами Firebase, Huawei HMS
- ✅ `app/build.gradle` - с полным списком зависимостей
- ✅ `settings.gradle` - настройки проекта
- ✅ `gradle.properties` - свойства Gradle
- ✅ `local.properties` - путь к Android SDK
- ✅ `gradlew` и `gradlew.bat` - Gradle wrapper
- ✅ `gradle/wrapper/gradle-wrapper.properties` - настройки wrapper

### 2. ProGuard
- ✅ `app/proguard-rules.pro` - правила обфускации

### 3. Конфигурационные файлы
- ✅ `app/google-services.json` - конфигурация Firebase
- ✅ `app/agconnect-services.json` - конфигурация Huawei HMS

### 4. XML ресурсы
- ✅ `app/src/main/res/xml/network_security_config.xml`
- ✅ `app/src/main/res/xml/file_provider_paths.xml`
- ✅ `app/src/main/res/xml/file_paths.xml`
- ✅ `app/src/main/res/xml/provider_paths.xml`
- ✅ `app/src/main/res/xml/file_system_provider_paths.xml`
- ✅ `app/src/main/res/xml/file_viewer_provider_paths.xml`
- ✅ `app/src/main/res/xml/ivpusic_imagepicker_provider_paths.xml`
- ✅ `app/src/main/res/xml/share_download_paths.xml`

### 5. React Native файлы
- ✅ `package.json` - зависимости React Native
- ✅ `babel.config.js` - конфигурация Babel
- ✅ `metro.config.js` - конфигурация Metro
- ✅ `react-native.config.js` - конфигурация React Native
- ✅ `index.js` - точка входа
- ✅ `App.js` - главный компонент
- ✅ `app.json` - метаданные приложения

### 6. Другие файлы
- ✅ `.gitignore` - исключения для Git
- ✅ `README.md` - документация
- ✅ `BUILD_INSTRUCTIONS.md` - эти инструкции

## Зависимости

Приложение использует множество библиотек:

### React Native
- React Native 0.74.5
- React 18.2.0

### Firebase
- Firebase Analytics
- Firebase Messaging
- Firebase Crashlytics
- Firebase Performance
- Firebase Remote Config

### Google Play Services
- Google Auth
- Google Maps
- Google Location Services
- Google Billing
- ML Kit

### Huawei HMS
- Huawei Push Kit
- Huawei Maps
- Huawei Location Services

### RuStore
- RuStore Push Client
- RuStore Remote Config
- RuStore Review
- RuStore Activity Launcher

### Другие библиотеки
- Yandex Maps
- Sentry для crash reporting
- OkHttp для сетевых запросов
- Glide для загрузки изображений
- CameraX для работы с камерой
- Biometric для биометрии
- Room для базы данных
- Work Manager для фоновых задач

## Инструкции по сборке

### 1. Установка зависимостей
```bash
# Установка Node.js зависимостей
npm install

# Установка Android SDK (если не установлен)
# Скачайте Android Studio и установите SDK
```

### 2. Настройка окружения
```bash
# Установите правильный путь к Android SDK в local.properties
echo "sdk.dir=/path/to/your/android-sdk" > local.properties
```

### 3. Сборка приложения
```bash
# Debug сборка
cd android
./gradlew assembleDebug

# Release сборка
./gradlew assembleRelease
```

### 4. Установка на устройство
```bash
# Установка debug версии
./gradlew installDebug

# Установка release версии
./gradlew installRelease
```

## Возможные проблемы

### 1. Ошибки зависимостей
- Убедитесь, что все репозитории доступны
- Проверьте версии зависимостей

### 2. Ошибки ProGuard
- Проверьте правила в `proguard-rules.pro`
- Добавьте исключения для проблемных классов

### 3. Ошибки Firebase/HMS
- Убедитесь, что конфигурационные файлы корректны
- Проверьте API ключи

### 4. Ошибки React Native
- Убедитесь, что Metro bundler запущен
- Проверьте версии Node.js и React Native

## Примечания

- Приложение поддерживает архитектуры: ARM64, ARMv7, x86, x86_64
- Используется Hermes JavaScript engine
- Поддерживается новая архитектура React Native
- Приложение использует множество push-сервисов для максимальной совместимости

## Лицензия

Этот проект является декомпилированной версией приложения "Дневник МЭШ". Все права принадлежат разработчикам оригинального приложения.