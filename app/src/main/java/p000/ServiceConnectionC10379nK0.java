package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: nK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC10379nK0 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C10891rK0 f38278a;

    public ServiceConnectionC10379nK0(C10891rK0 c10891rK0) {
        this.f38278a = c10891rK0;
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        AbstractC10922rZ1.m24429c("ReactExoplayerView", "Could not register ExoPlayer");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C10891rK0 c10891rK0 = this.f38278a;
        c10891rK0.getClass();
        try {
            if (c10891rK0.f41589u1.f10602a.getCurrentActivity() != null) {
                throw null;
            }
            AbstractC10922rZ1.m24431e("ReactExoplayerView", "Could not register ExoPlayer: currentActivity is null");
        } catch (Exception e) {
            AbstractC10922rZ1.m24429c("ReactExoplayerView", "Could not register ExoPlayer: " + e.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C10891rK0 c10891rK0 = this.f38278a;
        try {
            c10891rK0.getClass();
        } catch (Exception unused) {
        }
        c10891rK0.getClass();
    }
}
