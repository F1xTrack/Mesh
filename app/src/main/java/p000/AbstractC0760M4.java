package p000;

import java.io.EOFException;
import java.util.ArrayList;

/* renamed from: M4 */
/* loaded from: classes.dex */
public abstract class AbstractC0760M4 {

    /* renamed from: a */
    public static final C1339VH f6982a = C1339VH.m8357A("k", "x", "y");

    /* renamed from: a */
    public static C7978Mu0 m5253a(C7682Hc0 c7682Hc0, C8532Xl0 c8532Xl0) throws C6583ou, EOFException {
        ArrayList arrayList = new ArrayList();
        if (c7682Hc0.mo3517U() == 1) {
            c7682Hc0.mo3523m();
            while (c7682Hc0.mo3535x()) {
                arrayList.add(new C10999sA0(c8532Xl0, AbstractC10807qg0.m24043b(c7682Hc0, c8532Xl0, AbstractC7745Ih1.m3974c(), C7616Fv0.f3478f, c7682Hc0.mo3517U() == 3, false)));
            }
            c7682Hc0.mo3527o();
            AbstractC10935rg0.m24447b(arrayList);
        } else {
            arrayList.add(new C10551og0(AbstractC7734Ic0.m3955b(c7682Hc0, AbstractC7745Ih1.m3974c())));
        }
        return new C7978Mu0(3, arrayList);
    }

    /* renamed from: b */
    public static InterfaceC1074R4 m5254b(C7682Hc0 c7682Hc0, C8532Xl0 c8532Xl0) {
        c7682Hc0.mo3525n();
        C7978Mu0 c7978Mu0M5253a = null;
        C0698L4 c0698l4M9272d = null;
        boolean z = false;
        C0698L4 c0698l4M9272d2 = null;
        while (c7682Hc0.mo3517U() != 4) {
            int iMo3518X = c7682Hc0.mo3518X(f6982a);
            if (iMo3518X == 0) {
                c7978Mu0M5253a = m5253a(c7682Hc0, c8532Xl0);
            } else if (iMo3518X != 1) {
                if (iMo3518X != 2) {
                    c7682Hc0.mo3519b0();
                    c7682Hc0.mo3520d0();
                } else if (c7682Hc0.mo3517U() == 6) {
                    c7682Hc0.mo3520d0();
                    z = true;
                } else {
                    c0698l4M9272d = YM1.m9272d(c7682Hc0, c8532Xl0, true);
                }
            } else if (c7682Hc0.mo3517U() == 6) {
                c7682Hc0.mo3520d0();
                z = true;
            } else {
                c0698l4M9272d2 = YM1.m9272d(c7682Hc0, c8532Xl0, true);
            }
        }
        c7682Hc0.mo3529p();
        if (z) {
            c8532Xl0.m9110a("Lottie doesn't support expressions.");
        }
        return c7978Mu0M5253a != null ? c7978Mu0M5253a : new C0823N4(c0698l4M9272d2, c0698l4M9272d);
    }
}
