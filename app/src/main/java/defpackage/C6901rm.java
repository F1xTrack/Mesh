package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rm */
/* loaded from: classes.dex */
public final /* synthetic */ class C6901rm implements InterfaceC0443Fl {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0212Cm b;

    public /* synthetic */ C6901rm(C0212Cm c0212Cm, int i) {
        this.a = i;
        this.b = c0212Cm;
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(final C0365El c0365El) {
        switch (this.a) {
            case 0:
                C0212Cm c0212Cm = this.b;
                c0212Cm.getClass();
                try {
                    ArrayList arrayList = new ArrayList(c0212Cm.a.d().b().c);
                    arrayList.add((C4031go) c0212Cm.A.f);
                    arrayList.add(new C7665vm(c0212Cm, c0365El));
                    c0212Cm.b.a.f1(c0212Cm.i.a, c0212Cm.c, YQ1.a(arrayList));
                    return "configAndCloseTask";
                } catch (SecurityException | C5950mn e) {
                    c0212Cm.u("Unable to open camera for configAndClose: " + e.getMessage());
                    c0365El.d(e);
                    return "configAndCloseTask";
                }
            case 1:
                final C0212Cm c0212Cm2 = this.b;
                final int i = 1;
                c0212Cm2.c.execute(new Runnable() { // from class: qm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1857Xo1 c1857Xo1;
                        switch (i) {
                            case 0:
                                C0212Cm c0212Cm3 = c0212Cm2;
                                C1241Pr0 c1241Pr0 = c0212Cm3.z;
                                C0365El c0365El2 = c0365El;
                                if (c1241Pr0 != null) {
                                    c0365El2.b(Boolean.valueOf(c0212Cm3.a.h(C0212Cm.x(c1241Pr0))));
                                    break;
                                } else {
                                    c0365El2.b(Boolean.FALSE);
                                    break;
                                }
                            default:
                                C0212Cm c0212Cm4 = c0212Cm2;
                                C0365El c0365El3 = c0365El;
                                if (c0212Cm4.n == null) {
                                    if (c0212Cm4.L != 1) {
                                        c0212Cm4.n = AbstractC8171yQ1.b(new C6901rm(c0212Cm4, 4));
                                    } else {
                                        c0212Cm4.n = F70.c;
                                    }
                                }
                                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = c0212Cm4.n;
                                switch (AbstractC8235ym.x(c0212Cm4.L)) {
                                    case 1:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (!c0212Cm4.h.a() && ((c1857Xo1 = (C1857Xo1) c0212Cm4.K.a) == null || ((AtomicBoolean) c1857Xo1.c).get())) {
                                            z = false;
                                        }
                                        c0212Cm4.K.q();
                                        c0212Cm4.F(2);
                                        if (z) {
                                            AbstractC3377dM1.i(c0212Cm4.p.isEmpty(), null);
                                            c0212Cm4.s();
                                            break;
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                        AbstractC3377dM1.i(c0212Cm4.j == null, null);
                                        c0212Cm4.F(2);
                                        AbstractC3377dM1.i(c0212Cm4.p.isEmpty(), null);
                                        c0212Cm4.s();
                                        break;
                                    case 8:
                                    case 9:
                                        c0212Cm4.F(2);
                                        c0212Cm4.r();
                                        break;
                                    default:
                                        c0212Cm4.u("release() ignored due to being in state: ".concat(AbstractC8235ym.z(c0212Cm4.L)));
                                        break;
                                }
                                AbstractC1500Sz1.m(interfaceFutureC0750Jj0, c0365El3);
                                break;
                        }
                    }
                });
                return "Release[request=" + c0212Cm2.m.getAndIncrement() + "]";
            case 2:
            default:
                C0212Cm c0212Cm3 = this.b;
                AbstractC3377dM1.i(c0212Cm3.o == null, "Camera can only be released once, so release completer should be null on creation.");
                c0212Cm3.o = c0365El;
                return "Release[camera=" + c0212Cm3 + "]";
            case 3:
                final C0212Cm c0212Cm4 = this.b;
                c0212Cm4.getClass();
                try {
                    final int i2 = 0;
                    c0212Cm4.c.execute(new Runnable() { // from class: qm
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1857Xo1 c1857Xo1;
                            switch (i2) {
                                case 0:
                                    C0212Cm c0212Cm32 = c0212Cm4;
                                    C1241Pr0 c1241Pr0 = c0212Cm32.z;
                                    C0365El c0365El2 = c0365El;
                                    if (c1241Pr0 != null) {
                                        c0365El2.b(Boolean.valueOf(c0212Cm32.a.h(C0212Cm.x(c1241Pr0))));
                                        break;
                                    } else {
                                        c0365El2.b(Boolean.FALSE);
                                        break;
                                    }
                                default:
                                    C0212Cm c0212Cm42 = c0212Cm4;
                                    C0365El c0365El3 = c0365El;
                                    if (c0212Cm42.n == null) {
                                        if (c0212Cm42.L != 1) {
                                            c0212Cm42.n = AbstractC8171yQ1.b(new C6901rm(c0212Cm42, 4));
                                        } else {
                                            c0212Cm42.n = F70.c;
                                        }
                                    }
                                    InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = c0212Cm42.n;
                                    switch (AbstractC8235ym.x(c0212Cm42.L)) {
                                        case 1:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                            if (!c0212Cm42.h.a() && ((c1857Xo1 = (C1857Xo1) c0212Cm42.K.a) == null || ((AtomicBoolean) c1857Xo1.c).get())) {
                                                z = false;
                                            }
                                            c0212Cm42.K.q();
                                            c0212Cm42.F(2);
                                            if (z) {
                                                AbstractC3377dM1.i(c0212Cm42.p.isEmpty(), null);
                                                c0212Cm42.s();
                                                break;
                                            }
                                            break;
                                        case 2:
                                        case 3:
                                            AbstractC3377dM1.i(c0212Cm42.j == null, null);
                                            c0212Cm42.F(2);
                                            AbstractC3377dM1.i(c0212Cm42.p.isEmpty(), null);
                                            c0212Cm42.s();
                                            break;
                                        case 8:
                                        case 9:
                                            c0212Cm42.F(2);
                                            c0212Cm42.r();
                                            break;
                                        default:
                                            c0212Cm42.u("release() ignored due to being in state: ".concat(AbstractC8235ym.z(c0212Cm42.L)));
                                            break;
                                    }
                                    AbstractC1500Sz1.m(interfaceFutureC0750Jj0, c0365El3);
                                    break;
                            }
                        }
                    });
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    c0365El.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
        }
    }
}
