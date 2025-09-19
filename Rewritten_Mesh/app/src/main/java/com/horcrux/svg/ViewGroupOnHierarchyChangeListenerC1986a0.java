package com.horcrux.svg;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.horcrux.svg.a0 */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC1986a0 implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    public final /* synthetic */ VirtualViewManager f18584a;

    public ViewGroupOnHierarchyChangeListenerC1986a0(VirtualViewManager virtualViewManager) {
        this.f18584a = virtualViewManager;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view instanceof VirtualView) {
            this.f18584a.invalidateSvgView((VirtualView) view);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view instanceof VirtualView) {
            this.f18584a.invalidateSvgView((VirtualView) view);
        }
    }
}
