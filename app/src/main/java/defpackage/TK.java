package defpackage;

import android.graphics.PointF;
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public final class TK implements InterfaceC1836Xh1 {
    public static final TK a = new TK();
    public static final VH b = VH.A("t", "f", UcumUtils.UCUM_SECONDS, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.InterfaceC1836Xh1
    public final Object z(AbstractC8396zc0 abstractC8396zc0, float f) {
        String str;
        abstractC8396zc0.n();
        String strS = null;
        float fD = 0.0f;
        float fD2 = 0.0f;
        float fD3 = 0.0f;
        float fD4 = 0.0f;
        int iJ = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zA = true;
        int i = 3;
        String strS2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC8396zc0.x()) {
            switch (abstractC8396zc0.X(b)) {
                case 0:
                    strS = abstractC8396zc0.S();
                    continue;
                case 1:
                    str = strS;
                    strS2 = abstractC8396zc0.S();
                    break;
                case 2:
                    str = strS;
                    fD = (float) abstractC8396zc0.D();
                    break;
                case 3:
                    str = strS;
                    int iJ2 = abstractC8396zc0.J();
                    if (iJ2 <= 2 && iJ2 >= 0) {
                        i = AbstractC8235ym.C(3)[iJ2];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 4:
                    iJ = abstractC8396zc0.J();
                    continue;
                case 5:
                    fD2 = (float) abstractC8396zc0.D();
                    continue;
                case 6:
                    fD3 = (float) abstractC8396zc0.D();
                    continue;
                case 7:
                    iA = AbstractC0651Ic0.a(abstractC8396zc0);
                    continue;
                case 8:
                    iA2 = AbstractC0651Ic0.a(abstractC8396zc0);
                    continue;
                case 9:
                    fD4 = (float) abstractC8396zc0.D();
                    continue;
                case 10:
                    zA = abstractC8396zc0.A();
                    continue;
                case 11:
                    abstractC8396zc0.m();
                    pointF = new PointF(((float) abstractC8396zc0.D()) * f, ((float) abstractC8396zc0.D()) * f);
                    abstractC8396zc0.o();
                    continue;
                case 12:
                    abstractC8396zc0.m();
                    str = strS;
                    pointF2 = new PointF(((float) abstractC8396zc0.D()) * f, ((float) abstractC8396zc0.D()) * f);
                    abstractC8396zc0.o();
                    break;
                default:
                    abstractC8396zc0.b0();
                    abstractC8396zc0.d0();
                    continue;
            }
            strS = str;
        }
        abstractC8396zc0.p();
        SK sk = new SK();
        sk.a = strS;
        sk.b = strS2;
        sk.c = fD;
        sk.d = i;
        sk.e = iJ;
        sk.f = fD2;
        sk.g = fD3;
        sk.h = iA;
        sk.i = iA2;
        sk.j = fD4;
        sk.k = zA;
        sk.l = pointF;
        sk.m = pointF2;
        return sk;
    }
}
