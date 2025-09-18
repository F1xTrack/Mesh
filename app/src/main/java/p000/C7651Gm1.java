package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: Gm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7651Gm1 implements Closeable {

    /* renamed from: a */
    public final C11917zN0 f3875a;

    /* renamed from: b */
    public final MN0 f3876b;

    /* renamed from: c */
    public final boolean f3877c;

    /* renamed from: d */
    public final boolean f3878d;

    /* renamed from: e */
    public boolean f3879e;

    /* renamed from: f */
    public int f3880f;

    /* renamed from: g */
    public long f3881g;

    /* renamed from: h */
    public boolean f3882h;

    /* renamed from: i */
    public boolean f3883i;

    /* renamed from: j */
    public boolean f3884j;

    /* renamed from: k */
    public final C6507nj f3885k;

    /* renamed from: l */
    public final C6507nj f3886l;

    /* renamed from: m */
    public C10445nr0 f3887m;

    /* renamed from: n */
    public final byte[] f3888n;

    public C7651Gm1(C11917zN0 c11917zN0, MN0 mn0, boolean z, boolean z2) {
        O90.m5968f(c11917zN0, "source");
        this.f3875a = c11917zN0;
        this.f3876b = mn0;
        this.f3877c = z;
        this.f3878d = z2;
        this.f3885k = new C6507nj();
        this.f3886l = new C6507nj();
        this.f3888n = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C10445nr0 c10445nr0 = this.f3887m;
        if (c10445nr0 != null) {
            c10445nr0.close();
        }
    }

    /* renamed from: m */
    public final void m3153m() throws IOException {
        String strM23183e0;
        short sM23181b0;
        long j = this.f3881g;
        if (j > 0) {
            this.f3875a.m26379A(this.f3885k, j);
        }
        switch (this.f3880f) {
            case 8:
                C6507nj c6507nj = this.f3885k;
                long j2 = c6507nj.f38488b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    sM23181b0 = c6507nj.m23181b0();
                    strM23183e0 = this.f3885k.m23183e0();
                    String strM24909u = (sM23181b0 < 1000 || sM23181b0 >= 5000) ? AbstractC11153tN0.m24909u(sM23181b0, "Code must be in range [1000,5000): ") : ((1004 > sM23181b0 || sM23181b0 >= 1007) && (1015 > sM23181b0 || sM23181b0 >= 3000)) ? null : AbstractC7222ym.m26230g(sM23181b0, "Code ", " is reserved and may not be used.");
                    if (strM24909u != null) {
                        throw new ProtocolException(strM24909u);
                    }
                } else {
                    strM23183e0 = "";
                    sM23181b0 = 1005;
                }
                this.f3876b.m5354f(sM23181b0, strM23183e0);
                this.f3879e = true;
                return;
            case 9:
                MN0 mn0 = this.f3876b;
                C6507nj c6507nj2 = this.f3885k;
                mn0.m5355g(c6507nj2.m23178U(c6507nj2.f38488b));
                return;
            case 10:
                MN0 mn02 = this.f3876b;
                C6507nj c6507nj3 = this.f3885k;
                C0551Ik c0551IkM23178U = c6507nj3.m23178U(c6507nj3.f38488b);
                synchronized (mn02) {
                    O90.m5968f(c0551IkM23178U, "payload");
                    mn02.f7140v = false;
                }
                return;
            default:
                int i = this.f3880f;
                byte[] bArr = AbstractC7433Ch1.f1577a;
                String hexString = Integer.toHexString(i);
                O90.m5967e(hexString, "toHexString(this)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    /* renamed from: n */
    public final void m3154n() throws IOException {
        boolean z;
        long jM23180X;
        C7651Gm1 c7651Gm1 = this;
        if (c7651Gm1.f3879e) {
            throw new IOException("closed");
        }
        C11917zN0 c11917zN0 = c7651Gm1.f3875a;
        long jMo2360h = c11917zN0.f46809a.mo97r().mo2360h();
        U21 u21 = c11917zN0.f46809a;
        u21.mo97r().mo2357b();
        try {
            byte bM26390p = c11917zN0.m26390p();
            byte[] bArr = AbstractC7433Ch1.f1577a;
            u21.mo97r().mo1730g(jMo2360h, TimeUnit.NANOSECONDS);
            int i = bM26390p & 15;
            c7651Gm1.f3880f = i;
            boolean z2 = (bM26390p & 128) != 0;
            c7651Gm1.f3882h = z2;
            boolean z3 = (bM26390p & 8) != 0;
            c7651Gm1.f3883i = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (bM26390p & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!c7651Gm1.f3877c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                c7651Gm1.f3884j = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((bM26390p & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((bM26390p & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte bM26390p2 = c11917zN0.m26390p();
            boolean z5 = (bM26390p2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = bM26390p2 & 127;
            c7651Gm1.f3881g = j;
            C6507nj c6507nj = c11917zN0.f46810b;
            if (j == 126) {
                c7651Gm1.f3881g = c11917zN0.m26383U() & 65535;
            } else if (j == 127) {
                c11917zN0.m26385X(8L);
                if (c6507nj.f38488b < 8) {
                    throw new EOFException();
                }
                JX0 jx0 = c6507nj.f38487a;
                O90.m5965c(jx0);
                int i2 = jx0.f5580b;
                int i3 = jx0.f5581c;
                if (i3 - i2 < 8) {
                    jM23180X = ((c6507nj.m23180X() & 4294967295L) << 32) | (c6507nj.m23180X() & 4294967295L);
                } else {
                    byte[] bArr2 = jx0.f5579a;
                    int i4 = i2 + 7;
                    long j2 = ((bArr2[2 + i2] & 255) << 40) | ((bArr2[i2] & 255) << 56) | ((bArr2[1 + i2] & 255) << 48) | ((bArr2[i2 + 3] & 255) << 32) | ((bArr2[i2 + 4] & 255) << 24) | ((bArr2[i2 + 5] & 255) << 16) | ((bArr2[i2 + 6] & 255) << 8);
                    int i5 = i2 + 8;
                    jM23180X = (bArr2[i4] & 255) | j2;
                    c6507nj.f38488b -= 8;
                    if (i5 == i3) {
                        c6507nj.f38487a = jx0.m4339a();
                        RX0.m7031a(jx0);
                    } else {
                        jx0.f5580b = i5;
                    }
                    c7651Gm1 = this;
                }
                c7651Gm1.f3881g = jM23180X;
                if (jM23180X < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(c7651Gm1.f3881g);
                    O90.m5967e(hexString, "toHexString(this)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (c7651Gm1.f3883i && c7651Gm1.f3881g > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!z5) {
                return;
            }
            byte[] bArr3 = c7651Gm1.f3888n;
            O90.m5965c(bArr3);
            try {
                c11917zN0.m26385X(bArr3.length);
                c6507nj.m23179W(bArr3);
            } catch (EOFException e) {
                int i6 = 0;
                while (true) {
                    long j3 = c6507nj.f38488b;
                    if (j3 <= 0) {
                        throw e;
                    }
                    int iM23174A = c6507nj.m23174A(bArr3, i6, (int) j3);
                    if (iM23174A == -1) {
                        throw new AssertionError();
                    }
                    i6 += iM23174A;
                }
            }
        } catch (Throwable th) {
            u21.mo97r().mo1730g(jMo2360h, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
