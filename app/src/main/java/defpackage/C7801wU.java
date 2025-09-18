package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: wU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7801wU implements Iterator, InterfaceC7451ue0 {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ InterfaceC3412dY0 e;

    public C7801wU(C7991xU c7991xU) {
        this.a = 0;
        this.e = c7991xU;
        this.b = c7991xU.a.iterator();
        this.c = -1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, nZ] */
    public void a() {
        Object next;
        C7991xU c7991xU;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            } else {
                next = it.next();
                c7991xU = (C7991xU) this.e;
            }
        } while (((Boolean) c7991xU.c.invoke(next)).booleanValue() != c7991xU.b);
        this.d = next;
        this.c = 1;
    }

    public void b() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            ((M8) this.e).getClass();
            if (((Boolean) XS0.F.invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, nZ] */
    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.d = null;
                return false;
            }
            Object next = it3.next();
            C2339bW c2339bW = (C2339bW) this.e;
            it = (Iterator) c2339bW.c.invoke(c2339bW.b.invoke(next));
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            case 1:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
            default:
                if (this.c == -1) {
                    b();
                }
                return this.c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.d;
                this.d = null;
                this.c = -1;
                return obj;
            case 1:
                int i = this.c;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !c()) {
                    throw new NoSuchElementException();
                }
                this.c = 0;
                Iterator it = (Iterator) this.d;
                O90.c(it);
                return it.next();
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.d;
                this.d = null;
                this.c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7801wU(C2339bW c2339bW) {
        this.a = 1;
        this.e = c2339bW;
        this.b = c2339bW.a.iterator();
    }

    public C7801wU(M8 m8) {
        this.a = 2;
        this.e = m8;
        this.b = ((InterfaceC3412dY0) m8.b).iterator();
        this.c = -1;
    }
}
