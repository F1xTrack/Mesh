package p000;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* renamed from: R7 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC1077R7 implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    public final /* synthetic */ AppStartTrace f10017a;

    public ViewTreeObserverOnDrawListenerC1077R7(AppStartTrace appStartTrace) {
        this.f10017a = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.f10017a.f18502s++;
    }
}
