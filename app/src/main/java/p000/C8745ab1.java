package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: ab1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8745ab1 implements InterfaceC8542Xq0 {

    /* renamed from: a */
    public MenuC7450Cq0 f15579a;

    /* renamed from: b */
    public C7866Kq0 f15580b;

    /* renamed from: c */
    public final /* synthetic */ Toolbar f15581c;

    public C8745ab1(Toolbar toolbar) {
        this.f15581c = toolbar;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: c */
    public final boolean mo301c(I51 i51) {
        return false;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: d */
    public final boolean mo302d() {
        return false;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: e */
    public final boolean mo303e(C7866Kq0 c7866Kq0) {
        Toolbar toolbar = this.f15581c;
        KeyEvent.Callback callback = toolbar.f15897i;
        if (callback instanceof InterfaceC6772ru) {
            ((InterfaceC6772ru) callback).mo5461e();
        }
        toolbar.removeView(toolbar.f15897i);
        toolbar.removeView(toolbar.f15896h);
        toolbar.f15897i = null;
        ArrayList arrayList = toolbar.f15873E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f15580b = null;
        toolbar.requestLayout();
        c7866Kq0.f6331C = false;
        c7866Kq0.f6345n.m1417p(false);
        toolbar.m9871w();
        return true;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: h */
    public final boolean mo306h(C7866Kq0 c7866Kq0) {
        Toolbar toolbar = this.f15581c;
        toolbar.m9855c();
        ViewParent parent = toolbar.f15896h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f15896h);
            }
            toolbar.addView(toolbar.f15896h);
        }
        View actionView = c7866Kq0.getActionView();
        toolbar.f15897i = actionView;
        this.f15580b = c7866Kq0;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f15897i);
            }
            C8873bb1 c8873bb1M9849h = Toolbar.m9849h();
            c8873bb1M9849h.f17080a = (toolbar.f15902n & 112) | 8388611;
            c8873bb1M9849h.f17081b = 2;
            toolbar.f15897i.setLayoutParams(c8873bb1M9849h);
            toolbar.addView(toolbar.f15897i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C8873bb1) childAt.getLayoutParams()).f17081b != 2 && childAt != toolbar.f15889a) {
                toolbar.removeViewAt(childCount);
                toolbar.f15873E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c7866Kq0.f6331C = true;
        c7866Kq0.f6345n.m1417p(false);
        KeyEvent.Callback callback = toolbar.f15897i;
        if (callback instanceof InterfaceC6772ru) {
            ((InterfaceC6772ru) callback).mo5460d();
        }
        toolbar.m9871w();
        return true;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: i */
    public final void mo307i() {
        if (this.f15580b != null) {
            MenuC7450Cq0 menuC7450Cq0 = this.f15579a;
            if (menuC7450Cq0 != null) {
                int size = menuC7450Cq0.f1707f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f15579a.getItem(i) == this.f15580b) {
                        return;
                    }
                }
            }
            mo303e(this.f15580b);
        }
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: k */
    public final void mo308k(Context context, MenuC7450Cq0 menuC7450Cq0) {
        C7866Kq0 c7866Kq0;
        MenuC7450Cq0 menuC7450Cq02 = this.f15579a;
        if (menuC7450Cq02 != null && (c7866Kq0 = this.f15580b) != null) {
            menuC7450Cq02.mo1405d(c7866Kq0);
        }
        this.f15579a = menuC7450Cq0;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: f */
    public final void mo304f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
    }
}
