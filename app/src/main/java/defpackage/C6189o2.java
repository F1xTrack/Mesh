package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* renamed from: o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6189o2 implements InterfaceC1862Xq0 {
    public final Context a;
    public Context b;
    public MenuC0225Cq0 c;
    public final LayoutInflater d;
    public InterfaceC1784Wq0 e;
    public InterfaceC2212ar0 h;
    public C5998n2 i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public C5616l2 s;
    public C5616l2 t;
    public XZ u;
    public C5807m2 v;
    public final int f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray r = new SparseBooleanArray();
    public final C3513e41 w = new C3513e41(2, this);

    public C6189o2(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Zq0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0849Kq0 c0849Kq0, View view, ViewGroup viewGroup) {
        View actionView = c0849Kq0.getActionView();
        if (actionView == null || c0849Kq0.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC2018Zq0 ? (InterfaceC2018Zq0) view : (InterfaceC2018Zq0) this.d.inflate(this.g, viewGroup, false);
            actionMenuItemView.c(c0849Kq0);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.v == null) {
                this.v = new C5807m2(this);
            }
            actionMenuItemView2.setPopupCallback(this.v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0849Kq0.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C6571q2)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        XZ xz = this.u;
        if (xz != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(xz);
            this.u = null;
            return true;
        }
        C5616l2 c5616l2 = this.s;
        if (c5616l2 == null) {
            return false;
        }
        if (c5616l2.b()) {
            c5616l2.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1862Xq0
    public final boolean c(I51 i51) {
        boolean z;
        if (!i51.hasVisibleItems()) {
            return false;
        }
        I51 i512 = i51;
        while (true) {
            MenuC0225Cq0 menuC0225Cq0 = i512.z;
            if (menuC0225Cq0 == this.c) {
                break;
            }
            i512 = (I51) menuC0225Cq0;
        }
        ViewGroup viewGroup = (ViewGroup) this.h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC2018Zq0) && ((InterfaceC2018Zq0) childAt).getItemData() == i512.A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        i51.A.getClass();
        int size = i51.f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = i51.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C5616l2 c5616l2 = new C5616l2(this, this.b, i51, view);
        this.t = c5616l2;
        c5616l2.g = z;
        AbstractC1238Pq0 abstractC1238Pq0 = c5616l2.i;
        if (abstractC1238Pq0 != null) {
            abstractC1238Pq0.o(z);
        }
        C5616l2 c5616l22 = this.t;
        if (!c5616l22.b()) {
            if (c5616l22.e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c5616l22.d(0, 0, false, false);
        }
        InterfaceC1784Wq0 interfaceC1784Wq0 = this.e;
        if (interfaceC1784Wq0 != null) {
            interfaceC1784Wq0.q0(i51);
        }
        return true;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        MenuC0225Cq0 menuC0225Cq0 = this.c;
        if (menuC0225Cq0 != null) {
            arrayListL = menuC0225Cq0.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = this.p;
        int i3 = this.o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C0849Kq0 c0849Kq0 = (C0849Kq0) arrayListL.get(i4);
            int i7 = c0849Kq0.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.q && c0849Kq0.C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C0849Kq0 c0849Kq02 = (C0849Kq0) arrayListL.get(i9);
            int i11 = c0849Kq02.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c0849Kq02.b;
            if (z3) {
                View viewA = a(c0849Kq02, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c0849Kq02.g(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewA2 = a(c0849Kq02, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        C0849Kq0 c0849Kq03 = (C0849Kq0) arrayListL.get(i13);
                        if (c0849Kq03.b == i12) {
                            if (c0849Kq03.f()) {
                                i8++;
                            }
                            c0849Kq03.g(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c0849Kq02.g(z5);
            } else {
                c0849Kq02.g(false);
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return z;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean e(C0849Kq0 c0849Kq0) {
        return false;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
        b();
        C5616l2 c5616l2 = this.t;
        if (c5616l2 != null && c5616l2.b()) {
            c5616l2.i.dismiss();
        }
        InterfaceC1784Wq0 interfaceC1784Wq0 = this.e;
        if (interfaceC1784Wq0 != null) {
            interfaceC1784Wq0.f(menuC0225Cq0, z);
        }
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void g(InterfaceC1784Wq0 interfaceC1784Wq0) {
        throw null;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean h(C0849Kq0 c0849Kq0) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1862Xq0
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC0225Cq0 menuC0225Cq0 = this.c;
            if (menuC0225Cq0 != null) {
                menuC0225Cq0.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0849Kq0 c0849Kq0 = (C0849Kq0) arrayListL.get(i2);
                    if (c0849Kq0.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0849Kq0 itemData = childAt instanceof InterfaceC2018Zq0 ? ((InterfaceC2018Zq0) childAt).getItemData() : null;
                        View viewA = a(c0849Kq0, childAt, viewGroup);
                        if (c0849Kq0 != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.h).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        MenuC0225Cq0 menuC0225Cq02 = this.c;
        if (menuC0225Cq02 != null) {
            menuC0225Cq02.i();
            ArrayList arrayList2 = menuC0225Cq02.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0927Lq0 actionProviderVisibilityListenerC0927Lq0 = ((C0849Kq0) arrayList2.get(i3)).A;
            }
        }
        MenuC0225Cq0 menuC0225Cq03 = this.c;
        if (menuC0225Cq03 != null) {
            menuC0225Cq03.i();
            arrayList = menuC0225Cq03.j;
        }
        if (this.l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C0849Kq0) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.i == null) {
                this.i = new C5998n2(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C5998n2 c5998n2 = this.i;
                actionMenuView.getClass();
                C6571q2 c6571q2L = ActionMenuView.l();
                c6571q2L.a = true;
                actionMenuView.addView(c5998n2, c6571q2L);
            }
        } else {
            C5998n2 c5998n22 = this.i;
            if (c5998n22 != null) {
                Object parent = c5998n22.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    public final boolean j() {
        C5616l2 c5616l2 = this.s;
        return c5616l2 != null && c5616l2.b();
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void k(Context context, MenuC0225Cq0 menuC0225Cq0) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = menuC0225Cq0;
        Resources resources = context.getResources();
        if (!this.m) {
            this.l = true;
        }
        int i = 2;
        this.n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.p = i;
        int measuredWidth = this.n;
        if (this.l) {
            if (this.i == null) {
                C5998n2 c5998n2 = new C5998n2(this, this.a);
                this.i = c5998n2;
                if (this.k) {
                    c5998n2.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        MenuC0225Cq0 menuC0225Cq0;
        if (!this.l || j() || (menuC0225Cq0 = this.c) == null || this.h == null || this.u != null) {
            return false;
        }
        menuC0225Cq0.i();
        if (menuC0225Cq0.j.isEmpty()) {
            return false;
        }
        XZ xz = new XZ(this, new C5616l2(this, this.b, this.c, this.i), false, 1);
        this.u = xz;
        ((View) this.h).post(xz);
        return true;
    }
}
