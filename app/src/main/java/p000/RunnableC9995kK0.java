package p000;

import android.app.Activity;
import android.content.Context;
import java.io.File;
import java.util.concurrent.Executors;

/* renamed from: kK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9995kK0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36428a = 1;

    /* renamed from: b */
    public final /* synthetic */ C10891rK0 f36429b;

    /* renamed from: c */
    public final /* synthetic */ V21 f36430c;

    /* renamed from: d */
    public final /* synthetic */ Activity f36431d;

    /* renamed from: e */
    public final /* synthetic */ C10891rK0 f36432e;

    public /* synthetic */ RunnableC9995kK0(C10891rK0 c10891rK0, V21 v21, C10891rK0 c10891rK02, Activity activity) {
        this.f36429b = c10891rK0;
        this.f36430c = v21;
        this.f36432e = c10891rK02;
        this.f36431d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36428a) {
            case 0:
                C10891rK0 c10891rK0 = this.f36432e;
                Activity activity = this.f36431d;
                C10891rK0 c10891rK02 = this.f36429b;
                boolean z = c10891rK02.f41534C1;
                V21 v21 = this.f36430c;
                if (!z || v21 != c10891rK02.f41551P) {
                    try {
                        if (v21.f12315b != null) {
                            if (c10891rK02.f41573j == null) {
                                c10891rK02.m24299R(c10891rK0);
                            }
                            V21 v212 = c10891rK02.f41551P;
                            if (v212.f12316c || v212.f12317d || v212.f12329p.f40340a <= 0) {
                                c10891rK02.f41546K = false;
                            } else {
                                Context context = c10891rK02.getContext();
                                int i = c10891rK02.f41551P.f12329p.f40340a;
                                O90.m5968f(context, "context");
                                if (AbstractC8847bO1.f17003a == null && i > 0) {
                                    long j = 1024;
                                    AbstractC8847bO1.f17003a = new N01(new File(context.getCacheDir(), "RNVCache"), new C9915ji0(i * j * j), new C9580h41(context.getApplicationContext(), "exoplayer_internal.db", null, 1));
                                }
                                c10891rK02.f41546K = true;
                            }
                            if (!c10891rK02.f41575l) {
                                if (v21 == c10891rK02.f41551P) {
                                    c10891rK02.m24300S(v21);
                                    break;
                                }
                            } else {
                                c10891rK02.f41570g.m18236c();
                                c10891rK02.f41570g.f27192e.setVideoAspectRatio(0.0f);
                                Executors.newSingleThreadExecutor().execute(new RunnableC9995kK0(c10891rK02, v21, activity, c10891rK0));
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        c10891rK0.f41575l = true;
                        AbstractC10922rZ1.m24429c("ReactExoplayerView", "Failed to initialize Player! 2");
                        AbstractC10922rZ1.m24429c("ReactExoplayerView", e.toString());
                        e.printStackTrace();
                        c10891rK02.f41559a.f43814c.mo300b(e.toString(), e, "1001");
                        return;
                    }
                }
                break;
            default:
                C10891rK0 c10891rK03 = this.f36429b;
                boolean z2 = c10891rK03.f41534C1;
                V21 v213 = this.f36430c;
                if (!z2 || v213 != c10891rK03.f41551P) {
                    Activity activity2 = this.f36431d;
                    if (activity2 != null) {
                        activity2.runOnUiThread(new RunnableC8176Qp0(c10891rK03, v213, this.f36432e, 2));
                        break;
                    } else {
                        AbstractC10922rZ1.m24429c("ReactExoplayerView", "Failed to initialize Player!, null activity");
                        c10891rK03.f41559a.f43814c.mo300b("Failed to initialize Player!", new Exception("Current Activity is null!"), "1001");
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC9995kK0(C10891rK0 c10891rK0, V21 v21, Activity activity, C10891rK0 c10891rK02) {
        this.f36429b = c10891rK0;
        this.f36430c = v21;
        this.f36431d = activity;
        this.f36432e = c10891rK02;
    }
}
