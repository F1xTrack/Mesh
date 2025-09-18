package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class EH implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FH b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ C3866fw1 d;

    public /* synthetic */ EH(FH fh, Runnable runnable, C3866fw1 c3866fw1, int i) {
        this.a = i;
        this.b = fh;
        this.c = runnable;
        this.d = c3866fw1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FH fh = this.b;
                fh.getClass();
                final Runnable runnable = this.c;
                final C3866fw1 c3866fw1 = this.d;
                final int i = 0;
                fh.a.execute(new Runnable() { // from class: CH
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((HH) c3866fw1.b).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((HH) c3866fw1.b).k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                HH hh = (HH) c3866fw1.b;
                                try {
                                    runnable2.run();
                                    hh.j(null);
                                    return;
                                } catch (Exception e3) {
                                    hh.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                FH fh2 = this.b;
                fh2.getClass();
                final Runnable runnable2 = this.c;
                final C3866fw1 c3866fw12 = this.d;
                final int i2 = 2;
                fh2.a.execute(new Runnable() { // from class: CH
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((HH) c3866fw12.b).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((HH) c3866fw12.b).k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                HH hh = (HH) c3866fw12.b;
                                try {
                                    runnable22.run();
                                    hh.j(null);
                                    return;
                                } catch (Exception e3) {
                                    hh.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                FH fh3 = this.b;
                fh3.getClass();
                final Runnable runnable3 = this.c;
                final C3866fw1 c3866fw13 = this.d;
                final int i3 = 1;
                fh3.a.execute(new Runnable() { // from class: CH
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((HH) c3866fw13.b).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((HH) c3866fw13.b).k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                HH hh = (HH) c3866fw13.b;
                                try {
                                    runnable22.run();
                                    hh.j(null);
                                    return;
                                } catch (Exception e3) {
                                    hh.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
