package defpackage;

import java.util.Map;

/* renamed from: r21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6763r21 implements Comparable, Map.Entry {
    public final Comparable a;
    public Object b;
    public final /* synthetic */ C6000n21 c;

    public C6763r21(C6000n21 c6000n21, Comparable comparable, Object obj) {
        this.c = c6000n21;
        this.a = comparable;
        this.b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((C6763r21) obj).a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.b();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        return AbstractC7209tN0.z(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2);
    }
}
