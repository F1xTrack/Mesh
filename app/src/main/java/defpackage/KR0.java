package defpackage;

import android.app.Activity;
import android.app.Fragment;
import com.bumptech.glide.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class KR0 extends Fragment {
    public final E2 a;
    public final C6446pN0 b;
    public final HashSet c;
    public JR0 d;
    public KR0 e;
    public Fragment f;

    public KR0() {
        E2 e2 = new E2();
        this.b = new C6446pN0(2, this);
        this.c = new HashSet();
        this.a = e2;
    }

    public final Set a() {
        if (equals(this.e)) {
            return Collections.unmodifiableSet(this.c);
        }
        if (this.e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (KR0 kr0 : this.e.a()) {
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

    public final void b(Activity activity) {
        KR0 kr0 = this.e;
        if (kr0 != null) {
            kr0.c.remove(this);
            this.e = null;
        }
        NR0 nr0 = a.a(activity).f;
        nr0.getClass();
        KR0 kr0J = nr0.j(activity.getFragmentManager(), null);
        this.e = kr0J;
        if (equals(kr0J)) {
            return;
        }
        this.e.c.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            b(activity);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.a();
        KR0 kr0 = this.e;
        if (kr0 != null) {
            kr0.c.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        KR0 kr0 = this.e;
        if (kr0 != null) {
            kr0.c.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        E2 e2 = this.a;
        e2.b = true;
        Iterator it = AbstractC0121Bh1.e(e2.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0747Ji0) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        E2 e2 = this.a;
        e2.b = false;
        Iterator it = AbstractC0121Bh1.e(e2.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0747Ji0) it.next()).onStop();
        }
    }

    @Override // android.app.Fragment
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
