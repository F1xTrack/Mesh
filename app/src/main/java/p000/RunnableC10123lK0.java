package p000;

import java.net.CookieManager;

/* renamed from: lK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC10123lK0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f37011a;

    /* renamed from: b */
    public final /* synthetic */ C10891rK0 f37012b;

    public /* synthetic */ RunnableC10123lK0(C10891rK0 c10891rK0, int i) {
        this.f37011a = i;
        this.f37012b = c10891rK0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10891rK0 c10891rK0 = this.f37012b;
        switch (this.f37011a) {
            case 0:
                c10891rK0.f41559a.f43821j.invoke();
                break;
            case 1:
                c10891rK0.f41559a.f43823l.invoke();
                break;
            default:
                CookieManager cookieManager = C10891rK0.f41528H1;
                c10891rK0.m24302V();
                break;
        }
    }
}
