package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gD0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C3921gD0 implements InterfaceC7244tZ {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3921gD0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC7244tZ
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ((C4112hD0) this.b).b(EnumC5652lD0.b);
                break;
            default:
                JD0 jd0 = (JD0) this.b;
                C4037gq c4037gq = jd0.e;
                if (jd0.j == 2) {
                    List<AbstractC4314iH> listB = jd0.i.b();
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC4314iH abstractC4314iH : listB) {
                        AbstractC3377dM1.d("Surface must be SessionProcessorSurface", abstractC4314iH instanceof C4178hZ0);
                        arrayList.add((C4178hZ0) abstractC4314iH);
                    }
                    jd0.h = new C4219hn(c4037gq, arrayList);
                    AbstractC0759Jm0.f("ProcessingCaptureSession");
                    jd0.a.g(jd0.h);
                    jd0.j = 3;
                    C8194yY0 c8194yY0 = jd0.g;
                    if (c8194yY0 != null) {
                        jd0.b(c8194yY0);
                    }
                    if (jd0.k != null) {
                        jd0.f(jd0.k);
                        jd0.k = null;
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
