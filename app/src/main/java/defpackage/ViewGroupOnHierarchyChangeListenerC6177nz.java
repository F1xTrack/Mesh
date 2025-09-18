package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: nz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC6177nz implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ ViewGroupOnHierarchyChangeListenerC6177nz(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        switch (this.a) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.b).p;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    break;
                }
                break;
            default:
                if (view != null) {
                    FrameLayout frameLayout = (FrameLayout) this.b;
                    view.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), 1073741824));
                }
                if (view != null) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                coordinatorLayout.o(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.p;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    break;
                }
                break;
        }
    }

    private final void a(View view, View view2) {
    }
}
