package defpackage;

import android.graphics.Rect;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: dm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3454dm0 {
    public static final VH a = VH.A("w", UcumUtils.UCUM_HOURS, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final VH b = VH.A(NotificationConstants.ID, "layers", "w", UcumUtils.UCUM_HOURS, "p", "u");
    public static final VH c = VH.A("list");
    public static final VH d = VH.A("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static C1847Xl0 a(C0573Hc0 c0573Hc0) throws C6353ou, NumberFormatException, EOFException {
        float f;
        ArrayList arrayList;
        float f2;
        int i;
        float f3;
        int i2;
        float f4;
        int i3;
        float f5;
        int i4;
        ArrayList arrayList2;
        float f6;
        float fC = AbstractC0667Ih1.c();
        C0366El0 c0366El0 = new C0366El0();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        C2443c31 c2443c31 = new C2443c31();
        C1847Xl0 c1847Xl0 = new C1847Xl0();
        c0573Hc0.n();
        float fD = 0.0f;
        int iJ = 0;
        int iJ2 = 0;
        float fD2 = 0.0f;
        float fD3 = 0.0f;
        while (c0573Hc0.x()) {
            switch (c0573Hc0.X(a)) {
                case 0:
                    arrayList2 = arrayList4;
                    iJ = c0573Hc0.J();
                    arrayList4 = arrayList2;
                    break;
                case 1:
                    arrayList2 = arrayList4;
                    iJ2 = c0573Hc0.J();
                    arrayList4 = arrayList2;
                    break;
                case 2:
                    f6 = fC;
                    arrayList2 = arrayList4;
                    fD2 = (float) c0573Hc0.D();
                    fC = f6;
                    arrayList4 = arrayList2;
                    break;
                case 3:
                    f6 = fC;
                    arrayList2 = arrayList4;
                    fD = ((float) c0573Hc0.D()) - 0.01f;
                    fC = f6;
                    arrayList4 = arrayList2;
                    break;
                case 4:
                    f6 = fC;
                    arrayList2 = arrayList4;
                    fD3 = (float) c0573Hc0.D();
                    fC = f6;
                    arrayList4 = arrayList2;
                    break;
                case 5:
                    f = fC;
                    arrayList = arrayList4;
                    f2 = fD;
                    i = iJ2;
                    f3 = fD2;
                    String[] strArrSplit = c0573Hc0.S().split("\\.");
                    int i5 = Integer.parseInt(strArrSplit[0]);
                    int i6 = Integer.parseInt(strArrSplit[1]);
                    int i7 = Integer.parseInt(strArrSplit[2]);
                    if (i5 < 4 || (i5 <= 4 && (i6 < 4 || (i6 <= 4 && i7 < 0)))) {
                        c1847Xl0.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fC = f;
                    fD2 = f3;
                    arrayList4 = arrayList;
                    fD = f2;
                    iJ2 = i;
                    break;
                case 6:
                    f = fC;
                    arrayList = arrayList4;
                    f2 = fD;
                    i = iJ2;
                    f3 = fD2;
                    c0573Hc0.m();
                    int i8 = 0;
                    while (c0573Hc0.x()) {
                        C1910Yg0 c1910Yg0A = AbstractC1988Zg0.a(c0573Hc0, c1847Xl0);
                        if (c1910Yg0A.e == 3) {
                            i8++;
                        }
                        arrayList3.add(c1910Yg0A);
                        c0366El0.k(c1910Yg0A.d, c1910Yg0A);
                        if (i8 > 4) {
                            AbstractC7281tl0.b("You have " + i8 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    c0573Hc0.o();
                    fC = f;
                    fD2 = f3;
                    arrayList4 = arrayList;
                    fD = f2;
                    iJ2 = i;
                    break;
                case 7:
                    arrayList = arrayList4;
                    f2 = fD;
                    int i9 = iJ2;
                    f3 = fD2;
                    c0573Hc0.m();
                    while (c0573Hc0.x()) {
                        ArrayList arrayList5 = new ArrayList();
                        C0366El0 c0366El02 = new C0366El0();
                        c0573Hc0.n();
                        String strS = null;
                        String strS2 = null;
                        String strS3 = null;
                        int iJ3 = 0;
                        int iJ4 = 0;
                        while (c0573Hc0.x()) {
                            int iX = c0573Hc0.X(b);
                            if (iX != 0) {
                                if (iX == 1) {
                                    c0573Hc0.m();
                                    while (c0573Hc0.x()) {
                                        C1910Yg0 c1910Yg0A2 = AbstractC1988Zg0.a(c0573Hc0, c1847Xl0);
                                        c0366El02.k(c1910Yg0A2.d, c1910Yg0A2);
                                        arrayList5.add(c1910Yg0A2);
                                        fC = fC;
                                        i9 = i9;
                                    }
                                    i2 = i9;
                                    f4 = fC;
                                    c0573Hc0.o();
                                } else if (iX == 2) {
                                    iJ3 = c0573Hc0.J();
                                } else if (iX == 3) {
                                    iJ4 = c0573Hc0.J();
                                } else if (iX == 4) {
                                    strS2 = c0573Hc0.S();
                                } else if (iX != 5) {
                                    c0573Hc0.b0();
                                    c0573Hc0.d0();
                                    i2 = i9;
                                    f4 = fC;
                                } else {
                                    strS3 = c0573Hc0.S();
                                }
                                fC = f4;
                                i9 = i2;
                            } else {
                                strS = c0573Hc0.S();
                            }
                        }
                        int i10 = i9;
                        float f7 = fC;
                        c0573Hc0.p();
                        if (strS2 != null) {
                            map2.put(strS, new C6521pm0(strS, strS2, iJ3, iJ4, strS3));
                        } else {
                            map.put(strS, arrayList5);
                        }
                        fC = f7;
                        i9 = i10;
                    }
                    i = i9;
                    f = fC;
                    c0573Hc0.o();
                    fC = f;
                    fD2 = f3;
                    arrayList4 = arrayList;
                    fD = f2;
                    iJ2 = i;
                    break;
                case 8:
                    f2 = fD;
                    int i11 = iJ2;
                    f3 = fD2;
                    c0573Hc0.n();
                    while (c0573Hc0.x()) {
                        if (c0573Hc0.X(c) != 0) {
                            c0573Hc0.b0();
                            c0573Hc0.d0();
                        } else {
                            c0573Hc0.m();
                            while (c0573Hc0.x()) {
                                VH vh = ZW.a;
                                c0573Hc0.n();
                                String strS4 = null;
                                String strS5 = null;
                                String strS6 = null;
                                while (c0573Hc0.x()) {
                                    int iX2 = c0573Hc0.X(ZW.a);
                                    if (iX2 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (iX2 == 1) {
                                            strS5 = c0573Hc0.S();
                                        } else if (iX2 == 2) {
                                            strS6 = c0573Hc0.S();
                                        } else if (iX2 != 3) {
                                            c0573Hc0.b0();
                                            c0573Hc0.d0();
                                        } else {
                                            c0573Hc0.D();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        strS4 = c0573Hc0.S();
                                    }
                                }
                                c0573Hc0.p();
                                map3.put(strS5, new RW(strS4, strS5, strS6));
                                arrayList4 = arrayList4;
                            }
                            c0573Hc0.o();
                        }
                    }
                    arrayList = arrayList4;
                    c0573Hc0.p();
                    i = i11;
                    f = fC;
                    fC = f;
                    fD2 = f3;
                    arrayList4 = arrayList;
                    fD = f2;
                    iJ2 = i;
                    break;
                case 9:
                    f2 = fD;
                    i3 = iJ2;
                    f3 = fD2;
                    c0573Hc0.m();
                    while (c0573Hc0.x()) {
                        VH vh2 = UW.a;
                        ArrayList arrayList7 = new ArrayList();
                        c0573Hc0.n();
                        double D = 0.0d;
                        String strS7 = null;
                        String strS8 = null;
                        char cCharAt = 0;
                        while (c0573Hc0.x()) {
                            int iX3 = c0573Hc0.X(UW.a);
                            if (iX3 == 0) {
                                cCharAt = c0573Hc0.S().charAt(0);
                            } else if (iX3 == 1) {
                                c0573Hc0.D();
                            } else if (iX3 == 2) {
                                D = c0573Hc0.D();
                            } else if (iX3 == 3) {
                                strS7 = c0573Hc0.S();
                            } else if (iX3 == 4) {
                                strS8 = c0573Hc0.S();
                            } else if (iX3 != 5) {
                                c0573Hc0.b0();
                                c0573Hc0.d0();
                            } else {
                                c0573Hc0.n();
                                while (c0573Hc0.x()) {
                                    if (c0573Hc0.X(UW.b) != 0) {
                                        c0573Hc0.b0();
                                        c0573Hc0.d0();
                                    } else {
                                        c0573Hc0.m();
                                        while (c0573Hc0.x()) {
                                            arrayList7.add((SZ0) AbstractC0404Ey.a(c0573Hc0, c1847Xl0));
                                        }
                                        c0573Hc0.o();
                                    }
                                }
                                c0573Hc0.p();
                            }
                        }
                        c0573Hc0.p();
                        TW tw = new TW(arrayList7, cCharAt, D, strS7, strS8);
                        c2443c31.g(tw.hashCode(), tw);
                    }
                    c0573Hc0.o();
                    i = i3;
                    f = fC;
                    arrayList = arrayList4;
                    fC = f;
                    fD2 = f3;
                    arrayList4 = arrayList;
                    fD = f2;
                    iJ2 = i;
                    break;
                case 10:
                    c0573Hc0.m();
                    while (c0573Hc0.x()) {
                        c0573Hc0.n();
                        String strS9 = null;
                        float fD4 = 0.0f;
                        float fD5 = 0.0f;
                        while (c0573Hc0.x()) {
                            int iX4 = c0573Hc0.X(d);
                            if (iX4 != 0) {
                                f5 = fD;
                                if (iX4 == 1) {
                                    i4 = iJ2;
                                    fD2 = fD2;
                                    fD4 = (float) c0573Hc0.D();
                                } else if (iX4 != 2) {
                                    c0573Hc0.b0();
                                    c0573Hc0.d0();
                                } else {
                                    i4 = iJ2;
                                    fD2 = fD2;
                                    fD5 = (float) c0573Hc0.D();
                                }
                                fD = f5;
                                iJ2 = i4;
                            } else {
                                f5 = fD;
                                strS9 = c0573Hc0.S();
                            }
                            fD = f5;
                        }
                        c0573Hc0.p();
                        arrayList4.add(new C7478un0(strS9, fD4, fD5));
                        iJ2 = iJ2;
                        fD2 = fD2;
                        fD = fD;
                    }
                    f2 = fD;
                    i3 = iJ2;
                    f3 = fD2;
                    c0573Hc0.o();
                    i = i3;
                    f = fC;
                    arrayList = arrayList4;
                    fC = f;
                    fD2 = f3;
                    arrayList4 = arrayList;
                    fD = f2;
                    iJ2 = i;
                    break;
                default:
                    c0573Hc0.b0();
                    c0573Hc0.d0();
                    f = fC;
                    arrayList = arrayList4;
                    f2 = fD;
                    i = iJ2;
                    f3 = fD2;
                    fC = f;
                    fD2 = f3;
                    arrayList4 = arrayList;
                    fD = f2;
                    iJ2 = i;
                    break;
            }
        }
        float f8 = fC;
        Rect rect = new Rect(0, 0, (int) (iJ * f8), (int) (iJ2 * f8));
        float fC2 = AbstractC0667Ih1.c();
        c1847Xl0.k = rect;
        c1847Xl0.l = fD2;
        c1847Xl0.m = fD;
        c1847Xl0.n = fD3;
        c1847Xl0.j = arrayList3;
        c1847Xl0.i = c0366El0;
        c1847Xl0.c = map;
        c1847Xl0.d = map2;
        c1847Xl0.e = fC2;
        c1847Xl0.h = c2443c31;
        c1847Xl0.f = map3;
        c1847Xl0.g = arrayList4;
        return c1847Xl0;
    }
}
