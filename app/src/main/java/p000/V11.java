package p000;

import android.content.IntentFilter;
import android.util.Log;

/* loaded from: classes.dex */
public final class V11 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f12309a;

    /* renamed from: b */
    public final /* synthetic */ W11 f12310b;

    public /* synthetic */ V11(W11 w11, int i) {
        this.f12309a = i;
        this.f12310b = w11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12309a) {
            case 0:
                W11 w11 = this.f12310b;
                w11.f12934d = w11.m8651b();
                try {
                    W11 w112 = this.f12310b;
                    w112.f12931a.registerReceiver(w112.f12936f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f12310b.f12935e = true;
                    break;
                } catch (SecurityException unused) {
                    this.f12310b.f12935e = false;
                    return;
                }
            case 1:
                if (this.f12310b.f12935e) {
                    this.f12310b.f12935e = false;
                    W11 w113 = this.f12310b;
                    w113.f12931a.unregisterReceiver(w113.f12936f);
                    break;
                }
                break;
            default:
                boolean z = this.f12310b.f12934d;
                W11 w114 = this.f12310b;
                w114.f12934d = w114.m8651b();
                if (z != this.f12310b.f12934d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        boolean z2 = this.f12310b.f12934d;
                    }
                    W11 w115 = this.f12310b;
                    AbstractC7381Bh1.m807f().post(new RunnableC1267U8(w115, w115.f12934d, 3));
                    break;
                }
                break;
        }
    }
}
