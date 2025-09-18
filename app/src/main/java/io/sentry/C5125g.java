package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: io.sentry.g */
/* loaded from: classes2.dex */
public final class C5125g implements Iterator {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ C5128h d;

    public C5125g(C5128h c5128h) {
        this.d = c5128h;
        this.a = c5128h.b;
        this.c = c5128h.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c || this.a != this.d.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = false;
        int i = this.a;
        this.b = i;
        int i2 = i + 1;
        C5128h c5128h = this.d;
        this.a = i2 < c5128h.e ? i2 : 0;
        return c5128h.a[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.b;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C5128h c5128h = this.d;
        int i3 = c5128h.b;
        if (i2 == i3) {
            c5128h.remove();
            this.b = -1;
            return;
        }
        int i4 = i2 + 1;
        int i5 = c5128h.e;
        if (i3 >= i2 || i4 >= (i = c5128h.c)) {
            while (i4 != c5128h.c) {
                if (i4 >= i5) {
                    Object[] objArr = c5128h.a;
                    objArr[i4 - 1] = objArr[0];
                } else {
                    Object[] objArr2 = c5128h.a;
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
            Object[] objArr3 = c5128h.a;
            System.arraycopy(objArr3, i4, objArr3, i2, i - i4);
        }
        this.b = -1;
        int i7 = c5128h.c - 1;
        if (i7 < 0) {
            i7 = i5 - 1;
        }
        c5128h.c = i7;
        c5128h.a[i7] = null;
        c5128h.d = false;
        int i8 = this.a - 1;
        if (i8 < 0) {
            i8 = i5 - 1;
        }
        this.a = i8;
    }
}
