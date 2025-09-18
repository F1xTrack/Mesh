package p000;

import java.util.Iterator;

/* renamed from: lg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10168lg1 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f37245a;

    /* renamed from: a */
    public abstract byte mo2124a();

    @Override // java.util.Iterator, java.util.ListIterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(mo2124a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f37245a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
