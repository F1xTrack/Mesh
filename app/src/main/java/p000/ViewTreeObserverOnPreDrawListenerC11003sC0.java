package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sC0 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC11003sC0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final Handler f42298a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final AtomicReference f42299b;

    /* renamed from: c */
    public final RunnableC1015Q7 f42300c;

    /* renamed from: d */
    public final RunnableC1015Q7 f42301d;

    public ViewTreeObserverOnPreDrawListenerC11003sC0(View view, RunnableC1015Q7 runnableC1015Q7, RunnableC1015Q7 runnableC1015Q72) {
        this.f42299b = new AtomicReference(view);
        this.f42300c = runnableC1015Q7;
        this.f42301d = runnableC1015Q72;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.f42299b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.f42298a;
        handler.post(this.f42300c);
        handler.postAtFrontOfQueue(this.f42301d);
        return true;
    }
}
