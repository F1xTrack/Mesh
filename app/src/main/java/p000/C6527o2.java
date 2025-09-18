package p000;

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

/* renamed from: o2 */
/* loaded from: classes.dex */
public final class C6527o2 implements InterfaceC8542Xq0 {

    /* renamed from: a */
    public final Context f38690a;

    /* renamed from: b */
    public Context f38691b;

    /* renamed from: c */
    public MenuC7450Cq0 f38692c;

    /* renamed from: d */
    public final LayoutInflater f38693d;

    /* renamed from: e */
    public InterfaceC8490Wq0 f38694e;

    /* renamed from: h */
    public InterfaceC8776ar0 f38697h;

    /* renamed from: i */
    public C6464n2 f38698i;

    /* renamed from: j */
    public Drawable f38699j;

    /* renamed from: k */
    public boolean f38700k;

    /* renamed from: l */
    public boolean f38701l;

    /* renamed from: m */
    public boolean f38702m;

    /* renamed from: n */
    public int f38703n;

    /* renamed from: o */
    public int f38704o;

    /* renamed from: p */
    public int f38705p;

    /* renamed from: q */
    public boolean f38706q;

    /* renamed from: s */
    public C6338l2 f38708s;

    /* renamed from: t */
    public C6338l2 f38709t;

    /* renamed from: u */
    public RunnableC1483XZ f38710u;

    /* renamed from: v */
    public C6401m2 f38711v;

    /* renamed from: f */
    public final int f38695f = R.layout.abc_action_menu_layout;

    /* renamed from: g */
    public final int f38696g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r */
    public final SparseBooleanArray f38707r = new SparseBooleanArray();

    /* renamed from: w */
    public final C9196e41 f38712w = new C9196e41(2, this);

    public C6527o2(Context context) {
        this.f38690a = context;
        this.f38693d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Zq0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: a */
    public final View m23310a(C7866Kq0 c7866Kq0, View view, ViewGroup viewGroup) {
        View actionView = c7866Kq0.getActionView();
        if (actionView == null || c7866Kq0.m4769e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC8646Zq0 ? (InterfaceC8646Zq0) view : (InterfaceC8646Zq0) this.f38693d.inflate(this.f38696g, viewGroup, false);
            actionMenuItemView.mo9614c(c7866Kq0);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f38697h);
            if (this.f38711v == null) {
                this.f38711v = new C6401m2(this);
            }
            actionMenuItemView2.setPopupCallback(this.f38711v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c7866Kq0.f6331C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C6655q2)) {
            actionView.setLayoutParams(ActionMenuView.m9845m(layoutParams));
        }
        return actionView;
    }

