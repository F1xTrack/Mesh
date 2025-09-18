package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class H5 implements I5 {
    @Override // defpackage.I5
    public final InterfaceC7916x5 D(KX kx) {
        O90.f(kx, "fqName");
        return null;
    }

    @Override // defpackage.I5
    public final boolean g(KX kx) {
        return AbstractC6447pN1.c(this, kx);
    }

    @Override // defpackage.I5
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return LN.a;
    }

    public final String toString() {
        return "EMPTY";
    }
}
