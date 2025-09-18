# Быстрое решение проблемы сборки

## Проблема
```
Could not find com.huawei.agconnect:agcp:1.9.1.300
```

## Быстрое решение

### Вариант 1: Использовать совместимую версию
```bash
# Замените build.gradle на совместимую версию
cp build.gradle.compatible build.gradle
```

### Вариант 2: Убрать Huawei HMS полностью
```bash
# Замените на версии без Huawei
cp build.gradle.no-huawei build.gradle
cp app/build.gradle.no-huawei app/build.gradle
```

### Вариант 3: Ручное исправление
Откройте `build.gradle` и замените:
```gradle
classpath 'com.huawei.agconnect:agcp:1.9.1.300'
```
на:
```gradle
classpath 'com.huawei.agconnect:agcp:1.8.1.300'
```

## После исправления
```bash
# Очистите проект
./gradlew clean

# Попробуйте собрать
./gradlew assembleDebug
```

## Если проблема остается

1. Проверьте интернет-соединение
2. Убедитесь, что репозиторий Huawei доступен
3. Попробуйте использовать версию без Huawei HMS

## Альтернативные репозитории Huawei

Если основной репозиторий недоступен, попробуйте:
```gradle
maven { url 'https://repo.huaweicloud.com/repository/maven/' }
```

Или:
```gradle
maven { url 'https://maven.aliyun.com/repository/public' }
```