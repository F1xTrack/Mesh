package p000;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* renamed from: r21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10854r21 implements Comparable, Map.Entry {

    /* renamed from: a */
    public final Comparable f41305a;

    /* renamed from: b */
    public Object f41306b;

    /* renamed from: c */
    public final /* synthetic */ C10342n21 f41307c;

    public C10854r21(C10342n21 c10342n21, Comparable comparable, Object obj) {
        this.f41307c = c10342n21;
        this.f41305a = comparable;
        this.f41306b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f41305a.compareTo(((C10854r21) obj).f41305a);
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
        Comparable comparable = this.f41305a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f41306b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f41305a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f41306b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f41305a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f41306b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f41307c.m23062b();
        Object obj2 = this.f41306b;
        this.f41306b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f41305a);
        String strValueOf2 = String.valueOf(this.f41306b);
        return AbstractC11153tN0.m24914z(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2);
    }
}
