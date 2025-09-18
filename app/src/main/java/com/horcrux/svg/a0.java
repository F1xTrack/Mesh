package com.horcrux.svg;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class a0 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ VirtualViewManager a;

    public a0(VirtualViewManager virtualViewManager) {
        this.a = virtualViewManager;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view instanceof VirtualView) {
            this.a.invalidateSvgView((VirtualView) view);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view instanceof VirtualView) {
            this.a.invalidateSvgView((VirtualView) view);
        }
    }
}
