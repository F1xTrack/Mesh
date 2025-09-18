package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: Pq0 */
/* loaded from: classes.dex */
public abstract class AbstractC1238Pq0 implements InterfaceC8090y01, InterfaceC1862Xq0, AdapterView.OnItemClickListener {
    public Rect a;

    public static int m(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean u(MenuC0225Cq0 menuC0225Cq0) {
        int size = menuC0225Cq0.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuC0225Cq0.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean e(C0849Kq0 c0849Kq0) {
        return false;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean h(C0849Kq0 c0849Kq0) {
        return false;
    }

    public abstract void l(MenuC0225Cq0 menuC0225Cq0);

    public abstract void n(View view);

    public abstract void o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C8438zq0) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C8438zq0) listAdapter).a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC0068Aq) ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);

    @Override // defpackage.InterfaceC1862Xq0
    public final void k(Context context, MenuC0225Cq0 menuC0225Cq0) {
    }
}
