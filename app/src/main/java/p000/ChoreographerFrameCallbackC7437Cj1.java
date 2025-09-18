package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: Cj1 */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC7437Cj1 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e */
    public static final ChoreographerFrameCallbackC7437Cj1 f1594e = new ChoreographerFrameCallbackC7437Cj1();

    /* renamed from: a */
    public volatile long f1595a = -9223372036854775807L;

    /* renamed from: b */
    public final Handler f1596b;

    /* renamed from: c */
    public Choreographer f1597c;

    /* renamed from: d */
    public int f1598d;

    public ChoreographerFrameCallbackC7437Cj1() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = AbstractC7485Dh1.f2166a;
        Handler handler = new Handler(looper, this);
        this.f1596b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f1595a = j;
        Choreographer choreographer = this.f1597c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f1597c = Choreographer.getInstance();
            } catch (RuntimeException e) {
                AbstractC10872rA1.m24176i("Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.f1597c;
            if (choreographer != null) {
                int i2 = this.f1598d + 1;
                this.f1598d = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f1597c;
        if (choreographer2 != null) {
            int i3 = this.f1598d - 1;
            this.f1598d = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f1595a = -9223372036854775807L;
            }
        }
        return true;
    }
}
