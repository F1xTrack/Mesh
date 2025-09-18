package com.yandex.runtime.bindings;

import java.lang.Enum;

/* loaded from: classes2.dex */
public class EnumHandler<T extends Enum<T>> implements ArchivingHandler<T> {
    private Class<T> enumClass;
    private final boolean isOptional;

    public EnumHandler(Class<T> cls) {
        this(false, cls);
    }

    public EnumHandler(boolean z, Class<T> cls) {
        this.isOptional = z;
        this.enumClass = cls;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public T add(T t, Archive archive) {
        return (T) archive.add((Archive) t, this.isOptional, (Class<Archive>) this.enumClass);
    }
}
