package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: lO */
/* loaded from: classes.dex */
public final /* synthetic */ class C6360lO implements InterfaceC0363Fl {

    /* renamed from: a */
    public final /* synthetic */ int f37028a;

    /* renamed from: b */
    public final /* synthetic */ C6549oO f37029b;

    public /* synthetic */ C6360lO(C6549oO c6549oO, int i) {
        this.f37028a = i;
        this.f37029b = c6549oO;
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public final Object mo411h0(final C0300El c0300El) {
        switch (this.f37028a) {
            case 0:
                final C6549oO c6549oO = this.f37029b;
                final int i = 0;
                c6549oO.f38983d.f42398h.execute(new Runnable() { // from class: mO
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                c0300El.m2375b(c6549oO.f38981b);
                                break;
                            default:
                                final C6549oO c6549oO2 = c6549oO;
                                EnumC6967uj enumC6967uj = c6549oO2.f38981b;
                                EnumC6967uj enumC6967uj2 = EnumC6967uj.f43809a;
                                C0300El c0300El2 = c0300El;
                                if (enumC6967uj != enumC6967uj2) {
                                    if (enumC6967uj != EnumC6967uj.f43810b) {
                                        c0300El2.m2377d(new IllegalStateException("Unknown state: " + c6549oO2.f38981b));
                                        break;
                                    } else {
                                        c0300El2.m2377d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    C6820sO c6820sO = c6549oO2.f38983d;
                                    final InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M24717a = c6820sO.m24717a();
                                    AbstractC8301Sz1.m7490m(interfaceFutureC7800Jj0M24717a, c0300El2);
                                    final int i2 = 0;
                                    c0300El2.m2374a(new Runnable() { // from class: nO
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i2) {
                                                case 0:
                                                    C6549oO c6549oO3 = c6549oO2;
                                                    c6549oO3.getClass();
                                                    InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = interfaceFutureC7800Jj0M24717a;
                                                    if (!interfaceFutureC7800Jj0.cancel(true)) {
                                                        AbstractC9104dM1.m17550i(interfaceFutureC7800Jj0.isDone(), null);
                                                        try {
                                                            ((C11506w80) interfaceFutureC7800Jj0.get()).m25564a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = c6549oO3.f38983d.f42391a;
                                                            e.toString();
                                                            AbstractC7806Jm0.m4412f(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    c6549oO2.f38982c.remove(interfaceFutureC7800Jj0M24717a);
                                                    break;
                                            }
                                        }
                                    }, QR1.m6703a());
                                    c6549oO2.f38982c.add(interfaceFutureC7800Jj0M24717a);
                                    final int i3 = 1;
                                    interfaceFutureC7800Jj0M24717a.mo2494d(new Runnable() { // from class: nO
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    C6549oO c6549oO3 = c6549oO2;
                                                    c6549oO3.getClass();
                                                    InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = interfaceFutureC7800Jj0M24717a;
                                                    if (!interfaceFutureC7800Jj0.cancel(true)) {
                                                        AbstractC9104dM1.m17550i(interfaceFutureC7800Jj0.isDone(), null);
                                                        try {
                                                            ((C11506w80) interfaceFutureC7800Jj0.get()).m25564a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = c6549oO3.f38983d.f42391a;
                                                            e.toString();
                                                            AbstractC7806Jm0.m4412f(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    c6549oO2.f38982c.remove(interfaceFutureC7800Jj0M24717a);
                                                    break;
                                            }
                                        }
                                    }, c6820sO.f42398h);
                                    break;
                                }
                        }
                    }
                });
                return "fetchData";
            default:
                final C6549oO c6549oO2 = this.f37029b;
                final int i2 = 1;
                c6549oO2.f38983d.f42398h.execute(new Runnable() { // from class: mO
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                c0300El.m2375b(c6549oO2.f38981b);
                                break;
                            default:
                                final C6549oO c6549oO22 = c6549oO2;
                                EnumC6967uj enumC6967uj = c6549oO22.f38981b;
                                EnumC6967uj enumC6967uj2 = EnumC6967uj.f43809a;
                                C0300El c0300El2 = c0300El;
                                if (enumC6967uj != enumC6967uj2) {
                                    if (enumC6967uj != EnumC6967uj.f43810b) {
                                        c0300El2.m2377d(new IllegalStateException("Unknown state: " + c6549oO22.f38981b));
                                        break;
                                    } else {
                                        c0300El2.m2377d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    C6820sO c6820sO = c6549oO22.f38983d;
                                    final InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M24717a = c6820sO.m24717a();
                                    AbstractC8301Sz1.m7490m(interfaceFutureC7800Jj0M24717a, c0300El2);
                                    final int i22 = 0;
                                    c0300El2.m2374a(new Runnable() { // from class: nO
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    C6549oO c6549oO3 = c6549oO22;
                                                    c6549oO3.getClass();
                                                    InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = interfaceFutureC7800Jj0M24717a;
                                                    if (!interfaceFutureC7800Jj0.cancel(true)) {
                                                        AbstractC9104dM1.m17550i(interfaceFutureC7800Jj0.isDone(), null);
                                                        try {
                                                            ((C11506w80) interfaceFutureC7800Jj0.get()).m25564a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = c6549oO3.f38983d.f42391a;
                                                            e.toString();
                                                            AbstractC7806Jm0.m4412f(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    c6549oO22.f38982c.remove(interfaceFutureC7800Jj0M24717a);
                                                    break;
                                            }
                                        }
                                    }, QR1.m6703a());
                                    c6549oO22.f38982c.add(interfaceFutureC7800Jj0M24717a);
                                    final int i3 = 1;
                                    interfaceFutureC7800Jj0M24717a.mo2494d(new Runnable() { // from class: nO
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    C6549oO c6549oO3 = c6549oO22;
                                                    c6549oO3.getClass();
                                                    InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = interfaceFutureC7800Jj0M24717a;
                                                    if (!interfaceFutureC7800Jj0.cancel(true)) {
                                                        AbstractC9104dM1.m17550i(interfaceFutureC7800Jj0.isDone(), null);
                                                        try {
                                                            ((C11506w80) interfaceFutureC7800Jj0.get()).m25564a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = c6549oO3.f38983d.f42391a;
                                                            e.toString();
                                                            AbstractC7806Jm0.m4412f(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    c6549oO22.f38982c.remove(interfaceFutureC7800Jj0M24717a);
                                                    break;
                                            }
                                        }
                                    }, c6820sO.f42398h);
                                    break;
                                }
                        }
                    }
                });
                return "acquireBuffer";
        }
    }
}
