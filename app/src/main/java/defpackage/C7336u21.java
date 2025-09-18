package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: u21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7336u21 implements Iterator {
    public static final C7336u21 b = new C7336u21(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C7336u21(int i) {
        this.a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                throw new NoSuchElementException();
            case 1:
                throw new NoSuchElementException();
            case 2:
                throw new NoSuchElementException();
            default:
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
