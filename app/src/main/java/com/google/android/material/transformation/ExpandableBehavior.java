package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC6397lz;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC6397lz {
    public ExpandableBehavior() {
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: b */
    public abstract boolean mo11182b(View view, View view2);

    @Override // p000.AbstractC6397lz
    /* renamed from: d */
    public final boolean mo11183d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: h */
    public final boolean mo9810h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (!view.isLaidOut()) {
            List listM9966j = coordinatorLayout.m9966j(view);
            int size = listM9966j.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo11182b(view, (View) listM9966j.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
