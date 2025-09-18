package p000;

import android.app.Activity;
import android.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class KR0 extends Fragment {

    /* renamed from: a */
    public final C0255E2 f6105a;

    /* renamed from: b */
    public final C10641pN0 f6106b;

    /* renamed from: c */
    public final HashSet f6107c;

    /* renamed from: d */
    public JR0 f6108d;

    /* renamed from: e */
    public KR0 f6109e;

    /* renamed from: f */
    public Fragment f6110f;

    public KR0() {
        C0255E2 c0255e2 = new C0255E2();
        this.f6106b = new C10641pN0(2, this);
        this.f6107c = new HashSet();
        this.f6105a = c0255e2;
    }

    /* renamed from: a */
    public final Set m4643a() {
        if (equals(this.f6109e)) {
            return Collections.unmodifiableSet(this.f6107c);
        }
        if (this.f6109e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (KR0 kr0 : this.f6109e.m4643a()) {
            Fragment parentFragment = kr0.getParentFragment();
            Fragment parentFragment2 = getParentFragment();
            while (true) {
                Fragment parentFragment3 = parentFragment.getParentFragment();
                if (parentFragment3 == null) {
                    break;
                }
                if (parentFragment3.equals(parentFragment2)) {
                    hashSet.add(kr0);
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: b */
    public final void m4644b(Activity activity) {
        KR0 kr0 = this.f6109e;
        if (kr0 != null) {
            kr0.f6107c.remove(this);
            this.f6109e = null;
        }
        NR0 nr0 = ComponentCallbacks2C1874a.m10883a(activity).f17778f;
        nr0.getClass();
        KR0 kr0M5685j = nr0.m5685j(activity.getFragmentManager(), null);
        this.f6109e = kr0M5685j;
        if (equals(kr0M5685j)) {
            return;
        }
        this.f6109e.f6107c.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m4644b(activity);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f6105a.m1986a();
        KR0 kr0 = this.f6109e;
        if (kr0 != null) {
            kr0.f6107c.remove(this);
            this.f6109e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        KR0 kr0 = this.f6109e;
        if (kr0 != null) {
            kr0.f6107c.remove(this);
            this.f6109e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0255E2 c0255e2 = this.f6105a;
        c0255e2.f2355b = true;
        Iterator it = AbstractC7381Bh1.m806e(c0255e2.f2354a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7798Ji0) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        C0255E2 c0255e2 = this.f6105a;
        c0255e2.f2355b = false;
        Iterator it = AbstractC7381Bh1.m806e(c0255e2.f2354a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7798Ji0) it.next()).onStop();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f6110f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
