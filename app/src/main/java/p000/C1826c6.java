package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* renamed from: c6 */
/* loaded from: classes.dex */
public final class C1826c6 extends C0002A1 {

    /* renamed from: d */
    public final /* synthetic */ C4032f6 f17300d;

    /* renamed from: e */
    public final /* synthetic */ CoordinatorLayout f17301e;

    /* renamed from: f */
    public final /* synthetic */ AppBarLayout$BaseBehavior f17302f;

    public C1826c6(C4032f6 c4032f6, CoordinatorLayout coordinatorLayout, AppBarLayout$BaseBehavior appBarLayout$BaseBehavior) {
        this.f17302f = appBarLayout$BaseBehavior;
        this.f17300d = c4032f6;
        this.f17301e = coordinatorLayout;
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior;
        View viewM11163u;
        this.f11a.onInitializeAccessibilityNodeInfo(view, c1009q1.f9401a);
        c1009q1.m6539k(ScrollView.class.getName());
        C4032f6 c4032f6 = this.f17300d;
        if (c4032f6.getTotalScrollRange() == 0 || (viewM11163u = AppBarLayout$BaseBehavior.m11163u((appBarLayout$BaseBehavior = this.f17302f), this.f17301e)) == null) {
            return;
        }
        int childCount = c4032f6.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C3969e6) c4032f6.getChildAt(i).getLayoutParams()).f26540a != 0) {
                if (appBarLayout$BaseBehavior.m11178x() != (-c4032f6.getTotalScrollRange())) {
                    c1009q1.m6531b(C0695L1.f6456i);
                    c1009q1.m6543o(true);
                }
                if (appBarLayout$BaseBehavior.m11178x() != 0) {
                    if (!viewM11163u.canScrollVertically(-1)) {
                        c1009q1.m6531b(C0695L1.f6457j);
                        c1009q1.m6543o(true);
                        return;
                    } else {
                        if ((-c4032f6.getDownNestedPreScrollRange()) != 0) {
                            c1009q1.m6531b(C0695L1.f6457j);
                            c1009q1.m6543o(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // p000.C0002A1
    /* renamed from: g */
    public final boolean mo14g(View view, int i, Bundle bundle) {
        C4032f6 c4032f6 = this.f17300d;
        if (i == 4096) {
            c4032f6.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.mo14g(view, i, bundle);
        }
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.f17302f;
        if (appBarLayout$BaseBehavior.m11178x() != 0) {
            View viewM11163u = AppBarLayout$BaseBehavior.m11163u(appBarLayout$BaseBehavior, this.f17301e);
            if (!viewM11163u.canScrollVertically(-1)) {
                c4032f6.setExpanded(true);
                return true;
            }
            int i2 = -c4032f6.getDownNestedPreScrollRange();
            if (i2 != 0) {
                CoordinatorLayout coordinatorLayout = this.f17301e;
                C4032f6 c4032f62 = this.f17300d;
                this.f17302f.m11179y(coordinatorLayout, c4032f62, viewM11163u, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
