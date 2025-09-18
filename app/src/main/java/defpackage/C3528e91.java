package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: e91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3528e91 implements ZC {
    public final ZC a;
    public final C2574cl b;
    public boolean c;
    public long d;

    public C3528e91(ZC zc, C2574cl c2574cl) {
        zc.getClass();
        this.a = zc;
        c2574cl.getClass();
        this.b = c2574cl;
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) throws C2384bl {
        long jC = this.a.c(c3538eD);
        this.d = jC;
        if (jC == 0) {
            return 0L;
        }
        if (c3538eD.g == -1 && jC != -1) {
            c3538eD = c3538eD.e(0L, jC);
        }
        this.c = true;
        C2574cl c2574cl = this.b;
        c2574cl.getClass();
        c3538eD.h.getClass();
        if (c3538eD.g == -1 && c3538eD.c(2)) {
            c2574cl.d = null;
        } else {
            c2574cl.d = c3538eD;
            c2574cl.e = c3538eD.c(4) ? c2574cl.b : Long.MAX_VALUE;
            c2574cl.i = 0L;
            try {
                c2574cl.b(c3538eD);
            } catch (IOException e) {
                throw new C2384bl(e);
            }
        }
        return this.d;
    }

    @Override // defpackage.ZC
    public final void close() throws C2384bl {
        C2574cl c2574cl = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (c2574cl.d == null) {
                    return;
                }
                try {
                    c2574cl.a();
                } catch (IOException e) {
                    throw new C2384bl(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (c2574cl.d != null) {
                    try {
                        c2574cl.a();
                    } catch (IOException e2) {
                        throw new C2384bl(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.ZC
    public final void d(InterfaceC4188hc1 interfaceC4188hc1) {
        interfaceC4188hc1.getClass();
        this.a.d(interfaceC4188hc1);
    }

    @Override // defpackage.ZC
    public final Map l() {
        return this.a.l();
    }

    @Override // defpackage.ZC
    public final Uri o() {
        return this.a.o();
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int iR = this.a.r(bArr, i, i2);
        if (iR > 0) {
            C2574cl c2574cl = this.b;
            C3538eD c3538eD = c2574cl.d;
            if (c3538eD != null) {
                int i3 = 0;
                while (i3 < iR) {
                    try {
                        if (c2574cl.h == c2574cl.e) {
                            c2574cl.a();
                            c2574cl.b(c3538eD);
                        }
                        int iMin = (int) Math.min(iR - i3, c2574cl.e - c2574cl.h);
                        OutputStream outputStream = c2574cl.g;
                        int i4 = AbstractC0277Dh1.a;
                        outputStream.write(bArr, i + i3, iMin);
                        i3 += iMin;
                        long j = iMin;
                        c2574cl.h += j;
                        c2574cl.i += j;
                    } catch (IOException e) {
                        throw new C2384bl(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - iR;
            }
        }
        return iR;
    }
}
