package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import ru.mes.dnevnik.R;

/* renamed from: Aq */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0068Aq extends AbstractC1238Pq0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public View n;
    public View o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean v;
    public InterfaceC1784Wq0 w;
    public ViewTreeObserver x;
    public C1316Qq0 y;
    public boolean z;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final X6 i = new X6(2, this);
    public final ViewOnAttachStateChangeListenerC8247yq j = new ViewOnAttachStateChangeListenerC8247yq(0, this);
    public final QQ0 k = new QQ0(this);
    public int l = 0;
    public int m = 0;
    public boolean u = false;

    public ViewOnKeyListenerC0068Aq(Context context, View view, int i, boolean z) {
        this.b = context;
        this.n = view;
        this.d = i;
        this.e = z;
        this.p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // defpackage.InterfaceC8090y01
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C8437zq) arrayList.get(0)).a.z.isShowing();
    }

    @Override // defpackage.InterfaceC8090y01
    public final void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0225Cq0) it.next());
        }
        arrayList.clear();
        View view = this.n;
        this.o = view;
        if (view != null) {
            boolean z = this.x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.o.addOnAttachStateChangeListener(this.j);
        }
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean c(I51 i51) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C8437zq c8437zq = (C8437zq) it.next();
            if (i51 == c8437zq.b) {
                c8437zq.a.c.requestFocus();
                return true;
            }
        }
        if (!i51.hasVisibleItems()) {
            return false;
        }
        l(i51);
        InterfaceC1784Wq0 interfaceC1784Wq0 = this.w;
        if (interfaceC1784Wq0 != null) {
            interfaceC1784Wq0.q0(i51);
        }
        return true;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final boolean d() {
        return false;
    }

    @Override // defpackage.InterfaceC8090y01
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C8437zq[] c8437zqArr = (C8437zq[]) arrayList.toArray(new C8437zq[size]);
            for (int i = size - 1; i >= 0; i--) {
                C8437zq c8437zq = c8437zqArr[i];
                if (c8437zq.a.z.isShowing()) {
                    c8437zq.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0225Cq0 == ((C8437zq) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C8437zq) arrayList.get(i2)).b.c(false);
        }
        C8437zq c8437zq = (C8437zq) arrayList.remove(i);
        c8437zq.b.r(this);
        boolean z2 = this.z;
        C1706Vq0 c1706Vq0 = c8437zq.a;
        if (z2) {
            AbstractC1472Sq0.b(c1706Vq0.z, null);
            c1706Vq0.z.setAnimationStyle(0);
        }
        c1706Vq0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.p = ((C8437zq) arrayList.get(size2 - 1)).c;
        } else {
            this.p = this.n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C8437zq) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1784Wq0 interfaceC1784Wq0 = this.w;
        if (interfaceC1784Wq0 != null) {
            interfaceC1784Wq0.f(menuC0225Cq0, true);
        }
        ViewTreeObserver viewTreeObserver = this.x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeGlobalOnLayoutListener(this.i);
            }
            this.x = null;
        }
        this.o.removeOnAttachStateChangeListener(this.j);
        this.y.onDismiss();
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void g(InterfaceC1784Wq0 interfaceC1784Wq0) {
        this.w = interfaceC1784Wq0;
    }

    @Override // defpackage.InterfaceC1862Xq0
    public final void i() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C8437zq) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C8438zq0) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC8090y01
    public final C2118aM j() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C8437zq) AbstractC8235ym.e(1, arrayList)).a.c;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void l(MenuC0225Cq0 menuC0225Cq0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        menuC0225Cq0.b(this, this.b);
        if (a()) {
            v(menuC0225Cq0);
        } else {
            this.g.add(menuC0225Cq0);
        }
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void n(View view) {
        if (this.n != view) {
            this.n = view;
            this.m = Gravity.getAbsoluteGravity(this.l, view.getLayoutDirection());
        }
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void o(boolean z) {
        this.u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C8437zq c8437zq;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c8437zq = null;
                break;
            }
            c8437zq = (C8437zq) arrayList.get(i);
            if (!c8437zq.a.z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c8437zq != null) {
            c8437zq.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void p(int i) {
        if (this.l != i) {
            this.l = i;
            this.m = Gravity.getAbsoluteGravity(i, this.n.getLayoutDirection());
        }
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void q(int i) {
        this.q = true;
        this.s = i;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.y = (C1316Qq0) onDismissListener;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void s(boolean z) {
        this.v = z;
    }

    @Override // defpackage.AbstractC1238Pq0
    public final void t(int i) {
        this.r = true;
        this.t = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(defpackage.MenuC0225Cq0 r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnKeyListenerC0068Aq.v(Cq0):void");
    }
}
