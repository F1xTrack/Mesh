package defpackage;

import java.util.Map;

/* renamed from: rL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6822rL1 implements Map.Entry, Comparable {
    public final Comparable a;
    public Object b;
    public final /* synthetic */ C5677lL1 c;

    public C6822rL1(C5677lL1 c5677lL1, Comparable comparable, Object obj) {
        this.c = c5677lL1;
        this.a = comparable;
        this.b = obj;
    }

    public final Comparable a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((C6822rL1) obj).a);
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
    public final /* synthetic */ Object getKey() {
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
        this.c.i();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        return AbstractC1705Vq.h(String.valueOf(this.a), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.b));
    }
}
