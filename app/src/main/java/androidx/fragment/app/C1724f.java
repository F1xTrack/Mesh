package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC11153tN0;
import p000.AbstractC11710xk1;
import p000.AbstractC7167xu;
import p000.AbstractC9536gk1;
import p000.C0744Lp;
import p000.C7119x8;
import p000.HS1;
import p000.MD0;
import p000.O90;
import ru.mes.dnevnik.R;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public final class C1724f {

    /* renamed from: a */
    public final ViewGroup f16183a;

    /* renamed from: b */
    public final ArrayList f16184b;

    /* renamed from: c */
    public final ArrayList f16185c;

    /* renamed from: d */
    public boolean f16186d;

    /* renamed from: e */
    public boolean f16187e;

    public C1724f(ViewGroup viewGroup) {
        O90.m5968f(viewGroup, "container");
        this.f16183a = viewGroup;
        this.f16184b = new ArrayList();
        this.f16185c = new ArrayList();
    }

    /* renamed from: a */
    public static void m10022a(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC11710xk1.m25936b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                m10022a(childAt, arrayList);
            }
        }
    }

    /* renamed from: e */
    public static void m10023e(C7119x8 c7119x8, View view) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        String strM18616k = AbstractC9536gk1.m18616k(view);
        if (strM18616k != null) {
            c7119x8.put(strM18616k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m10023e(c7119x8, childAt);
                }
            }
        }
    }

    /* renamed from: h */
    public static final C1724f m10024h(ViewGroup viewGroup, AbstractC1733o abstractC1733o) {
        O90.m5968f(viewGroup, "container");
        O90.m5968f(abstractC1733o, "fragmentManager");
        O90.m5967e(abstractC1733o.m10043G(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C1724f) {
            return (C1724f) tag;
        }
        C1724f c1724f = new C1724f(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c1724f);
        return c1724f;
    }

    /* renamed from: b */
    public final void m10025b(int i, int i2, C1736r c1736r) {
        synchronized (this.f16184b) {
            C0744Lp c0744Lp = new C0744Lp();
            Fragment fragment = c1736r.f16262c;
            O90.m5967e(fragment, "fragmentStateManager.fragment");
            C1740v c1740vM10028f = m10028f(fragment);
            if (c1740vM10028f != null) {
                c1740vM10028f.m10120c(i, i2);
                return;
            }
            final C1740v c1740v = new C1740v(i, i2, c1736r, c0744Lp);
            this.f16184b.add(c1740v);
            c1740v.f16280d.add(new Runnable() { // from class: androidx.fragment.app.u
                @Override // java.lang.Runnable
                public final void run() {
                    C1724f c1724f = this.f16275a;
                    O90.m5968f(c1724f, "this$0");
                    C1740v c1740v2 = c1740v;
                    if (c1724f.f16184b.contains(c1740v2)) {
                        int i3 = c1740v2.f16277a;
                        View view = c1740v2.f16279c.mView;
                        O90.m5967e(view, "operation.fragment.mView");
                        AbstractC11153tN0.m24900l(i3, view);
                    }
                }
            });
            c1740v.f16280d.add(new MD0(this, 21, c1740v));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0810 A[LOOP:10: B:291:0x080a->B:293:0x0810, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0509 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:401:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10026c(java.util.ArrayList r41, boolean r42) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1724f.m10026c(java.util.ArrayList, boolean):void");
    }

    /* renamed from: d */
    public final void m10027d() {
        if (this.f16187e) {
            return;
        }
        ViewGroup viewGroup = this.f16183a;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (!viewGroup.isAttachedToWindow()) {
            m10029g();
            this.f16186d = false;
            return;
        }
        synchronized (this.f16184b) {
            try {
                if (!this.f16184b.isEmpty()) {
                    ArrayList arrayListM25984d0 = AbstractC7167xu.m25984d0(this.f16185c);
                    this.f16185c.clear();
                    Iterator it = arrayListM25984d0.iterator();
                    while (it.hasNext()) {
                        C1740v c1740v = (C1740v) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(c1740v);
                        }
                        c1740v.m10118a();
                        if (!c1740v.f16283g) {
                            this.f16185c.add(c1740v);
                        }
                    }
                    m10031j();
                    ArrayList arrayListM25984d02 = AbstractC7167xu.m25984d0(this.f16184b);
                    this.f16184b.clear();
                    this.f16185c.addAll(arrayListM25984d02);
                    Iterator it2 = arrayListM25984d02.iterator();
                    while (it2.hasNext()) {
                        ((C1740v) it2.next()).m10121d();
                    }
                    m10026c(arrayListM25984d02, this.f16186d);
                    this.f16186d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final C1740v m10028f(Fragment fragment) {
        Object next;
        Iterator it = this.f16184b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C1740v c1740v = (C1740v) next;
            if (O90.m5963a(c1740v.f16279c, fragment) && !c1740v.f16282f) {
                break;
            }
        }
        return (C1740v) next;
    }

    /* renamed from: g */
    public final void m10029g() {
        ViewGroup viewGroup = this.f16183a;
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f16184b) {
            try {
                m10031j();
                Iterator it = this.f16184b.iterator();
                while (it.hasNext()) {
                    ((C1740v) it.next()).m10121d();
                }
                Iterator it2 = AbstractC7167xu.m25984d0(this.f16185c).iterator();
                while (it2.hasNext()) {
                    C1740v c1740v = (C1740v) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f16183a);
                        }
                        Objects.toString(c1740v);
                    }
                    c1740v.m10118a();
                }
                Iterator it3 = AbstractC7167xu.m25984d0(this.f16184b).iterator();
                while (it3.hasNext()) {
                    C1740v c1740v2 = (C1740v) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f16183a);
                        }
                        Objects.toString(c1740v2);
                    }
                    c1740v2.m10118a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final void m10030i() {
        Object objPrevious;
        synchronized (this.f16184b) {
            try {
                m10031j();
                ArrayList arrayList = this.f16184b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    C1740v c1740v = (C1740v) objPrevious;
                    View view = c1740v.f16279c.mView;
                    O90.m5967e(view, "operation.fragment.mView");
                    int iM3430a = HS1.m3430a(view);
                    if (c1740v.f16277a == 2 && iM3430a != 2) {
                        break;
                    }
                }
                C1740v c1740v2 = (C1740v) objPrevious;
                Fragment fragment = c1740v2 != null ? c1740v2.f16279c : null;
                this.f16187e = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final void m10031j() {
        Iterator it = this.f16184b.iterator();
        while (it.hasNext()) {
            C1740v c1740v = (C1740v) it.next();
            int i = 2;
            if (c1740v.f16278b == 2) {
                View viewRequireView = c1740v.f16279c.requireView();
                O90.m5967e(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                c1740v.m10120c(i, 1);
            }
        }
    }
}
