package com.yandex.runtime.bindings.internal;

import android.os.Build;
import com.yandex.runtime.NativeObject;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class StringDictionary<E> extends AbstractMap<String, E> {
    private ConcurrentHashMap<String, E> map = new ConcurrentHashMap<>();
    private NativeObject nativeObject;

    public StringDictionary(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj) || containsKeyNative(obj);
    }

    public native boolean containsKeyNative(Object obj);

    @Override // java.util.AbstractMap, java.util.Map
    public native Set<Map.Entry<String, E>> entrySet();

    @Override // java.util.AbstractMap, java.util.Map
    public E get(Object obj) {
        E e = this.map.get(obj);
        if (e != null) {
            return e;
        }
        E e2 = getNative(obj);
        if (e2 == null) {
            return e2;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            E ePutIfAbsent = this.map.putIfAbsent((String) obj, e2);
            return ePutIfAbsent != null ? ePutIfAbsent : e2;
        }
        synchronized (this.map) {
            E e3 = this.map.get((String) obj);
            if (e3 != null) {
                e2 = e3;
            } else {
                this.map.put((String) obj, e2);
            }
        }
        return e2;
    }

    public native E getNative(Object obj);

    @Override // java.util.AbstractMap, java.util.Map
    public native int size();
}
