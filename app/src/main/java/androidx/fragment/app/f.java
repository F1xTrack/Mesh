package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC4021gk1;
import defpackage.AbstractC6897rk1;
import defpackage.AbstractC7209tN0;
import defpackage.AbstractC8041xk1;
import defpackage.AbstractC8069xu;
import defpackage.C0923Lp;
import defpackage.C7925x8;
import defpackage.HS1;
import defpackage.MD0;
import defpackage.O90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class f {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public f(ViewGroup viewGroup) {
        O90.f(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static void a(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC8041xk1.b(viewGroup)) {
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
                a(childAt, arrayList);
            }
        }
    }

    public static void e(C7925x8 c7925x8, View view) {
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        String strK = AbstractC4021gk1.k(view);
        if (strK != null) {
            c7925x8.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    e(c7925x8, childAt);
                }
            }
        }
    }

    public static final f h(ViewGroup viewGroup, o oVar) {
        O90.f(viewGroup, "container");
        O90.f(oVar, "fragmentManager");
        O90.e(oVar.G(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof f) {
            return (f) tag;
        }
        f fVar = new f(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, fVar);
        return fVar;
    }

    public final void b(int i, int i2, r rVar) {
        synchronized (this.b) {
            C0923Lp c0923Lp = new C0923Lp();
            Fragment fragment = rVar.c;
            O90.e(fragment, "fragmentStateManager.fragment");
            v vVarF = f(fragment);
            if (vVarF != null) {
                vVarF.c(i, i2);
                return;
            }
            final v vVar = new v(i, i2, rVar, c0923Lp);
            this.b.add(vVar);
            vVar.d.add(new Runnable() { // from class: androidx.fragment.app.u
                @Override // java.lang.Runnable
                public final void run() {
                    f fVar = this.a;
                    O90.f(fVar, "this$0");
                    v vVar2 = vVar;
                    if (fVar.b.contains(vVar2)) {
                        int i3 = vVar2.a;
                        View view = vVar2.c.mView;
                        O90.e(view, "operation.fragment.mView");
                        AbstractC7209tN0.l(i3, view);
                    }
                }
            });
            vVar.d.add(new MD0(this, 21, vVar));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.ArrayList r41, boolean r42) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.c(java.util.ArrayList, boolean):void");
    }

    public final void d() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        if (!viewGroup.isAttachedToWindow()) {
            g();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayListD0 = AbstractC8069xu.d0(this.c);
                    this.c.clear();
                    Iterator it = arrayListD0.iterator();
                    while (it.hasNext()) {
                        v vVar = (v) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(vVar);
                        }
                        vVar.a();
                        if (!vVar.g) {
                            this.c.add(vVar);
                        }
                    }
                    j();
                    ArrayList arrayListD02 = AbstractC8069xu.d0(this.b);
                    this.b.clear();
                    this.c.addAll(arrayListD02);
                    Iterator it2 = arrayListD02.iterator();
                    while (it2.hasNext()) {
                        ((v) it2.next()).d();
                    }
                    c(arrayListD02, this.d);
                    this.d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v f(Fragment fragment) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            v vVar = (v) next;
            if (O90.a(vVar.c, fragment) && !vVar.f) {
                break;
            }
        }
        return (v) next;
    }

    public final void g() {
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                j();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((v) it.next()).d();
                }
                Iterator it2 = AbstractC8069xu.d0(this.c).iterator();
                while (it2.hasNext()) {
                    v vVar = (v) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(vVar);
                    }
                    vVar.a();
                }
                Iterator it3 = AbstractC8069xu.d0(this.b).iterator();
                while (it3.hasNext()) {
                    v vVar2 = (v) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(vVar2);
                    }
                    vVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        Object objPrevious;
        synchronized (this.b) {
            try {
                j();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    v vVar = (v) objPrevious;
                    View view = vVar.c.mView;
                    O90.e(view, "operation.fragment.mView");
                    int iA = HS1.a(view);
                    if (vVar.a == 2 && iA != 2) {
                        break;
                    }
                }
                v vVar2 = (v) objPrevious;
                Fragment fragment = vVar2 != null ? vVar2.c : null;
                this.e = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            int i = 2;
            if (vVar.b == 2) {
                View viewRequireView = vVar.c.requireView();
                O90.e(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC7209tN0.u(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                vVar.c(i, 1);
            }
        }
    }
}
