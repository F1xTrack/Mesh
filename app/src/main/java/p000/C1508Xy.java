package p000;

import java.io.IOException;

/* renamed from: Xy */
/* loaded from: classes2.dex */
public final class C1508Xy implements InterfaceC0111Bl, InterfaceC6497nZ {

    /* renamed from: a */
    public final /* synthetic */ int f14065a = 1;

    /* renamed from: b */
    public final Object f14066b;

    /* renamed from: c */
    public final Object f14067c;

    public C1508Xy(InterfaceC6843sl interfaceC6843sl, C0619Jp c0619Jp) {
        O90.m5968f(interfaceC6843sl, "call");
        this.f14066b = interfaceC6843sl;
        this.f14067c = c0619Jp;
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    public void mo851Z(InterfaceC6843sl interfaceC6843sl, HS0 hs0) {
        O90.m5968f(interfaceC6843sl, "call");
        ((C0619Jp) this.f14067c).resumeWith(hs0);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f14065a) {
            case 0:
                try {
                    ((DN0) ((InterfaceC6843sl) this.f14066b)).m1668e();
                } catch (Throwable unused) {
                }
                break;
            default:
                InterfaceC7158xl interfaceC7158xl = (InterfaceC7158xl) obj;
                AbstractC8695aC1 abstractC8695aC1 = (AbstractC8695aC1) this.f14066b;
                InterfaceC7158xl interfaceC7158xl2 = (InterfaceC7158xl) this.f14067c;
                O90.m5968f(interfaceC7158xl, "second");
                abstractC8695aC1.mo1623b(interfaceC7158xl2, interfaceC7158xl);
                break;
        }
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        O90.m5968f(interfaceC6843sl, "call");
        if (((DN0) interfaceC6843sl).f1994o) {
            return;
        }
        ((C0619Jp) this.f14067c).resumeWith(RQ1.m7015b(iOException));
    }

    public C1508Xy(AbstractC8695aC1 abstractC8695aC1, InterfaceC7158xl interfaceC7158xl) {
        this.f14066b = abstractC8695aC1;
        this.f14067c = interfaceC7158xl;
    }
}
