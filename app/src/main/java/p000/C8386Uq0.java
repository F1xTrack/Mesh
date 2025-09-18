package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: Uq0 */
/* loaded from: classes.dex */
public final class C8386Uq0 extends C1659aM {

    /* renamed from: m */
    public final int f12161m;

    /* renamed from: n */
    public final int f12162n;

    /* renamed from: o */
    public InterfaceC7814Jq0 f12163o;

    /* renamed from: p */
    public C7866Kq0 f12164p;

    public C8386Uq0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f12161m = 21;
            this.f12162n = 22;
        } else {
            this.f12161m = 22;
            this.f12162n = 21;
        }
    }

    @Override // p000.C1659aM, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C11975zq0 c11975zq0;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f12163o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c11975zq0 = (C11975zq0) headerViewListAdapter.getWrappedAdapter();
            } else {
                c11975zq0 = (C11975zq0) adapter;
                headersCount = 0;
            }
            C7866Kq0 item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c11975zq0.getCount()) ? null : c11975zq0.getItem(i);
            C7866Kq0 c7866Kq0 = this.f12164p;
            if (c7866Kq0 != item) {
                MenuC7450Cq0 menuC7450Cq0 = c11975zq0.f47027a;
                if (c7866Kq0 != null) {
                    this.f12163o.mo4454n(menuC7450Cq0, c7866Kq0);
                }
                this.f12164p = item;
                if (item != null) {
                    this.f12163o.mo4453B(menuC7450Cq0, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f12161m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f12162n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C11975zq0) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C11975zq0) adapter).f47027a.m1404c(false);
        return true;
    }

    public void setHoverListener(InterfaceC7814Jq0 interfaceC7814Jq0) {
        this.f12163o = interfaceC7814Jq0;
    }

    @Override // p000.C1659aM, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
