package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class QO0 extends A1 {
    public final RecyclerView d;
    public final PO0 e;

    public QO0(RecyclerView recyclerView) {
        this.d = recyclerView;
        PO0 po0 = this.e;
        if (po0 != null) {
            this.e = po0;
        } else {
            this.e = new PO0(this);
        }
    }

    @Override // defpackage.A1
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // defpackage.A1
    public final void d(Q1 q1, View view) {
        this.a.onInitializeAccessibilityNodeInfo(view, q1.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC8354zO0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.V(recyclerView2.c, recyclerView2.s1, q1);
    }

    @Override // defpackage.A1
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC8354zO0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.i0(recyclerView2.c, recyclerView2.s1, i, bundle);
    }
}
