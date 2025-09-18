package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC5886f;

/* renamed from: FV */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC0347FV implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ int f3283a;

    /* renamed from: b */
    public final /* synthetic */ Object f3284b;

    /* renamed from: c */
    public final /* synthetic */ View f3285c;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0347FV(Object obj, View view, int i) {
        this.f3283a = i;
        this.f3284b = obj;
        this.f3285c = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3283a) {
            case 0:
                ViewTreeObserverOnDrawListenerC0410GV viewTreeObserverOnDrawListenerC0410GV = (ViewTreeObserverOnDrawListenerC0410GV) this.f3284b;
                viewTreeObserverOnDrawListenerC0410GV.getClass();
                this.f3285c.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0410GV);
                break;
            case 1:
                C10910rT1 c10910rT1 = (C10910rT1) this.f3284b;
                O90.m5968f(c10910rT1, "this$0");
                c10910rT1.m24375J((ViewGroup) this.f3285c);
                break;
            default:
                ViewTreeObserverOnDrawListenerC5886f viewTreeObserverOnDrawListenerC5886f = (ViewTreeObserverOnDrawListenerC5886f) this.f3284b;
                viewTreeObserverOnDrawListenerC5886f.getClass();
                this.f3285c.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC5886f);
                break;
        }
    }
}
