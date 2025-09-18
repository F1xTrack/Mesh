package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class FG1 extends LinkedHashMap {

    /* renamed from: b */
    public static final FG1 f3137b;

    /* renamed from: a */
    public boolean f3138a = true;

    static {
        FG1 fg1 = new FG1();
        f3137b = fg1;
        fg1.f3138a = false;
    }

    /* renamed from: a */
    public static FG1 m2571a() {
        return f3137b;
    }

    /* renamed from: k */
    public static int m2572k(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof EnumC10768qM1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC9090dF1.f25904a;
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
        m2576l();
        super.clear();
    }

    /* renamed from: e */
    public final FG1 m2573e() {
        if (isEmpty()) {
            return new FG1();
        }
        FG1 fg1 = new FG1(this);
        fg1.f3138a = true;
        return fg1;
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
        int iM2572k = 0;
        for (Map.Entry entry : entrySet()) {
            iM2572k += m2572k(entry.getValue()) ^ m2572k(entry.getKey());
        }
        return iM2572k;
    }

    /* renamed from: i */
    public final void m2574i() {
        this.f3138a = false;
    }

    /* renamed from: j */
    public final boolean m2575j() {
        return this.f3138a;
    }

    /* renamed from: l */
    public final void m2576l() {
        if (!this.f3138a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m2576l();
        Charset charset = AbstractC9090dF1.f25904a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m2576l();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC9090dF1.f25904a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m2576l();
        return super.remove(obj);
    }
}
