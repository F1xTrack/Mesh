package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sm */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6844sm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f42588a;

    /* renamed from: b */
    public final /* synthetic */ C0175Cm f42589b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f42590c;

    public /* synthetic */ RunnableC6844sm(C0175Cm c0175Cm, ArrayList arrayList, int i) {
        this.f42588a = i;
        this.f42589b = c0175Cm;
        this.f42590c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8539Xo1 c8539Xo1;
        switch (this.f42588a) {
            case 0:
                ArrayList arrayList = this.f42590c;
                C0175Cm c0175Cm = this.f42589b;
                C6573om c6573om = c0175Cm.f1628g;
                try {
                    c0175Cm.m1322I(arrayList);
                    return;
                } finally {
                    c6573om.m23544b();
                }
            default:
                C0175Cm c0175Cm2 = this.f42589b;
                ArrayList arrayList2 = this.f42590c;
                c0175Cm2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    C7212yc c7212yc = (C7212yc) it.next();
                    if (c0175Cm2.f1622a.m25190h(c7212yc.f46334a)) {
                        ((LinkedHashMap) c0175Cm2.f1622a.f43693a).remove(c7212yc.f46334a);
                        arrayList3.add(c7212yc.f46334a);
                        if (c7212yc.f46335b == C9085dD0.class) {
                            z = true;
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                c0175Cm2.m1347u("Use cases [" + TextUtils.join(", ", arrayList3) + "] now DETACHED for camera");
                if (z) {
                    c0175Cm2.f1628g.f39235g.f3778e = null;
                }
                c0175Cm2.m1343q();
                if (c0175Cm2.f1622a.m25189f().isEmpty()) {
                    c0175Cm2.f1628g.f39239k.f12792c = false;
                } else {
                    c0175Cm2.m1326M();
                }
                if (!c0175Cm2.f1622a.m25188e().isEmpty()) {
                    c0175Cm2.m1325L();
                    c0175Cm2.m1318E();
                    if (c0175Cm2.f1621L == 9) {
                        c0175Cm2.m1316C();
                        return;
                    }
                    return;
                }
                c0175Cm2.f1628g.m23544b();
                c0175Cm2.m1318E();
                c0175Cm2.f1628g.m23550k(false);
                c0175Cm2.f1633l = c0175Cm2.m1314A();
                c0175Cm2.m1347u("Closing camera.");
                switch (AbstractC7222ym.m26247x(c0175Cm2.f1621L)) {
                    case 3:
                        AbstractC9104dM1.m17550i(c0175Cm2.f1631j == null, null);
                        c0175Cm2.m1319F(3);
                        return;
                    case 4:
                    default:
                        c0175Cm2.m1347u("close() ignored due to being in state: ".concat(AbstractC7222ym.m26249z(c0175Cm2.f1621L)));
                        return;
                    case 5:
                    case 6:
                    case 7:
                        if (c0175Cm2.f1629h.m855a() || ((c8539Xo1 = (C8539Xo1) c0175Cm2.f1620K.f7362a) != null && !((AtomicBoolean) c8539Xo1.f13982c).get())) {
                            z = true;
                        }
                        c0175Cm2.f1620K.m5449q();
                        c0175Cm2.m1319F(5);
                        if (z) {
                            AbstractC9104dM1.m17550i(c0175Cm2.f1637p.isEmpty(), null);
                            c0175Cm2.m1345s();
                            return;
                        }
                        return;
                    case 8:
                    case 9:
                        c0175Cm2.m1319F(5);
                        c0175Cm2.m1344r();
                        return;
                }
        }
    }
}
