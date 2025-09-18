package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: al1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2195al1 extends AbstractC5795lz {
    public C5971mu a;
    public int b = 0;

    public AbstractC2195al1() {
    }

    @Override // defpackage.AbstractC5795lz
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        t(coordinatorLayout, view, i);
        if (this.a == null) {
            C5971mu c5971mu = new C5971mu();
            c5971mu.d = view;
            this.a = c5971mu;
        }
        C5971mu c5971mu2 = this.a;
        View view2 = (View) c5971mu2.d;
        c5971mu2.a = view2.getTop();
        c5971mu2.b = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        C5971mu c5971mu3 = this.a;
        if (c5971mu3.c != i2) {
            c5971mu3.c = i2;
            c5971mu3.a();
        }
        this.b = 0;
        return true;
    }

    public final int s() {
        C5971mu c5971mu = this.a;
        if (c5971mu != null) {
            return c5971mu.c;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.p(i, view);
    }

    public AbstractC2195al1(int i) {
    }
}
