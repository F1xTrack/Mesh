package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: u21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11238u21 implements Iterator {

    /* renamed from: b */
    public static final C11238u21 f43453b = new C11238u21(0);

    /* renamed from: a */
    public final /* synthetic */ int f43454a;

    public /* synthetic */ C11238u21(int i) {
        this.f43454a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f43454a) {
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f43454a) {
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
        switch (this.f43454a) {
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
