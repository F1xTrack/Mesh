package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class GE1 extends JE1 {
    public final byte[] c;

    public GE1(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    public int G() {
        return 0;
    }

    public final boolean H(GE1 ge1, int i, int i2) {
        if (i2 > ge1.i()) {
            throw new IllegalArgumentException("Length too large: " + i2 + i());
        }
        if (i + i2 > ge1.i()) {
            int i3 = ge1.i();
            StringBuilder sbM = AbstractC1705Vq.m("Ran off end of other: ", ", ", i, i2, ", ");
            sbM.append(i3);
            throw new IllegalArgumentException(sbM.toString());
        }
        int iG = G() + i2;
        int iG2 = G();
        int iG3 = ge1.G() + i;
        while (iG2 < iG) {
            if (this.c[iG2] != ge1.c[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    @Override // defpackage.JE1
    public byte b(int i) {
        return this.c[i];
    }

    @Override // defpackage.JE1
    public byte d(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JE1) || i() != ((JE1) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (!(obj instanceof GE1)) {
            return obj.equals(this);
        }
        GE1 ge1 = (GE1) obj;
        int i = this.a;
        int i2 = ge1.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return H(ge1, 0, i());
        }
        return false;
    }

    @Override // defpackage.JE1
    public int i() {
        return this.c.length;
    }

    @Override // defpackage.JE1
    public void k(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    @Override // defpackage.JE1
    public final int q() {
        return 0;
    }

    @Override // defpackage.JE1
    public final boolean r() {
        return true;
    }

    @Override // defpackage.JE1
    public final int s(int i, int i2, int i3) {
        int iG = G() + i2;
        Charset charset = AbstractC7574vH1.a;
        for (int i4 = iG; i4 < iG + i3; i4++) {
            i = (i * 31) + this.c[i4];
        }
        return i;
    }

    @Override // defpackage.JE1
    public final int t(int i, int i2, int i3) {
        int iG = G() + i2;
        AbstractC3952gN1.a.getClass();
        return KG1.a(i, this.c, iG, i3 + iG);
    }

    @Override // defpackage.JE1
    public final JE1 u(int i, int i2) {
        int iA = JE1.A(i, i2, i());
        if (iA == 0) {
            return JE1.b;
        }
        return new C7945xE1(this.c, G() + i, iA);
    }

    @Override // defpackage.JE1
    public final String v(Charset charset) {
        return new String(this.c, G(), i(), charset);
    }

    @Override // defpackage.JE1
    public final void y(WE1 we1) {
        we1.e(this.c, G(), i());
    }

    @Override // defpackage.JE1
    public final boolean z() {
        int iG = G();
        return AbstractC3952gN1.d(this.c, iG, i() + iG);
    }
}
