package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Bk */
/* loaded from: classes.dex */
public final class C0110Bk implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f996a = 0;

    /* renamed from: b */
    public int f997b = 0;

    /* renamed from: c */
    public final int f998c;

    /* renamed from: d */
    public final /* synthetic */ Iterable f999d;

    public C0110Bk(C11769yC1 c11769yC1) {
        this.f999d = c11769yC1;
        this.f998c = c11769yC1.mo23955h();
    }

    /* renamed from: a */
    public byte m843a() {
        try {
            byte[] bArr = ((C8580Yj0) this.f999d).f14490b;
            int i = this.f997b;
            this.f997b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f996a) {
            case 0:
                if (this.f997b < this.f998c) {
                }
                break;
            case 1:
                if (this.f997b < this.f998c) {
                }
                break;
            case 2:
                if (this.f997b < this.f998c) {
                }
                break;
            case 3:
                if (this.f997b < this.f998c) {
                }
                break;
            default:
                if (this.f997b < this.f998c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f996a) {
            case 0:
                int i = this.f997b;
                if (i >= this.f998c) {
                    throw new NoSuchElementException();
                }
                this.f997b = i + 1;
                return Byte.valueOf(((C0299Ek) this.f999d).mo1304i(i));
            case 1:
                int i2 = this.f997b;
                if (i2 >= this.f998c) {
                    throw new NoSuchElementException();
                }
                this.f997b = i2 + 1;
                return Byte.valueOf(((C0362Fk) this.f999d).f3406b[i2]);
            case 2:
                return Byte.valueOf(m843a());
            case 3:
                int i3 = this.f997b;
                if (i3 >= this.f998c) {
                    throw new NoSuchElementException();
                }
                this.f997b = i3 + 1;
                return Byte.valueOf(((C11769yC1) this.f999d).mo23954d(i3));
            default:
                int i4 = this.f997b;
                if (i4 >= this.f998c) {
                    throw new NoSuchElementException();
                }
                this.f997b = i4 + 1;
                return Byte.valueOf(((JQ1) this.f999d).mo4320i(i4));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f996a) {
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

    public C0110Bk(JQ1 jq1) {
        this.f999d = jq1;
        this.f998c = jq1.mo4321k();
    }

    public C0110Bk(C0299Ek c0299Ek) {
        this.f999d = c0299Ek;
        this.f998c = c0299Ek.size();
    }

    public C0110Bk(C0362Fk c0362Fk) {
        this.f999d = c0362Fk;
        this.f998c = c0362Fk.size();
    }

    public C0110Bk(C8580Yj0 c8580Yj0) {
        this.f999d = c8580Yj0;
        this.f998c = c8580Yj0.f14490b.length;
    }
}
