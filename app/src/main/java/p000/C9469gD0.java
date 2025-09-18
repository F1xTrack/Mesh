package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gD0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C9469gD0 implements InterfaceC6894tZ {

    /* renamed from: a */
    public final /* synthetic */ int f27613a;

    /* renamed from: b */
    public final /* synthetic */ Object f27614b;

    public /* synthetic */ C9469gD0(int i, Object obj) {
        this.f27613a = i;
        this.f27614b = obj;
    }

    @Override // p000.InterfaceC6894tZ
    public final Object apply(Object obj) {
        switch (this.f27613a) {
            case 0:
                ((C9597hD0) this.f27614b).m18785b(EnumC10109lD0.f36975b);
                break;
            default:
                JD0 jd0 = (JD0) this.f27614b;
                C4141gq c4141gq = jd0.f5388e;
                if (jd0.f5393j == 2) {
                    List<AbstractC4232iH> listM26164b = jd0.f5392i.m26164b();
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC4232iH abstractC4232iH : listM26164b) {
                        AbstractC9104dM1.m17545d("Surface must be SessionProcessorSurface", abstractC4232iH instanceof C9641hZ0);
                        arrayList.add((C9641hZ0) abstractC4232iH);
                    }
                    jd0.f5391h = new C4201hn(c4141gq, arrayList);
                    AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
                    jd0.f5384a.mo9914g(jd0.f5391h);
                    jd0.f5393j = 3;
                    C11812yY0 c11812yY0 = jd0.f5390g;
                    if (c11812yY0 != null) {
                        jd0.mo4247b(c11812yY0);
                    }
                    if (jd0.f5394k != null) {
                        jd0.mo4251f(jd0.f5394k);
                        jd0.f5394k = null;
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
