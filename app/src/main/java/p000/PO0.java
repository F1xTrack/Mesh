package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class PO0 extends C0002A1 {

    /* renamed from: d */
    public final QO0 f9061d;

    /* renamed from: e */
    public final WeakHashMap f9062e = new WeakHashMap();

    public PO0(QO0 qo0) {
        this.f9061d = qo0;
    }

    @Override // p000.C0002A1
    /* renamed from: a */
    public final boolean mo8a(View view, AccessibilityEvent accessibilityEvent) {
        C0002A1 c0002a1 = (C0002A1) this.f9062e.get(view);
        return c0002a1 != null ? c0002a1.mo8a(view, accessibilityEvent) : this.f11a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000.C0002A1
    /* renamed from: b */
    public final QQ0 mo9b(View view) {
        C0002A1 c0002a1 = (C0002A1) this.f9062e.get(view);
        return c0002a1 != null ? c0002a1.mo9b(view) : super.mo9b(view);
    }

    @Override // p000.C0002A1
    /* renamed from: c */
    public final void mo10c(View view, AccessibilityEvent accessibilityEvent) {
        C0002A1 c0002a1 = (C0002A1) this.f9062e.get(view);
        if (c0002a1 != null) {
            c0002a1.mo10c(view, accessibilityEvent);
        } else {
            super.mo10c(view, accessibilityEvent);
        }
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        QO0 qo0 = this.f9061d;
        boolean zM10247O = qo0.f9610d.m10247O();
        View.AccessibilityDelegate accessibilityDelegate = this.f11a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
        if (!zM10247O) {
            RecyclerView recyclerView = qo0.f9610d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m26415W(c1009q1, view);
                C0002A1 c0002a1 = (C0002A1) this.f9062e.get(view);
                if (c0002a1 != null) {
                    c0002a1.mo11d(c1009q1, view);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // p000.C0002A1
    /* renamed from: e */
    public final void mo12e(View view, AccessibilityEvent accessibilityEvent) {
        C0002A1 c0002a1 = (C0002A1) this.f9062e.get(view);
        if (c0002a1 != null) {
            c0002a1.mo12e(view, accessibilityEvent);
        } else {
            super.mo12e(view, accessibilityEvent);
        }
    }

    @Override // p000.C0002A1
    /* renamed from: f */
    public final boolean mo13f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0002A1 c0002a1 = (C0002A1) this.f9062e.get(viewGroup);
        return c0002a1 != null ? c0002a1.mo13f(viewGroup, view, accessibilityEvent) : this.f11a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.C0002A1
    /* renamed from: g */
    public final boolean mo14g(View view, int i, Bundle bundle) {
        QO0 qo0 = this.f9061d;
        if (!qo0.f9610d.m10247O()) {
            RecyclerView recyclerView = qo0.f9610d;
            if (recyclerView.getLayoutManager() != null) {
                C0002A1 c0002a1 = (C0002A1) this.f9062e.get(view);
                if (c0002a1 != null) {
                    if (c0002a1.mo14g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.mo14g(view, i, bundle)) {
                    return true;
                }
                FO0 fo0 = recyclerView.getLayoutManager().f46814b.f16498c;
                return false;
            }
        }
        return super.mo14g(view, i, bundle);
    }

    @Override // p000.C0002A1
    /* renamed from: h */
    public final void mo15h(View view, int i) {
        C0002A1 c0002a1 = (C0002A1) this.f9062e.get(view);
        if (c0002a1 != null) {
            c0002a1.mo15h(view, i);
        } else {
            super.mo15h(view, i);
        }
    }

    @Override // p000.C0002A1
    /* renamed from: i */
    public final void mo16i(View view, AccessibilityEvent accessibilityEvent) {
        C0002A1 c0002a1 = (C0002A1) this.f9062e.get(view);
        if (c0002a1 != null) {
            c0002a1.mo16i(view, accessibilityEvent);
        } else {
            super.mo16i(view, accessibilityEvent);
        }
    }
}
