package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class QM1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ QM1(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.a = 0;
        this.c = firebaseInstanceIdReceiver;
        this.d = intent;
        this.e = context;
        this.b = z;
        this.f = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executorUnconfigurableExecutorService;
        int iIntValue;
        int iA;
        Bundle bundleE1;
        String str;
        Bundle bundleE12;
        switch (this.a) {
            case 0:
                FirebaseInstanceIdReceiver firebaseInstanceIdReceiver = (FirebaseInstanceIdReceiver) this.c;
                Intent intent = (Intent) this.d;
                Context context = (Context) this.e;
                boolean z = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f;
                firebaseInstanceIdReceiver.getClass();
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    } else if (intent.getExtras() == null) {
                        iA = 500;
                    } else {
                        C0389Et c0389Et = new C0389Et(intent);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (FirebaseInstanceIdReceiver.class) {
                            try {
                                SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                if (executorUnconfigurableExecutorService == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    FirebaseInstanceIdReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                }
                            } finally {
                            }
                        }
                        executorUnconfigurableExecutorService.execute(new RunnableC1492Sx(context, c0389Et, countDownLatch));
                        try {
                            iIntValue = ((Integer) AbstractC3782fU1.a(new C0999Mo1(context, 1).w(c0389Et.a))).intValue();
                        } catch (InterruptedException | ExecutionException unused) {
                            iIntValue = 500;
                        }
                        try {
                            countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            "Message ack failed: ".concat(e.toString());
                        }
                        iA = iIntValue;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                C2528cV1 c2528cV1J = RI1.j(((AppMeasurementDynamiteService) this.f).a);
                c2528cV1J.F1(new RunnableC7234tV1(c2528cV1J, (String) this.d, (String) this.e, c2528cV1J.N1(false), this.b, (InterfaceC7377uF1) this.c));
                return;
            case 2:
                C2528cV1 c2528cV1J2 = RI1.j((C3386dP1) ((FR1) this.f).b);
                c2528cV1J2.F1(new RunnableC7234tV1(c2528cV1J2, (AtomicReference) this.c, (String) this.d, (String) this.e, c2528cV1J2.N1(false), this.b));
                return;
            default:
                Uri uri = (Uri) this.c;
                String str2 = (String) this.e;
                FR1 fr1 = (FR1) ((IS) this.f).b;
                C3386dP1 c3386dP1 = (C3386dP1) fr1.b;
                fr1.v1();
                try {
                    C5910mZ1 c5910mZ1U1 = fr1.u1();
                    if (TextUtils.isEmpty(str2)) {
                        bundleE1 = null;
                    } else if (str2.contains("gclid") || str2.contains("gbraid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id")) {
                        bundleE1 = c5910mZ1U1.E1(Uri.parse("https://google.com/search?".concat(str2)));
                        if (bundleE1 != null) {
                            bundleE1.putString("_cis", "referrer");
                        }
                    } else {
                        c5910mZ1U1.n().n.d("Activity created with data 'referrer' without required params");
                        bundleE1 = null;
                    }
                    String str3 = (String) this.d;
                    boolean z2 = this.b;
                    C7409uQ0 c7409uQ0 = fr1.s;
                    if (!z2 || (bundleE12 = fr1.u1().E1(uri)) == null) {
                        str = "Activity created with data 'referrer' without required params";
                    } else {
                        bundleE12.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        if (bundleE12.containsKey("gclid") || bundleE1 == null || !bundleE1.containsKey("gclid")) {
                            str = "Activity created with data 'referrer' without required params";
                        } else {
                            str = "Activity created with data 'referrer' without required params";
                            bundleE12.putString("_cer", "gclid=" + bundleE1.getString("gclid"));
                        }
                        fr1.X1(str3, "_cmp", bundleE12);
                        c7409uQ0.m(bundleE12, str3);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    fr1.n().n.c(str2, "Activity created with referrer");
                    if (c3386dP1.g.E1(null, IB1.B0)) {
                        if (bundleE1 != null) {
                            fr1.X1(str3, "_cmp", bundleE1);
                            c7409uQ0.m(bundleE1, str3);
                        } else {
                            fr1.n().n.c(str2, "Referrer does not contain valid parameters");
                        }
                        fr1.K1("auto", "_ldl", null, true, c3386dP1.n.currentTimeMillis());
                        return;
                    }
                    if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                        fr1.n().n.d(str);
                        return;
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        fr1.K1("auto", "_ldl", str2, true, c3386dP1.n.currentTimeMillis());
                        return;
                    }
                } catch (RuntimeException e2) {
                    fr1.n().g.c(e2, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
        }
    }

    public /* synthetic */ QM1(Object obj, Object obj2, String str, String str2, boolean z, int i) {
        this.a = i;
        this.c = obj2;
        this.d = str;
        this.e = str2;
        this.b = z;
        this.f = obj;
    }

    public QM1(IS is, boolean z, Uri uri, String str, String str2) {
        this.a = 3;
        this.b = z;
        this.c = uri;
        this.d = str;
        this.e = str2;
        this.f = is;
    }
}
