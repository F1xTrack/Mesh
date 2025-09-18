package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: ab1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2165ab1 implements InterfaceC1862Xq0 {
    public MenuC0225Cq0 a;
    public C0849Kq0 b;
    public final /* synthetic */ Toolbar c;

    public C2165ab1(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean c(I51 i51) {
        return false;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean d() {
        return false;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean e(C0849Kq0 c0849Kq0) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC6925ru) {
            ((InterfaceC6925ru) callback).e();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        c0849Kq0.C = false;
        c0849Kq0.n.p(false);
        toolbar.w();
        return true;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean h(C0849Kq0 c0849Kq0) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0849Kq0.getActionView();
        toolbar.i = actionView;
        this.b = c0849Kq0;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            C2356bb1 c2356bb1H = Toolbar.h();
            c2356bb1H.a = (toolbar.n & 112) | 8388611;
            c2356bb1H.b = 2;
            toolbar.i.setLayoutParams(c2356bb1H);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C2356bb1) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0849Kq0.C = true;
        c0849Kq0.n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC6925ru) {
            ((InterfaceC6925ru) callback).d();
        }
        toolbar.w();
        return true;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void i() {
        if (this.b != null) {
            MenuC0225Cq0 menuC0225Cq0 = this.a;
            if (menuC0225Cq0 != null) {
                int size = menuC0225Cq0.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            e(this.b);
        }
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void k(Context context, MenuC0225Cq0 menuC0225Cq0) {
        C0849Kq0 c0849Kq0;
        MenuC0225Cq0 menuC0225Cq02 = this.a;
        if (menuC0225Cq02 != null && (c0849Kq0 = this.b) != null) {
            menuC0225Cq02.d(c0849Kq0);
        }
        this.a = menuC0225Cq0;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
    }
}
