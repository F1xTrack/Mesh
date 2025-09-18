package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: hn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9669hn0 extends LinkedHashMap {

    /* renamed from: b */
    public static final C9669hn0 f28584b;

    /* renamed from: a */
    public boolean f28585a = true;

    static {
        C9669hn0 c9669hn0 = new C9669hn0();
        f28584b = c9669hn0;
        c9669hn0.f28585a = false;
    }

    /* renamed from: a */
    public final void m18880a() {
        if (!this.f28585a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m18880a();
        super.clear();
    }

    /* renamed from: e */
    public final C9669hn0 m18881e() {
        if (isEmpty()) {
            return new C9669hn0();
        }
        C9669hn0 c9669hn0 = new C9669hn0(this);
        c9669hn0.f28585a = true;
        return c9669hn0;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                for (Map.Entry entry : entrySet()) {
                    if (map.containsKey(entry.getKey())) {
                        Object value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                        }
                    }
                }
                z = true;
            }
            z = false;
            break;
        }
        z = true;
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC11889z90.f46666a;
                iHashCode = bArr.length;
                for (byte b : bArr) {
                    iHashCode = (iHashCode * 31) + b;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = AbstractC11889z90.f46666a;
                iHashCode2 = bArr2.length;
                for (byte b2 : bArr2) {
                    iHashCode2 = (iHashCode2 * 31) + b2;
                }
                if (iHashCode2 == 0) {
                    iHashCode2 = 1;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m18880a();
        Charset charset = AbstractC11889z90.f46666a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m18880a();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC11889z90.f46666a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m18880a();
        return super.remove(obj);
    }
}
