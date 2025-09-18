package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Bk */
/* loaded from: classes.dex */
public final class C0128Bk implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Iterable d;

    public C0128Bk(C8129yC1 c8129yC1) {
        this.d = c8129yC1;
        this.c = c8129yC1.h();
    }

    public byte a() {
        try {
            byte[] bArr = ((C1919Yj0) this.d).b;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                }
                break;
            case 1:
                if (this.b < this.c) {
                }
                break;
            case 2:
                if (this.b < this.c) {
                }
                break;
            case 3:
                if (this.b < this.c) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.b;
                if (i >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i + 1;
                return Byte.valueOf(((C0362Ek) this.d).i(i));
            case 1:
                int i2 = this.b;
                if (i2 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i2 + 1;
                return Byte.valueOf(((C0440Fk) this.d).b[i2]);
            case 2:
                return Byte.valueOf(a());
            case 3:
                int i3 = this.b;
                if (i3 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i3 + 1;
                return Byte.valueOf(((C8129yC1) this.d).d(i3));
            default:
                int i4 = this.b;
                if (i4 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i4 + 1;
                return Byte.valueOf(((JQ1) this.d).i(i4));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0128Bk(JQ1 jq1) {
        this.d = jq1;
        this.c = jq1.k();
    }

    public C0128Bk(C0362Ek c0362Ek) {
        this.d = c0362Ek;
        this.c = c0362Ek.size();
    }

    public C0128Bk(C0440Fk c0440Fk) {
        this.d = c0440Fk;
        this.c = c0440Fk.size();
    }

    public C0128Bk(C1919Yj0 c1919Yj0) {
        this.d = c1919Yj0;
        this.c = c1919Yj0.b.length;
    }
}
