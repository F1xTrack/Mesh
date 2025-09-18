package defpackage;

import java.util.Map;

/* renamed from: Zm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2006Zm0 implements Map.Entry, InterfaceC7451ue0 {
    public final C2391bn0 a;
    public final int b;

    public C2006Zm0(C2391bn0 c2391bn0, int i) {
        O90.f(c2391bn0, "map");
        this.a = c2391bn0;
        this.b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (O90.a(entry.getKey(), getKey()) && O90.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.a[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.a.b;
        O90.c(objArr);
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C2391bn0 c2391bn0 = this.a;
        c2391bn0.c();
        Object[] objArr = c2391bn0.b;
        if (objArr == null) {
            int length = c2391bn0.a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c2391bn0.b = objArr;
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
