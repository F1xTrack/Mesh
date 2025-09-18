package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* renamed from: c6 */
/* loaded from: classes.dex */
public final class C2451c6 extends A1 {
    public final /* synthetic */ C3708f6 d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout$BaseBehavior f;

    public C2451c6(C3708f6 c3708f6, CoordinatorLayout coordinatorLayout, AppBarLayout$BaseBehavior appBarLayout$BaseBehavior) {
        this.f = appBarLayout$BaseBehavior;
        this.d = c3708f6;
        this.e = coordinatorLayout;
    }

    @Override // defpackage.A1
    public final void d(Q1 q1, View view) {
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior;
        View viewU;
        this.a.onInitializeAccessibilityNodeInfo(view, q1.a);
        q1.k(ScrollView.class.getName());
        C3708f6 c3708f6 = this.d;
        if (c3708f6.getTotalScrollRange() == 0 || (viewU = AppBarLayout$BaseBehavior.u((appBarLayout$BaseBehavior = this.f), this.e)) == null) {
            return;
        }
        int childCount = c3708f6.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C3517e6) c3708f6.getChildAt(i).getLayoutParams()).a != 0) {
                if (appBarLayout$BaseBehavior.x() != (-c3708f6.getTotalScrollRange())) {
                    q1.b(L1.i);
                    q1.o(true);
                }
                if (appBarLayout$BaseBehavior.x() != 0) {
                    if (!viewU.canScrollVertically(-1)) {
                        q1.b(L1.j);
                        q1.o(true);
                        return;
                    } else {
                        if ((-c3708f6.getDownNestedPreScrollRange()) != 0) {
                            q1.b(L1.j);
                            q1.o(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.A1
    public final boolean g(View view, int i, Bundle bundle) {
        C3708f6 c3708f6 = this.d;
        if (i == 4096) {
            c3708f6.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.f;
        if (appBarLayout$BaseBehavior.x() != 0) {
            View viewU = AppBarLayout$BaseBehavior.u(appBarLayout$BaseBehavior, this.e);
            if (!viewU.canScrollVertically(-1)) {
                c3708f6.setExpanded(true);
                return true;
            }
            int i2 = -c3708f6.getDownNestedPreScrollRange();
            if (i2 != 0) {
                CoordinatorLayout coordinatorLayout = this.e;
                C3708f6 c3708f62 = this.d;
                this.f.y(coordinatorLayout, c3708f62, viewU, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
