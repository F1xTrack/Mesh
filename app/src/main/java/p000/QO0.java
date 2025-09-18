package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class QO0 extends C0002A1 {

    /* renamed from: d */
    public final RecyclerView f9610d;

    /* renamed from: e */
    public final PO0 f9611e;

    public QO0(RecyclerView recyclerView) {
        this.f9610d = recyclerView;
        PO0 po0 = this.f9611e;
        if (po0 != null) {
            this.f9611e = po0;
        } else {
            this.f9611e = new PO0(this);
        }
    }

    @Override // p000.C0002A1
    /* renamed from: c */
    public final void mo10c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo10c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f9610d.m10247O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo10201U(accessibilityEvent);
        }
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        this.f11a.onInitializeAccessibilityNodeInfo(view, c1009q1.f9401a);
        RecyclerView recyclerView = this.f9610d;
        if (recyclerView.m10247O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC11919zO0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f46814b;
        layoutManager.mo10152V(recyclerView2.f16498c, recyclerView2.f16520s1, c1009q1);
    }

    @Override // p000.C0002A1
    /* renamed from: g */
    public final boolean mo14g(View view, int i, Bundle bundle) {
        if (super.mo14g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f9610d;
        if (recyclerView.m10247O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC11919zO0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f46814b;
        return layoutManager.mo18031i0(recyclerView2.f16498c, recyclerView2.f16520s1, i, bundle);
    }
}
