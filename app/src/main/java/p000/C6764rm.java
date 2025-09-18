package p000;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rm */
/* loaded from: classes.dex */
public final /* synthetic */ class C6764rm implements InterfaceC0363Fl {

    /* renamed from: a */
    public final /* synthetic */ int f41856a;

    /* renamed from: b */
    public final /* synthetic */ C0175Cm f41857b;

    public /* synthetic */ C6764rm(C0175Cm c0175Cm, int i) {
        this.f41856a = i;
        this.f41857b = c0175Cm;
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(final C0300El c0300El) {
        switch (this.f41856a) {
            case 0:
                C0175Cm c0175Cm = this.f41857b;
                c0175Cm.getClass();
                try {
                    ArrayList arrayList = new ArrayList(c0175Cm.f1622a.m25187d().m25912b().f46300c);
                    arrayList.add((C4139go) c0175Cm.f1610A.f11649f);
                    arrayList.add(new C7033vm(c0175Cm, c0300El));
                    c0175Cm.f1623b.f45796a.mo1070f1(c0175Cm.f1630i.f2885a, c0175Cm.f1624c, YQ1.m9297a(arrayList));
                    return "configAndCloseTask";
                } catch (SecurityException | C6448mn e) {
                    c0175Cm.m1347u("Unable to open camera for configAndClose: " + e.getMessage());
                    c0300El.m2377d(e);
                    return "configAndCloseTask";
                }
            case 1:
                final C0175Cm c0175Cm2 = this.f41857b;
                final int i = 1;
                c0175Cm2.f1624c.execute(new Runnable() { // from class: qm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8539Xo1 c8539Xo1;
                        switch (i) {
                            case 0:
                                C0175Cm c0175Cm3 = c0175Cm2;
                                C8128Pr0 c8128Pr0 = c0175Cm3.f1647z;
                                C0300El c0300El2 = c0300El;
                                if (c8128Pr0 != null) {
                                    c0300El2.m2375b(Boolean.valueOf(c0175Cm3.f1622a.m25190h(C0175Cm.m1312x(c8128Pr0))));
                                    break;
                                } else {
                                    c0300El2.m2375b(Boolean.FALSE);
                                    break;
                                }
                            default:
                                C0175Cm c0175Cm4 = c0175Cm2;
                                C0300El c0300El3 = c0300El;
                                if (c0175Cm4.f1635n == null) {
                                    if (c0175Cm4.f1621L != 1) {
                                        c0175Cm4.f1635n = AbstractC11797yQ1.m26149b(new C6764rm(c0175Cm4, 4));
                                    } else {
                                        c0175Cm4.f1635n = F70.f3069c;
                                    }
                                }
                                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = c0175Cm4.f1635n;
                                switch (AbstractC7222ym.m26247x(c0175Cm4.f1621L)) {
                                    case 1:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (!c0175Cm4.f1629h.m855a() && ((c8539Xo1 = (C8539Xo1) c0175Cm4.f1620K.f7362a) == null || ((AtomicBoolean) c8539Xo1.f13982c).get())) {
                                            z = false;
                                        }
                                        c0175Cm4.f1620K.m5449q();
                                        c0175Cm4.m1319F(2);
                                        if (z) {
                                            AbstractC9104dM1.m17550i(c0175Cm4.f1637p.isEmpty(), null);
                                            c0175Cm4.m1345s();
                                            break;
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                        AbstractC9104dM1.m17550i(c0175Cm4.f1631j == null, null);
                                        c0175Cm4.m1319F(2);
                                        AbstractC9104dM1.m17550i(c0175Cm4.f1637p.isEmpty(), null);
                                        c0175Cm4.m1345s();
                                        break;
                                    case 8:
                                    case 9:
                                        c0175Cm4.m1319F(2);
                                        c0175Cm4.m1344r();
                                        break;
                                    default:
                                        c0175Cm4.m1347u("release() ignored due to being in state: ".concat(AbstractC7222ym.m26249z(c0175Cm4.f1621L)));
                                        break;
                                }
                                AbstractC8301Sz1.m7490m(interfaceFutureC7800Jj0, c0300El3);
                                break;
                        }
                    }
                });
                return "Release[request=" + c0175Cm2.f1634m.getAndIncrement() + "]";
            case 2:
            default:
                C0175Cm c0175Cm3 = this.f41857b;
                AbstractC9104dM1.m17550i(c0175Cm3.f1636o == null, "Camera can only be released once, so release completer should be null on creation.");
                c0175Cm3.f1636o = c0300El;
                return "Release[camera=" + c0175Cm3 + "]";
            case 3:
                final C0175Cm c0175Cm4 = this.f41857b;
                c0175Cm4.getClass();
                try {
                    final int i2 = 0;
                    c0175Cm4.f1624c.execute(new Runnable() { // from class: qm
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8539Xo1 c8539Xo1;
                            switch (i2) {
                                case 0:
                                    C0175Cm c0175Cm32 = c0175Cm4;
                                    C8128Pr0 c8128Pr0 = c0175Cm32.f1647z;
                                    C0300El c0300El2 = c0300El;
                                    if (c8128Pr0 != null) {
                                        c0300El2.m2375b(Boolean.valueOf(c0175Cm32.f1622a.m25190h(C0175Cm.m1312x(c8128Pr0))));
                                        break;
                                    } else {
                                        c0300El2.m2375b(Boolean.FALSE);
                                        break;
                                    }
                                default:
                                    C0175Cm c0175Cm42 = c0175Cm4;
                                    C0300El c0300El3 = c0300El;
                                    if (c0175Cm42.f1635n == null) {
                                        if (c0175Cm42.f1621L != 1) {
                                            c0175Cm42.f1635n = AbstractC11797yQ1.m26149b(new C6764rm(c0175Cm42, 4));
                                        } else {
                                            c0175Cm42.f1635n = F70.f3069c;
                                        }
                                    }
                                    InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = c0175Cm42.f1635n;
                                    switch (AbstractC7222ym.m26247x(c0175Cm42.f1621L)) {
                                        case 1:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                            if (!c0175Cm42.f1629h.m855a() && ((c8539Xo1 = (C8539Xo1) c0175Cm42.f1620K.f7362a) == null || ((AtomicBoolean) c8539Xo1.f13982c).get())) {
                                                z = false;
                                            }
                                            c0175Cm42.f1620K.m5449q();
                                            c0175Cm42.m1319F(2);
                                            if (z) {
                                                AbstractC9104dM1.m17550i(c0175Cm42.f1637p.isEmpty(), null);
                                                c0175Cm42.m1345s();
                                                break;
                                            }
                                            break;
                                        case 2:
                                        case 3:
                                            AbstractC9104dM1.m17550i(c0175Cm42.f1631j == null, null);
                                            c0175Cm42.m1319F(2);
                                            AbstractC9104dM1.m17550i(c0175Cm42.f1637p.isEmpty(), null);
                                            c0175Cm42.m1345s();
                                            break;
                                        case 8:
                                        case 9:
                                            c0175Cm42.m1319F(2);
                                            c0175Cm42.m1344r();
                                            break;
                                        default:
                                            c0175Cm42.m1347u("release() ignored due to being in state: ".concat(AbstractC7222ym.m26249z(c0175Cm42.f1621L)));
                                            break;
                                    }
                                    AbstractC8301Sz1.m7490m(interfaceFutureC7800Jj0, c0300El3);
                                    break;
                            }
                        }
                    });
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    c0300El.m2377d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
        }
    }
}
