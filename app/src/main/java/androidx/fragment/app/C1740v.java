package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import p000.AbstractC0852NX;
import p000.AbstractC7167xu;
import p000.AbstractC7222ym;
import p000.C0744Lp;
import p000.C8450Vw0;
import p000.O90;

/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public final class C1740v {

    /* renamed from: a */
    public int f16277a;

    /* renamed from: b */
    public int f16278b;

    /* renamed from: c */
    public final Fragment f16279c;

    /* renamed from: d */
    public final ArrayList f16280d;

    /* renamed from: e */
    public final LinkedHashSet f16281e;

    /* renamed from: f */
    public boolean f16282f;

    /* renamed from: g */
    public boolean f16283g;

    /* renamed from: h */
    public final C1736r f16284h;

    public C1740v(int i, int i2, C1736r c1736r, C0744Lp c0744Lp) {
        AbstractC0852NX.m5764m(i, "finalState");
        AbstractC0852NX.m5764m(i2, "lifecycleImpact");
        O90.m5968f(c1736r, "fragmentStateManager");
        Fragment fragment = c1736r.f16262c;
        O90.m5967e(fragment, "fragmentStateManager.fragment");
        AbstractC0852NX.m5764m(i, "finalState");
        AbstractC0852NX.m5764m(i2, "lifecycleImpact");
        O90.m5968f(fragment, "fragment");
        this.f16277a = i;
        this.f16278b = i2;
        this.f16279c = fragment;
        this.f16280d = new ArrayList();
        this.f16281e = new LinkedHashSet();
        c0744Lp.m5111c(new C8450Vw0(16, this));
        this.f16284h = c1736r;
    }

    /* renamed from: a */
    public final void m10118a() {
        if (this.f16282f) {
            return;
        }
        this.f16282f = true;
        LinkedHashSet linkedHashSet = this.f16281e;
        if (linkedHashSet.isEmpty()) {
            m10119b();
            return;
        }
        Iterator it = AbstractC7167xu.m25986f0(linkedHashSet).iterator();
        while (it.hasNext()) {
            ((C0744Lp) it.next()).m5109a();
        }
    }

    /* renamed from: b */
    public final void m10119b() {
        if (!this.f16283g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f16283g = true;
            Iterator it = this.f16280d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f16284h.m10102i();
    }

    /* renamed from: c */
    public final void m10120c(int i, int i2) {
        AbstractC0852NX.m5764m(i, "finalState");
        AbstractC0852NX.m5764m(i2, "lifecycleImpact");
        int iM26247x = AbstractC7222ym.m26247x(i2);
        Fragment fragment = this.f16279c;
        if (iM26247x == 0) {
            if (this.f16277a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(fragment);
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        throw null;
                    }
                }
                this.f16277a = i;
                return;
            }
            return;
        }
        if (iM26247x != 1) {
            if (iM26247x != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(fragment);
            }
            this.f16277a = 1;
            this.f16278b = 3;
            return;
        }
        if (this.f16277a == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(fragment);
            }
            this.f16277a = 2;
            this.f16278b = 2;
        }
    }

    /* renamed from: d */
    public final void m10121d() {
        int i = this.f16278b;
        C1736r c1736r = this.f16284h;
        if (i != 2) {
            if (i == 3) {
                Fragment fragment = c1736r.f16262c;
                O90.m5967e(fragment, "fragmentStateManager.fragment");
                View viewRequireView = fragment.requireView();
                O90.m5967e(viewRequireView, "fragment.requireView()");
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
        Fragment fragment2 = c1736r.f16262c;
        O90.m5967e(fragment2, "fragmentStateManager.fragment");
        View viewFindFocus = fragment2.mView.findFocus();
        if (viewFindFocus != null) {
            fragment2.setFocusedView(viewFindFocus);
            if (Log.isLoggable("FragmentManager", 2)) {
                viewFindFocus.toString();
                fragment2.toString();
            }
        }
        View viewRequireView2 = this.f16279c.requireView();
        O90.m5967e(viewRequireView2, "this.fragment.requireView()");
        if (viewRequireView2.getParent() == null) {
            c1736r.m10094a();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
    }

    public final String toString() {
        StringBuilder sbM26240q = AbstractC7222ym.m26240q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i = this.f16277a;
        sbM26240q.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sbM26240q.append(" lifecycleImpact = ");
        int i2 = this.f16278b;
        sbM26240q.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        sbM26240q.append(" fragment = ");
        sbM26240q.append(this.f16279c);
        sbM26240q.append('}');
        return sbM26240q.toString();
    }
}
