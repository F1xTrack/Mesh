package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: zX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8380zX implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AX b;

    public /* synthetic */ RunnableC8380zX(AX ax, int i) {
        this.a = i;
        this.b = ax;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AX ax = this.b;
                ax.a();
                View view = ax.d;
                if (view.isEnabled() && !view.isLongClickable() && ax.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    ax.g = true;
                    break;
                }
                break;
        }
    }
}
