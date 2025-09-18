package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: Gm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0526Gm1 implements Closeable {
    public final C8351zN0 a;
    public final MN0 b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final C6129nj k;
    public final C6129nj l;
    public C6154nr0 m;
    public final byte[] n;

    public C0526Gm1(C8351zN0 c8351zN0, MN0 mn0, boolean z, boolean z2) {
        O90.f(c8351zN0, "source");
        this.a = c8351zN0;
        this.b = mn0;
        this.c = z;
        this.d = z2;
        this.k = new C6129nj();
        this.l = new C6129nj();
        this.n = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C6154nr0 c6154nr0 = this.m;
        if (c6154nr0 != null) {
            c6154nr0.close();
        }
    }

    public final void m() throws IOException {
        String strE0;
        short sB0;
        long j = this.g;
        if (j > 0) {
            this.a.A(this.k, j);
        }
        switch (this.f) {
            case 8:
                C6129nj c6129nj = this.k;
                long j2 = c6129nj.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    sB0 = c6129nj.b0();
                    strE0 = this.k.e0();
                    String strU = (sB0 < 1000 || sB0 >= 5000) ? AbstractC7209tN0.u(sB0, "Code must be in range [1000,5000): ") : ((1004 > sB0 || sB0 >= 1007) && (1015 > sB0 || sB0 >= 3000)) ? null : AbstractC8235ym.g(sB0, "Code ", " is reserved and may not be used.");
                    if (strU != null) {
                        throw new ProtocolException(strU);
                    }
                } else {
                    strE0 = "";
                    sB0 = 1005;
                }
                this.b.f(sB0, strE0);
                this.e = true;
                return;
            case 9:
                MN0 mn0 = this.b;
                C6129nj c6129nj2 = this.k;
                mn0.g(c6129nj2.U(c6129nj2.b));
                return;
            case 10:
                MN0 mn02 = this.b;
                C6129nj c6129nj3 = this.k;
                C0674Ik c0674IkU = c6129nj3.U(c6129nj3.b);
                synchronized (mn02) {
                    O90.f(c0674IkU, "payload");
                    mn02.v = false;
                }
                return;
            default:
                int i = this.f;
                byte[] bArr = AbstractC0199Ch1.a;
                String hexString = Integer.toHexString(i);
                O90.e(hexString, "toHexString(this)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void n() throws IOException {
        boolean z;
        long jX;
        C0526Gm1 c0526Gm1 = this;
        if (c0526Gm1.e) {
            throw new IOException("closed");
        }
        C8351zN0 c8351zN0 = c0526Gm1.a;
        long jH = c8351zN0.a.r().h();
        U21 u21 = c8351zN0.a;
        u21.r().b();
        try {
            byte bP = c8351zN0.p();
            byte[] bArr = AbstractC0199Ch1.a;
            u21.r().g(jH, TimeUnit.NANOSECONDS);
            int i = bP & 15;
            c0526Gm1.f = i;
            boolean z2 = (bP & 128) != 0;
            c0526Gm1.h = z2;
            boolean z3 = (bP & 8) != 0;
            c0526Gm1.i = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (bP & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!c0526Gm1.c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                c0526Gm1.j = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((bP & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((bP & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte bP2 = c8351zN0.p();
            boolean z5 = (bP2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = bP2 & 127;
            c0526Gm1.g = j;
            C6129nj c6129nj = c8351zN0.b;
            if (j == 126) {
                c0526Gm1.g = c8351zN0.U() & 65535;
            } else if (j == 127) {
                c8351zN0.X(8L);
                if (c6129nj.b < 8) {
                    throw new EOFException();
                }
                JX0 jx0 = c6129nj.a;
                O90.c(jx0);
                int i2 = jx0.b;
                int i3 = jx0.c;
                if (i3 - i2 < 8) {
                    jX = ((c6129nj.X() & 4294967295L) << 32) | (c6129nj.X() & 4294967295L);
                } else {
                    byte[] bArr2 = jx0.a;
                    int i4 = i2 + 7;
                    long j2 = ((bArr2[2 + i2] & 255) << 40) | ((bArr2[i2] & 255) << 56) | ((bArr2[1 + i2] & 255) << 48) | ((bArr2[i2 + 3] & 255) << 32) | ((bArr2[i2 + 4] & 255) << 24) | ((bArr2[i2 + 5] & 255) << 16) | ((bArr2[i2 + 6] & 255) << 8);
                    int i5 = i2 + 8;
                    jX = (bArr2[i4] & 255) | j2;
                    c6129nj.b -= 8;
                    if (i5 == i3) {
                        c6129nj.a = jx0.a();
                        RX0.a(jx0);
                    } else {
                        jx0.b = i5;
                    }
                    c0526Gm1 = this;
                }
                c0526Gm1.g = jX;
                if (jX < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(c0526Gm1.g);
                    O90.e(hexString, "toHexString(this)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (c0526Gm1.i && c0526Gm1.g > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!z5) {
                return;
            }
            byte[] bArr3 = c0526Gm1.n;
            O90.c(bArr3);
            try {
                c8351zN0.X(bArr3.length);
                c6129nj.W(bArr3);
            } catch (EOFException e) {
                int i6 = 0;
                while (true) {
                    long j3 = c6129nj.b;
                    if (j3 <= 0) {
                        throw e;
                    }
                    int iA = c6129nj.A(bArr3, i6, (int) j3);
                    if (iA == -1) {
                        throw new AssertionError();
                    }
                    i6 += iA;
                }
            }
        } catch (Throwable th) {
            u21.r().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
