package defpackage;

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
public final class C5900mW0 extends SV0 {
    public final ArrayList h;
    public final HashSet i;
    public final ArrayList j;
    public ArrayList k;
    public InterfaceC6664qW0 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;

    public C5900mW0(S91 s91) {
        super(s91);
        this.h = new ArrayList();
        this.i = new HashSet();
        this.j = new ArrayList();
        this.k = new ArrayList();
    }

    @Override // defpackage.SV0
    public final InterfaceC5327jW0 a(RV0 rv0) {
        O90.f(rv0, "screen");
        return AbstractC5709lW0.a[rv0.getStackPresentation().ordinal()] == 1 ? new DimmingFragment(new C6473pW0(rv0)) : new C6473pW0(rv0);
    }

    @Override // defpackage.SV0
    public final boolean c(InterfaceC5327jW0 interfaceC5327jW0) {
        return AbstractC8069xu.v(this.a, interfaceC5327jW0) && !AbstractC8069xu.v(this.i, interfaceC5327jW0);
    }

    @Override // defpackage.SV0
    public final void d() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((InterfaceC6664qW0) it.next()).l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        O90.f(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.k.size() < this.p) {
            this.o = false;
        }
        this.p = this.k.size();
        if (this.o && this.k.size() >= 2) {
            Collections.swap(this.k, r7.size() - 1, this.k.size() - 2);
        }
        ArrayList arrayList = this.k;
        this.k = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5518kW0 c5518kW0 = (C5518kW0) it.next();
            C5900mW0 c5900mW0 = c5518kW0.d;
            c5900mW0.getClass();
            Canvas canvas2 = c5518kW0.a;
            O90.c(canvas2);
            super.drawChild(canvas2, c5518kW0.b, c5518kW0.c);
            c5518kW0.a = null;
            c5518kW0.b = null;
            c5518kW0.c = 0L;
            this.j.add(c5518kW0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        O90.f(canvas, "canvas");
        O90.f(view, "child");
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        C5518kW0 c5518kW0 = arrayList2.isEmpty() ? new C5518kW0(this) : (C5518kW0) arrayList2.remove(AbstractC8259yu.d(arrayList2));
        c5518kW0.a = canvas;
        c5518kW0.b = view;
        c5518kW0.c = j;
        arrayList.add(c5518kW0);
        return true;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        O90.f(view, "view");
        super.endViewTransition(view);
        if (this.m) {
            this.m = false;
            j();
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
    @Override // defpackage.SV0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5900mW0.f():void");
    }

    public final ArrayList<InterfaceC6664qW0> getFragments() {
        return this.h;
    }

    public final boolean getGoingForward() {
        return this.q;
    }

    public final RV0 getRootScreen() {
        Object next;
        RV0 rv0H;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!AbstractC8069xu.v(this.i, (InterfaceC5327jW0) next)) {
                break;
            }
        }
        InterfaceC5327jW0 interfaceC5327jW0 = (InterfaceC5327jW0) next;
        if (interfaceC5327jW0 == null || (rv0H = interfaceC5327jW0.h()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return rv0H;
    }

    @Override // defpackage.SV0
    public RV0 getTopScreen() {
        InterfaceC6664qW0 interfaceC6664qW0 = this.l;
        if (interfaceC6664qW0 != null) {
            return interfaceC6664qW0.h();
        }
        return null;
    }

    @Override // defpackage.SV0
    public final void h() {
        this.i.clear();
        super.h();
    }

    @Override // defpackage.SV0
    public final void i(int i) {
        HashSet hashSet = this.i;
        Object obj = this.a.get(i);
        O90.e(obj, "get(...)");
        AbstractC5543ke1.a(hashSet).remove((InterfaceC5327jW0) obj);
        super.i(i);
    }

    public final void j() {
        int iE = OZ1.e(this);
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC7405uP interfaceC7405uPB = OZ1.b((ReactContext) context, getId());
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(new C7098so(iE, getId(), 26));
        }
    }

    @Override // defpackage.SV0, android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        O90.f(view, "view");
        if (this.n) {
            this.n = false;
            this.o = true;
        }
        super.removeView(view);
    }

    public final void setGoingForward(boolean z) {
        this.q = z;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        O90.f(view, "view");
        super.startViewTransition(view);
        this.m = true;
    }
}
