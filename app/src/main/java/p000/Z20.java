package p000;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Z20 {

    /* renamed from: a */
    public final List f14657a;

    /* renamed from: b */
    public final int f14658b;

    /* renamed from: c */
    public final int f14659c;

    /* renamed from: d */
    public final int f14660d;

    /* renamed from: e */
    public final int f14661e;

    /* renamed from: f */
    public final int f14662f;

    /* renamed from: g */
    public final int f14663g;

    /* renamed from: h */
    public final float f14664h;

    /* renamed from: i */
    public final int f14665i;

    /* renamed from: j */
    public final String f14666j;

    public Z20(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, String str) {
        this.f14657a = list;
        this.f14658b = i;
        this.f14659c = i2;
        this.f14660d = i3;
        this.f14661e = i4;
        this.f14662f = i5;
        this.f14663g = i6;
        this.f14664h = f;
        this.f14665i = i7;
        this.f14666j = str;
    }

    /* renamed from: a */
    public static Z20 m9460a(C9591hA0 c9591hA0) throws C10103lA0 {
        int i;
        int i2;
        try {
            c9591hA0.m18742H(21);
            int iM18763u = c9591hA0.m18763u() & 3;
            int iM18763u2 = c9591hA0.m18763u();
            int i3 = c9591hA0.f28294b;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iM18763u2; i6++) {
                c9591hA0.m18742H(1);
                int iM18735A = c9591hA0.m18735A();
                for (int i7 = 0; i7 < iM18735A; i7++) {
                    int iM18735A2 = c9591hA0.m18735A();
                    i5 += iM18735A2 + 4;
                    c9591hA0.m18742H(iM18735A2);
                }
            }
            c9591hA0.m18741G(i3);
            byte[] bArr = new byte[i5];
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            float f = 1.0f;
            String strM25304a = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 < iM18763u2) {
                int iM18763u3 = c9591hA0.m18763u() & 63;
                int iM18735A3 = c9591hA0.m18735A();
                int i16 = i4;
                while (i16 < iM18735A3) {
                    int iM18735A4 = c9591hA0.m18735A();
                    int i17 = iM18763u2;
                    System.arraycopy(TA1.f11190a, i4, bArr, i15, 4);
                    int i18 = i15 + 4;
                    System.arraycopy(c9591hA0.f28293a, c9591hA0.f28294b, bArr, i18, iM18735A4);
                    if (iM18763u3 == 33 && i16 == 0) {
                        C8184Qt0 c8184Qt0M7616f = TA1.m7616f(bArr, i18, i18 + iM18735A4);
                        int i19 = c8184Qt0M7616f.f9843e + 8;
                        i9 = c8184Qt0M7616f.f9844f + 8;
                        i10 = c8184Qt0M7616f.f9851m;
                        int i20 = c8184Qt0M7616f.f9852n;
                        int i21 = c8184Qt0M7616f.f9853o;
                        float f2 = c8184Qt0M7616f.f9849k;
                        int i22 = c8184Qt0M7616f.f9850l;
                        i = iM18763u3;
                        i2 = iM18735A3;
                        i8 = i19;
                        strM25304a = AbstractC11362v10.m25304a(c8184Qt0M7616f.f9839a, c8184Qt0M7616f.f9840b, c8184Qt0M7616f.f9841c, c8184Qt0M7616f.f9842d, c8184Qt0M7616f.f9845g, c8184Qt0M7616f.f9846h);
                        i12 = i21;
                        i11 = i20;
                        i13 = i22;
                        f = f2;
                    } else {
                        i = iM18763u3;
                        i2 = iM18735A3;
                    }
                    i15 = i18 + iM18735A4;
                    c9591hA0.m18742H(iM18735A4);
                    i16++;
                    iM18763u2 = i17;
                    iM18763u3 = i;
                    iM18735A3 = i2;
                    i4 = 0;
                }
                i14++;
                i4 = 0;
            }
            return new Z20(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iM18763u + 1, i8, i9, i10, i11, i12, f, i13, strM25304a);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C10103lA0.m22366a(e, "Error parsing HEVC config");
        }
    }
}
