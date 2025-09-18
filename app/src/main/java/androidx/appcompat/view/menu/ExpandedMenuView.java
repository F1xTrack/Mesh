package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.C7866Kq0;
import p000.C8539Xo1;
import p000.InterfaceC7398Bq0;
import p000.InterfaceC8776ar0;
import p000.MenuC7450Cq0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC7398Bq0, InterfaceC8776ar0, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public static final int[] f15762b = {R.attr.background, R.attr.divider};

    /* renamed from: a */
    public MenuC7450Cq0 f15763a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context, attributeSet, f15762b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c8539Xo1M9117J.m9121C(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c8539Xo1M9117J.m9121C(1));
        }
        c8539Xo1M9117J.m9130M();
    }

    @Override // p000.InterfaceC7398Bq0
    /* renamed from: a */
    public final boolean mo892a(C7866Kq0 c7866Kq0) {
        return this.f15763a.m1418q(c7866Kq0, null, 0);
    }

    @Override // p000.InterfaceC8776ar0
    /* renamed from: b */
    public final void mo9828b(MenuC7450Cq0 menuC7450Cq0) {
        this.f15763a = menuC7450Cq0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo892a((C7866Kq0) getAdapter().getItem(i));
    }
}
