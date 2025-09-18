package p000;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class MJ0 {

    /* renamed from: f */
    public static MJ0 f7089f;

    /* renamed from: a */
    public C7621Fx1 f7090a;

    /* renamed from: c */
    public final ChoreographerFrameCallbackC4220i5 f7092c = new ChoreographerFrameCallbackC4220i5(2, this);

    /* renamed from: d */
    public int f7093d = 0;

    /* renamed from: e */
    public boolean f7094e = false;

    /* renamed from: b */
    public final ArrayDeque[] f7091b = new ArrayDeque[AbstractC7222ym.m26223C(5).length];

    public MJ0(InterfaceC0935Or interfaceC0935Or) {
        int i = 0;
        while (true) {
            ArrayDeque[] arrayDequeArr = this.f7091b;
            if (i >= arrayDequeArr.length) {
                UiThreadUtil.runOnUiThread(new MD0(this, 7, interfaceC0935Or));
                return;
            } else {
                arrayDequeArr[i] = new ArrayDeque();
                i++;
            }
        }
    }

    /* renamed from: a */
    public static MJ0 m5303a() {
        UN1.m8000d(f7089f, "ReactChoreographer needs to be initialized.");
        return f7089f;
    }

    /* renamed from: b */
    public final void m5304b() {
        UN1.m7997a(this.f7093d >= 0);
        if (this.f7093d == 0 && this.f7094e) {
            C7621Fx1 c7621Fx1 = this.f7090a;
            if (c7621Fx1 != null) {
                ((Choreographer) c7621Fx1.f3494a).removeFrameCallback(this.f7092c);
            }
            this.f7094e = false;
        }
    }

    /* renamed from: c */
    public final void m5305c(int i, Choreographer.FrameCallback frameCallback) {
        synchronized (this.f7091b) {
            try {
                this.f7091b[AbstractC7222ym.m26247x(i)].addLast(frameCallback);
                int i2 = this.f7093d + 1;
                this.f7093d = i2;
                UN1.m7997a(i2 > 0);
                if (!this.f7094e) {
                    C7621Fx1 c7621Fx1 = this.f7090a;
                    if (c7621Fx1 == null) {
                        UiThreadUtil.runOnUiThread(new RunnableC8352Tz0(10, this));
                    } else {
                        ChoreographerFrameCallbackC4220i5 choreographerFrameCallbackC4220i5 = this.f7092c;
                        c7621Fx1.getClass();
                        ((Choreographer) c7621Fx1.f3494a).postFrameCallback(choreographerFrameCallbackC4220i5);
                        this.f7094e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m5306d(int i, Choreographer.FrameCallback frameCallback) {
        synchronized (this.f7091b) {
            try {
                if (this.f7091b[AbstractC7222ym.m26247x(i)].removeFirstOccurrence(frameCallback)) {
                    this.f7093d--;
                    m5304b();
                } else {
                    AbstractC3929dS.m17672e("ReactNative");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
