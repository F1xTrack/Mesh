package defpackage;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class MJ0 {
    public static MJ0 f;
    public C0481Fx1 a;
    public final ChoreographerFrameCallbackC4278i5 c = new ChoreographerFrameCallbackC4278i5(2, this);
    public int d = 0;
    public boolean e = false;
    public final ArrayDeque[] b = new ArrayDeque[AbstractC8235ym.C(5).length];

    public MJ0(InterfaceC1162Or interfaceC1162Or) {
        int i = 0;
        while (true) {
            ArrayDeque[] arrayDequeArr = this.b;
            if (i >= arrayDequeArr.length) {
                UiThreadUtil.runOnUiThread(new MD0(this, 7, interfaceC1162Or));
                return;
            } else {
                arrayDequeArr[i] = new ArrayDeque();
                i++;
            }
        }
    }

    public static MJ0 a() {
        UN1.d(f, "ReactChoreographer needs to be initialized.");
        return f;
    }

    public final void b() {
        UN1.a(this.d >= 0);
        if (this.d == 0 && this.e) {
            C0481Fx1 c0481Fx1 = this.a;
            if (c0481Fx1 != null) {
                ((Choreographer) c0481Fx1.a).removeFrameCallback(this.c);
            }
            this.e = false;
        }
    }

    public final void c(int i, Choreographer.FrameCallback frameCallback) {
        synchronized (this.b) {
            try {
                this.b[AbstractC8235ym.x(i)].addLast(frameCallback);
                int i2 = this.d + 1;
                this.d = i2;
                UN1.a(i2 > 0);
                if (!this.e) {
                    C0481Fx1 c0481Fx1 = this.a;
                    if (c0481Fx1 == null) {
                        UiThreadUtil.runOnUiThread(new RunnableC1577Tz0(10, this));
                    } else {
                        ChoreographerFrameCallbackC4278i5 choreographerFrameCallbackC4278i5 = this.c;
                        c0481Fx1.getClass();
                        ((Choreographer) c0481Fx1.a).postFrameCallback(choreographerFrameCallbackC4278i5);
                        this.e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i, Choreographer.FrameCallback frameCallback) {
        synchronized (this.b) {
            try {
                if (this.b[AbstractC8235ym.x(i)].removeFirstOccurrence(frameCallback)) {
                    this.d--;
                    b();
                } else {
                    AbstractC3393dS.e("ReactNative");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
