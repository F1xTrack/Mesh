package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class W11 implements U11 {
    public static final Executor g = AsyncTask.SERIAL_EXECUTOR;
    public final Context a;
    public final T11 b;
    public final DO c;
    public volatile boolean d;
    public volatile boolean e;
    public final D6 f = new D6(4, this);

    public W11(Context context, DO r4, T11 t11) {
        this.a = context.getApplicationContext();
        this.c = r4;
        this.b = t11;
    }

    @Override // defpackage.U11
    public final boolean a() {
        g.execute(new V11(this, 0));
        return true;
    }

    public final boolean b() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.c.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            return true;
        }
    }

    @Override // defpackage.U11
    public final void unregister() {
        g.execute(new V11(this, 1));
    }
}
