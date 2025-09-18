package p000;

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
public abstract class AbstractC8126Pq0 implements InterfaceC11742y01, InterfaceC8542Xq0, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f9296a;

    /* renamed from: m */
    public static int m6435m(ListAdapter listAdapter, Context context, int i) {
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

    /* renamed from: u */
    public static boolean m6436u(MenuC7450Cq0 menuC7450Cq0) {
        int size = menuC7450Cq0.f1707f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuC7450Cq0.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: e */
    public final boolean mo303e(C7866Kq0 c7866Kq0) {
        return false;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: h */
    public final boolean mo306h(C7866Kq0 c7866Kq0) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo337l(MenuC7450Cq0 menuC7450Cq0);

    /* renamed from: n */
    public abstract void mo338n(View view);

    /* renamed from: o */
    public abstract void mo339o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C11975zq0) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C11975zq0) listAdapter).f47027a.m1418q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC0053Aq) ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo340p(int i);

    /* renamed from: q */
    public abstract void mo341q(int i);

    /* renamed from: r */
    public abstract void mo342r(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: s */
    public abstract void mo343s(boolean z);

    /* renamed from: t */
    public abstract void mo344t(int i);

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: k */
    public final void mo308k(Context context, MenuC7450Cq0 menuC7450Cq0) {
    }
}
