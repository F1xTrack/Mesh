package p000;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Yu */
/* loaded from: classes.dex */
public abstract class AbstractC1567Yu implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f14583a = 0;

    /* renamed from: b */
    public int f14584b;

    /* renamed from: c */
    public int f14585c;

    /* renamed from: d */
    public int f14586d;

    /* renamed from: e */
    public final /* synthetic */ AbstractMap f14587e;

    public AbstractC1567Yu(C1752av c1752av, byte b) {
        this.f14587e = c1752av;
        this.f14584b = c1752av.f16669f;
        this.f14585c = c1752av.isEmpty() ? -1 : 0;
        this.f14586d = -1;
    }

    /* renamed from: a */
    public abstract Object mo8870a(int i);

    /* renamed from: b */
    public abstract Object mo9388b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14583a) {
            case 0:
                if (this.f14585c >= 0) {
                }
                break;
            default:
                if (this.f14585c >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14583a) {
            case 0:
                C1752av c1752av = (C1752av) this.f14587e;
                if (c1752av.f16669f != this.f14584b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f14585c;
                this.f14586d = i;
                Object objMo8870a = mo8870a(i);
                int i2 = this.f14585c + 1;
                if (i2 >= c1752av.f16670g) {
                    i2 = -1;
                }
                this.f14585c = i2;
                return objMo8870a;
            default:
                C1752av c1752av2 = (C1752av) this.f14587e;
                if (c1752av2.f16669f != this.f14584b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f14585c;
                this.f14586d = i3;
                Object objMo9388b = mo9388b(i3);
                int i4 = this.f14585c + 1;
                if (i4 >= c1752av2.f16670g) {
                    i4 = -1;
                }
                this.f14585c = i4;
                return objMo9388b;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14583a) {
            case 0:
                C1752av c1752av = (C1752av) this.f14587e;
                if (c1752av.f16669f != this.f14584b) {
                    throw new ConcurrentModificationException();
                }
                QL1.m6671g(this.f14586d >= 0, "no calls to next() since the last call to remove()");
                this.f14584b += 32;
                c1752av.remove(c1752av.m10366k()[this.f14586d]);
                this.f14585c--;
                this.f14586d = -1;
                return;
            default:
                C1752av c1752av2 = (C1752av) this.f14587e;
                if (c1752av2.f16669f != this.f14584b) {
                    throw new ConcurrentModificationException();
                }
                Q12.m6551e("no calls to next() since the last call to remove()", this.f14586d >= 0);
                this.f14584b += 32;
                c1752av2.remove(c1752av2.m10370o()[this.f14586d]);
                this.f14585c--;
                this.f14586d = -1;
                return;
        }
    }

    public AbstractC1567Yu(C1752av c1752av) {
        this.f14587e = c1752av;
        this.f14584b = c1752av.f16669f;
        this.f14585c = c1752av.isEmpty() ? -1 : 0;
        this.f14586d = -1;
    }
}
