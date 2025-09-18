package p000;

import java.io.Serializable;

/* renamed from: xD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11644xD1 extends ZB1 implements Serializable {

    /* renamed from: a */
    public final Object f45483a;

    /* renamed from: b */
    public final Object f45484b;

    public C11644xD1(Object obj, Object obj2) {
        this.f45483a = obj;
        this.f45484b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f45483a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f45484b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
