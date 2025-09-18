package p000;

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
import com.huawei.hms.support.api.entity.core.CommonCode;
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

    /* renamed from: a */
    public final /* synthetic */ int f9600a;

    /* renamed from: b */
    public final /* synthetic */ boolean f9601b;

    /* renamed from: c */
    public final /* synthetic */ Object f9602c;

    /* renamed from: d */
    public final /* synthetic */ Object f9603d;

    /* renamed from: e */
    public final /* synthetic */ Object f9604e;

    /* renamed from: f */
    public final /* synthetic */ Object f9605f;

    public /* synthetic */ QM1(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f9600a = 0;
        this.f9602c = firebaseInstanceIdReceiver;
        this.f9603d = intent;
        this.f9604e = context;
        this.f9601b = z;
        this.f9605f = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executorUnconfigurableExecutorService;
        int iIntValue;
        int iM11304a;
        Bundle bundleM22862E1;
        String str;
        Bundle bundleM22862E12;
        switch (this.f9600a) {
            case 0:
                FirebaseInstanceIdReceiver firebaseInstanceIdReceiver = (FirebaseInstanceIdReceiver) this.f9602c;
                Intent intent = (Intent) this.f9603d;
                Context context = (Context) this.f9604e;
                boolean z = this.f9601b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f9605f;
                firebaseInstanceIdReceiver.getClass();
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        iM11304a = FirebaseInstanceIdReceiver.m11304a(intent2);
                    } else if (intent.getExtras() == null) {
                        iM11304a = 500;
                    } else {
                        C0308Et c0308Et = new C0308Et(intent);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (FirebaseInstanceIdReceiver.class) {
                            try {
                                SoftReference softReference = FirebaseInstanceIdReceiver.f18463b;
                                executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                if (executorUnconfigurableExecutorService == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    FirebaseInstanceIdReceiver.f18463b = new SoftReference(executorUnconfigurableExecutorService);
                                }
                            } finally {
                            }
                        }
                        executorUnconfigurableExecutorService.execute(new RunnableC1192Sx(context, c0308Et, countDownLatch));
                        try {
                            iIntValue = ((Integer) AbstractC9376fU1.m18240a(new C7967Mo1(context, 1).m5454w(c0308Et.f2938a))).intValue();
                        } catch (InterruptedException | ExecutionException unused) {
                            iIntValue = 500;
                        }
                        try {
                            countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            "Message ack failed: ".concat(e.toString());
                        }
                        iM11304a = iIntValue;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iM11304a);
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
                C8989cV1 c8989cV1M6946j = RI1.m6946j(((AppMeasurementDynamiteService) this.f9605f).f18050a);
                c8989cV1M6946j.m10744F1(new RunnableC11170tV1(c8989cV1M6946j, (String) this.f9603d, (String) this.f9604e, c8989cV1M6946j.m10752N1(false), this.f9601b, (InterfaceC11266uF1) this.f9602c));
                return;
            case 2:
                C8989cV1 c8989cV1M6946j2 = RI1.m6946j((C9110dP1) ((FR1) this.f9605f).f11615b);
                c8989cV1M6946j2.m10744F1(new RunnableC11170tV1(c8989cV1M6946j2, (AtomicReference) this.f9602c, (String) this.f9603d, (String) this.f9604e, c8989cV1M6946j2.m10752N1(false), this.f9601b));
                return;
            default:
                Uri uri = (Uri) this.f9602c;
                String str2 = (String) this.f9604e;
                FR1 fr1 = (FR1) ((C0533IS) this.f9605f).f4939b;
                C9110dP1 c9110dP1 = (C9110dP1) fr1.f11615b;
                fr1.mo7681v1();
                try {
                    C10282mZ1 c10282mZ1M7852u1 = fr1.m7852u1();
                    if (TextUtils.isEmpty(str2)) {
                        bundleM22862E1 = null;
                    } else if (str2.contains("gclid") || str2.contains("gbraid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id")) {
                        bundleM22862E1 = c10282mZ1M7852u1.m22862E1(Uri.parse("https://google.com/search?".concat(str2)));
                        if (bundleM22862E1 != null) {
                            bundleM22862E1.putString("_cis", "referrer");
                        }
                    } else {
                        c10282mZ1M7852u1.mo6070n().f8385n.m24555d("Activity created with data 'referrer' without required params");
                        bundleM22862E1 = null;
                    }
                    String str3 = (String) this.f9603d;
                    boolean z2 = this.f9601b;
                    C11287uQ0 c11287uQ0 = fr1.f3220s;
                    if (!z2 || (bundleM22862E12 = fr1.m7852u1().m22862E1(uri)) == null) {
                        str = "Activity created with data 'referrer' without required params";
                    } else {
                        bundleM22862E12.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        if (bundleM22862E12.containsKey("gclid") || bundleM22862E1 == null || !bundleM22862E1.containsKey("gclid")) {
                            str = "Activity created with data 'referrer' without required params";
                        } else {
                            str = "Activity created with data 'referrer' without required params";
                            bundleM22862E12.putString("_cer", "gclid=" + bundleM22862E1.getString("gclid"));
                        }
                        fr1.m2653X1(str3, "_cmp", bundleM22862E12);
                        c11287uQ0.m25193m(bundleM22862E12, str3);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    fr1.mo6070n().f8385n.m24554c(str2, "Activity created with referrer");
                    if (c9110dP1.f26037g.m6511E1(null, IB1.f4731B0)) {
                        if (bundleM22862E1 != null) {
                            fr1.m2653X1(str3, "_cmp", bundleM22862E1);
                            c11287uQ0.m25193m(bundleM22862E1, str3);
                        } else {
                            fr1.mo6070n().f8385n.m24554c(str2, "Referrer does not contain valid parameters");
                        }
                        fr1.m2641K1("auto", "_ldl", null, true, c9110dP1.f26044n.currentTimeMillis());
                        return;
                    }
                    if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                        fr1.mo6070n().f8385n.m24555d(str);
                        return;
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        fr1.m2641K1("auto", "_ldl", str2, true, c9110dP1.f26044n.currentTimeMillis());
                        return;
                    }
                } catch (RuntimeException e2) {
                    fr1.mo6070n().f8378g.m24554c(e2, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
        }
    }

    public /* synthetic */ QM1(Object obj, Object obj2, String str, String str2, boolean z, int i) {
        this.f9600a = i;
        this.f9602c = obj2;
        this.f9603d = str;
        this.f9604e = str2;
        this.f9601b = z;
        this.f9605f = obj;
    }

    public QM1(C0533IS c0533is, boolean z, Uri uri, String str, String str2) {
        this.f9600a = 3;
        this.f9601b = z;
        this.f9602c = uri;
        this.f9603d = str;
        this.f9604e = str2;
        this.f9605f = c0533is;
    }
}
