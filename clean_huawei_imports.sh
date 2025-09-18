#!/bin/bash

# Скрипт для удаления Huawei импортов из Java файлов

echo "Очистка Huawei импортов из Java файлов..."

# Найти все Java файлы с Huawei импортами
find /workspace/app/src/main/java/ -name "*.java" -exec grep -l "import.*huawei\|import.*Huawei\|import.*HUAWEI" {} \; | while read file; do
    echo "Обрабатываем: $file"
    
    # Создать временный файл
    temp_file=$(mktemp)
    
    # Удалить строки с Huawei импортами
    grep -v "import.*huawei\|import.*Huawei\|import.*HUAWEI" "$file" > "$temp_file"
    
    # Заменить оригинальный файл
    mv "$temp_file" "$file"
done

echo "Очистка завершена!"