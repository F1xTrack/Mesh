package p000;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* renamed from: rL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10894rL1 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f41606a;

    /* renamed from: b */
    public Object f41607b;

    /* renamed from: c */
    public final /* synthetic */ C10126lL1 f41608c;

    public C10894rL1(C10126lL1 c10126lL1, Comparable comparable, Object obj) {
        this.f41608c = c10126lL1;
        this.f41606a = comparable;
        this.f41607b = obj;
    }

    /* renamed from: a */
    public final Comparable m24320a() {
        return this.f41606a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f41606a.compareTo(((C10894rL1) obj).f41606a);
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
        Comparable comparable = this.f41606a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f41607b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f41606a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f41607b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f41606a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f41607b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f41608c.m22413i();
        Object obj2 = this.f41607b;
        this.f41607b = obj;
        return obj2;
    }

    public final String toString() {
        return AbstractC1374Vq.m8589h(String.valueOf(this.f41606a), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.f41607b));
    }
}
