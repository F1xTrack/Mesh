package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: Dk1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC0286Dk1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0286Dk1(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                O90.f(view, "v");
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                AbstractC3639ek1.c(view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                O90.f(view, "v");
                break;
        }
    }

    private final void a(View view) {
    }
}
