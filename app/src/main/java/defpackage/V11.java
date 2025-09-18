package defpackage;

import android.content.IntentFilter;
import android.util.Log;

/* loaded from: classes.dex */
public final class V11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ W11 b;

    public /* synthetic */ V11(W11 w11, int i) {
        this.a = i;
        this.b = w11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                W11 w11 = this.b;
                w11.d = w11.b();
                try {
                    W11 w112 = this.b;
                    w112.a.registerReceiver(w112.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.b.e = true;
                    break;
                } catch (SecurityException unused) {
                    this.b.e = false;
                    return;
                }
            case 1:
                if (this.b.e) {
                    this.b.e = false;
                    W11 w113 = this.b;
                    w113.a.unregisterReceiver(w113.f);
                    break;
                }
                break;
            default:
                boolean z = this.b.d;
                W11 w114 = this.b;
                w114.d = w114.b();
                if (z != this.b.d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        boolean z2 = this.b.d;
                    }
                    W11 w115 = this.b;
                    AbstractC0121Bh1.f().post(new U8(w115, w115.d, 3));
                    break;
                }
                break;
        }
    }
}
