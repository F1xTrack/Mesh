package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.AbstractC0547Ig;
import p000.C6540oF;
import p000.C9937jt0;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C9937jt0 f18255h;

    public BaseTransientBottomBar$Behavior() {
        C9937jt0 c9937jt0 = new C9937jt0(8);
        this.f18087e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f18088f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f18086d = 0;
        this.f18255h = c9937jt0;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.AbstractC6397lz
    /* renamed from: g */
    public final boolean mo11168g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f18255h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C6540oF.f38902b == null) {
                    C6540oF.f38902b = new C6540oF(1);
                }
                synchronized (C6540oF.f38902b.f38903a) {
                }
            }
        } else if (coordinatorLayout.m9968n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C6540oF.f38902b == null) {
                C6540oF.f38902b = new C6540oF(1);
            }
            C6540oF.f38902b.m23363b();
        }
        return super.mo11168g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: s */
    public final boolean mo11188s(View view) {
        this.f18255h.getClass();
        return view instanceof AbstractC0547Ig;
    }
}
