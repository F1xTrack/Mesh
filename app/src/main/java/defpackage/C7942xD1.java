package defpackage;

import java.io.Serializable;

/* renamed from: xD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7942xD1 extends ZB1 implements Serializable {
    public final Object a;
    public final Object b;

    public C7942xD1(Object obj, Object obj2) {
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
