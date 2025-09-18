package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: Nl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067Nl0 implements InterfaceC6712qm0 {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public C1067Nl0(C1145Ol0 c1145Ol0, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(c1145Ol0);
                break;
            default:
                this.b = new WeakReference(c1145Ol0);
                break;
        }
    }

    @Override // defpackage.InterfaceC6712qm0
    public final void onResult(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                C1145Ol0 c1145Ol0 = (C1145Ol0) this.b.get();
                if (c1145Ol0 != null) {
                    int i = c1145Ol0.g;
                    if (i != 0) {
                        c1145Ol0.setImageResource(i);
                    }
                    InterfaceC6712qm0 interfaceC6712qm0 = c1145Ol0.f;
                    if (interfaceC6712qm0 == null) {
                        interfaceC6712qm0 = C1145Ol0.q;
                    }
                    interfaceC6712qm0.onResult(th);
                    break;
                }
                break;
            default:
                C1847Xl0 c1847Xl0 = (C1847Xl0) obj;
                C1145Ol0 c1145Ol02 = (C1145Ol0) this.b.get();
                if (c1145Ol02 != null) {
                    c1145Ol02.setComposition(c1847Xl0);
                    break;
                }
                break;
        }
    }
}
