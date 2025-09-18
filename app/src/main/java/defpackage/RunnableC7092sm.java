package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7092sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0212Cm b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ RunnableC7092sm(C0212Cm c0212Cm, ArrayList arrayList, int i) {
        this.a = i;
        this.b = c0212Cm;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1857Xo1 c1857Xo1;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                C0212Cm c0212Cm = this.b;
                C6329om c6329om = c0212Cm.g;
                try {
                    c0212Cm.I(arrayList);
                    return;
                } finally {
                    c6329om.b();
                }
            default:
                C0212Cm c0212Cm2 = this.b;
                ArrayList arrayList2 = this.c;
                c0212Cm2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    C8205yc c8205yc = (C8205yc) it.next();
                    if (c0212Cm2.a.h(c8205yc.a)) {
                        ((LinkedHashMap) c0212Cm2.a.a).remove(c8205yc.a);
                        arrayList3.add(c8205yc.a);
                        if (c8205yc.b == C3349dD0.class) {
                            z = true;
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                c0212Cm2.u("Use cases [" + TextUtils.join(", ", arrayList3) + "] now DETACHED for camera");
                if (z) {
                    c0212Cm2.g.g.e = null;
                }
                c0212Cm2.q();
                if (c0212Cm2.a.f().isEmpty()) {
                    c0212Cm2.g.k.c = false;
                } else {
                    c0212Cm2.M();
                }
                if (!c0212Cm2.a.e().isEmpty()) {
                    c0212Cm2.L();
                    c0212Cm2.E();
                    if (c0212Cm2.L == 9) {
                        c0212Cm2.C();
                        return;
                    }
                    return;
                }
                c0212Cm2.g.b();
                c0212Cm2.E();
                c0212Cm2.g.k(false);
                c0212Cm2.l = c0212Cm2.A();
                c0212Cm2.u("Closing camera.");
                switch (AbstractC8235ym.x(c0212Cm2.L)) {
                    case 3:
                        AbstractC3377dM1.i(c0212Cm2.j == null, null);
                        c0212Cm2.F(3);
                        return;
                    case 4:
                    default:
                        c0212Cm2.u("close() ignored due to being in state: ".concat(AbstractC8235ym.z(c0212Cm2.L)));
                        return;
                    case 5:
                    case 6:
                    case 7:
                        if (c0212Cm2.h.a() || ((c1857Xo1 = (C1857Xo1) c0212Cm2.K.a) != null && !((AtomicBoolean) c1857Xo1.c).get())) {
                            z = true;
                        }
                        c0212Cm2.K.q();
                        c0212Cm2.F(5);
                        if (z) {
                            AbstractC3377dM1.i(c0212Cm2.p.isEmpty(), null);
                            c0212Cm2.s();
                            return;
                        }
                        return;
                    case 8:
                    case 9:
                        c0212Cm2.F(5);
                        c0212Cm2.r();
                        return;
                }
        }
    }
}
