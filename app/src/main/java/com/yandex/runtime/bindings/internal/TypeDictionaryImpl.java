package com.yandex.runtime.bindings.internal;

import android.os.Build;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.TypeDictionary;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public final class TypeDictionaryImpl<T> implements TypeDictionary<T> {
    private Map<String, T> map;
    private NativeObject nativeObject;

    private TypeDictionaryImpl(NativeObject nativeObject) {
        this.map = new ConcurrentHashMap();
        this.nativeObject = nativeObject;
    }

    private <U extends T> U getItemByKey(String str) {
        T t = this.map.get(str);
        if (t != null || this.nativeObject == null) {
            return t;
        }
        U u = (U) getItemNative(str);
        if (u == null) {
            return u;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            U u2 = (U) this.map.putIfAbsent(str, u);
            return u2 != null ? u2 : u;
        }
        synchronized (this.map) {
            Object obj = this.map.get(str);
            if (obj != null) {
                u = (U) obj;
            } else {
                this.map.put(str, u);
            }
        }
        return u;
    }

    private native Object getItemNative(String str);

    private native List<String> getKeys();

    private <U> String keyForClass(Class<U> cls) {
        try {
            return (String) cls.getMethod("getNativeName", null).invoke(null, null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("Objects of class ", cls.getName(), " cannot be stored in com.yandex.runtime.bindings.internal.TypeDictionaryImpl"), e);
        }
    }

    @Override // com.yandex.runtime.TypeDictionary
    public Map<String, T> getAllItems() {
        if (this.nativeObject != null) {
            Iterator<String> it = getKeys().iterator();
            while (it.hasNext()) {
                getItemByKey(it.next());
            }
        }
        return this.map;
    }

    @Override // com.yandex.runtime.TypeDictionary
    public <U extends T> U getItem(Class<U> cls) {
        String strKeyForClass = keyForClass(cls);
        if (strKeyForClass == null) {
            return null;
        }
        return (U) getItemByKey(strKeyForClass);
    }

    public TypeDictionaryImpl(Map<String, T> map) {
        new ConcurrentHashMap();
        this.map = map;
    }
}
