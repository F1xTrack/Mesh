package p000;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class GE1 extends JE1 {

    /* renamed from: c */
    public final byte[] f3646c;

    public GE1(byte[] bArr) {
        bArr.getClass();
        this.f3646c = bArr;
    }

    /* renamed from: G */
    public int mo3002G() {
        return 0;
    }

    /* renamed from: H */
    public final boolean m3003H(GE1 ge1, int i, int i2) {
        if (i2 > ge1.mo3006i()) {
            throw new IllegalArgumentException("Length too large: " + i2 + mo3006i());
        }
        if (i + i2 > ge1.mo3006i()) {
            int iMo3006i = ge1.mo3006i();
            StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Ran off end of other: ", ", ", i, i2, ", ");
            sbM8594m.append(iMo3006i);
            throw new IllegalArgumentException(sbM8594m.toString());
        }
        int iMo3002G = mo3002G() + i2;
        int iMo3002G2 = mo3002G();
        int iMo3002G3 = ge1.mo3002G() + i;
        while (iMo3002G2 < iMo3002G) {
            if (this.f3646c[iMo3002G2] != ge1.f3646c[iMo3002G3]) {
                return false;
            }
            iMo3002G2++;
            iMo3002G3++;
        }
        return true;
    }

    @Override // p000.JE1
    /* renamed from: b */
    public byte mo3004b(int i) {
        return this.f3646c[i];
    }

    @Override // p000.JE1
    /* renamed from: d */
    public byte mo3005d(int i) {
        return this.f3646c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JE1) || mo3006i() != ((JE1) obj).mo3006i()) {
            return false;
        }
        if (mo3006i() == 0) {
            return true;
        }
        if (!(obj instanceof GE1)) {
            return obj.equals(this);
        }
        GE1 ge1 = (GE1) obj;
        int i = this.f5403a;
        int i2 = ge1.f5403a;
        if (i == 0 || i2 == 0 || i == i2) {
            return m3003H(ge1, 0, mo3006i());
        }
        return false;
    }

    @Override // p000.JE1
    /* renamed from: i */
    public int mo3006i() {
        return this.f3646c.length;
    }

    @Override // p000.JE1
    /* renamed from: k */
    public void mo3007k(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f3646c, i, bArr, i2, i3);
    }

    @Override // p000.JE1
    /* renamed from: q */
    public final int mo3008q() {
        return 0;
    }

    @Override // p000.JE1
    /* renamed from: r */
    public final boolean mo3009r() {
        return true;
    }

    @Override // p000.JE1
    /* renamed from: s */
    public final int mo3010s(int i, int i2, int i3) {
        int iMo3002G = mo3002G() + i2;
        Charset charset = AbstractC11398vH1.f44320a;
        for (int i4 = iMo3002G; i4 < iMo3002G + i3; i4++) {
            i = (i * 31) + this.f3646c[i4];
        }
        return i;
    }

    @Override // p000.JE1
    /* renamed from: t */
    public final int mo3011t(int i, int i2, int i3) {
        int iMo3002G = mo3002G() + i2;
        AbstractC9490gN1.f27708a.getClass();
        return KG1.m4592a(i, this.f3646c, iMo3002G, i3 + iMo3002G);
    }

    @Override // p000.JE1
    /* renamed from: u */
    public final JE1 mo3012u(int i, int i2) {
        int iM4257A = JE1.m4257A(i, i2, mo3006i());
        if (iM4257A == 0) {
            return JE1.f5402b;
        }
        return new C11646xE1(this.f3646c, mo3002G() + i, iM4257A);
    }

    @Override // p000.JE1
    /* renamed from: v */
    public final String mo3013v(Charset charset) {
        return new String(this.f3646c, mo3002G(), mo3006i(), charset);
    }

    @Override // p000.JE1
    /* renamed from: y */
    public final void mo3014y(WE1 we1) {
        we1.m8723e(this.f3646c, mo3002G(), mo3006i());
    }

    @Override // p000.JE1
    /* renamed from: z */
    public final boolean mo3015z() {
        int iMo3002G = mo3002G();
        return AbstractC9490gN1.m18478d(this.f3646c, iMo3002G, mo3006i() + iMo3002G);
    }
}
