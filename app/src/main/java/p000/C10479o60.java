package p000;

import java.lang.ref.WeakReference;

/* renamed from: o60 */
/* loaded from: classes.dex */
public final /* synthetic */ class C10479o60 implements InterfaceC7144xX {

    /* renamed from: a */
    public final /* synthetic */ int f38803a;

    /* renamed from: b */
    public final /* synthetic */ Object f38804b;

    public /* synthetic */ C10479o60(int i, Object obj) {
        this.f38803a = i;
        this.f38804b = obj;
    }

    @Override // p000.InterfaceC7144xX
    /* renamed from: b */
    public final void mo4038b(AbstractC7207yX abstractC7207yX) {
        InterfaceC7144xX interfaceC7144xX;
        switch (this.f38803a) {
            case 0:
                C10735q60 c10735q60 = (C10735q60) ((WeakReference) ((C10607p60) this.f38804b).f39840e).get();
                if (c10735q60 != null) {
                    c10735q60.f40603t.execute(new RunnableC0204DE(19, c10735q60));
                    return;
                }
                return;
            default:
                MU0 mu0 = (MU0) this.f38804b;
                synchronized (mu0.f7184a) {
                    try {
                        int i = mu0.f7185b - 1;
                        mu0.f7185b = i;
                        if (mu0.f7186c && i == 0) {
                            mu0.close();
                        }
                        interfaceC7144xX = mu0.f7189f;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC7144xX != null) {
                    interfaceC7144xX.mo4038b(abstractC7207yX);
                    return;
                }
                return;
        }
    }
}
