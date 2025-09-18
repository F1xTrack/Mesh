package p000;

import java.util.Map;

/* loaded from: classes.dex */
public final class TU0 implements Map.Entry {

    /* renamed from: a */
    public final Object f11396a;

    /* renamed from: b */
    public final Object f11397b;

    /* renamed from: c */
    public TU0 f11398c;

    /* renamed from: d */
    public TU0 f11399d;

    public TU0(Object obj, Object obj2) {
        this.f11396a = obj;
        this.f11397b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TU0)) {
            return false;
        }
        TU0 tu0 = (TU0) obj;
        return this.f11396a.equals(tu0.f11396a) && this.f11397b.equals(tu0.f11397b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11396a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11397b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f11396a.hashCode() ^ this.f11397b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f11396a + ContainerUtils.KEY_VALUE_DELIMITER + this.f11397b;
    }
}
