package p000;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: yN0 */
/* loaded from: classes2.dex */
public final class C11790yN0 implements InterfaceC0613Jj {

    /* renamed from: a */
    public final Z11 f46236a;

    /* renamed from: b */
    public final C6507nj f46237b;

    /* renamed from: c */
    public boolean f46238c;

    public C11790yN0(Z11 z11) {
        O90.m5968f(z11, "sink");
        this.f46236a = z11;
        this.f46237b = new C6507nj();
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: L */
    public final InterfaceC0613Jj mo4391L(String str) {
        O90.m5968f(str, "string");
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        this.f46237b.m23203x0(str);
        m26143m();
        return this;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: O */
    public final InterfaceC0613Jj mo4392O(byte[] bArr, int i, int i2) {
        O90.m5968f(bArr, "source");
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        this.f46237b.m23194q0(bArr, i, i2);
        m26143m();
        return this;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: a0 */
    public final InterfaceC0613Jj mo4393a0(byte[] bArr) {
        O90.m5968f(bArr, "source");
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        this.f46237b.m23193p0(bArr);
        m26143m();
        return this;
    }

    @Override // p000.Z11
    /* renamed from: c0 */
    public final void mo2328c0(C6507nj c6507nj, long j) {
        O90.m5968f(c6507nj, "source");
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        this.f46237b.mo2328c0(c6507nj, j);
        m26143m();
    }

    @Override // p000.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Z11 z11 = this.f46236a;
        if (this.f46238c) {
            return;
        }
        try {
            C6507nj c6507nj = this.f46237b;
            long j = c6507nj.f38488b;
            if (j > 0) {
                z11.mo2328c0(c6507nj, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            z11.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f46238c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: f0 */
    public final InterfaceC0613Jj mo4394f0(long j) {
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        this.f46237b.m23196s0(j);
        m26143m();
        return this;
    }

    @Override // p000.Z11, java.io.Flushable
    public final void flush() {
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        C6507nj c6507nj = this.f46237b;
        long j = c6507nj.f38488b;
        Z11 z11 = this.f46236a;
        if (j > 0) {
            z11.mo2328c0(c6507nj, j);
        }
        z11.flush();
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: g0 */
    public final OutputStream mo4395g0() {
        return new C6444mj(this, 1);
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: i */
    public final long mo4396i(U21 u21) {
        O90.m5968f(u21, "source");
        long j = 0;
        while (true) {
            long jMo96H = u21.mo96H(this.f46237b, 8192L);
            if (jMo96H == -1) {
                return j;
            }
            j += jMo96H;
            m26143m();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f46238c;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: k */
    public final InterfaceC0613Jj mo4397k(int i) {
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        this.f46237b.m23195r0(i);
        m26143m();
        return this;
    }

    @Override // p000.InterfaceC0613Jj
    /* renamed from: k0 */
    public final InterfaceC0613Jj mo4398k0(C0551Ik c0551Ik) {
        O90.m5968f(c0551Ik, "byteString");
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        this.f46237b.m23191o0(c0551Ik);
        m26143m();
        return this;
    }

    /* renamed from: m */
    public final InterfaceC0613Jj m26143m() {
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        C6507nj c6507nj = this.f46237b;
        long jM23190o = c6507nj.m23190o();
        if (jM23190o > 0) {
            this.f46236a.mo2328c0(c6507nj, jM23190o);
        }
        return this;
    }

    /* renamed from: n */
    public final InterfaceC0613Jj m26144n(int i) {
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        this.f46237b.m23198u0(i);
        m26143m();
        return this;
    }

    @Override // p000.Z11
    /* renamed from: r */
    public final C7523Ea1 mo2329r() {
        return this.f46236a.mo2329r();
    }

    public final String toString() {
        return "buffer(" + this.f46236a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        O90.m5968f(byteBuffer, "source");
        if (this.f46238c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f46237b.write(byteBuffer);
        m26143m();
        return iWrite;
    }
}
