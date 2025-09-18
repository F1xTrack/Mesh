package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: Dv */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0247Dv implements InterfaceExecutorC0184Cv, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: a */
    public final long f2295a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b */
    public Runnable f2296b;

    /* renamed from: c */
    public boolean f2297c;

    /* renamed from: d */
    public final /* synthetic */ AbstractActivityC0499Hv f2298d;

    public ViewTreeObserverOnDrawListenerC0247Dv(AbstractActivityC0499Hv abstractActivityC0499Hv) {
        this.f2298d = abstractActivityC0499Hv;
    }

    /* renamed from: a */
    public final void m1925a(View view) {
        if (this.f2297c) {
            return;
        }
        this.f2297c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        O90.m5968f(runnable, "runnable");
        this.f2296b = runnable;
        View decorView = this.f2298d.getWindow().getDecorView();
        O90.m5967e(decorView, "window.decorView");
        if (!this.f2297c) {
            decorView.postOnAnimation(new RunnableC0383G4(23, this));
        } else if (O90.m5963a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f2296b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f2295a) {
                this.f2297c = false;
                this.f2298d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f2296b = null;
        C6371lZ fullyDrawnReporter = this.f2298d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f37149a) {
            z = fullyDrawnReporter.f37150b;
        }
        if (z) {
            this.f2297c = false;
            this.f2298d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2298d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
