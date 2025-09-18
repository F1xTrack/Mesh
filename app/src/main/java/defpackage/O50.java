package defpackage;

import android.net.Uri;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class O50 implements ZC {
    public final ZC a;
    public final int b;
    public final C5846mE0 c;
    public final byte[] d;
    public int e;

    public O50(ZC zc, int i, C5846mE0 c5846mE0) {
        YN1.c(i > 0);
        this.a = zc;
        this.b = i;
        this.c = c5846mE0;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ZC
    public final void close() {
        throw new UnsupportedOperationException();
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
    public final int r(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        ZC zc = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (zc.r(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iR = zc.r(bArr3, i4, i6);
                        if (iR != -1) {
                            i4 += iR;
                            i6 -= iR;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        C4103hA0 c4103hA0 = new C4103hA0(bArr3, i5);
                        C5846mE0 c5846mE0 = this.c;
                        long jMax = !c5846mE0.m ? c5846mE0.j : Math.max(c5846mE0.n.k(true), c5846mE0.j);
                        int iA = c4103hA0.a();
                        InterfaceC1584Ub1 interfaceC1584Ub1 = c5846mE0.l;
                        interfaceC1584Ub1.getClass();
                        interfaceC1584Ub1.d(iA, c4103hA0);
                        interfaceC1584Ub1.a(jMax, 1, iA, 0, null);
                        c5846mE0.m = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int iR2 = zc.r(bArr, i, Math.min(this.e, i2));
        if (iR2 != -1) {
            this.e -= iR2;
        }
        return iR2;
    }
}
