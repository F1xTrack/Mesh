package p000;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class YD0 {
    /* renamed from: a */
    public static void m9239a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: XD0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
