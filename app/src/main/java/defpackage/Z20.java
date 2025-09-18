package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Z20 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final String j;

    public Z20(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = f;
        this.i = i7;
        this.j = str;
    }

    public static Z20 a(C4103hA0 c4103hA0) throws C5643lA0 {
        int i;
        int i2;
        try {
            c4103hA0.H(21);
            int iU = c4103hA0.u() & 3;
            int iU2 = c4103hA0.u();
            int i3 = c4103hA0.b;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iU2; i6++) {
                c4103hA0.H(1);
                int iA = c4103hA0.A();
                for (int i7 = 0; i7 < iA; i7++) {
                    int iA2 = c4103hA0.A();
                    i5 += iA2 + 4;
                    c4103hA0.H(iA2);
                }
            }
            c4103hA0.G(i3);
            byte[] bArr = new byte[i5];
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            float f = 1.0f;
            String strA = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 < iU2) {
                int iU3 = c4103hA0.u() & 63;
                int iA3 = c4103hA0.A();
                int i16 = i4;
                while (i16 < iA3) {
                    int iA4 = c4103hA0.A();
                    int i17 = iU2;
                    System.arraycopy(TA1.a, i4, bArr, i15, 4);
                    int i18 = i15 + 4;
                    System.arraycopy(c4103hA0.a, c4103hA0.b, bArr, i18, iA4);
                    if (iU3 == 33 && i16 == 0) {
                        C1325Qt0 c1325Qt0F = TA1.f(bArr, i18, i18 + iA4);
                        int i19 = c1325Qt0F.e + 8;
                        i9 = c1325Qt0F.f + 8;
                        i10 = c1325Qt0F.m;
                        int i20 = c1325Qt0F.n;
                        int i21 = c1325Qt0F.o;
                        float f2 = c1325Qt0F.k;
                        int i22 = c1325Qt0F.l;
                        i = iU3;
                        i2 = iA3;
                        i8 = i19;
                        strA = AbstractC7522v10.a(c1325Qt0F.a, c1325Qt0F.b, c1325Qt0F.c, c1325Qt0F.d, c1325Qt0F.g, c1325Qt0F.h);
                        i12 = i21;
                        i11 = i20;
                        i13 = i22;
                        f = f2;
                    } else {
                        i = iU3;
                        i2 = iA3;
                    }
                    i15 = i18 + iA4;
                    c4103hA0.H(iA4);
                    i16++;
                    iU2 = i17;
                    iU3 = i;
                    iA3 = i2;
                    i4 = 0;
                }
                i14++;
                i4 = 0;
            }
            return new Z20(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iU + 1, i8, i9, i10, i11, i12, f, i13, strA);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C5643lA0.a(e, "Error parsing HEVC config");
        }
    }
}
