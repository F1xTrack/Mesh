package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: Ly0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950Ly0 extends AbstractC4089h51 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(C4103hA0 c4103hA0, byte[] bArr) {
        if (c4103hA0.a() < bArr.length) {
            return false;
        }
        int i = c4103hA0.b;
        byte[] bArr2 = new byte[bArr.length];
        c4103hA0.e(bArr2, 0, bArr.length);
        c4103hA0.G(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.AbstractC4089h51
    public final long b(C4103hA0 c4103hA0) {
        byte[] bArr = c4103hA0.a;
        return (this.i * NJ1.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.AbstractC4089h51
    public final boolean c(C4103hA0 c4103hA0, long j, CC0 cc0) {
        if (e(c4103hA0, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c4103hA0.a, c4103hA0.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = NJ1.a(bArrCopyOf);
            if (((C6666qX) cc0.b) != null) {
                return true;
            }
            C6475pX c6475pX = new C6475pX();
            c6475pX.l = AbstractC1865Xr0.n("audio/opus");
            c6475pX.z = i;
            c6475pX.A = 48000;
            c6475pX.o = arrayListA;
            cc0.b = new C6666qX(c6475pX);
            return true;
        }
        if (!e(c4103hA0, p)) {
            YN1.h((C6666qX) cc0.b);
            return false;
        }
        YN1.h((C6666qX) cc0.b);
        if (this.n) {
            return true;
        }
        this.n = true;
        c4103hA0.H(8);
        C0540Gr0 c0540Gr0C = U02.c(P70.v((String[]) U02.d(c4103hA0, false, false).a));
        if (c0540Gr0C == null) {
            return true;
        }
        C6475pX c6475pXA = ((C6666qX) cc0.b).a();
        c6475pXA.j = c0540Gr0C.b(((C6666qX) cc0.b).k);
        cc0.b = new C6666qX(c6475pXA);
        return true;
    }

    @Override // defpackage.AbstractC4089h51
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
