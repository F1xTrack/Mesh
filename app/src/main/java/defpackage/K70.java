package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class K70 extends H0 implements Serializable {
    public final Object a;
    public final Object b;

    public K70(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
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
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
