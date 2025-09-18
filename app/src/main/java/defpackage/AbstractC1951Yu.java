package defpackage;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Yu */
/* loaded from: classes.dex */
public abstract class AbstractC1951Yu implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public AbstractC1951Yu(C2223av c2223av, byte b) {
        this.e = c2223av;
        this.b = c2223av.f;
        this.c = c2223av.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c >= 0) {
                }
                break;
            default:
                if (this.c >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                C2223av c2223av = (C2223av) this.e;
                if (c2223av.f != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.c;
                this.d = i;
                Object objA = a(i);
                int i2 = this.c + 1;
                if (i2 >= c2223av.g) {
                    i2 = -1;
                }
                this.c = i2;
                return objA;
            default:
                C2223av c2223av2 = (C2223av) this.e;
                if (c2223av2.f != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.c;
                this.d = i3;
                Object objB = b(i3);
                int i4 = this.c + 1;
                if (i4 >= c2223av2.g) {
                    i4 = -1;
                }
                this.c = i4;
                return objB;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                C2223av c2223av = (C2223av) this.e;
                if (c2223av.f != this.b) {
                    throw new ConcurrentModificationException();
                }
                QL1.g(this.d >= 0, "no calls to next() since the last call to remove()");
                this.b += 32;
                c2223av.remove(c2223av.k()[this.d]);
                this.c--;
                this.d = -1;
                return;
            default:
                C2223av c2223av2 = (C2223av) this.e;
                if (c2223av2.f != this.b) {
                    throw new ConcurrentModificationException();
                }
                Q12.e("no calls to next() since the last call to remove()", this.d >= 0);
                this.b += 32;
                c2223av2.remove(c2223av2.o()[this.d]);
                this.c--;
                this.d = -1;
                return;
        }
    }

    public AbstractC1951Yu(C2223av c2223av) {
        this.e = c2223av;
        this.b = c2223av.f;
        this.c = c2223av.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
