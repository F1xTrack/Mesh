package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: al1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8765al1 extends AbstractC6397lz {

    /* renamed from: a */
    public C6455mu f15685a;

    /* renamed from: b */
    public int f15686b = 0;

    public AbstractC8765al1() {
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: h */
    public boolean mo9810h(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo9812t(coordinatorLayout, view, i);
        if (this.f15685a == null) {
            C6455mu c6455mu = new C6455mu();
            c6455mu.f37984d = view;
            this.f15685a = c6455mu;
        }
        C6455mu c6455mu2 = this.f15685a;
        View view2 = (View) c6455mu2.f37984d;
        c6455mu2.f37981a = view2.getTop();
        c6455mu2.f37982b = view2.getLeft();
        this.f15685a.m22991a();
        int i2 = this.f15686b;
        if (i2 == 0) {
            return true;
        }
        C6455mu c6455mu3 = this.f15685a;
        if (c6455mu3.f37983c != i2) {
            c6455mu3.f37983c = i2;
            c6455mu3.m22991a();
        }
        this.f15686b = 0;
        return true;
    }

    /* renamed from: s */
    public final int m9811s() {
        C6455mu c6455mu = this.f15685a;
        if (c6455mu != null) {
            return c6455mu.f37983c;
        }
        return 0;
    }

    /* renamed from: t */
    public void mo9812t(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m9970p(i, view);
    }

    public AbstractC8765al1(int i) {
    }
}
