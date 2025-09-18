package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import defpackage.AbstractC8069xu;
import defpackage.AbstractC8235ym;
import defpackage.C0923Lp;
import defpackage.C1724Vw0;
import defpackage.NX;
import defpackage.O90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v {
    public int a;
    public int b;
    public final Fragment c;
    public final ArrayList d;
    public final LinkedHashSet e;
    public boolean f;
    public boolean g;
    public final r h;

    public v(int i, int i2, r rVar, C0923Lp c0923Lp) {
        NX.m(i, "finalState");
        NX.m(i2, "lifecycleImpact");
        O90.f(rVar, "fragmentStateManager");
        Fragment fragment = rVar.c;
        O90.e(fragment, "fragmentStateManager.fragment");
        NX.m(i, "finalState");
        NX.m(i2, "lifecycleImpact");
        O90.f(fragment, "fragment");
        this.a = i;
        this.b = i2;
        this.c = fragment;
        this.d = new ArrayList();
        this.e = new LinkedHashSet();
        c0923Lp.c(new C1724Vw0(16, this));
        this.h = rVar;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        LinkedHashSet linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = AbstractC8069xu.f0(linkedHashSet).iterator();
        while (it.hasNext()) {
            ((C0923Lp) it.next()).a();
        }
    }

    public final void b() {
        if (!this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.i();
    }

    public final void c(int i, int i2) {
        NX.m(i, "finalState");
        NX.m(i2, "lifecycleImpact");
        int iX = AbstractC8235ym.x(i2);
        Fragment fragment = this.c;
        if (iX == 0) {
            if (this.a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(fragment);
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        throw null;
                    }
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iX != 1) {
            if (iX != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(fragment);
            }
            this.a = 1;
            this.b = 3;
            return;
        }
        if (this.a == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(fragment);
            }
            this.a = 2;
            this.b = 2;
        }
    }

    public final void d() {
        int i = this.b;
        r rVar = this.h;
        if (i != 2) {
            if (i == 3) {
                Fragment fragment = rVar.c;
                O90.e(fragment, "fragmentStateManager.fragment");
                View viewRequireView = fragment.requireView();
                O90.e(viewRequireView, "fragment.requireView()");
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(viewRequireView.findFocus());
                    viewRequireView.toString();
                    fragment.toString();
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        Fragment fragment2 = rVar.c;
        O90.e(fragment2, "fragmentStateManager.fragment");
        View viewFindFocus = fragment2.mView.findFocus();
        if (viewFindFocus != null) {
            fragment2.setFocusedView(viewFindFocus);
            if (Log.isLoggable("FragmentManager", 2)) {
                viewFindFocus.toString();
                fragment2.toString();
            }
        }
        View viewRequireView2 = this.c.requireView();
        O90.e(viewRequireView2, "this.fragment.requireView()");
        if (viewRequireView2.getParent() == null) {
            rVar.a();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
    }

    public final String toString() {
        StringBuilder sbQ = AbstractC8235ym.q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i = this.a;
        sbQ.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sbQ.append(" lifecycleImpact = ");
        int i2 = this.b;
        sbQ.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        sbQ.append(" fragment = ");
        sbQ.append(this.c);
        sbQ.append('}');
        return sbQ.toString();
    }
}
