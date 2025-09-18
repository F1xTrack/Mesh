package defpackage;

/* renamed from: d11 */
/* loaded from: classes2.dex */
public final class C3311d11 extends AbstractC2435c11 {
    public final /* synthetic */ int a = 1;
    public final AbstractC1676Vg0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3311d11(InterfaceC5908mZ interfaceC5908mZ) {
        this.b = (AbstractC1676Vg0) interfaceC5908mZ;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Vg0, mZ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Vg0, nZ] */
    @Override // defpackage.AbstractC2435c11
    public final void a(InterfaceC6187o11 interfaceC6187o11) {
        Object objB;
        switch (this.a) {
            case 0:
                C5423k11 c5423k11 = new C5423k11(interfaceC6187o11);
                interfaceC6187o11.e0(c5423k11);
                try {
                    this.b.invoke(c5423k11);
                    break;
                } catch (Throwable th) {
                    c5423k11.b(th);
                    return;
                }
            default:
                S01 s01 = new S01();
                interfaceC6187o11.e0(s01);
                if (!s01.a) {
                    try {
                        objB = this.b.invoke();
                    } catch (Throwable th2) {
                        objB = RQ1.b(th2);
                    }
                    if (!(objB instanceof OS0) && !s01.a) {
                        interfaceC6187o11.onSuccess(objB);
                    }
                    Throwable thA = PS0.a(objB);
                    if (thA != null && !s01.a) {
                        interfaceC6187o11.onError(thA);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3311d11(InterfaceC6099nZ interfaceC6099nZ) {
        this.b = (AbstractC1676Vg0) interfaceC6099nZ;
    }
}
