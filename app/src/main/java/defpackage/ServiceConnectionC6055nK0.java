package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: nK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC6055nK0 implements ServiceConnection {
    public final /* synthetic */ C6818rK0 a;

    public ServiceConnectionC6055nK0(C6818rK0 c6818rK0) {
        this.a = c6818rK0;
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        AbstractC6864rZ1.c("ReactExoplayerView", "Could not register ExoPlayer");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C6818rK0 c6818rK0 = this.a;
        c6818rK0.getClass();
        try {
            if (c6818rK0.u1.a.getCurrentActivity() != null) {
                throw null;
            }
            AbstractC6864rZ1.e("ReactExoplayerView", "Could not register ExoPlayer: currentActivity is null");
        } catch (Exception e) {
            AbstractC6864rZ1.c("ReactExoplayerView", "Could not register ExoPlayer: " + e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C6818rK0 c6818rK0 = this.a;
        try {
            c6818rK0.getClass();
        } catch (Exception unused) {
        }
        c6818rK0.getClass();
    }
}
