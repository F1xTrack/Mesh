package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressLint({"all"})
/* renamed from: com.yandex.metrica.impl.ob.Xm */
/* loaded from: classes2.dex */
public class C3063Xm<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f22828a;

    /* renamed from: b */
    private int f22829b;

    /* renamed from: c */
    private int f22830c;

    /* renamed from: d */
    private int f22831d;

    /* renamed from: e */
    private int f22832e;

    /* renamed from: f */
    private int f22833f;

    /* renamed from: g */
    private int f22834g;

    public C3063Xm(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f22830c = i;
        this.f22828a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private int m15437b(K k, V v) {
        int length = C2819O2.m14689c(((C3061Xk) k).f22826b).length + 12;
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Negative size: " + k + ContainerUtils.KEY_VALUE_DELIMITER + v);
    }

    /* renamed from: a */
    public final synchronized V m15438a(K k) {
        V v = this.f22828a.get(k);
        if (v != null) {
            this.f22833f++;
            return v;
        }
        this.f22834g++;
        return null;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.f22833f;
            i2 = this.f22834g + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f22830c), Integer.valueOf(this.f22833f), Integer.valueOf(this.f22834g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    /* renamed from: a */
    public final synchronized V m15439a(K k, V v) {
        V vPut;
        try {
            this.f22831d++;
            this.f22829b += m15437b(k, v);
            vPut = this.f22828a.put(k, v);
            if (vPut != null) {
                this.f22829b -= m15437b(k, vPut);
            }
            m15436a(this.f22830c);
        } catch (Throwable th) {
            throw th;
        }
        return vPut;
    }

    /* renamed from: a */
    private void m15436a(int i) {
        Map.Entry<K, V> next;
        while (this.f22829b > i && !this.f22828a.isEmpty() && (next = this.f22828a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            V value = next.getValue();
            this.f22828a.remove(key);
            this.f22829b -= m15437b(key, value);
            this.f22832e++;
        }
        if (this.f22829b < 0 || (this.f22828a.isEmpty() && this.f22829b != 0)) {
            throw new IllegalStateException(getClass().getName().concat(".sizeOf() is reporting inconsistent results!"));
        }
    }

    /* renamed from: a */
    public final synchronized void m15440a() {
        m15436a(-1);
    }
}
