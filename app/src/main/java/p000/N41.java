package p000;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class N41 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7486a = 1;

    /* renamed from: b */
    public final /* synthetic */ P41 f7487b;

    /* renamed from: c */
    public final /* synthetic */ boolean f7488c;

    public /* synthetic */ N41(P41 p41, boolean z) {
        this.f7487b = p41;
        this.f7488c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7486a) {
            case 0:
                P41 p41 = this.f7487b;
                O90.m5968f(p41, "this$0");
                if (!this.f7488c) {
                    C8771ao1 c8771ao1M6225a = p41.m6225a();
                    if (c8771ao1M6225a != null) {
                        c8771ao1M6225a.m10339b(1);
                        break;
                    }
                } else {
                    C8771ao1 c8771ao1M6225a2 = p41.m6225a();
                    if (c8771ao1M6225a2 != null) {
                        c8771ao1M6225a2.m10338a(1);
                        break;
                    }
                }
                break;
            default:
                O90.m5968f(this.f7487b, "this$0");
                WeakReference weakReference = AbstractC10977s02.f42200a;
                C3924dN c3924dN = weakReference != null ? (C3924dN) weakReference.get() : null;
                if (c3924dN != null && c3924dN.f25989f) {
                    boolean z = c3924dN.f25985b;
                    boolean z2 = this.f7488c;
                    if (z != z2) {
                        c3924dN.f25985b = z2;
                        c3924dN.m17554o();
                        if (!c3924dN.isAttachedToWindow()) {
                            c3924dN.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC7491Dk1(0));
                            break;
                        } else {
                            c3924dN.requestApplyInsets();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ N41(boolean z, P41 p41) {
        this.f7488c = z;
        this.f7487b = p41;
    }
}
