package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: lO */
/* loaded from: classes.dex */
public final /* synthetic */ class C5684lO implements InterfaceC0443Fl {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6257oO b;

    public /* synthetic */ C5684lO(C6257oO c6257oO, int i) {
        this.a = i;
        this.b = c6257oO;
    }

    @Override // defpackage.InterfaceC0443Fl
    public final Object h0(final C0365El c0365El) {
        switch (this.a) {
            case 0:
                final C6257oO c6257oO = this.b;
                final int i = 0;
                c6257oO.d.h.execute(new Runnable() { // from class: mO
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                c0365El.b(c6257oO.b);
                                break;
                            default:
                                final C6257oO c6257oO2 = c6257oO;
                                EnumC7465uj enumC7465uj = c6257oO2.b;
                                EnumC7465uj enumC7465uj2 = EnumC7465uj.a;
                                C0365El c0365El2 = c0365El;
                                if (enumC7465uj != enumC7465uj2) {
                                    if (enumC7465uj != EnumC7465uj.b) {
                                        c0365El2.d(new IllegalStateException("Unknown state: " + c6257oO2.b));
                                        break;
                                    } else {
                                        c0365El2.d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    C7020sO c7020sO = c6257oO2.d;
                                    final InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0A = c7020sO.a();
                                    AbstractC1500Sz1.m(interfaceFutureC0750Jj0A, c0365El2);
                                    final int i2 = 0;
                                    c0365El2.a(new Runnable() { // from class: nO
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i2) {
                                                case 0:
                                                    C6257oO c6257oO3 = c6257oO2;
                                                    c6257oO3.getClass();
                                                    InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = interfaceFutureC0750Jj0A;
                                                    if (!interfaceFutureC0750Jj0.cancel(true)) {
                                                        AbstractC3377dM1.i(interfaceFutureC0750Jj0.isDone(), null);
                                                        try {
                                                            ((C7736w80) interfaceFutureC0750Jj0.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = c6257oO3.d.a;
                                                            e.toString();
                                                            AbstractC0759Jm0.f(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    c6257oO2.c.remove(interfaceFutureC0750Jj0A);
                                                    break;
                                            }
                                        }
                                    }, QR1.a());
                                    c6257oO2.c.add(interfaceFutureC0750Jj0A);
                                    final int i3 = 1;
                                    interfaceFutureC0750Jj0A.d(new Runnable() { // from class: nO
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    C6257oO c6257oO3 = c6257oO2;
                                                    c6257oO3.getClass();
                                                    InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = interfaceFutureC0750Jj0A;
                                                    if (!interfaceFutureC0750Jj0.cancel(true)) {
                                                        AbstractC3377dM1.i(interfaceFutureC0750Jj0.isDone(), null);
                                                        try {
                                                            ((C7736w80) interfaceFutureC0750Jj0.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = c6257oO3.d.a;
                                                            e.toString();
                                                            AbstractC0759Jm0.f(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    c6257oO2.c.remove(interfaceFutureC0750Jj0A);
                                                    break;
                                            }
                                        }
                                    }, c7020sO.h);
                                    break;
                                }
                        }
                    }
                });
                return "fetchData";
            default:
                final C6257oO c6257oO2 = this.b;
                final int i2 = 1;
                c6257oO2.d.h.execute(new Runnable() { // from class: mO
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                c0365El.b(c6257oO2.b);
                                break;
                            default:
                                final C6257oO c6257oO22 = c6257oO2;
                                EnumC7465uj enumC7465uj = c6257oO22.b;
                                EnumC7465uj enumC7465uj2 = EnumC7465uj.a;
                                C0365El c0365El2 = c0365El;
                                if (enumC7465uj != enumC7465uj2) {
                                    if (enumC7465uj != EnumC7465uj.b) {
                                        c0365El2.d(new IllegalStateException("Unknown state: " + c6257oO22.b));
                                        break;
                                    } else {
                                        c0365El2.d(new IllegalStateException("BufferProvider is not active."));
                                        break;
                                    }
                                } else {
                                    C7020sO c7020sO = c6257oO22.d;
                                    final InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0A = c7020sO.a();
                                    AbstractC1500Sz1.m(interfaceFutureC0750Jj0A, c0365El2);
                                    final int i22 = 0;
                                    c0365El2.a(new Runnable() { // from class: nO
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    C6257oO c6257oO3 = c6257oO22;
                                                    c6257oO3.getClass();
                                                    InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = interfaceFutureC0750Jj0A;
                                                    if (!interfaceFutureC0750Jj0.cancel(true)) {
                                                        AbstractC3377dM1.i(interfaceFutureC0750Jj0.isDone(), null);
                                                        try {
                                                            ((C7736w80) interfaceFutureC0750Jj0.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = c6257oO3.d.a;
                                                            e.toString();
                                                            AbstractC0759Jm0.f(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    c6257oO22.c.remove(interfaceFutureC0750Jj0A);
                                                    break;
                                            }
                                        }
                                    }, QR1.a());
                                    c6257oO22.c.add(interfaceFutureC0750Jj0A);
                                    final int i3 = 1;
                                    interfaceFutureC0750Jj0A.d(new Runnable() { // from class: nO
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    C6257oO c6257oO3 = c6257oO22;
                                                    c6257oO3.getClass();
                                                    InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = interfaceFutureC0750Jj0A;
                                                    if (!interfaceFutureC0750Jj0.cancel(true)) {
                                                        AbstractC3377dM1.i(interfaceFutureC0750Jj0.isDone(), null);
                                                        try {
                                                            ((C7736w80) interfaceFutureC0750Jj0.get()).a();
                                                            break;
                                                        } catch (InterruptedException | CancellationException | ExecutionException e) {
                                                            String str = c6257oO3.d.a;
                                                            e.toString();
                                                            AbstractC0759Jm0.f(str);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    c6257oO22.c.remove(interfaceFutureC0750Jj0A);
                                                    break;
                                            }
                                        }
                                    }, c7020sO.h);
                                    break;
                                }
                        }
                    }
                });
                return "acquireBuffer";
        }
    }
}
