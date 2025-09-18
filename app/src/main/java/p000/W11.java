package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class W11 implements U11 {

    /* renamed from: g */
    public static final Executor f12930g = AsyncTask.SERIAL_EXECUTOR;

    /* renamed from: a */
    public final Context f12931a;

    /* renamed from: b */
    public final T11 f12932b;

    /* renamed from: c */
    public final C0214DO f12933c;

    /* renamed from: d */
    public volatile boolean f12934d;

    /* renamed from: e */
    public volatile boolean f12935e;

    /* renamed from: f */
    public final C0196D6 f12936f = new C0196D6(4, this);

    public W11(Context context, C0214DO c0214do, T11 t11) {
        this.f12931a = context.getApplicationContext();
        this.f12933c = c0214do;
        this.f12932b = t11;
    }

    @Override // p000.U11
    /* renamed from: a */
    public final boolean mo7863a() {
        f12930g.execute(new V11(this, 0));
        return true;
    }

    /* renamed from: b */
    public final boolean m8651b() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f12933c.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            return true;
        }
    }

    @Override // p000.U11
    public final void unregister() {
        f12930g.execute(new V11(this, 1));
    }
}
