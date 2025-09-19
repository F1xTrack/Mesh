package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.AbstractC6397lz;
import p000.C6588oz;
import p000.NG0;

/* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* loaded from: classes.dex */
public class C1944xe6e79f6<T> extends AbstractC6397lz {
    public C1944xe6e79f6() {
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: a */
    public final /* synthetic */ boolean mo11247a(View view) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: c */
    public final void mo11205c(C6588oz c6588oz) {
        if (c6588oz.f39412h == 0) {
            c6588oz.f39412h = 80;
        }
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: d */
    public final boolean mo11183d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: h */
    public final boolean mo9810h(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public C1944xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7694h);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
