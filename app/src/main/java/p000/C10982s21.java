package p000;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* renamed from: s21 */
/* loaded from: classes.dex */
public final class C10982s21 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f42220a;

    /* renamed from: b */
    public Object f42221b;

    /* renamed from: c */
    public final /* synthetic */ C10470o21 f42222c;

    public C10982s21(C10470o21 c10470o21, Comparable comparable, Object obj) {
        this.f42222c = c10470o21;
        this.f42220a = comparable;
        this.f42221b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f42220a.compareTo(((C10982s21) obj).f42220a);
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
        Comparable comparable = this.f42220a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f42221b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f42220a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f42221b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f42220a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f42221b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f42222c.m23315b();
        Object obj2 = this.f42221b;
        this.f42221b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f42220a + ContainerUtils.KEY_VALUE_DELIMITER + this.f42221b;
    }
}
