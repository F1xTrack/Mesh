package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: gn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9541gn0 extends LinkedHashMap {

    /* renamed from: b */
    public static final C9541gn0 f27993b;

    /* renamed from: a */
    public boolean f27994a = true;

    static {
        C9541gn0 c9541gn0 = new C9541gn0();
        f27993b = c9541gn0;
        c9541gn0.f27994a = false;
    }

    /* renamed from: a */
    public static int m18639a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof EnumC3909d8) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC11635x90.f45425a;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m18640e();
        super.clear();
    }

    /* renamed from: e */
    public final void m18640e() {
        if (!this.f27994a) {
            throw new UnsupportedOperationException();
        }
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
        int iM18639a = 0;
        for (Map.Entry entry : entrySet()) {
            iM18639a += m18639a(entry.getValue()) ^ m18639a(entry.getKey());
        }
        return iM18639a;
    }

    /* renamed from: i */
    public final C9541gn0 m18641i() {
        if (isEmpty()) {
            return new C9541gn0();
        }
        C9541gn0 c9541gn0 = new C9541gn0(this);
        c9541gn0.f27994a = true;
        return c9541gn0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m18640e();
        Charset charset = AbstractC11635x90.f45425a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m18640e();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC11635x90.f45425a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m18640e();
        return super.remove(obj);
    }
}
