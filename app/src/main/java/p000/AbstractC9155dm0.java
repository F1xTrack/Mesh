package p000;

import android.graphics.Rect;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: dm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9155dm0 {

    /* renamed from: a */
    public static final C1339VH f26262a = C1339VH.m8357A("w", UcumUtils.UCUM_HOURS, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    public static final C1339VH f26263b = C1339VH.m8357A(NotificationConstants.f19487ID, "layers", "w", UcumUtils.UCUM_HOURS, "p", "u");

    /* renamed from: c */
    public static final C1339VH f26264c = C1339VH.m8357A("list");

    /* renamed from: d */
    public static final C1339VH f26265d = C1339VH.m8357A("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    /* renamed from: a */
    public static C8532Xl0 m17741a(C7682Hc0 c7682Hc0) throws C6583ou, NumberFormatException, EOFException {
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
        float fM3974c = AbstractC7745Ih1.m3974c();
        C7544El0 c7544El0 = new C7544El0();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        C8932c31 c8932c31 = new C8932c31();
        C8532Xl0 c8532Xl0 = new C8532Xl0();
        c7682Hc0.mo3525n();
        float fMo3514D = 0.0f;
        int iMo3515J = 0;
        int iMo3515J2 = 0;
        float fMo3514D2 = 0.0f;
        float fMo3514D3 = 0.0f;
        while (c7682Hc0.mo3535x()) {
            switch (c7682Hc0.mo3518X(f26262a)) {
                case 0:
                    arrayList2 = arrayList4;
                    iMo3515J = c7682Hc0.mo3515J();
                    arrayList4 = arrayList2;
                    break;
                case 1:
                    arrayList2 = arrayList4;
                    iMo3515J2 = c7682Hc0.mo3515J();
                    arrayList4 = arrayList2;
                    break;
                case 2:
                    f6 = fM3974c;
                    arrayList2 = arrayList4;
                    fMo3514D2 = (float) c7682Hc0.mo3514D();
                    fM3974c = f6;
                    arrayList4 = arrayList2;
                    break;
                case 3:
                    f6 = fM3974c;
                    arrayList2 = arrayList4;
                    fMo3514D = ((float) c7682Hc0.mo3514D()) - 0.01f;
                    fM3974c = f6;
                    arrayList4 = arrayList2;
                    break;
                case 4:
                    f6 = fM3974c;
                    arrayList2 = arrayList4;
                    fMo3514D3 = (float) c7682Hc0.mo3514D();
                    fM3974c = f6;
                    arrayList4 = arrayList2;
                    break;
                case 5:
                    f = fM3974c;
                    arrayList = arrayList4;
                    f2 = fMo3514D;
                    i = iMo3515J2;
                    f3 = fMo3514D2;
                    String[] strArrSplit = c7682Hc0.mo3516S().split("\\.");
                    int i5 = Integer.parseInt(strArrSplit[0]);
                    int i6 = Integer.parseInt(strArrSplit[1]);
                    int i7 = Integer.parseInt(strArrSplit[2]);
                    if (i5 < 4 || (i5 <= 4 && (i6 < 4 || (i6 <= 4 && i7 < 0)))) {
                        c8532Xl0.m9110a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fM3974c = f;
                    fMo3514D2 = f3;
                    arrayList4 = arrayList;
                    fMo3514D = f2;
                    iMo3515J2 = i;
                    break;
                case 6:
                    f = fM3974c;
                    arrayList = arrayList4;
                    f2 = fMo3514D;
                    i = iMo3515J2;
                    f3 = fMo3514D2;
                    c7682Hc0.mo3523m();
                    int i8 = 0;
                    while (c7682Hc0.mo3535x()) {
                        C8574Yg0 c8574Yg0M9576a = AbstractC8626Zg0.m9576a(c7682Hc0, c8532Xl0);
                        if (c8574Yg0M9576a.f14422e == 3) {
                            i8++;
                        }
                        arrayList3.add(c8574Yg0M9576a);
                        c7544El0.m2383k(c8574Yg0M9576a.f14421d, c8574Yg0M9576a);
                        if (i8 > 4) {
                            AbstractC11201tl0.m24980b("You have " + i8 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    c7682Hc0.mo3527o();
                    fM3974c = f;
                    fMo3514D2 = f3;
                    arrayList4 = arrayList;
                    fMo3514D = f2;
                    iMo3515J2 = i;
                    break;
                case 7:
                    arrayList = arrayList4;
                    f2 = fMo3514D;
                    int i9 = iMo3515J2;
                    f3 = fMo3514D2;
                    c7682Hc0.mo3523m();
                    while (c7682Hc0.mo3535x()) {
                        ArrayList arrayList5 = new ArrayList();
                        C7544El0 c7544El02 = new C7544El0();
                        c7682Hc0.mo3525n();
                        String strMo3516S = null;
                        String strMo3516S2 = null;
                        String strMo3516S3 = null;
                        int iMo3515J3 = 0;
                        int iMo3515J4 = 0;
                        while (c7682Hc0.mo3535x()) {
                            int iMo3518X = c7682Hc0.mo3518X(f26263b);
                            if (iMo3518X != 0) {
                                if (iMo3518X == 1) {
                                    c7682Hc0.mo3523m();
                                    while (c7682Hc0.mo3535x()) {
                                        C8574Yg0 c8574Yg0M9576a2 = AbstractC8626Zg0.m9576a(c7682Hc0, c8532Xl0);
                                        c7544El02.m2383k(c8574Yg0M9576a2.f14421d, c8574Yg0M9576a2);
                                        arrayList5.add(c8574Yg0M9576a2);
                                        fM3974c = fM3974c;
                                        i9 = i9;
                                    }
                                    i2 = i9;
                                    f4 = fM3974c;
                                    c7682Hc0.mo3527o();
                                } else if (iMo3518X == 2) {
                                    iMo3515J3 = c7682Hc0.mo3515J();
                                } else if (iMo3518X == 3) {
                                    iMo3515J4 = c7682Hc0.mo3515J();
                                } else if (iMo3518X == 4) {
                                    strMo3516S2 = c7682Hc0.mo3516S();
                                } else if (iMo3518X != 5) {
                                    c7682Hc0.mo3519b0();
                                    c7682Hc0.mo3520d0();
                                    i2 = i9;
                                    f4 = fM3974c;
                                } else {
                                    strMo3516S3 = c7682Hc0.mo3516S();
                                }
                                fM3974c = f4;
                                i9 = i2;
                            } else {
                                strMo3516S = c7682Hc0.mo3516S();
                            }
                        }
                        int i10 = i9;
                        float f7 = fM3974c;
                        c7682Hc0.mo3529p();
                        if (strMo3516S2 != null) {
                            map2.put(strMo3516S, new C10691pm0(strMo3516S, strMo3516S2, iMo3515J3, iMo3515J4, strMo3516S3));
                        } else {
                            map.put(strMo3516S, arrayList5);
                        }
                        fM3974c = f7;
                        i9 = i10;
                    }
                    i = i9;
                    f = fM3974c;
                    c7682Hc0.mo3527o();
                    fM3974c = f;
                    fMo3514D2 = f3;
                    arrayList4 = arrayList;
                    fMo3514D = f2;
                    iMo3515J2 = i;
                    break;
                case 8:
                    f2 = fMo3514D;
                    int i11 = iMo3515J2;
                    f3 = fMo3514D2;
                    c7682Hc0.mo3525n();
                    while (c7682Hc0.mo3535x()) {
                        if (c7682Hc0.mo3518X(f26264c) != 0) {
                            c7682Hc0.mo3519b0();
                            c7682Hc0.mo3520d0();
                        } else {
                            c7682Hc0.mo3523m();
                            while (c7682Hc0.mo3535x()) {
                                C1339VH c1339vh = AbstractC1606ZW.f14953a;
                                c7682Hc0.mo3525n();
                                String strMo3516S4 = null;
                                String strMo3516S5 = null;
                                String strMo3516S6 = null;
                                while (c7682Hc0.mo3535x()) {
                                    int iMo3518X2 = c7682Hc0.mo3518X(AbstractC1606ZW.f14953a);
                                    if (iMo3518X2 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (iMo3518X2 == 1) {
                                            strMo3516S5 = c7682Hc0.mo3516S();
                                        } else if (iMo3518X2 == 2) {
                                            strMo3516S6 = c7682Hc0.mo3516S();
                                        } else if (iMo3518X2 != 3) {
                                            c7682Hc0.mo3519b0();
                                            c7682Hc0.mo3520d0();
                                        } else {
                                            c7682Hc0.mo3514D();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        strMo3516S4 = c7682Hc0.mo3516S();
                                    }
                                }
                                c7682Hc0.mo3529p();
                                map3.put(strMo3516S5, new C1102RW(strMo3516S4, strMo3516S5, strMo3516S6));
                                arrayList4 = arrayList4;
                            }
                            c7682Hc0.mo3527o();
                        }
                    }
                    arrayList = arrayList4;
                    c7682Hc0.mo3529p();
                    i = i11;
                    f = fM3974c;
                    fM3974c = f;
                    fMo3514D2 = f3;
                    arrayList4 = arrayList;
                    fMo3514D = f2;
                    iMo3515J2 = i;
                    break;
                case 9:
                    f2 = fMo3514D;
                    i3 = iMo3515J2;
                    f3 = fMo3514D2;
                    c7682Hc0.mo3523m();
                    while (c7682Hc0.mo3535x()) {
                        C1339VH c1339vh2 = AbstractC1291UW.f11831a;
                        ArrayList arrayList7 = new ArrayList();
                        c7682Hc0.mo3525n();
                        double dMo3514D = 0.0d;
                        String strMo3516S7 = null;
                        String strMo3516S8 = null;
                        char cCharAt = 0;
                        while (c7682Hc0.mo3535x()) {
                            int iMo3518X3 = c7682Hc0.mo3518X(AbstractC1291UW.f11831a);
                            if (iMo3518X3 == 0) {
                                cCharAt = c7682Hc0.mo3516S().charAt(0);
                            } else if (iMo3518X3 == 1) {
                                c7682Hc0.mo3514D();
                            } else if (iMo3518X3 == 2) {
                                dMo3514D = c7682Hc0.mo3514D();
                            } else if (iMo3518X3 == 3) {
                                strMo3516S7 = c7682Hc0.mo3516S();
                            } else if (iMo3518X3 == 4) {
                                strMo3516S8 = c7682Hc0.mo3516S();
                            } else if (iMo3518X3 != 5) {
                                c7682Hc0.mo3519b0();
                                c7682Hc0.mo3520d0();
                            } else {
                                c7682Hc0.mo3525n();
                                while (c7682Hc0.mo3535x()) {
                                    if (c7682Hc0.mo3518X(AbstractC1291UW.f11832b) != 0) {
                                        c7682Hc0.mo3519b0();
                                        c7682Hc0.mo3520d0();
                                    } else {
                                        c7682Hc0.mo3523m();
                                        while (c7682Hc0.mo3535x()) {
                                            arrayList7.add((SZ0) AbstractC0313Ey.m2460a(c7682Hc0, c8532Xl0));
                                        }
                                        c7682Hc0.mo3527o();
                                    }
                                }
                                c7682Hc0.mo3529p();
                            }
                        }
                        c7682Hc0.mo3529p();
                        C1228TW c1228tw = new C1228TW(arrayList7, cCharAt, dMo3514D, strMo3516S7, strMo3516S8);
                        c8932c31.m10583g(c1228tw.hashCode(), c1228tw);
                    }
                    c7682Hc0.mo3527o();
                    i = i3;
                    f = fM3974c;
                    arrayList = arrayList4;
                    fM3974c = f;
                    fMo3514D2 = f3;
                    arrayList4 = arrayList;
                    fMo3514D = f2;
                    iMo3515J2 = i;
                    break;
                case 10:
                    c7682Hc0.mo3523m();
                    while (c7682Hc0.mo3535x()) {
                        c7682Hc0.mo3525n();
                        String strMo3516S9 = null;
                        float fMo3514D4 = 0.0f;
                        float fMo3514D5 = 0.0f;
                        while (c7682Hc0.mo3535x()) {
                            int iMo3518X4 = c7682Hc0.mo3518X(f26265d);
                            if (iMo3518X4 != 0) {
                                f5 = fMo3514D;
                                if (iMo3518X4 == 1) {
                                    i4 = iMo3515J2;
                                    fMo3514D2 = fMo3514D2;
                                    fMo3514D4 = (float) c7682Hc0.mo3514D();
                                } else if (iMo3518X4 != 2) {
                                    c7682Hc0.mo3519b0();
                                    c7682Hc0.mo3520d0();
                                } else {
                                    i4 = iMo3515J2;
                                    fMo3514D2 = fMo3514D2;
                                    fMo3514D5 = (float) c7682Hc0.mo3514D();
                                }
                                fMo3514D = f5;
                                iMo3515J2 = i4;
                            } else {
                                f5 = fMo3514D;
                                strMo3516S9 = c7682Hc0.mo3516S();
                            }
                            fMo3514D = f5;
                        }
                        c7682Hc0.mo3529p();
                        arrayList4.add(new C11333un0(strMo3516S9, fMo3514D4, fMo3514D5));
                        iMo3515J2 = iMo3515J2;
                        fMo3514D2 = fMo3514D2;
                        fMo3514D = fMo3514D;
                    }
                    f2 = fMo3514D;
                    i3 = iMo3515J2;
                    f3 = fMo3514D2;
                    c7682Hc0.mo3527o();
                    i = i3;
                    f = fM3974c;
                    arrayList = arrayList4;
                    fM3974c = f;
                    fMo3514D2 = f3;
                    arrayList4 = arrayList;
                    fMo3514D = f2;
                    iMo3515J2 = i;
                    break;
                default:
                    c7682Hc0.mo3519b0();
                    c7682Hc0.mo3520d0();
                    f = fM3974c;
                    arrayList = arrayList4;
                    f2 = fMo3514D;
                    i = iMo3515J2;
                    f3 = fMo3514D2;
                    fM3974c = f;
                    fMo3514D2 = f3;
                    arrayList4 = arrayList;
                    fMo3514D = f2;
                    iMo3515J2 = i;
                    break;
            }
        }
        float f8 = fM3974c;
        Rect rect = new Rect(0, 0, (int) (iMo3515J * f8), (int) (iMo3515J2 * f8));
        float fM3974c2 = AbstractC7745Ih1.m3974c();
        c8532Xl0.f13957k = rect;
        c8532Xl0.f13958l = fMo3514D2;
        c8532Xl0.f13959m = fMo3514D;
        c8532Xl0.f13960n = fMo3514D3;
        c8532Xl0.f13956j = arrayList3;
        c8532Xl0.f13955i = c7544El0;
        c8532Xl0.f13949c = map;
        c8532Xl0.f13950d = map2;
        c8532Xl0.f13951e = fM3974c2;
        c8532Xl0.f13954h = c8932c31;
        c8532Xl0.f13952f = map3;
        c8532Xl0.f13953g = arrayList4;
        return c8532Xl0;
    }
}
