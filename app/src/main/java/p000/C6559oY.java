package p000;

import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: oY */
/* loaded from: classes.dex */
public final class C6559oY extends AbstractC4060fY {

    /* renamed from: f */
    public static final C6989v4 f39079f = C6989v4.m25319d();

    /* renamed from: a */
    public final WeakHashMap f39080a = new WeakHashMap();

    /* renamed from: b */
    public final C7564Ev0 f39081b;

    /* renamed from: c */
    public final C8619Zc1 f39082c;

    /* renamed from: d */
    public final C1329V7 f39083d;

    /* renamed from: e */
    public final C0979PY f39084e;

    public C6559oY(C7564Ev0 c7564Ev0, C8619Zc1 c8619Zc1, C1329V7 c1329v7, C0979PY c0979py) {
        this.f39081b = c7564Ev0;
        this.f39082c = c8619Zc1;
        this.f39083d = c1329v7;
        this.f39084e = c0979py;
    }

    @Override // p000.AbstractC4060fY
    public final void onFragmentPaused(AbstractC1733o abstractC1733o, Fragment fragment) {
        C11991zy0 c11991zy0;
        super.onFragmentPaused(abstractC1733o, fragment);
        Object[] objArr = {fragment.getClass().getSimpleName()};
        C6989v4 c6989v4 = f39079f;
        c6989v4.m25321b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.f39080a;
        if (!weakHashMap.containsKey(fragment)) {
            c6989v4.m25325g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        C0979PY c0979py = this.f39084e;
        boolean z = c0979py.f9129d;
        C6989v4 c6989v42 = C0979PY.f9125e;
        if (z) {
            HashMap map = c0979py.f9128c;
            if (map.containsKey(fragment)) {
                C0916OY c0916oy = (C0916OY) map.remove(fragment);
                C11991zy0 c11991zy0M6382a = c0979py.m6382a();
                if (c11991zy0M6382a.m26594b()) {
                    C0916OY c0916oy2 = (C0916OY) c11991zy0M6382a.m26593a();
                    c0916oy2.getClass();
                    c11991zy0 = new C11991zy0(new C0916OY(c0916oy2.f8478a - c0916oy.f8478a, c0916oy2.f8479b - c0916oy.f8479b, c0916oy2.f8480c - c0916oy.f8480c));
                } else {
                    c6989v42.m25321b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                    c11991zy0 = new C11991zy0();
                }
            } else {
                c6989v42.m25321b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
                c11991zy0 = new C11991zy0();
            }
        } else {
            c6989v42.m25320a();
            c11991zy0 = new C11991zy0();
        }
        if (!c11991zy0.m26594b()) {
            c6989v4.m25325g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            AbstractC11935zW0.m26445a(trace, (C0916OY) c11991zy0.m26593a());
            trace.stop();
        }
    }

    @Override // p000.AbstractC4060fY
    public final void onFragmentResumed(AbstractC1733o abstractC1733o, Fragment fragment) {
        super.onFragmentResumed(abstractC1733o, fragment);
        f39079f.m25321b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.f39082c, this.f39081b, this.f39083d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f39080a.put(fragment, trace);
        C0979PY c0979py = this.f39084e;
        boolean z = c0979py.f9129d;
        C6989v4 c6989v4 = C0979PY.f9125e;
        if (!z) {
            c6989v4.m25320a();
            return;
        }
        HashMap map = c0979py.f9128c;
        if (map.containsKey(fragment)) {
            c6989v4.m25321b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        C11991zy0 c11991zy0M6382a = c0979py.m6382a();
        if (c11991zy0M6382a.m26594b()) {
            map.put(fragment, (C0916OY) c11991zy0M6382a.m26593a());
        } else {
            c6989v4.m25321b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
