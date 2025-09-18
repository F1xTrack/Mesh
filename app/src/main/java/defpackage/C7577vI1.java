package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: vI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7577vI1 extends LinkedHashMap {
    public static final C7577vI1 b;
    public boolean a = true;

    static {
        C7577vI1 c7577vI1 = new C7577vI1();
        b = c7577vI1;
        c7577vI1.a = false;
    }

    public static C7577vI1 a() {
        return b;
    }

    public static int k(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof ZG1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC7574vH1.a;
        int length = bArr.length;
        for (byte b2 : bArr) {
            length = (length * 31) + b2;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        super.clear();
    }

    public final C7577vI1 e() {
        if (isEmpty()) {
            return new C7577vI1();
        }
        C7577vI1 c7577vI1 = new C7577vI1(this);
        c7577vI1.a = true;
        return c7577vI1;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iK = 0;
        for (Map.Entry entry : entrySet()) {
            iK += k(entry.getValue()) ^ k(entry.getKey());
        }
        return iK;
    }

    public final void i() {
        this.a = false;
    }

    public final boolean j() {
        return this.a;
    }

    public final void l() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l();
        Charset charset = AbstractC7574vH1.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC7574vH1.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l();
        return super.remove(obj);
    }
}
