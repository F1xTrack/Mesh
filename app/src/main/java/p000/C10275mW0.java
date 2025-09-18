package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.swmansion.rnscreens.bottomsheet.DimmingFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: mW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10275mW0 extends SV0 {

    /* renamed from: h */
    public final ArrayList f37743h;

    /* renamed from: i */
    public final HashSet f37744i;

    /* renamed from: j */
    public final ArrayList f37745j;

    /* renamed from: k */
    public ArrayList f37746k;

    /* renamed from: l */
    public InterfaceC10787qW0 f37747l;

    /* renamed from: m */
    public boolean f37748m;

    /* renamed from: n */
    public boolean f37749n;

    /* renamed from: o */
    public boolean f37750o;

    /* renamed from: p */
    public int f37751p;

    /* renamed from: q */
    public boolean f37752q;

    public C10275mW0(S91 s91) {
        super(s91);
        this.f37743h = new ArrayList();
        this.f37744i = new HashSet();
        this.f37745j = new ArrayList();
        this.f37746k = new ArrayList();
    }

    @Override // p000.SV0
    /* renamed from: a */
    public final InterfaceC9891jW0 mo7375a(RV0 rv0) {
        O90.m5968f(rv0, "screen");
        return AbstractC10147lW0.f37092a[rv0.getStackPresentation().ordinal()] == 1 ? new DimmingFragment(new C10659pW0(rv0)) : new C10659pW0(rv0);
    }

    @Override // p000.SV0
    /* renamed from: c */
    public final boolean mo7377c(InterfaceC9891jW0 interfaceC9891jW0) {
        return AbstractC7167xu.m25994v(this.f10815a, interfaceC9891jW0) && !AbstractC7167xu.m25994v(this.f37744i, interfaceC9891jW0);
    }

    @Override // p000.SV0
    /* renamed from: d */
    public final void mo7378d() {
        Iterator it = this.f37743h.iterator();
        while (it.hasNext()) {
            ((InterfaceC10787qW0) it.next()).mo13730l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        O90.m5968f(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f37746k.size() < this.f37751p) {
            this.f37750o = false;
        }
        this.f37751p = this.f37746k.size();
        if (this.f37750o && this.f37746k.size() >= 2) {
            Collections.swap(this.f37746k, r7.size() - 1, this.f37746k.size() - 2);
        }
        ArrayList arrayList = this.f37746k;
        this.f37746k = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10019kW0 c10019kW0 = (C10019kW0) it.next();
            C10275mW0 c10275mW0 = c10019kW0.f36521d;
            c10275mW0.getClass();
            Canvas canvas2 = c10019kW0.f36518a;
            O90.m5965c(canvas2);
            super.drawChild(canvas2, c10019kW0.f36519b, c10019kW0.f36520c);
            c10019kW0.f36518a = null;
            c10019kW0.f36519b = null;
            c10019kW0.f36520c = 0L;
            this.f37745j.add(c10019kW0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        O90.m5968f(canvas, "canvas");
        O90.m5968f(view, "child");
        ArrayList arrayList = this.f37746k;
        ArrayList arrayList2 = this.f37745j;
        C10019kW0 c10019kW0 = arrayList2.isEmpty() ? new C10019kW0(this) : (C10019kW0) arrayList2.remove(AbstractC7230yu.m26273d(arrayList2));
        c10019kW0.f36518a = canvas;
        c10019kW0.f36519b = view;
        c10019kW0.f36520c = j;
        arrayList.add(c10019kW0);
        return true;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        O90.m5968f(view, "view");
        super.endViewTransition(view);
        if (this.f37748m) {
            this.f37748m = false;
            m22833j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[PHI: r6 r7
  0x0042: PHI (r6v4 jW0) = (r6v3 jW0), (r6v3 jW0), (r6v5 jW0) binds: [B:5:0x0024, B:7:0x0030, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r7v3 jW0) = (r7v2 jW0), (r7v2 jW0), (r7v5 jW0) binds: [B:5:0x0024, B:7:0x0030, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027c A[LOOP:4: B:154:0x0276->B:156:0x027c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0297 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [qW0] */
    @Override // p000.SV0
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo7380f() {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10275mW0.mo7380f():void");
    }

    public final ArrayList<InterfaceC10787qW0> getFragments() {
        return this.f37743h;
    }

    public final boolean getGoingForward() {
        return this.f37752q;
    }

    public final RV0 getRootScreen() {
        Object next;
        RV0 rv0Mo13727h;
        Iterator it = this.f10815a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!AbstractC7167xu.m25994v(this.f37744i, (InterfaceC9891jW0) next)) {
                break;
            }
        }
        InterfaceC9891jW0 interfaceC9891jW0 = (InterfaceC9891jW0) next;
        if (interfaceC9891jW0 == null || (rv0Mo13727h = interfaceC9891jW0.mo13727h()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return rv0Mo13727h;
    }

    @Override // p000.SV0
    public RV0 getTopScreen() {
        InterfaceC10787qW0 interfaceC10787qW0 = this.f37747l;
        if (interfaceC10787qW0 != null) {
            return interfaceC10787qW0.mo13727h();
        }
        return null;
    }

    @Override // p000.SV0
    /* renamed from: h */
    public final void mo7382h() {
        this.f37744i.clear();
        super.mo7382h();
    }

    @Override // p000.SV0
    /* renamed from: i */
    public final void mo7383i(int i) {
        HashSet hashSet = this.f37744i;
        Object obj = this.f10815a.get(i);
        O90.m5967e(obj, "get(...)");
        AbstractC10036ke1.m22226a(hashSet).remove((InterfaceC9891jW0) obj);
        super.mo7383i(i);
    }

    /* renamed from: j */
    public final void m22833j() {
        int iM6094e = OZ1.m6094e(this);
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) context, getId());
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new C6846so(iM6094e, getId(), 26));
        }
    }

    @Override // p000.SV0, android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        O90.m5968f(view, "view");
        if (this.f37749n) {
            this.f37749n = false;
            this.f37750o = true;
        }
        super.removeView(view);
    }

    public final void setGoingForward(boolean z) {
        this.f37752q = z;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        O90.m5968f(view, "view");
        super.startViewTransition(view);
        this.f37748m = true;
    }
}
