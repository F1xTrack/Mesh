package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.InterfaceC8776ar0;
import p000.MenuC7450Cq0;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC8776ar0 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p000.InterfaceC8776ar0
    /* renamed from: b */
    public final void mo9828b(MenuC7450Cq0 menuC7450Cq0) {
    }
}
