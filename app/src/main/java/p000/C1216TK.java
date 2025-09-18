package p000;

import android.graphics.PointF;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: TK */
/* loaded from: classes.dex */
public final class C1216TK implements InterfaceC8525Xh1 {

    /* renamed from: a */
    public static final C1216TK f11323a = new C1216TK();

    /* renamed from: b */
    public static final C1339VH f11324b = C1339VH.m8357A("t", "f", UcumUtils.UCUM_SECONDS, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // p000.InterfaceC8525Xh1
    /* renamed from: z */
    public final Object mo407z(AbstractC11947zc0 abstractC11947zc0, float f) {
        String str;
        abstractC11947zc0.mo3525n();
        String strMo3516S = null;
        float fMo3514D = 0.0f;
        float fMo3514D2 = 0.0f;
        float fMo3514D3 = 0.0f;
        float fMo3514D4 = 0.0f;
        int iMo3515J = 0;
        int iM3954a = 0;
        int iM3954a2 = 0;
        boolean zMo3513A = true;
        int i = 3;
        String strMo3516S2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC11947zc0.mo3535x()) {
            switch (abstractC11947zc0.mo3518X(f11324b)) {
                case 0:
                    strMo3516S = abstractC11947zc0.mo3516S();
                    continue;
                case 1:
                    str = strMo3516S;
                    strMo3516S2 = abstractC11947zc0.mo3516S();
                    break;
                case 2:
                    str = strMo3516S;
                    fMo3514D = (float) abstractC11947zc0.mo3514D();
                    break;
                case 3:
                    str = strMo3516S;
                    int iMo3515J2 = abstractC11947zc0.mo3515J();
                    if (iMo3515J2 <= 2 && iMo3515J2 >= 0) {
                        i = AbstractC7222ym.m26223C(3)[iMo3515J2];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 4:
                    iMo3515J = abstractC11947zc0.mo3515J();
                    continue;
                case 5:
                    fMo3514D2 = (float) abstractC11947zc0.mo3514D();
                    continue;
                case 6:
                    fMo3514D3 = (float) abstractC11947zc0.mo3514D();
                    continue;
                case 7:
                    iM3954a = AbstractC7734Ic0.m3954a(abstractC11947zc0);
                    continue;
                case 8:
                    iM3954a2 = AbstractC7734Ic0.m3954a(abstractC11947zc0);
                    continue;
                case 9:
                    fMo3514D4 = (float) abstractC11947zc0.mo3514D();
                    continue;
                case 10:
                    zMo3513A = abstractC11947zc0.mo3513A();
                    continue;
                case 11:
                    abstractC11947zc0.mo3523m();
                    pointF = new PointF(((float) abstractC11947zc0.mo3514D()) * f, ((float) abstractC11947zc0.mo3514D()) * f);
                    abstractC11947zc0.mo3527o();
                    continue;
                case 12:
                    abstractC11947zc0.mo3523m();
                    str = strMo3516S;
                    pointF2 = new PointF(((float) abstractC11947zc0.mo3514D()) * f, ((float) abstractC11947zc0.mo3514D()) * f);
                    abstractC11947zc0.mo3527o();
                    break;
                default:
                    abstractC11947zc0.mo3519b0();
                    abstractC11947zc0.mo3520d0();
                    continue;
            }
            strMo3516S = str;
        }
        abstractC11947zc0.mo3529p();
        C1153SK c1153sk = new C1153SK();
        c1153sk.f10685a = strMo3516S;
        c1153sk.f10686b = strMo3516S2;
        c1153sk.f10687c = fMo3514D;
        c1153sk.f10688d = i;
        c1153sk.f10689e = iMo3515J;
        c1153sk.f10690f = fMo3514D2;
        c1153sk.f10691g = fMo3514D3;
        c1153sk.f10692h = iM3954a;
        c1153sk.f10693i = iM3954a2;
        c1153sk.f10694j = fMo3514D4;
        c1153sk.f10695k = zMo3513A;
        c1153sk.f10696l = pointF;
        c1153sk.f10697m = pointF2;
        return c1153sk;
    }
}
