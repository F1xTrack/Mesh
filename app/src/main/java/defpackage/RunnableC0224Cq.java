package defpackage;

import com.facebook.react.bridge.CatalystInstanceImpl;

/* renamed from: Cq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0224Cq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CatalystInstanceImpl b;

    public /* synthetic */ RunnableC0224Cq(CatalystInstanceImpl catalystInstanceImpl, int i) {
        this.a = i;
        this.b = catalystInstanceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$destroy$2();
                break;
            case 1:
                this.b.lambda$destroy$1();
                break;
            case 2:
                this.b.lambda$onNativeException$6();
                break;
            case 3:
                this.b.lambda$destroy$0();
                break;
            case 4:
                this.b.lambda$incrementPendingJSCalls$4();
                break;
            case 5:
                this.b.lambda$initialize$3();
                break;
            default:
                this.b.lambda$decrementPendingJSCalls$5();
                break;
        }
    }
}
