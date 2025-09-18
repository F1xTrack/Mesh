package p000;

/* renamed from: EH */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0270EH implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2590a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorServiceC0333FH f2591b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f2592c;

    /* renamed from: d */
    public final /* synthetic */ C9432fw1 f2593d;

    public /* synthetic */ RunnableC0270EH(ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH, Runnable runnable, C9432fw1 c9432fw1, int i) {
        this.f2590a = i;
        this.f2591b = scheduledExecutorServiceC0333FH;
        this.f2592c = runnable;
        this.f2593d = c9432fw1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2590a) {
            case 0:
                ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH = this.f2591b;
                scheduledExecutorServiceC0333FH.getClass();
                final Runnable runnable = this.f2592c;
                final C9432fw1 c9432fw1 = this.f2593d;
                final int i = 0;
                scheduledExecutorServiceC0333FH.f3139a.execute(new Runnable() { // from class: CH
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC0459HH) c9432fw1.f27505b).mo10414k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC0459HH) c9432fw1.f27505b).mo10414k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC0459HH scheduledFutureC0459HH = (ScheduledFutureC0459HH) c9432fw1.f27505b;
                                try {
                                    runnable2.run();
                                    scheduledFutureC0459HH.m10413j(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC0459HH.mo10414k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH2 = this.f2591b;
                scheduledExecutorServiceC0333FH2.getClass();
                final Runnable runnable2 = this.f2592c;
                final C9432fw1 c9432fw12 = this.f2593d;
                final int i2 = 2;
                scheduledExecutorServiceC0333FH2.f3139a.execute(new Runnable() { // from class: CH
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC0459HH) c9432fw12.f27505b).mo10414k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC0459HH) c9432fw12.f27505b).mo10414k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ScheduledFutureC0459HH scheduledFutureC0459HH = (ScheduledFutureC0459HH) c9432fw12.f27505b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC0459HH.m10413j(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC0459HH.mo10414k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH3 = this.f2591b;
                scheduledExecutorServiceC0333FH3.getClass();
                final Runnable runnable3 = this.f2592c;
                final C9432fw1 c9432fw13 = this.f2593d;
                final int i3 = 1;
                scheduledExecutorServiceC0333FH3.f3139a.execute(new Runnable() { // from class: CH
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC0459HH) c9432fw13.f27505b).mo10414k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC0459HH) c9432fw13.f27505b).mo10414k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ScheduledFutureC0459HH scheduledFutureC0459HH = (ScheduledFutureC0459HH) c9432fw13.f27505b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC0459HH.m10413j(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC0459HH.mo10414k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
