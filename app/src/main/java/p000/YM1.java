package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class YM1 {
    /* renamed from: a */
    public static final C7003vI m9269a(OF0 of0) {
        switch (of0 == null ? -1 : VF0.f12467b[of0.ordinal()]) {
            case 1:
                C7003vI c7003vI = AbstractC7066wI.f44763d;
                O90.m5967e(c7003vI, "INTERNAL");
                return c7003vI;
            case 2:
                C7003vI c7003vI2 = AbstractC7066wI.f44760a;
                O90.m5967e(c7003vI2, "PRIVATE");
                return c7003vI2;
            case 3:
                C7003vI c7003vI3 = AbstractC7066wI.f44761b;
                O90.m5967e(c7003vI3, "PRIVATE_TO_THIS");
                return c7003vI3;
            case 4:
                C7003vI c7003vI4 = AbstractC7066wI.f44762c;
                O90.m5967e(c7003vI4, "PROTECTED");
                return c7003vI4;
            case 5:
                C7003vI c7003vI5 = AbstractC7066wI.f44764e;
                O90.m5967e(c7003vI5, "PUBLIC");
                return c7003vI5;
            case 6:
                C7003vI c7003vI6 = AbstractC7066wI.f44765f;
                O90.m5967e(c7003vI6, "LOCAL");
                return c7003vI6;
            default:
                C7003vI c7003vI7 = AbstractC7066wI.f44760a;
                O90.m5967e(c7003vI7, "PRIVATE");
                return c7003vI7;
        }
    }

    /* renamed from: b */
    public static final int m9270b(EnumC9857jF0 enumC9857jF0) {
        int i = enumC9857jF0 == null ? -1 : VF0.f12466a[enumC9857jF0.ordinal()];
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

    /* renamed from: c */
    public static C0635K4 m9271c(C7682Hc0 c7682Hc0, C8532Xl0 c8532Xl0) {
        return new C0635K4(AbstractC10935rg0.m24446a(c7682Hc0, c8532Xl0, 1.0f, C7356Av0.f463c, false), 0);
    }

    /* renamed from: d */
    public static C0698L4 m9272d(AbstractC11947zc0 abstractC11947zc0, C8532Xl0 c8532Xl0, boolean z) {
        return new C0698L4(2, AbstractC10935rg0.m24446a(abstractC11947zc0, c8532Xl0, z ? AbstractC7745Ih1.m3974c() : 1.0f, OJ1.f8357c, false));
    }

    /* renamed from: e */
    public static C0635K4 m9273e(C7682Hc0 c7682Hc0, C8532Xl0 c8532Xl0, int i) {
        C3979eG c3979eG = new C3979eG(1);
        c3979eG.f26623b = i;
        ArrayList arrayListM24446a = AbstractC10935rg0.m24446a(c7682Hc0, c8532Xl0, 1.0f, c3979eG, false);
        for (int i2 = 0; i2 < arrayListM24446a.size(); i2++) {
            C10551og0 c10551og0 = (C10551og0) arrayListM24446a.get(i2);
            Q10 q10 = (Q10) c10551og0.f39159b;
            Q10 q102 = (Q10) c10551og0.f39160c;
            if (q10 != null && q102 != null) {
                float[] fArr = q10.f9403a;
                int length = fArr.length;
                float[] fArr2 = q102.f9403a;
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
                    c10551og0 = new C10551og0(q10.m6546b(fArrCopyOfRange), q102.m6546b(fArrCopyOfRange));
                }
            }
            arrayListM24446a.set(i2, c10551og0);
        }
        return new C0635K4(arrayListM24446a, 1);
    }

    /* renamed from: f */
    public static C0635K4 m9274f(AbstractC11947zc0 abstractC11947zc0, C8532Xl0 c8532Xl0) {
        return new C0635K4(AbstractC10935rg0.m24446a(abstractC11947zc0, c8532Xl0, 1.0f, C1210TE.f11210e, false), 2);
    }

    /* renamed from: g */
    public static C0635K4 m9275g(C7682Hc0 c7682Hc0, C8532Xl0 c8532Xl0) {
        return new C0635K4(AbstractC10935rg0.m24446a(c7682Hc0, c8532Xl0, AbstractC7745Ih1.m3974c(), NV1.f7839e, true), 3);
    }
}
