package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class TU0 implements Map.Entry {
    public final Object a;
    public final Object b;
    public TU0 c;
    public TU0 d;

    public TU0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
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
        return this.a.equals(tu0.a) && this.b.equals(tu0.b);
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
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + ContainerUtils.KEY_VALUE_DELIMITER + this.b;
    }
}
