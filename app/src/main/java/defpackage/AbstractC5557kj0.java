package defpackage;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: kj0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5557kj0 implements Iterator {
    public int b;
    public Map.Entry c;
    public final /* synthetic */ AbstractMap e;
    public final /* synthetic */ int a = 0;
    public Map.Entry d = null;

    public AbstractC5557kj0(C5939mj0 c5939mj0) {
        this.e = c5939mj0;
        this.c = (C5748lj0) ((C5748lj0) c5939mj0.g).i;
        this.b = c5939mj0.e;
    }

    public C5748lj0 a() {
        C5748lj0 c5748lj0 = (C5748lj0) this.c;
        C5939mj0 c5939mj0 = (C5939mj0) this.e;
        if (c5748lj0 == ((C5748lj0) c5939mj0.g)) {
            throw new NoSuchElementException();
        }
        if (c5939mj0.e != this.b) {
            throw new ConcurrentModificationException();
        }
        this.c = (C5748lj0) c5748lj0.i;
        this.d = c5748lj0;
        return c5748lj0;
    }

    public C5748lj0 b() {
        C5748lj0 c5748lj0 = (C5748lj0) this.c;
        C5939mj0 c5939mj0 = (C5939mj0) this.e;
        if (c5748lj0 == ((C5748lj0) c5939mj0.g)) {
            throw new NoSuchElementException();
        }
        if (c5939mj0.e != this.b) {
            throw new ConcurrentModificationException();
        }
        this.c = (C5748lj0) c5748lj0.i;
        this.d = c5748lj0;
        return c5748lj0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (((C5748lj0) this.c) != ((C5748lj0) ((C5939mj0) this.e).g)) {
                }
                break;
            default:
                if (((C5748lj0) this.c) != ((C5748lj0) ((C5939mj0) this.e).g)) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.a) {
            case 0:
                return a();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                C5748lj0 c5748lj0 = (C5748lj0) this.d;
                if (c5748lj0 == null) {
                    throw new IllegalStateException();
                }
                C5939mj0 c5939mj0 = (C5939mj0) this.e;
                c5939mj0.e(c5748lj0, true);
                this.d = null;
                this.b = c5939mj0.e;
                return;
            default:
                C5748lj0 c5748lj02 = (C5748lj0) this.d;
                if (c5748lj02 == null) {
                    throw new IllegalStateException();
                }
                C5939mj0 c5939mj02 = (C5939mj0) this.e;
                c5939mj02.f(c5748lj02, true);
                this.d = null;
                this.b = c5939mj02.e;
                return;
        }
    }

    public AbstractC5557kj0(C5939mj0 c5939mj0, byte b) {
        this.e = c5939mj0;
        this.c = (C5748lj0) ((C5748lj0) c5939mj0.g).i;
        this.b = c5939mj0.e;
    }
}
