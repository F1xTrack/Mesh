package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: nz */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC6523nz implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f38653a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f38654b;

    public /* synthetic */ ViewGroupOnHierarchyChangeListenerC6523nz(ViewGroup viewGroup, int i) {
        this.f38653a = i;
        this.f38654b = viewGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        switch (this.f38653a) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.f38654b).f16086p;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    break;
                }
                break;
            default:
                if (view != null) {
                    FrameLayout frameLayout = (FrameLayout) this.f38654b;
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
        switch (this.f38653a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f38654b;
                coordinatorLayout.m9969o(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f16086p;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    break;
                }
                break;
        }
    }

    /* renamed from: a */
    private final void m23291a(View view, View view2) {
    }
}
