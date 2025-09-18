package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class PO0 extends A1 {
    public final QO0 d;
    public final WeakHashMap e = new WeakHashMap();

    public PO0(QO0 qo0) {
        this.d = qo0;
    }

    @Override // defpackage.A1
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        A1 a1 = (A1) this.e.get(view);
        return a1 != null ? a1.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.A1
    public final QQ0 b(View view) {
        A1 a1 = (A1) this.e.get(view);
        return a1 != null ? a1.b(view) : super.b(view);
    }

    @Override // defpackage.A1
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        A1 a1 = (A1) this.e.get(view);
        if (a1 != null) {
            a1.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.A1
    public final void d(Q1 q1, View view) {
        QO0 qo0 = this.d;
        boolean zO = qo0.d.O();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = q1.a;
        if (!zO) {
            RecyclerView recyclerView = qo0.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().W(q1, view);
                A1 a1 = (A1) this.e.get(view);
                if (a1 != null) {
                    a1.d(q1, view);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // defpackage.A1
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        A1 a1 = (A1) this.e.get(view);
        if (a1 != null) {
            a1.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.A1
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        A1 a1 = (A1) this.e.get(viewGroup);
        return a1 != null ? a1.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.A1
    public final boolean g(View view, int i, Bundle bundle) {
        QO0 qo0 = this.d;
        if (!qo0.d.O()) {
            RecyclerView recyclerView = qo0.d;
            if (recyclerView.getLayoutManager() != null) {
                A1 a1 = (A1) this.e.get(view);
                if (a1 != null) {
                    if (a1.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                FO0 fo0 = recyclerView.getLayoutManager().b.c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.A1
    public final void h(View view, int i) {
        A1 a1 = (A1) this.e.get(view);
        if (a1 != null) {
            a1.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.A1
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        A1 a1 = (A1) this.e.get(view);
        if (a1 != null) {
            a1.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
