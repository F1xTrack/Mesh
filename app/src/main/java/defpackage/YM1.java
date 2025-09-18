package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class YM1 {
    public static final C7575vI a(OF0 of0) {
        switch (of0 == null ? -1 : VF0.b[of0.ordinal()]) {
            case 1:
                C7575vI c7575vI = AbstractC7765wI.d;
                O90.e(c7575vI, "INTERNAL");
                return c7575vI;
            case 2:
                C7575vI c7575vI2 = AbstractC7765wI.a;
                O90.e(c7575vI2, "PRIVATE");
                return c7575vI2;
            case 3:
                C7575vI c7575vI3 = AbstractC7765wI.b;
                O90.e(c7575vI3, "PRIVATE_TO_THIS");
                return c7575vI3;
            case 4:
                C7575vI c7575vI4 = AbstractC7765wI.c;
                O90.e(c7575vI4, "PROTECTED");
                return c7575vI4;
            case 5:
                C7575vI c7575vI5 = AbstractC7765wI.e;
                O90.e(c7575vI5, "PUBLIC");
                return c7575vI5;
            case 6:
                C7575vI c7575vI6 = AbstractC7765wI.f;
                O90.e(c7575vI6, "LOCAL");
                return c7575vI6;
            default:
                C7575vI c7575vI7 = AbstractC7765wI.a;
                O90.e(c7575vI7, "PRIVATE");
                return c7575vI7;
        }
    }

    public static final int b(EnumC5276jF0 enumC5276jF0) {
        int i = enumC5276jF0 == null ? -1 : VF0.a[enumC5276jF0.ordinal()];
        if (i == 1) {
            return 1;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return 1;
                }
            }
        }
        return i2;
    }

    public static K4 c(C0573Hc0 c0573Hc0, C1847Xl0 c1847Xl0) {
        return new K4(AbstractC6884rg0.a(c0573Hc0, c1847Xl0, 1.0f, C0084Av0.c, false), 0);
    }

    public static L4 d(AbstractC8396zc0 abstractC8396zc0, C1847Xl0 c1847Xl0, boolean z) {
        return new L4(2, AbstractC6884rg0.a(abstractC8396zc0, c1847Xl0, z ? AbstractC0667Ih1.c() : 1.0f, OJ1.c, false));
    }

    public static K4 e(C0573Hc0 c0573Hc0, C1847Xl0 c1847Xl0, int i) {
        C3547eG c3547eG = new C3547eG(1);
        c3547eG.b = i;
        ArrayList arrayListA = AbstractC6884rg0.a(c0573Hc0, c1847Xl0, 1.0f, c3547eG, false);
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            C6312og0 c6312og0 = (C6312og0) arrayListA.get(i2);
            Q10 q10 = (Q10) c6312og0.b;
            Q10 q102 = (Q10) c6312og0.c;
            if (q10 != null && q102 != null) {
                float[] fArr = q10.a;
                int length = fArr.length;
                float[] fArr2 = q102.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    c6312og0 = new C6312og0(q10.b(fArrCopyOfRange), q102.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i2, c6312og0);
        }
        return new K4(arrayListA, 1);
    }

    public static K4 f(AbstractC8396zc0 abstractC8396zc0, C1847Xl0 c1847Xl0) {
        return new K4(AbstractC6884rg0.a(abstractC8396zc0, c1847Xl0, 1.0f, TE.e, false), 2);
    }

    public static K4 g(C0573Hc0 c0573Hc0, C1847Xl0 c1847Xl0) {
        return new K4(AbstractC6884rg0.a(c0573Hc0, c1847Xl0, AbstractC0667Ih1.c(), NV1.e, true), 3);
    }
}
