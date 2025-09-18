package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: Uq0 */
/* loaded from: classes.dex */
public final class C1628Uq0 extends C2118aM {
    public final int m;
    public final int n;
    public InterfaceC0771Jq0 o;
    public C0849Kq0 p;

    public C1628Uq0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.m = 21;
            this.n = 22;
        } else {
            this.m = 22;
            this.n = 21;
        }
    }

    @Override // defpackage.C2118aM, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C8438zq0 c8438zq0;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c8438zq0 = (C8438zq0) headerViewListAdapter.getWrappedAdapter();
            } else {
                c8438zq0 = (C8438zq0) adapter;
                headersCount = 0;
            }
            C0849Kq0 item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c8438zq0.getCount()) ? null : c8438zq0.getItem(i);
            C0849Kq0 c0849Kq0 = this.p;
            if (c0849Kq0 != item) {
                MenuC0225Cq0 menuC0225Cq0 = c8438zq0.a;
                if (c0849Kq0 != null) {
                    this.o.n(menuC0225Cq0, c0849Kq0);
                }
                this.p = item;
                if (item != null) {
                    this.o.B(menuC0225Cq0, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C8438zq0) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C8438zq0) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0771Jq0 interfaceC0771Jq0) {
        this.o = interfaceC0771Jq0;
    }

    @Override // defpackage.C2118aM, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
