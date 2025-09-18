package p000;

/* renamed from: d11 */
/* loaded from: classes2.dex */
public final class C9059d11 extends AbstractC8926c11 {

    /* renamed from: a */
    public final /* synthetic */ int f25764a = 1;

    /* renamed from: b */
    public final AbstractC8418Vg0 f25765b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9059d11(InterfaceC6434mZ interfaceC6434mZ) {
        this.f25765b = (AbstractC8418Vg0) interfaceC6434mZ;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Vg0, mZ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Vg0, nZ] */
    @Override // p000.AbstractC8926c11
    /* renamed from: a */
    public final void mo10562a(InterfaceC10467o11 interfaceC10467o11) {
        Object objM7015b;
        switch (this.f25764a) {
            case 0:
                C9955k11 c9955k11 = new C9955k11(interfaceC10467o11);
                interfaceC10467o11.mo1066e0(c9955k11);
                try {
                    this.f25765b.invoke(c9955k11);
                    break;
                } catch (Throwable th) {
                    c9955k11.m22133b(th);
                    return;
                }
            default:
                S01 s01 = new S01();
                interfaceC10467o11.mo1066e0(s01);
                if (!s01.f10528a) {
                    try {
                        objM7015b = this.f25765b.invoke();
                    } catch (Throwable th2) {
                        objM7015b = RQ1.m7015b(th2);
                    }
                    if (!(objM7015b instanceof OS0) && !s01.f10528a) {
                        interfaceC10467o11.onSuccess(objM7015b);
                    }
                    Throwable thM6365a = PS0.m6365a(objM7015b);
                    if (thM6365a != null && !s01.f10528a) {
                        interfaceC10467o11.onError(thM6365a);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9059d11(InterfaceC6497nZ interfaceC6497nZ) {
        this.f25765b = (AbstractC8418Vg0) interfaceC6497nZ;
    }
}