    /* renamed from: b */
    public final boolean m23311b() {
        Object obj;
        RunnableC1483XZ runnableC1483XZ = this.f38710u;
        if (runnableC1483XZ != null && (obj = this.f38697h) != null) {
            ((View) obj).removeCallbacks(runnableC1483XZ);
            this.f38710u = null;
            return true;
        }
        C6338l2 c6338l2 = this.f38708s;
        if (c6338l2 == null) {
            return false;
        }
        if (c6338l2.m7121b()) {
            c6338l2.f10453i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC8542Xq0
    /* renamed from: c */
    public final boolean mo301c(I51 i51) {
        boolean z;
        if (!i51.hasVisibleItems()) {
            return false;
        }
        I51 i512 = i51;
        while (true) {
            MenuC7450Cq0 menuC7450Cq0 = i512.f4696z;
            if (menuC7450Cq0 == this.f38692c) {
                break;
            }
            i512 = (I51) menuC7450Cq0;
        }
        ViewGroup viewGroup = (ViewGroup) this.f38697h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC8646Zq0) && ((InterfaceC8646Zq0) childAt).getItemData() == i512.f4695A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        i51.f4695A.getClass();
        int size = i51.f1707f.size();
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
        C6338l2 c6338l2 = new C6338l2(this, this.f38691b, i51, view);
        this.f38709t = c6338l2;
        c6338l2.f10451g = z;
        AbstractC8126Pq0 abstractC8126Pq0 = c6338l2.f10453i;
        if (abstractC8126Pq0 != null) {
            abstractC8126Pq0.mo339o(z);
        }
        C6338l2 c6338l22 = this.f38709t;
        if (!c6338l22.m7121b()) {
            if (c6338l22.f10449e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c6338l22.m7123d(0, 0, false, false);
        }
        InterfaceC8490Wq0 interfaceC8490Wq0 = this.f38694e;
        if (interfaceC8490Wq0 != null) {
            interfaceC8490Wq0.mo1907q0(i51);
        }
        return true;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: d */
    public final boolean mo302d() {
        int size;
        ArrayList arrayListM1413l;
        int i;
        boolean z;
        MenuC7450Cq0 menuC7450Cq0 = this.f38692c;
        if (menuC7450Cq0 != null) {
            arrayListM1413l = menuC7450Cq0.m1413l();
            size = arrayListM1413l.size();
        } else {
            size = 0;
            arrayListM1413l = null;
        }
        int i2 = this.f38705p;
        int i3 = this.f38704o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f38697h;
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
            C7866Kq0 c7866Kq0 = (C7866Kq0) arrayListM1413l.get(i4);
            int i7 = c7866Kq0.f6356y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.f38706q && c7866Kq0.f6331C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f38701l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.f38707r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C7866Kq0 c7866Kq02 = (C7866Kq0) arrayListM1413l.get(i9);
            int i11 = c7866Kq02.f6356y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c7866Kq02.f6333b;
            if (z3) {
                View viewM23310a = m23310a(c7866Kq02, null, viewGroup);
                viewM23310a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM23310a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c7866Kq02.m4771g(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewM23310a2 = m23310a(c7866Kq02, null, viewGroup);
                    viewM23310a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM23310a2.getMeasuredWidth();
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
                        C7866Kq0 c7866Kq03 = (C7866Kq0) arrayListM1413l.get(i13);
                        if (c7866Kq03.f6333b == i12) {
                            if (c7866Kq03.m4770f()) {
                                i8++;
                            }
                            c7866Kq03.m4771g(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                c7866Kq02.m4771g(z5);
            } else {
                c7866Kq02.m4771g(false);
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

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: e */
    public final boolean mo303e(C7866Kq0 c7866Kq0) {
        return false;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: f */
    public final void mo304f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
        m23311b();
        C6338l2 c6338l2 = this.f38709t;
        if (c6338l2 != null && c6338l2.m7121b()) {
            c6338l2.f10453i.dismiss();
        }
        InterfaceC8490Wq0 interfaceC8490Wq0 = this.f38694e;
        if (interfaceC8490Wq0 != null) {
            interfaceC8490Wq0.mo1906f(menuC7450Cq0, z);
        }
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: g */
    public final void mo305g(InterfaceC8490Wq0 interfaceC8490Wq0) {
        throw null;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: h */
    public final boolean mo306h(C7866Kq0 c7866Kq0) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC8542Xq0
    /* renamed from: i */
    public final void mo307i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f38697h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC7450Cq0 menuC7450Cq0 = this.f38692c;
            if (menuC7450Cq0 != null) {
                menuC7450Cq0.m1410i();
                ArrayList arrayListM1413l = this.f38692c.m1413l();
                int size = arrayListM1413l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C7866Kq0 c7866Kq0 = (C7866Kq0) arrayListM1413l.get(i2);
                    if (c7866Kq0.m4770f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C7866Kq0 itemData = childAt instanceof InterfaceC8646Zq0 ? ((InterfaceC8646Zq0) childAt).getItemData() : null;
                        View viewM23310a = m23310a(c7866Kq0, childAt, viewGroup);
                        if (c7866Kq0 != itemData) {
                            viewM23310a.setPressed(false);
                            viewM23310a.jumpDrawablesToCurrentState();
                        }
                        if (viewM23310a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM23310a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM23310a);
                            }
                            ((ViewGroup) this.f38697h).addView(viewM23310a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f38698i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f38697h).requestLayout();
        MenuC7450Cq0 menuC7450Cq02 = this.f38692c;
        if (menuC7450Cq02 != null) {
            menuC7450Cq02.m1410i();
            ArrayList arrayList2 = menuC7450Cq02.f1710i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC7918Lq0 actionProviderVisibilityListenerC7918Lq0 = ((C7866Kq0) arrayList2.get(i3)).f6329A;
            }
        }
        MenuC7450Cq0 menuC7450Cq03 = this.f38692c;
        if (menuC7450Cq03 != null) {
            menuC7450Cq03.m1410i();
            arrayList = menuC7450Cq03.f1711j;
        }
        if (this.f38701l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C7866Kq0) arrayList.get(0)).f6331C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f38698i == null) {
                this.f38698i = new C6464n2(this, this.f38690a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f38698i.getParent();
            if (viewGroup3 != this.f38697h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f38698i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f38697h;
                C6464n2 c6464n2 = this.f38698i;
                actionMenuView.getClass();
                C6655q2 c6655q2M9844l = ActionMenuView.m9844l();
                c6655q2M9844l.f40501a = true;
                actionMenuView.addView(c6464n2, c6655q2M9844l);
            }
        } else {
            C6464n2 c6464n22 = this.f38698i;
            if (c6464n22 != null) {
                Object parent = c6464n22.getParent();
                Object obj = this.f38697h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f38698i);
                }
            }
        }
        ((ActionMenuView) this.f38697h).setOverflowReserved(this.f38701l);
    }

    /* renamed from: j */
    public final boolean m23312j() {
        C6338l2 c6338l2 = this.f38708s;
        return c6338l2 != null && c6338l2.m7121b();
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: k */
    public final void mo308k(Context context, MenuC7450Cq0 menuC7450Cq0) {
        this.f38691b = context;
        LayoutInflater.from(context);
        this.f38692c = menuC7450Cq0;
        Resources resources = context.getResources();
        if (!this.f38702m) {
            this.f38701l = true;
        }
        int i = 2;
        this.f38703n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f38705p = i;
        int measuredWidth = this.f38703n;
        if (this.f38701l) {
            if (this.f38698i == null) {
                C6464n2 c6464n2 = new C6464n2(this, this.f38690a);
                this.f38698i = c6464n2;
                if (this.f38700k) {
                    c6464n2.setImageDrawable(this.f38699j);
                    this.f38699j = null;
                    this.f38700k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f38698i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f38698i.getMeasuredWidth();
        } else {
            this.f38698i = null;
        }
        this.f38704o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: l */
    public final boolean m23313l() {
        MenuC7450Cq0 menuC7450Cq0;
        if (!this.f38701l || m23312j() || (menuC7450Cq0 = this.f38692c) == null || this.f38697h == null || this.f38710u != null) {
            return false;
        }
        menuC7450Cq0.m1410i();
        if (menuC7450Cq0.f1711j.isEmpty()) {
            return false;
        }
        RunnableC1483XZ runnableC1483XZ = new RunnableC1483XZ(this, new C6338l2(this, this.f38691b, this.f38692c, this.f38698i), false, 1);
        this.f38710u = runnableC1483XZ;
        ((View) this.f38697h).post(runnableC1483XZ);
        return true;
    }
}
