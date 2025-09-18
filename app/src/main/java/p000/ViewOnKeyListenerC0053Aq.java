package p000;

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
public final class ViewOnKeyListenerC0053Aq extends AbstractC8126Pq0 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b */
    public final Context f398b;

    /* renamed from: c */
    public final int f399c;

    /* renamed from: d */
    public final int f400d;

    /* renamed from: e */
    public final boolean f401e;

    /* renamed from: f */
    public final Handler f402f;

    /* renamed from: n */
    public View f410n;

    /* renamed from: o */
    public View f411o;

    /* renamed from: p */
    public int f412p;

    /* renamed from: q */
    public boolean f413q;

    /* renamed from: r */
    public boolean f414r;

    /* renamed from: s */
    public int f415s;

    /* renamed from: t */
    public int f416t;

    /* renamed from: v */
    public boolean f418v;

    /* renamed from: w */
    public InterfaceC8490Wq0 f419w;

    /* renamed from: x */
    public ViewTreeObserver f420x;

    /* renamed from: y */
    public C8178Qq0 f421y;

    /* renamed from: z */
    public boolean f422z;

    /* renamed from: g */
    public final ArrayList f403g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f404h = new ArrayList();

    /* renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC1454X6 f405i = new ViewTreeObserverOnGlobalLayoutListenerC1454X6(2, this);

    /* renamed from: j */
    public final ViewOnAttachStateChangeListenerC7226yq f406j = new ViewOnAttachStateChangeListenerC7226yq(0, this);

    /* renamed from: k */
    public final QQ0 f407k = new QQ0(this);

    /* renamed from: l */
    public int f408l = 0;

    /* renamed from: m */
    public int f409m = 0;

    /* renamed from: u */
    public boolean f417u = false;

    public ViewOnKeyListenerC0053Aq(Context context, View view, int i, boolean z) {
        this.f398b = context;
        this.f410n = view;
        this.f400d = i;
        this.f401e = z;
        this.f412p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f399c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f402f = new Handler();
    }

    @Override // p000.InterfaceC11742y01
    /* renamed from: a */
    public final boolean mo334a() {
        ArrayList arrayList = this.f404h;
        return arrayList.size() > 0 && ((C7289zq) arrayList.get(0)).f47024a.f4480z.isShowing();
    }

    @Override // p000.InterfaceC11742y01
    /* renamed from: b */
    public final void mo335b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo334a()) {
            return;
        }
        ArrayList arrayList = this.f403g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m345v((MenuC7450Cq0) it.next());
        }
        arrayList.clear();
        View view = this.f410n;
        this.f411o = view;
        if (view != null) {
            boolean z = this.f420x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f420x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f405i);
            }
            this.f411o.addOnAttachStateChangeListener(this.f406j);
        }
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: c */
    public final boolean mo301c(I51 i51) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.f404h.iterator();
        while (it.hasNext()) {
            C7289zq c7289zq = (C7289zq) it.next();
            if (i51 == c7289zq.f47025b) {
                c7289zq.f47024a.f4457c.requestFocus();
                return true;
            }
        }
        if (!i51.hasVisibleItems()) {
            return false;
        }
        mo337l(i51);
        InterfaceC8490Wq0 interfaceC8490Wq0 = this.f419w;
        if (interfaceC8490Wq0 != null) {
            interfaceC8490Wq0.mo1907q0(i51);
        }
        return true;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: d */
    public final boolean mo302d() {
        return false;
    }

    @Override // p000.InterfaceC11742y01
    public final void dismiss() {
        ArrayList arrayList = this.f404h;
        int size = arrayList.size();
        if (size > 0) {
            C7289zq[] c7289zqArr = (C7289zq[]) arrayList.toArray(new C7289zq[size]);
            for (int i = size - 1; i >= 0; i--) {
                C7289zq c7289zq = c7289zqArr[i];
                if (c7289zq.f47024a.f4480z.isShowing()) {
                    c7289zq.f47024a.dismiss();
                }
            }
        }
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: f */
    public final void mo304f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
        ArrayList arrayList = this.f404h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC7450Cq0 == ((C7289zq) arrayList.get(i)).f47025b) {
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
            ((C7289zq) arrayList.get(i2)).f47025b.m1404c(false);
        }
        C7289zq c7289zq = (C7289zq) arrayList.remove(i);
        c7289zq.f47025b.m1419r(this);
        boolean z2 = this.f422z;
        C8438Vq0 c8438Vq0 = c7289zq.f47024a;
        if (z2) {
            AbstractC8282Sq0.m7453b(c8438Vq0.f4480z, null);
            c8438Vq0.f4480z.setAnimationStyle(0);
        }
        c8438Vq0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f412p = ((C7289zq) arrayList.get(size2 - 1)).f47026c;
        } else {
            this.f412p = this.f410n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C7289zq) arrayList.get(0)).f47025b.m1404c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC8490Wq0 interfaceC8490Wq0 = this.f419w;
        if (interfaceC8490Wq0 != null) {
            interfaceC8490Wq0.mo1906f(menuC7450Cq0, true);
        }
        ViewTreeObserver viewTreeObserver = this.f420x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f420x.removeGlobalOnLayoutListener(this.f405i);
            }
            this.f420x = null;
        }
        this.f411o.removeOnAttachStateChangeListener(this.f406j);
        this.f421y.onDismiss();
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: g */
    public final void mo305g(InterfaceC8490Wq0 interfaceC8490Wq0) {
        this.f419w = interfaceC8490Wq0;
    }

    @Override // p000.InterfaceC8542Xq0
    /* renamed from: i */
    public final void mo307i() {
        Iterator it = this.f404h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C7289zq) it.next()).f47024a.f4457c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C11975zq0) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC11742y01
    /* renamed from: j */
    public final C1659aM mo336j() {
        ArrayList arrayList = this.f404h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C7289zq) AbstractC7222ym.m26228e(1, arrayList)).f47024a.f4457c;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: l */
    public final void mo337l(MenuC7450Cq0 menuC7450Cq0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        menuC7450Cq0.m1403b(this, this.f398b);
        if (mo334a()) {
            m345v(menuC7450Cq0);
        } else {
            this.f403g.add(menuC7450Cq0);
        }
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: n */
    public final void mo338n(View view) {
        if (this.f410n != view) {
            this.f410n = view;
            this.f409m = Gravity.getAbsoluteGravity(this.f408l, view.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: o */
    public final void mo339o(boolean z) {
        this.f417u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C7289zq c7289zq;
        ArrayList arrayList = this.f404h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c7289zq = null;
                break;
            }
            c7289zq = (C7289zq) arrayList.get(i);
            if (!c7289zq.f47024a.f4480z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c7289zq != null) {
            c7289zq.f47025b.m1404c(false);
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

    @Override // p000.AbstractC8126Pq0
    /* renamed from: p */
    public final void mo340p(int i) {
        if (this.f408l != i) {
            this.f408l = i;
            this.f409m = Gravity.getAbsoluteGravity(i, this.f410n.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: q */
    public final void mo341q(int i) {
        this.f413q = true;
        this.f415s = i;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: r */
    public final void mo342r(PopupWindow.OnDismissListener onDismissListener) {
        this.f421y = (C8178Qq0) onDismissListener;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: s */
    public final void mo343s(boolean z) {
        this.f418v = z;
    }

    @Override // p000.AbstractC8126Pq0
    /* renamed from: t */
    public final void mo344t(int i) {
        this.f414r = true;
        this.f416t = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0193  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m345v(p000.MenuC7450Cq0 r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnKeyListenerC0053Aq.m345v(Cq0):void");
    }
}
