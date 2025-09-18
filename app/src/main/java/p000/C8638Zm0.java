package p000;

import java.util.Map;

/* renamed from: Zm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8638Zm0 implements Map.Entry, InterfaceC11315ue0 {

    /* renamed from: a */
    public final C8896bn0 f15121a;

    /* renamed from: b */
    public final int f15122b;

    public C8638Zm0(C8896bn0 c8896bn0, int i) {
        O90.m5968f(c8896bn0, "map");
        this.f15121a = c8896bn0;
        this.f15122b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (O90.m5963a(entry.getKey(), getKey()) && O90.m5963a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15121a.f17145a[this.f15122b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f15121a.f17146b;
        O90.m5965c(objArr);
        return objArr[this.f15122b];
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
        C8896bn0 c8896bn0 = this.f15121a;
        c8896bn0.m10511c();
        Object[] objArr = c8896bn0.f17146b;
        if (objArr == null) {
            int length = c8896bn0.f17145a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c8896bn0.f17146b = objArr;
        }
        int i = this.f15122b;
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
