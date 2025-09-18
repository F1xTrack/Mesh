package p000;

import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.JavaTimerManager;

/* renamed from: sb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC11053sb0 implements Choreographer.FrameCallback {

    /* renamed from: a */
    public WritableArray f42492a = null;

    /* renamed from: b */
    public final /* synthetic */ JavaTimerManager f42493b;

    public ChoreographerFrameCallbackC11053sb0(JavaTimerManager javaTimerManager) {
        this.f42493b = javaTimerManager;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (!this.f42493b.f17931i.get() || this.f42493b.f17932j.get()) {
            long j2 = j / 1000000;
            synchronized (this.f42493b.f17927e) {
                while (!this.f42493b.f17929g.isEmpty() && ((C10925rb0) this.f42493b.f17929g.peek()).f41744d < j2) {
                    try {
                        C10925rb0 c10925rb0 = (C10925rb0) this.f42493b.f17929g.poll();
                        if (this.f42492a == null) {
                            this.f42492a = Arguments.createArray();
                        }
                        this.f42492a.pushInt(c10925rb0.f41741a);
                        if (c10925rb0.f41742b) {
                            c10925rb0.f41744d = c10925rb0.f41743c + j2;
                            this.f42493b.f17929g.add(c10925rb0);
                        } else {
                            this.f42493b.f17930h.remove(c10925rb0.f41741a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            WritableArray writableArray = this.f42492a;
            if (writableArray != null) {
                this.f42493b.f17924b.callTimers(writableArray);
                this.f42492a = null;
            }
            this.f42493b.f17925c.m5305c(4, this);
        }
    }
}
