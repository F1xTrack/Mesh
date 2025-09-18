package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class S21 implements InterfaceC7056sa {
    public int b;
    public float c;
    public float d;
    public C6675qa e;
    public C6675qa f;
    public C6675qa g;
    public C6675qa h;
    public boolean i;
    public R21 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // defpackage.InterfaceC7056sa
    public final void d() {
        this.c = 1.0f;
        this.d = 1.0f;
        C6675qa c6675qa = C6675qa.e;
        this.e = c6675qa;
        this.f = c6675qa;
        this.g = c6675qa;
        this.h = c6675qa;
        ByteBuffer byteBuffer = InterfaceC7056sa.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.InterfaceC7056sa
    public final ByteBuffer e() {
        R21 r21 = this.j;
        if (r21 != null) {
            int i = r21.m;
            int i2 = r21.b;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.k.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int iMin = Math.min(shortBuffer.remaining() / i2, r21.m);
                int i4 = iMin * i2;
                shortBuffer.put(r21.l, 0, i4);
                int i5 = r21.m - iMin;
                r21.m = i5;
                short[] sArr = r21.l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.o += i3;
                this.k.limit(i3);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = InterfaceC7056sa.a;
        return byteBuffer;
    }

    @Override // defpackage.InterfaceC7056sa
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            R21 r21 = this.j;
            r21.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = r21.b;
            int i2 = iRemaining2 / i;
            short[] sArrC = r21.c(r21.j, r21.k, i2);
            r21.j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, r21.k * i, ((i2 * i) * 2) / 2);
            r21.k += i2;
            r21.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.InterfaceC7056sa
    public final void flush() {
        if (isActive()) {
            C6675qa c6675qa = this.e;
            this.g = c6675qa;
            C6675qa c6675qa2 = this.f;
            this.h = c6675qa2;
            if (this.i) {
                this.j = new R21(c6675qa.a, c6675qa.b, this.c, this.d, c6675qa2.a);
            } else {
                R21 r21 = this.j;
                if (r21 != null) {
                    r21.k = 0;
                    r21.m = 0;
                    r21.o = 0;
                    r21.p = 0;
                    r21.q = 0;
                    r21.r = 0;
                    r21.s = 0;
                    r21.t = 0;
                    r21.u = 0;
                    r21.v = 0;
                }
            }
        }
        this.m = InterfaceC7056sa.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.InterfaceC7056sa
    public final C6675qa g(C6675qa c6675qa) throws C6865ra {
        if (c6675qa.c != 2) {
            throw new C6865ra(c6675qa);
        }
        int i = this.b;
        if (i == -1) {
            i = c6675qa.a;
        }
        this.e = c6675qa;
        C6675qa c6675qa2 = new C6675qa(i, c6675qa.b, 2);
        this.f = c6675qa2;
        this.i = true;
        return c6675qa2;
    }

    @Override // defpackage.InterfaceC7056sa
    public final void h() {
        R21 r21 = this.j;
        if (r21 != null) {
            int i = r21.k;
            float f = r21.c;
            float f2 = r21.d;
            int i2 = r21.m + ((int) ((((i / (f / f2)) + r21.o) / (r21.e * f2)) + 0.5f));
            short[] sArr = r21.j;
            int i3 = r21.h * 2;
            r21.j = r21.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = r21.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                r21.j[(i5 * i) + i4] = 0;
                i4++;
            }
            r21.k = i3 + r21.k;
            r21.f();
            if (r21.m > i2) {
                r21.m = i2;
            }
            r21.k = 0;
            r21.r = 0;
            r21.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.InterfaceC7056sa
    public final boolean i() {
        R21 r21;
        return this.p && ((r21 = this.j) == null || (r21.m * r21.b) * 2 == 0);
    }

    @Override // defpackage.InterfaceC7056sa
    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }
}
