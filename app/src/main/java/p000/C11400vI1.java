package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: vI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11400vI1 extends LinkedHashMap {

    /* renamed from: b */
    public static final C11400vI1 f44324b;

    /* renamed from: a */
    public boolean f44325a = true;

    static {
        C11400vI1 c11400vI1 = new C11400vI1();
        f44324b = c11400vI1;
        c11400vI1.f44325a = false;
    }

    /* renamed from: a */
    public static C11400vI1 m25382a() {
        return f44324b;
    }

    /* renamed from: k */
    public static int m25383k(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof ZG1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC11398vH1.f44320a;
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
        m25387l();
        super.clear();
    }

    /* renamed from: e */
    public final C11400vI1 m25384e() {
        if (isEmpty()) {
            return new C11400vI1();
        }
        C11400vI1 c11400vI1 = new C11400vI1(this);
        c11400vI1.f44325a = true;
        return c11400vI1;
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
        int iM25383k = 0;
        for (Map.Entry entry : entrySet()) {
            iM25383k += m25383k(entry.getValue()) ^ m25383k(entry.getKey());
        }
        return iM25383k;
    }

    /* renamed from: i */
    public final void m25385i() {
        this.f44325a = false;
    }

    /* renamed from: j */
    public final boolean m25386j() {
        return this.f44325a;
    }

    /* renamed from: l */
    public final void m25387l() {
        if (!this.f44325a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m25387l();
        Charset charset = AbstractC11398vH1.f44320a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m25387l();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC11398vH1.f44320a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m25387l();
        return super.remove(obj);
    }
}
