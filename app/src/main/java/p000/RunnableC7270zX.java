package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: zX */
/* loaded from: classes.dex */
public final class RunnableC7270zX implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f46859a;

    /* renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC0034AX f46860b;

    public /* synthetic */ RunnableC7270zX(AbstractViewOnTouchListenerC0034AX abstractViewOnTouchListenerC0034AX, int i) {
        this.f46859a = i;
        this.f46860b = abstractViewOnTouchListenerC0034AX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46859a) {
            case 0:
                ViewParent parent = this.f46860b.f231d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0034AX abstractViewOnTouchListenerC0034AX = this.f46860b;
                abstractViewOnTouchListenerC0034AX.m199a();
                View view = abstractViewOnTouchListenerC0034AX.f231d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0034AX.mo201c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0034AX.f234g = true;
                    break;
                }
                break;
        }
    }
}
