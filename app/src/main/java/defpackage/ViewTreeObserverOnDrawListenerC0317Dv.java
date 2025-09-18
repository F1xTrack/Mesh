package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: Dv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0317Dv implements InterfaceExecutorC0239Cv, ViewTreeObserver.OnDrawListener, Runnable {
    public final long a = SystemClock.uptimeMillis() + 10000;
    public Runnable b;
    public boolean c;
    public final /* synthetic */ AbstractActivityC0629Hv d;

    public ViewTreeObserverOnDrawListenerC0317Dv(AbstractActivityC0629Hv abstractActivityC0629Hv) {
        this.d = abstractActivityC0629Hv;
    }

    public final void a(View view) {
        if (this.c) {
            return;
        }
        this.c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        O90.f(runnable, "runnable");
        this.b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        O90.e(decorView, "window.decorView");
        if (!this.c) {
            decorView.postOnAnimation(new G4(23, this));
        } else if (O90.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.b = null;
        C5717lZ fullyDrawnReporter = this.d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.a) {
            z = fullyDrawnReporter.b;
        }
        if (z) {
            this.c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
