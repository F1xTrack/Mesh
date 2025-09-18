package defpackage;

/* renamed from: eq0 */
/* loaded from: classes2.dex */
public final class C3656eq0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C4038gq0 f;
    public final /* synthetic */ C6613qF0 g;
    public final /* synthetic */ TI h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3656eq0(C4038gq0 c4038gq0, C6613qF0 c6613qF0, TI ti, int i) {
        super(0);
        this.e = i;
        this.f = c4038gq0;
        this.g = c6613qF0;
        this.h = ti;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                C4038gq0 c4038gq0 = this.f;
                AbstractC0447Fm0 abstractC0447Fm0A = c4038gq0.a((CD) c4038gq0.a.e);
                O90.c(abstractC0447Fm0A);
                InterfaceC6582q5 interfaceC6582q5 = ((C7955xI) c4038gq0.a.c).e;
                AbstractC0663Ig0 returnType = this.h.getReturnType();
                O90.e(returnType, "getReturnType(...)");
                return (AbstractC0323Dx) interfaceC6582q5.l(abstractC0447Fm0A, this.g, returnType);
            case 1:
                C4038gq0 c4038gq02 = this.f;
                Z41 z41 = ((C7955xI) c4038gq02.a.c).a;
                C3656eq0 c3656eq0 = new C3656eq0(c4038gq02, this.g, this.h, 0);
                C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
                c1922Yk0.getClass();
                return new C1610Uk0(c1922Yk0, c3656eq0);
            case 2:
                C4038gq0 c4038gq03 = this.f;
                AbstractC0447Fm0 abstractC0447Fm0A2 = c4038gq03.a((CD) c4038gq03.a.e);
                O90.c(abstractC0447Fm0A2);
                InterfaceC6582q5 interfaceC6582q52 = ((C7955xI) c4038gq03.a.c).e;
                AbstractC0663Ig0 returnType2 = this.h.getReturnType();
                O90.e(returnType2, "getReturnType(...)");
                return (AbstractC0323Dx) interfaceC6582q52.e(abstractC0447Fm0A2, this.g, returnType2);
            default:
                C4038gq0 c4038gq04 = this.f;
                Z41 z412 = ((C7955xI) c4038gq04.a.c).a;
                C3656eq0 c3656eq02 = new C3656eq0(c4038gq04, this.g, this.h, 2);
                C1922Yk0 c1922Yk02 = (C1922Yk0) z412;
                c1922Yk02.getClass();
                return new C1610Uk0(c1922Yk02, c3656eq02);
        }
    }
}
