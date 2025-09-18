package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: oY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6287oY extends AbstractC3792fY {
    public static final C7533v4 f = C7533v4.d();
    public final WeakHashMap a = new WeakHashMap();
    public final C0396Ev0 b;
    public final C1977Zc1 c;
    public final V7 d;
    public final PY e;

    public C6287oY(C0396Ev0 c0396Ev0, C1977Zc1 c1977Zc1, V7 v7, PY py) {
        this.b = c0396Ev0;
        this.c = c1977Zc1;
        this.d = v7;
        this.e = py;
    }

    @Override // defpackage.AbstractC3792fY
    public final void onFragmentPaused(o oVar, Fragment fragment) {
        C8462zy0 c8462zy0;
        super.onFragmentPaused(oVar, fragment);
        Object[] objArr = {fragment.getClass().getSimpleName()};
        C7533v4 c7533v4 = f;
        c7533v4.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.a;
        if (!weakHashMap.containsKey(fragment)) {
            c7533v4.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        PY py = this.e;
        boolean z = py.d;
        C7533v4 c7533v42 = PY.e;
        if (z) {
            HashMap map = py.c;
            if (map.containsKey(fragment)) {
                OY oy = (OY) map.remove(fragment);
                C8462zy0 c8462zy0A = py.a();
                if (c8462zy0A.b()) {
                    OY oy2 = (OY) c8462zy0A.a();
                    oy2.getClass();
                    c8462zy0 = new C8462zy0(new OY(oy2.a - oy.a, oy2.b - oy.b, oy2.c - oy.c));
                } else {
                    c7533v42.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                    c8462zy0 = new C8462zy0();
                }
            } else {
                c7533v42.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
                c8462zy0 = new C8462zy0();
            }
        } else {
            c7533v42.a();
            c8462zy0 = new C8462zy0();
        }
        if (!c8462zy0.b()) {
            c7533v4.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            AbstractC8378zW0.a(trace, (OY) c8462zy0.a());
            trace.stop();
        }
    }

    @Override // defpackage.AbstractC3792fY
    public final void onFragmentResumed(o oVar, Fragment fragment) {
        super.onFragmentResumed(oVar, fragment);
        f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.c, this.b, this.d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.a.put(fragment, trace);
        PY py = this.e;
        boolean z = py.d;
        C7533v4 c7533v4 = PY.e;
        if (!z) {
            c7533v4.a();
            return;
        }
        HashMap map = py.c;
        if (map.containsKey(fragment)) {
            c7533v4.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        C8462zy0 c8462zy0A = py.a();
        if (c8462zy0A.b()) {
            map.put(fragment, (OY) c8462zy0A.a());
        } else {
            c7533v4.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
