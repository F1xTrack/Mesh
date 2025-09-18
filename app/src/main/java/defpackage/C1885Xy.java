package defpackage;

import java.io.IOException;

/* renamed from: Xy */
/* loaded from: classes2.dex */
public final class C1885Xy implements InterfaceC0131Bl, InterfaceC6099nZ {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public C1885Xy(InterfaceC7089sl interfaceC7089sl, C0767Jp c0767Jp) {
        O90.f(interfaceC7089sl, "call");
        this.b = interfaceC7089sl;
        this.c = c0767Jp;
    }

    @Override // defpackage.InterfaceC0131Bl
    public void Z(InterfaceC7089sl interfaceC7089sl, HS0 hs0) {
        O90.f(interfaceC7089sl, "call");
        ((C0767Jp) this.c).resumeWith(hs0);
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    ((DN0) ((InterfaceC7089sl) this.b)).e();
                } catch (Throwable unused) {
                }
                break;
            default:
                InterfaceC8042xl interfaceC8042xl = (InterfaceC8042xl) obj;
                AbstractC2090aC1 abstractC2090aC1 = (AbstractC2090aC1) this.b;
                InterfaceC8042xl interfaceC8042xl2 = (InterfaceC8042xl) this.c;
                O90.f(interfaceC8042xl, "second");
                abstractC2090aC1.b(interfaceC8042xl2, interfaceC8042xl);
                break;
        }
        return C1518Tf1.a;
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        O90.f(interfaceC7089sl, "call");
        if (((DN0) interfaceC7089sl).o) {
            return;
        }
        ((C0767Jp) this.c).resumeWith(RQ1.b(iOException));
    }

    public C1885Xy(AbstractC2090aC1 abstractC2090aC1, InterfaceC8042xl interfaceC8042xl) {
        this.b = abstractC2090aC1;
        this.c = interfaceC8042xl;
    }
}
