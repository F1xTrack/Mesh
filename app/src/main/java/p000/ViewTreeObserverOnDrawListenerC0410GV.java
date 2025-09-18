package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: GV */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0410GV implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    public final Handler f3764a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final AtomicReference f3765b;

    /* renamed from: c */
    public final RunnableC1015Q7 f3766c;

    public ViewTreeObserverOnDrawListenerC0410GV(View view, RunnableC1015Q7 runnableC1015Q7) {
        this.f3765b = new AtomicReference(view);
        this.f3766c = runnableC1015Q7;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.f3765b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0347FV(this, view, 0));
        this.f3764a.postAtFrontOfQueue(this.f3766c);
    }
}
