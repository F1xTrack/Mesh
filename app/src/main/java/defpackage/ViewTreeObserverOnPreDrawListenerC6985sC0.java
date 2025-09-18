package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sC0 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC6985sC0 implements ViewTreeObserver.OnPreDrawListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final Q7 c;
    public final Q7 d;

    public ViewTreeObserverOnPreDrawListenerC6985sC0(View view, Q7 q7, Q7 q72) {
        this.b = new AtomicReference(view);
        this.c = q7;
        this.d = q72;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.a;
        handler.post(this.c);
        handler.postAtFrontOfQueue(this.d);
        return true;
    }
}
