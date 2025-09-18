package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class N41 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ P41 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ N41(P41 p41, boolean z) {
        this.b = p41;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                P41 p41 = this.b;
                O90.f(p41, "this$0");
                if (!this.c) {
                    C2204ao1 c2204ao1A = p41.a();
                    if (c2204ao1A != null) {
                        c2204ao1A.b(1);
                        break;
                    }
                } else {
                    C2204ao1 c2204ao1A2 = p41.a();
                    if (c2204ao1A2 != null) {
                        c2204ao1A2.a(1);
                        break;
                    }
                }
                break;
            default:
                O90.f(this.b, "this$0");
                WeakReference weakReference = AbstractC6947s02.a;
                C3378dN c3378dN = weakReference != null ? (C3378dN) weakReference.get() : null;
                if (c3378dN != null && c3378dN.f) {
                    boolean z = c3378dN.b;
                    boolean z2 = this.c;
                    if (z != z2) {
                        c3378dN.b = z2;
                        c3378dN.o();
                        if (!c3378dN.isAttachedToWindow()) {
                            c3378dN.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0286Dk1(0));
                            break;
                        } else {
                            c3378dN.requestApplyInsets();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ N41(boolean z, P41 p41) {
        this.c = z;
        this.b = p41;
    }
}
