package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.bumptech.glide.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class B61 extends Fragment {
    public final E2 a;
    public final A61 b;
    public final HashSet c;
    public B61 d;
    public JR0 e;
    public Fragment f;

    public B61() {
        E2 e2 = new E2();
        this.b = new A61(0, this);
        this.c = new HashSet();
        this.a = e2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        o fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        try {
            s(getContext(), fragmentManager);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.a();
        B61 b61 = this.d;
        if (b61 != null) {
            b61.c.remove(this);
            this.d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f = null;
        B61 b61 = this.d;
        if (b61 != null) {
            b61.c.remove(this);
            this.d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        E2 e2 = this.a;
        e2.b = true;
        Iterator it = AbstractC0121Bh1.e(e2.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0747Ji0) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        E2 e2 = this.a;
        e2.b = false;
        Iterator it = AbstractC0121Bh1.e(e2.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0747Ji0) it.next()).onStop();
        }
    }

    public final Set r() {
        B61 b61 = this.d;
        if (b61 == null) {
            return Collections.emptySet();
        }
        if (equals(b61)) {
            return Collections.unmodifiableSet(this.c);
        }
        HashSet hashSet = new HashSet();
        for (B61 b612 : this.d.r()) {
            Fragment parentFragment = b612.getParentFragment();
            if (parentFragment == null) {
                parentFragment = b612.f;
            }
            Fragment parentFragment2 = getParentFragment();
            if (parentFragment2 == null) {
                parentFragment2 = this.f;
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

    public final void s(Context context, o oVar) {
        B61 b61 = this.d;
        if (b61 != null) {
            b61.c.remove(this);
            this.d = null;
        }
        B61 b61K = a.a(context).f.k(oVar, null);
        this.d = b61K;
        if (equals(b61K)) {
            return;
        }
        this.d.c.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
