package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class TV extends AbstractC4089h51 {
    public UV n;
    public H9 o;

    @Override // defpackage.AbstractC4089h51
    public final long b(C4103hA0 c4103hA0) {
        byte[] bArr = c4103hA0.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c4103hA0.H(4);
            c4103hA0.B();
        }
        int iB = AbstractC3502e12.b(i, c4103hA0);
        c4103hA0.G(0);
        return iB;
    }

    @Override // defpackage.AbstractC4089h51
    public final boolean c(C4103hA0 c4103hA0, long j, CC0 cc0) {
        byte[] bArr = c4103hA0.a;
        UV uv = this.n;
        if (uv == null) {
            UV uv2 = new UV(bArr, 17);
            this.n = uv2;
            cc0.b = uv2.c(Arrays.copyOfRange(bArr, 9, c4103hA0.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            H9 h9 = this.o;
            if (h9 != null) {
                h9.a = j;
                cc0.c = h9;
            }
            ((C6666qX) cc0.b).getClass();
            return false;
        }
        ES1 es1B = AbstractC3693f12.b(c4103hA0);
        UV uv3 = new UV(uv.a, uv.b, uv.c, uv.d, uv.e, uv.g, uv.h, uv.j, es1B, uv.l);
        this.n = uv3;
        H9 h92 = new H9();
        h92.c = uv3;
        h92.d = es1B;
        h92.a = -1L;
        h92.b = -1L;
        this.o = h92;
        return true;
    }

    @Override // defpackage.AbstractC4089h51
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
