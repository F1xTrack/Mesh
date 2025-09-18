package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class GV implements ViewTreeObserver.OnDrawListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final Q7 c;

    public GV(View view, Q7 q7) {
        this.b = new AtomicReference(view);
        this.c = q7;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new FV(this, view, 0));
        this.a.postAtFrontOfQueue(this.c);
    }
}
