package defpackage;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* loaded from: classes.dex */
public final class R7 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ AppStartTrace a;

    public R7(AppStartTrace appStartTrace) {
        this.a = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.a.s++;
    }
}
