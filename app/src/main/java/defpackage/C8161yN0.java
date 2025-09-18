package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: yN0 */
/* loaded from: classes2.dex */
public final class C8161yN0 implements InterfaceC0749Jj {
    public final Z11 a;
    public final C6129nj b;
    public boolean c;

    public C8161yN0(Z11 z11) {
        O90.f(z11, "sink");
        this.a = z11;
        this.b = new C6129nj();
    }

    @Override // defpackage.InterfaceC0749Jj
    public final InterfaceC0749Jj L(String str) {
        O90.f(str, "string");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.x0(str);
        m();
        return this;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final InterfaceC0749Jj O(byte[] bArr, int i, int i2) {
        O90.f(bArr, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.q0(bArr, i, i2);
        m();
        return this;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final InterfaceC0749Jj a0(byte[] bArr) {
        O90.f(bArr, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.p0(bArr);
        m();
        return this;
    }

    @Override // defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) {
        O90.f(c6129nj, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.c0(c6129nj, j);
        m();
    }

    @Override // defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Z11 z11 = this.a;
        if (this.c) {
            return;
        }
        try {
            C6129nj c6129nj = this.b;
            long j = c6129nj.b;
            if (j > 0) {
                z11.c0(c6129nj, j);
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
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC0749Jj
    public final InterfaceC0749Jj f0(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.s0(j);
        m();
        return this;
    }

    @Override // defpackage.Z11, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        C6129nj c6129nj = this.b;
        long j = c6129nj.b;
        Z11 z11 = this.a;
        if (j > 0) {
            z11.c0(c6129nj, j);
        }
        z11.flush();
    }

    @Override // defpackage.InterfaceC0749Jj
    public final OutputStream g0() {
        return new C5938mj(this, 1);
    }

    @Override // defpackage.InterfaceC0749Jj
    public final long i(U21 u21) {
        O90.f(u21, "source");
        long j = 0;
        while (true) {
            long jH = u21.H(this.b, 8192L);
            if (jH == -1) {
                return j;
            }
            j += jH;
            m();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final InterfaceC0749Jj k(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.r0(i);
        m();
        return this;
    }

    @Override // defpackage.InterfaceC0749Jj
    public final InterfaceC0749Jj k0(C0674Ik c0674Ik) {
        O90.f(c0674Ik, "byteString");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.o0(c0674Ik);
        m();
        return this;
    }

    public final InterfaceC0749Jj m() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        C6129nj c6129nj = this.b;
        long jO = c6129nj.o();
        if (jO > 0) {
            this.a.c0(c6129nj, jO);
        }
        return this;
    }

    public final InterfaceC0749Jj n(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.u0(i);
        m();
        return this;
    }

    @Override // defpackage.Z11
    public final C0334Ea1 r() {
        return this.a.r();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        O90.f(byteBuffer, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.b.write(byteBuffer);
        m();
        return iWrite;
    }
}
