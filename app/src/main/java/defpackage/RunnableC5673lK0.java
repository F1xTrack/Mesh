package defpackage;

import java.net.CookieManager;

/* renamed from: lK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5673lK0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6818rK0 b;

    public /* synthetic */ RunnableC5673lK0(C6818rK0 c6818rK0, int i) {
        this.a = i;
        this.b = c6818rK0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6818rK0 c6818rK0 = this.b;
        switch (this.a) {
            case 0:
                c6818rK0.a.j.invoke();
                break;
            case 1:
                c6818rK0.a.l.invoke();
                break;
            default:
                CookieManager cookieManager = C6818rK0.H1;
                c6818rK0.V();
                break;
        }
    }
}
