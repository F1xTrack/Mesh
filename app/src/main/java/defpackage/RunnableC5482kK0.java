package defpackage;

import android.app.Activity;
import android.content.Context;
import java.io.File;
import java.util.concurrent.Executors;

/* renamed from: kK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5482kK0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ C6818rK0 b;
    public final /* synthetic */ V21 c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ C6818rK0 e;

    public /* synthetic */ RunnableC5482kK0(C6818rK0 c6818rK0, V21 v21, C6818rK0 c6818rK02, Activity activity) {
        this.b = c6818rK0;
        this.c = v21;
        this.e = c6818rK02;
        this.d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C6818rK0 c6818rK0 = this.e;
                Activity activity = this.d;
                C6818rK0 c6818rK02 = this.b;
                boolean z = c6818rK02.C1;
                V21 v21 = this.c;
                if (!z || v21 != c6818rK02.P) {
                    try {
                        if (v21.b != null) {
                            if (c6818rK02.j == null) {
                                c6818rK02.R(c6818rK0);
                            }
                            V21 v212 = c6818rK02.P;
                            if (v212.c || v212.d || v212.p.a <= 0) {
                                c6818rK02.K = false;
                            } else {
                                Context context = c6818rK02.getContext();
                                int i = c6818rK02.P.p.a;
                                O90.f(context, "context");
                                if (AbstractC2317bO1.a == null && i > 0) {
                                    long j = 1024;
                                    AbstractC2317bO1.a = new N01(new File(context.getCacheDir(), "RNVCache"), new C5363ji0(i * j * j), new C4086h41(context.getApplicationContext(), "exoplayer_internal.db", null, 1));
                                }
                                c6818rK02.K = true;
                            }
                            if (!c6818rK02.l) {
                                if (v21 == c6818rK02.P) {
                                    c6818rK02.S(v21);
                                    break;
                                }
                            } else {
                                c6818rK02.g.c();
                                c6818rK02.g.e.setVideoAspectRatio(0.0f);
                                Executors.newSingleThreadExecutor().execute(new RunnableC5482kK0(c6818rK02, v21, activity, c6818rK0));
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        c6818rK0.l = true;
                        AbstractC6864rZ1.c("ReactExoplayerView", "Failed to initialize Player! 2");
                        AbstractC6864rZ1.c("ReactExoplayerView", e.toString());
                        e.printStackTrace();
                        c6818rK02.a.c.b(e.toString(), e, "1001");
                        return;
                    }
                }
                break;
            default:
                C6818rK0 c6818rK03 = this.b;
                boolean z2 = c6818rK03.C1;
                V21 v213 = this.c;
                if (!z2 || v213 != c6818rK03.P) {
                    Activity activity2 = this.d;
                    if (activity2 != null) {
                        activity2.runOnUiThread(new RunnableC1313Qp0(c6818rK03, v213, this.e, 2));
                        break;
                    } else {
                        AbstractC6864rZ1.c("ReactExoplayerView", "Failed to initialize Player!, null activity");
                        c6818rK03.a.c.b("Failed to initialize Player!", new Exception("Current Activity is null!"), "1001");
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC5482kK0(C6818rK0 c6818rK0, V21 v21, Activity activity, C6818rK0 c6818rK02) {
        this.b = c6818rK0;
        this.c = v21;
        this.d = activity;
        this.e = c6818rK02;
    }
}
