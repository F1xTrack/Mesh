package p000;

import android.content.Context;
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class B61 extends Fragment {

    /* renamed from: a */
    public final C0255E2 f572a;

    /* renamed from: b */
    public final A61 f573b;

    /* renamed from: c */
    public final HashSet f574c;

    /* renamed from: d */
    public B61 f575d;

    /* renamed from: e */
    public JR0 f576e;

    /* renamed from: f */
    public Fragment f577f;

    public B61() {
        C0255E2 c0255e2 = new C0255E2();
        this.f573b = new A61(0, this);
        this.f574c = new HashSet();
        this.f572a = c0255e2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        AbstractC1733o fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        try {
            m498s(getContext(), fragmentManager);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f572a.m1986a();
        B61 b61 = this.f575d;
        if (b61 != null) {
            b61.f574c.remove(this);
            this.f575d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f577f = null;
        B61 b61 = this.f575d;
        if (b61 != null) {
            b61.f574c.remove(this);
            this.f575d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C0255E2 c0255e2 = this.f572a;
        c0255e2.f2355b = true;
        Iterator it = AbstractC7381Bh1.m806e(c0255e2.f2354a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7798Ji0) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C0255E2 c0255e2 = this.f572a;
        c0255e2.f2355b = false;
        Iterator it = AbstractC7381Bh1.m806e(c0255e2.f2354a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7798Ji0) it.next()).onStop();
        }
    }

    /* renamed from: r */
    public final Set m497r() {
        B61 b61 = this.f575d;
        if (b61 == null) {
            return Collections.emptySet();
        }
        if (equals(b61)) {
            return Collections.unmodifiableSet(this.f574c);
        }
        HashSet hashSet = new HashSet();
        for (B61 b612 : this.f575d.m497r()) {
            Fragment parentFragment = b612.getParentFragment();
            if (parentFragment == null) {
                parentFragment = b612.f577f;
            }
            Fragment parentFragment2 = getParentFragment();
            if (parentFragment2 == null) {
                parentFragment2 = this.f577f;
            }
            while (true) {
                Fragment parentFragment3 = parentFragment.getParentFragment();
                if (parentFragment3 == null) {
                    break;
                }
                if (parentFragment3.equals(parentFragment2)) {
                    hashSet.add(b612);
                    break;
                }
                parentFragment = parentFragment.getParentFragment();
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: s */
    public final void m498s(Context context, AbstractC1733o abstractC1733o) {
        B61 b61 = this.f575d;
        if (b61 != null) {
            b61.f574c.remove(this);
            this.f575d = null;
        }
        B61 b61M5686k = ComponentCallbacks2C1874a.m10883a(context).f17778f.m5686k(abstractC1733o, null);
        this.f575d = b61M5686k;
        if (equals(b61M5686k)) {
            return;
        }
        this.f575d.f574c.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f577f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
