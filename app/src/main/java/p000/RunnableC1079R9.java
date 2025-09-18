package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: R9 */
/* loaded from: classes.dex */
public final class RunnableC1079R9 extends BroadcastReceiver implements Runnable {

    /* renamed from: a */
    public final SurfaceHolderCallbackC1285UQ f10037a;

    /* renamed from: b */
    public final Handler f10038b;

    /* renamed from: c */
    public final /* synthetic */ X11 f10039c;

    public RunnableC1079R9(X11 x11, Handler handler, SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ) {
        this.f10039c = x11;
        this.f10038b = handler;
        this.f10037a = surfaceHolderCallbackC1285UQ;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10038b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10039c.f13487b) {
            this.f10037a.f11780a.m9032d2(-1, 3, false);
        }
    }
}
