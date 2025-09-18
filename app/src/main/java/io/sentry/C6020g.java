package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: io.sentry.g */
/* loaded from: classes2.dex */
public final class C6020g implements Iterator {

    /* renamed from: a */
    public int f34158a;

    /* renamed from: b */
    public int f34159b = -1;

    /* renamed from: c */
    public boolean f34160c;

    /* renamed from: d */
    public final /* synthetic */ C6023h f34161d;

    public C6020g(C6023h c6023h) {
        this.f34161d = c6023h;
        this.f34158a = c6023h.f34168b;
        this.f34160c = c6023h.f34170d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34160c || this.f34158a != this.f34161d.f34169c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f34160c = false;
        int i = this.f34158a;
        this.f34159b = i;
        int i2 = i + 1;
        C6023h c6023h = this.f34161d;
        this.f34158a = i2 < c6023h.f34171e ? i2 : 0;
        return c6023h.f34167a[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.f34159b;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C6023h c6023h = this.f34161d;
        int i3 = c6023h.f34168b;
        if (i2 == i3) {
            c6023h.remove();
            this.f34159b = -1;
            return;
        }
        int i4 = i2 + 1;
        int i5 = c6023h.f34171e;
        if (i3 >= i2 || i4 >= (i = c6023h.f34169c)) {
            while (i4 != c6023h.f34169c) {
                if (i4 >= i5) {
                    Object[] objArr = c6023h.f34167a;
                    objArr[i4 - 1] = objArr[0];
                } else {
                    Object[] objArr2 = c6023h.f34167a;
                    int i6 = i4 - 1;
                    if (i6 < 0) {
                        i6 = i5 - 1;
                    }
                    objArr2[i6] = objArr2[i4];
                    i4++;
                    if (i4 >= i5) {
                    }
                }
                i4 = 0;
            }
        } else {
            Object[] objArr3 = c6023h.f34167a;
            System.arraycopy(objArr3, i4, objArr3, i2, i - i4);
        }
        this.f34159b = -1;
        int i7 = c6023h.f34169c - 1;
        if (i7 < 0) {
            i7 = i5 - 1;
        }
        c6023h.f34169c = i7;
        c6023h.f34167a[i7] = null;
        c6023h.f34170d = false;
        int i8 = this.f34158a - 1;
        if (i8 < 0) {
            i8 = i5 - 1;
        }
        this.f34158a = i8;
    }
}
