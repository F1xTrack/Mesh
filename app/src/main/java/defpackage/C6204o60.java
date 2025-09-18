package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: o60 */
/* loaded from: classes.dex */
public final /* synthetic */ class C6204o60 implements InterfaceC8000xX {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C6204o60(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC8000xX
    public final void b(AbstractC8190yX abstractC8190yX) {
        InterfaceC8000xX interfaceC8000xX;
        switch (this.a) {
            case 0:
                C6586q60 c6586q60 = (C6586q60) ((WeakReference) ((C6395p60) this.b).e).get();
                if (c6586q60 != null) {
                    c6586q60.t.execute(new DE(19, c6586q60));
                    return;
                }
                return;
            default:
                MU0 mu0 = (MU0) this.b;
                synchronized (mu0.a) {
                    try {
                        int i = mu0.b - 1;
                        mu0.b = i;
                        if (mu0.c && i == 0) {
                            mu0.close();
                        }
                        interfaceC8000xX = mu0.f;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC8000xX != null) {
                    interfaceC8000xX.b(abstractC8190yX);
                    return;
                }
                return;
        }
    }
}
