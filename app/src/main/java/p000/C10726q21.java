package p000;

import java.util.Map;

/* renamed from: q21 */
/* loaded from: classes.dex */
public final class C10726q21 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f40526a;

    /* renamed from: b */
    public Object f40527b;

    /* renamed from: c */
    public final /* synthetic */ C10214m21 f40528c;

    public C10726q21(C10214m21 c10214m21, Comparable comparable, Object obj) {
        this.f40528c = c10214m21;
        this.f40526a = comparable;
        this.f40527b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f40526a.compareTo(((C10726q21) obj).f40526a);
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
        Comparable comparable = this.f40526a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f40527b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f40526a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f40527b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f40526a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f40527b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f40528c.m22637b();
        Object obj2 = this.f40527b;
        this.f40527b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f40526a + ContainerUtils.KEY_VALUE_DELIMITER + this.f40527b;
    }
}
