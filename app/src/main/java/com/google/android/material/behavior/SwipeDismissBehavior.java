package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC6397lz;
import p000.C0695L1;
import p000.C10098l71;
import p000.C10226m71;
import p000.C11583wk1;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC6397lz {

    /* renamed from: a */
    public C11583wk1 f18083a;

    /* renamed from: b */
    public boolean f18084b;

    /* renamed from: c */
    public boolean f18085c;

    /* renamed from: d */
    public int f18086d = 2;

    /* renamed from: e */
    public float f18087e = 0.0f;

    /* renamed from: f */
    public float f18088f = 0.5f;

    /* renamed from: g */
    public final C10098l71 f18089g = new C10098l71(this);

    @Override // p000.AbstractC6397lz
    /* renamed from: g */
    public boolean mo11168g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM9968n = this.f18084b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM9968n = coordinatorLayout.m9968n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f18084b = zM9968n;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f18084b = false;
        }
        if (!zM9968n) {
            return false;
        }
        if (this.f18083a == null) {
            this.f18083a = new C11583wk1(coordinatorLayout.getContext(), coordinatorLayout, this.f18089g);
        }
        return !this.f18085c && this.f18083a.m25691q(motionEvent);
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: h */
    public final boolean mo9810h(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = 0;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC10944rk1.m24479k(1048576, view);
            AbstractC10944rk1.m24476h(0, view);
            if (mo11188s(view)) {
                AbstractC10944rk1.m24480l(view, C0695L1.f6460m, new C10226m71(i2, this));
            }
        }
        return false;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: r */
    public final boolean mo11176r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f18083a == null) {
            return false;
        }
        if (this.f18085c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f18083a.m25684j(motionEvent);
        return true;
    }

    /* renamed from: s */
    public boolean mo11188s(View view) {
        return true;
    }
}
