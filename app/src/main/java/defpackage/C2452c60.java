package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* renamed from: c60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2452c60 implements InterfaceC7814wY0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2452c60(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC7814wY0
    public final void a(C8194yY0 c8194yY0) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                C4282i60 c4282i60 = (C4282i60) obj;
                if (c4282i60.d() == null) {
                    return;
                }
                DV1.a();
                C7624vY0 c7624vY0 = c4282i60.t;
                if (c7624vY0 != null) {
                    c7624vY0.b();
                    c4282i60.t = null;
                }
                G70 g70 = c4282i60.s;
                if (g70 != null) {
                    g70.a();
                    c4282i60.s = null;
                }
                c4282i60.o.c();
                c4282i60.f();
                C6013n60 c6013n60 = (C6013n60) c4282i60.f;
                C0500Ge c0500Ge = c4282i60.g;
                c0500Ge.getClass();
                C7433uY0 c7433uY0F = c4282i60.F(c6013n60, c0500Ge);
                c4282i60.r = c7433uY0F;
                Object[] objArr = {c7433uY0F.d()};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                c4282i60.E(Collections.unmodifiableList(arrayList));
                c4282i60.q();
                return;
            case 1:
                C7349u60 c7349u60 = (C7349u60) obj;
                if (c7349u60.d() == null) {
                    return;
                }
                C7737w81 c7737w81 = c7349u60.w;
                c7737w81.getClass();
                DV1.a();
                c7737w81.f = true;
                WR0 wr0 = c7737w81.d;
                if (wr0 != null) {
                    DV1.a();
                    if (!wr0.d.b.isDone()) {
                        C7730w60 c7730w60 = new C7730w60("The request is aborted silently and retried.", null);
                        DV1.a();
                        wr0.g = true;
                        RunnableC3467dr runnableC3467dr = wr0.i;
                        Objects.requireNonNull(runnableC3467dr);
                        runnableC3467dr.cancel(true);
                        wr0.e.d(c7730w60);
                        wr0.f.b(null);
                        C1357Re c1357Re = wr0.a;
                        C7737w81 c7737w812 = wr0.b;
                        c7737w812.getClass();
                        DV1.a();
                        AbstractC0759Jm0.f("TakePictureManagerImpl");
                        c7737w812.a.addFirst(c1357Re);
                        c7737w812.c();
                    }
                }
                c7349u60.F(true);
                String strF = c7349u60.f();
                C7540v60 c7540v60 = (C7540v60) c7349u60.f;
                C0500Ge c0500Ge2 = c7349u60.g;
                c0500Ge2.getClass();
                C7433uY0 c7433uY0G = c7349u60.G(strF, c7540v60, c0500Ge2);
                c7349u60.u = c7433uY0G;
                Object[] objArr2 = {c7433uY0G.d()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj3 = objArr2[0];
                Objects.requireNonNull(obj3);
                arrayList2.add(obj3);
                c7349u60.E(Collections.unmodifiableList(arrayList2));
                c7349u60.q();
                C7737w81 c7737w813 = c7349u60.w;
                c7737w813.getClass();
                DV1.a();
                c7737w813.f = false;
                c7737w813.c();
                return;
            case 2:
                C1241Pr0 c1241Pr0 = (C1241Pr0) obj;
                c1241Pr0.b = c1241Pr0.n();
                C6901rm c6901rm = (C6901rm) c1241Pr0.e;
                if (c6901rm != null) {
                    C0212Cm c0212Cm = c6901rm.b;
                    c0212Cm.getClass();
                    try {
                        if (((Boolean) AbstractC8171yQ1.b(new C6901rm(c0212Cm, 3)).b.get()).booleanValue()) {
                            C1241Pr0 c1241Pr02 = c0212Cm.z;
                            c0212Cm.c.execute(new RunnableC7474um(c0212Cm, C0212Cm.x(c1241Pr02), (C8194yY0) c1241Pr02.b, (C1163Or0) c1241Pr02.c, null, Collections.singletonList(EnumC5743lh1.f), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                }
                return;
            case 3:
                C3349dD0 c3349dD0 = (C3349dD0) obj;
                if (c3349dD0.d() == null) {
                    return;
                }
                c3349dD0.I((C3539eD0) c3349dD0.f, c3349dD0.g);
                c3349dD0.q();
                return;
            case 4:
                Iterator it = ((C8004xY0) obj).m.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7814wY0) it.next()).a(c8194yY0);
                }
                return;
            default:
                ((C1371Ri1) obj).N();
                return;
        }
    }
}
