package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* renamed from: c60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8938c60 implements InterfaceC11558wY0 {

    /* renamed from: a */
    public final /* synthetic */ int f17303a;

    /* renamed from: b */
    public final /* synthetic */ Object f17304b;

    public /* synthetic */ C8938c60(int i, Object obj) {
        this.f17303a = i;
        this.f17304b = obj;
    }

    @Override // p000.InterfaceC11558wY0
    /* renamed from: a */
    public final void mo10586a(C11812yY0 c11812yY0) {
        Object obj = this.f17304b;
        switch (this.f17303a) {
            case 0:
                C9711i60 c9711i60 = (C9711i60) obj;
                if (c9711i60.m18274d() == null) {
                    return;
                }
                DV1.m1716a();
                C11431vY0 c11431vY0 = c9711i60.f28825t;
                if (c11431vY0 != null) {
                    c11431vY0.m25443b();
                    c9711i60.f28825t = null;
                }
                G70 g70 = c9711i60.f28824s;
                if (g70 != null) {
                    g70.mo6573a();
                    c9711i60.f28824s = null;
                }
                c9711i60.f28820o.mo22358c();
                c9711i60.m18276f();
                C10351n60 c10351n60 = (C10351n60) c9711i60.f27337f;
                C0419Ge c0419Ge = c9711i60.f27338g;
                c0419Ge.getClass();
                C11303uY0 c11303uY0M18968F = c9711i60.m18968F(c10351n60, c0419Ge);
                c9711i60.f28823r = c11303uY0M18968F;
                Object[] objArr = {c11303uY0M18968F.m25206d()};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                c9711i60.m18270E(Collections.unmodifiableList(arrayList));
                c9711i60.m18284q();
                return;
            case 1:
                C11247u60 c11247u60 = (C11247u60) obj;
                if (c11247u60.m18274d() == null) {
                    return;
                }
                C11507w81 c11507w81 = c11247u60.f43522w;
                c11507w81.getClass();
                DV1.m1716a();
                c11507w81.f44697f = true;
                WR0 wr0 = c11507w81.f44695d;
                if (wr0 != null) {
                    DV1.m1716a();
                    if (!wr0.f13182d.f4484b.isDone()) {
                        C11502w60 c11502w60 = new C11502w60("The request is aborted silently and retried.", null);
                        DV1.m1716a();
                        wr0.f13185g = true;
                        RunnableC3953dr runnableC3953dr = wr0.f13187i;
                        Objects.requireNonNull(runnableC3953dr);
                        runnableC3953dr.cancel(true);
                        wr0.f13183e.m2377d(c11502w60);
                        wr0.f13184f.m2375b(null);
                        C1110Re c1110Re = wr0.f13179a;
                        C11507w81 c11507w812 = wr0.f13180b;
                        c11507w812.getClass();
                        DV1.m1716a();
                        AbstractC7806Jm0.m4412f("TakePictureManagerImpl");
                        c11507w812.f44692a.addFirst(c1110Re);
                        c11507w812.m25567c();
                    }
                }
                c11247u60.m25110F(true);
                String strM18276f = c11247u60.m18276f();
                C11375v60 c11375v60 = (C11375v60) c11247u60.f27337f;
                C0419Ge c0419Ge2 = c11247u60.f27338g;
                c0419Ge2.getClass();
                C11303uY0 c11303uY0M25111G = c11247u60.m25111G(strM18276f, c11375v60, c0419Ge2);
                c11247u60.f43520u = c11303uY0M25111G;
                Object[] objArr2 = {c11303uY0M25111G.m25206d()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj3 = objArr2[0];
                Objects.requireNonNull(obj3);
                arrayList2.add(obj3);
                c11247u60.m18270E(Collections.unmodifiableList(arrayList2));
                c11247u60.m18284q();
                C11507w81 c11507w813 = c11247u60.f43522w;
                c11507w813.getClass();
                DV1.m1716a();
                c11507w813.f44697f = false;
                c11507w813.m25567c();
                return;
            case 2:
                C8128Pr0 c8128Pr0 = (C8128Pr0) obj;
                c8128Pr0.f9304b = c8128Pr0.m6451n();
                C6764rm c6764rm = (C6764rm) c8128Pr0.f9307e;
                if (c6764rm != null) {
                    C0175Cm c0175Cm = c6764rm.f41857b;
                    c0175Cm.getClass();
                    try {
                        if (((Boolean) AbstractC11797yQ1.m26149b(new C6764rm(c0175Cm, 3)).f4484b.get()).booleanValue()) {
                            C8128Pr0 c8128Pr02 = c0175Cm.f1647z;
                            c0175Cm.f1624c.execute(new RunnableC6970um(c0175Cm, C0175Cm.m1312x(c8128Pr02), (C11812yY0) c8128Pr02.f9304b, (C8076Or0) c8128Pr02.f9305c, null, Collections.singletonList(EnumC10170lh1.f37256f), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                }
                return;
            case 3:
                C9085dD0 c9085dD0 = (C9085dD0) obj;
                if (c9085dD0.m18274d() == null) {
                    return;
                }
                c9085dD0.m17507I((C9213eD0) c9085dD0.f27337f, c9085dD0.f27338g);
                c9085dD0.m18284q();
                return;
            case 4:
                Iterator it = ((C11685xY0) obj).f45676m.iterator();
                while (it.hasNext()) {
                    ((InterfaceC11558wY0) it.next()).mo10586a(c11812yY0);
                }
                return;
            default:
                ((C8215Ri1) obj).m7099N();
                return;
        }
    }
}
