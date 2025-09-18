package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
public final class R9 extends BroadcastReceiver implements Runnable {
    public final UQ a;
    public final Handler b;
    public final /* synthetic */ X11 c;

    public R9(X11 x11, Handler handler, UQ uq) {
        this.c = x11;
        this.b = handler;
        this.a = uq;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.b) {
            this.a.a.d2(-1, 3, false);
        }
    }
}
