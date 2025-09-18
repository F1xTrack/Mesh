# Решение проблем сборки

## Проблема с Huawei AGConnect

Если вы получаете ошибку:
```
Could not find com.huawei.agconnect:agcp:1.9.1.300
```

### Решение 1: Использовать версию без Huawei HMS

Замените файлы на версии без Huawei:

```bash
# Сделайте резервные копии
cp build.gradle build.gradle.backup
cp app/build.gradle app/build.gradle.backup

# Замените на версии без Huawei
cp build.gradle.no-huawei build.gradle
cp app/build.gradle.no-huawei app/build.gradle
```

### Решение 2: Добавить репозиторий Huawei

Если хотите сохранить поддержку Huawei HMS, убедитесь, что в `build.gradle` есть:

```gradle
buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://developer.huawei.com/repo/' }
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:8.10.1'
        classpath 'com.google.gms:google-services:4.4.0'
        classpath 'com.google.firebase:firebase-crashlytics-gradle:2.9.9'
        classpath 'com.huawei.agconnect:agcp:1.9.1.300'
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://developer.huawei.com/repo/' }
        maven { url 'https://artifactory-external.vkpartner.ru/artifactory/maven' }
        maven { url 'https://maven.pkg.jetbrains.space/public/p/compose/dev' }
    }
}
```

### Решение 3: Использовать более старую версию AGConnect

Замените в `build.gradle`:
```gradle
classpath 'com.huawei.agconnect:agcp:1.8.1.300'
```

## Другие возможные проблемы

### Проблема с версией Gradle

Если получаете ошибки совместимости, попробуйте:

1. Обновить `gradle-wrapper.properties`:
```properties
distributionUrl=https\://services.gradle.org/distributions/gradle-8.6-bin.zip
```

2. Обновить версию Android Gradle Plugin:
```gradle
classpath 'com.android.tools.build:gradle:8.1.4'
```

### Проблема с зависимостями React Native

Если получаете ошибки с React Native зависимостями:

1. Убедитесь, что версии совместимы
2. Попробуйте использовать более старые версии:
```gradle
implementation 'com.facebook.react:react-android:0.72.6'
implementation 'com.facebook.react:react-native:0.72.6'
```

### Проблема с ProGuard

Если получаете ошибки обфускации:

1. Отключите ProGuard временно:
```gradle
buildTypes {
    release {
        minifyEnabled false
        // proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
    }
}
```

### Проблема с Firebase

Если получаете ошибки Firebase:

1. Убедитесь, что `google-services.json` находится в папке `app/`
2. Проверьте, что версии Firebase совместимы:
```gradle
implementation 'com.google.firebase:firebase-bom:32.7.4'
```

## Минимальная рабочая конфигурация

Если ничего не помогает, используйте минимальную конфигурацию:

### build.gradle (минимальный)
```gradle
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:8.1.4'
        classpath 'com.google.gms:google-services:4.4.0'
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}
```

### app/build.gradle (минимальный)
```gradle
plugins {
    id 'com.android.application'
    id 'com.google.gms.google-services'
}

android {
    namespace "ru.mes.dnevnik"
    compileSdkVersion 34

    defaultConfig {
        applicationId 'ru.mes.dnevnik'
        minSdkVersion 23
        targetSdkVersion 34
        versionCode 1757332198
        versionName "3.64.24"
    }

    buildTypes {
        release {
            minifyEnabled false
        }
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Только основные зависимости
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.10.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    
    // Firebase
    implementation 'com.google.firebase:firebase-bom:32.7.4'
    implementation 'com.google.firebase:firebase-analytics'
    implementation 'com.google.firebase:firebase-messaging'
}
```

## Команды для диагностики

```bash
# Очистка проекта
./gradlew clean

# Проверка зависимостей
./gradlew dependencies

# Сборка с подробным выводом
./gradlew assembleDebug --info

# Проверка конфигурации
./gradlew tasks
```