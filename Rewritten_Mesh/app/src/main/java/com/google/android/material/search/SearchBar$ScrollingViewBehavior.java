package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import p000.C4032f6;

/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {

    /* renamed from: g */
    public boolean f18232g;

    public SearchBar$ScrollingViewBehavior() {
        this.f18232g = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, p000.AbstractC6397lz
    /* renamed from: d */
    public final boolean mo11183d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.mo11183d(coordinatorLayout, view, view2);
        if (!this.f18232g && (view2 instanceof C4032f6)) {
            this.f18232g = true;
            C4032f6 c4032f6 = (C4032f6) view2;
            c4032f6.setBackgroundColor(0);
            c4032f6.setTargetElevation(0.0f);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18232g = false;
    }
}
