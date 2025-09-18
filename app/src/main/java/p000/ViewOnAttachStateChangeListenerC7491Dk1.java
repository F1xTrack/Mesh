package p000;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: Dk1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC7491Dk1 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f2228a;

    public /* synthetic */ ViewOnAttachStateChangeListenerC7491Dk1(int i) {
        this.f2228a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f2228a) {
            case 0:
                O90.m5968f(view, "v");
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                AbstractC9280ek1.m18029c(view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f2228a) {
            case 0:
                O90.m5968f(view, "v");
                break;
        }
    }

    /* renamed from: a */
    private final void m1866a(View view) {
    }
}
