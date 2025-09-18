package p000;

import com.facebook.react.bridge.CatalystInstanceImpl;

/* renamed from: Cq */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0179Cq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1699a;

    /* renamed from: b */
    public final /* synthetic */ CatalystInstanceImpl f1700b;

    public /* synthetic */ RunnableC0179Cq(CatalystInstanceImpl catalystInstanceImpl, int i) {
        this.f1699a = i;
        this.f1700b = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1699a) {
            case 0:
                this.f1700b.lambda$destroy$2();
                break;
            case 1:
                this.f1700b.lambda$destroy$1();
                break;
            case 2:
                this.f1700b.lambda$onNativeException$6();
                break;
            case 3:
                this.f1700b.lambda$destroy$0();
                break;
            case 4:
                this.f1700b.lambda$incrementPendingJSCalls$4();
                break;
            case 5:
                this.f1700b.lambda$initialize$3();
                break;
            default:
                this.f1700b.lambda$decrementPendingJSCalls$5();
                break;
        }
    }
}
