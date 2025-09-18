package defpackage;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class JY {
    public final InterfaceC1584Ub1 a;
    public C1662Vb1 d;
    public C7569vG e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final C1194Pb1 b = new C1194Pb1();
    public final C4103hA0 c = new C4103hA0();
    public final C4103hA0 j = new C4103hA0(1);
    public final C4103hA0 k = new C4103hA0();

    public JY(InterfaceC1584Ub1 interfaceC1584Ub1, C1662Vb1 c1662Vb1, C7569vG c7569vG) {
        this.a = interfaceC1584Ub1;
        this.d = c1662Vb1;
        this.e = c7569vG;
        this.d = c1662Vb1;
        this.e = c7569vG;
        interfaceC1584Ub1.f(c1662Vb1.a.f);
        d();
    }

    public final C1116Ob1 a() {
        if (!this.l) {
            return null;
        }
        C1194Pb1 c1194Pb1 = this.b;
        C7569vG c7569vG = c1194Pb1.a;
        int i = AbstractC0277Dh1.a;
        int i2 = c7569vG.a;
        C1116Ob1 c1116Ob1 = c1194Pb1.m;
        if (c1116Ob1 == null) {
            C1116Ob1[] c1116Ob1Arr = this.d.a.k;
            c1116Ob1 = c1116Ob1Arr == null ? null : c1116Ob1Arr[i2];
        }
        if (c1116Ob1 == null || !c1116Ob1.a) {
            return null;
        }
        return c1116Ob1;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i, int i2) {
        C4103hA0 c4103hA0;
        C1116Ob1 c1116Ob1A = a();
        if (c1116Ob1A == null) {
            return 0;
        }
        C1194Pb1 c1194Pb1 = this.b;
        int length = c1116Ob1A.d;
        if (length != 0) {
            c4103hA0 = c1194Pb1.n;
        } else {
            int i3 = AbstractC0277Dh1.a;
            byte[] bArr = c1116Ob1A.e;
            int length2 = bArr.length;
            C4103hA0 c4103hA02 = this.k;
            c4103hA02.E(length2, bArr);
            length = bArr.length;
            c4103hA0 = c4103hA02;
        }
        boolean z = c1194Pb1.k && c1194Pb1.l[this.f];
        boolean z2 = z || i2 != 0;
        C4103hA0 c4103hA03 = this.j;
        c4103hA03.a[0] = (byte) ((z2 ? 128 : 0) | length);
        c4103hA03.G(0);
        InterfaceC1584Ub1 interfaceC1584Ub1 = this.a;
        interfaceC1584Ub1.b(c4103hA03, 1, 1);
        interfaceC1584Ub1.b(c4103hA0, length, 1);
        if (!z2) {
            return length + 1;
        }
        C4103hA0 c4103hA04 = this.c;
        if (!z) {
            c4103hA04.D(8);
            byte[] bArr2 = c4103hA04.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            interfaceC1584Ub1.b(c4103hA04, 8, 1);
            return length + 9;
        }
        C4103hA0 c4103hA05 = c1194Pb1.n;
        int iA = c4103hA05.A();
        c4103hA05.H(-2);
        int i4 = (iA * 6) + 2;
        if (i2 != 0) {
            c4103hA04.D(i4);
            byte[] bArr3 = c4103hA04.a;
            c4103hA05.e(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr3[3] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
        } else {
            c4103hA04 = c4103hA05;
        }
        interfaceC1584Ub1.b(c4103hA04, i4, 1);
        return length + 1 + i4;
    }

    public final void d() {
        C1194Pb1 c1194Pb1 = this.b;
        c1194Pb1.d = 0;
        c1194Pb1.p = 0L;
        c1194Pb1.q = false;
        c1194Pb1.k = false;
        c1194Pb1.o = false;
        c1194Pb1.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
