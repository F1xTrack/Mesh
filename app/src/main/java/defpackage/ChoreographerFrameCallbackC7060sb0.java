package defpackage;

import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.JavaTimerManager;

/* renamed from: sb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC7060sb0 implements Choreographer.FrameCallback {
    public WritableArray a = null;
    public final /* synthetic */ JavaTimerManager b;

    public ChoreographerFrameCallbackC7060sb0(JavaTimerManager javaTimerManager) {
        this.b = javaTimerManager;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (!this.b.i.get() || this.b.j.get()) {
            long j2 = j / 1000000;
            synchronized (this.b.e) {
                while (!this.b.g.isEmpty() && ((C6869rb0) this.b.g.peek()).d < j2) {
                    try {
                        C6869rb0 c6869rb0 = (C6869rb0) this.b.g.poll();
                        if (this.a == null) {
                            this.a = Arguments.createArray();
                        }
                        this.a.pushInt(c6869rb0.a);
                        if (c6869rb0.b) {
                            c6869rb0.d = c6869rb0.c + j2;
                            this.b.g.add(c6869rb0);
                        } else {
                            this.b.h.remove(c6869rb0.a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            WritableArray writableArray = this.a;
            if (writableArray != null) {
                this.b.b.callTimers(writableArray);
                this.a = null;
            }
            this.b.c.c(4, this);
        }
    }
}
