package defpackage;

import java.util.ArrayList;

/* renamed from: df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3432df {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public C3432df(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static C3432df a(C4103hA0 c4103hA0) throws C5643lA0 {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        String str;
        int i8;
        try {
            c4103hA0.H(4);
            int iU = (c4103hA0.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = c4103hA0.u() & 31;
            int i9 = 0;
            while (true) {
                bArr = AbstractC7522v10.a;
                if (i9 >= iU2) {
                    break;
                }
                int iA = c4103hA0.A();
                int i10 = c4103hA0.b;
                c4103hA0.H(iA);
                byte[] bArr2 = c4103hA0.a;
                byte[] bArr3 = new byte[iA + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i10, bArr3, 4, iA);
                arrayList.add(bArr3);
                i9++;
            }
            int iU3 = c4103hA0.u();
            for (int i11 = 0; i11 < iU3; i11++) {
                int iA2 = c4103hA0.A();
                int i12 = c4103hA0.b;
                c4103hA0.H(iA2);
                byte[] bArr4 = c4103hA0.a;
                byte[] bArr5 = new byte[iA2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i12, bArr5, 4, iA2);
                arrayList.add(bArr5);
            }
            if (iU2 > 0) {
                C1481St0 c1481St0G = TA1.g((byte[]) arrayList.get(0), iU, ((byte[]) arrayList.get(0)).length);
                int i13 = c1481St0G.e;
                int i14 = c1481St0G.f;
                int i15 = c1481St0G.h + 8;
                int i16 = c1481St0G.i + 8;
                int i17 = c1481St0G.p;
                int i18 = c1481St0G.q;
                int i19 = c1481St0G.r;
                int i20 = c1481St0G.s;
                float f2 = c1481St0G.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c1481St0G.a), Integer.valueOf(c1481St0G.b), Integer.valueOf(c1481St0G.c));
                i7 = i19;
                i8 = i20;
                f = f2;
                i4 = i16;
                i5 = i17;
                i6 = i18;
                i = i13;
                i2 = i14;
                i3 = i15;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                f = 1.0f;
                str = null;
                i8 = 16;
            }
            return new C3432df(arrayList, iU, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C5643lA0.a(e, "Error parsing AVC config");
        }
    }
}
