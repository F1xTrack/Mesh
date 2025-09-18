package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: tQ0 */
/* loaded from: classes.dex */
public final class C11159tQ0 implements InterfaceC6953uV {

    /* renamed from: j */
    public static final Clock f43063j = DefaultClock.getInstance();

    /* renamed from: k */
    public static final Random f43064k = new Random();

    /* renamed from: l */
    public static final HashMap f43065l = new HashMap();

    /* renamed from: b */
    public final Context f43067b;

    /* renamed from: c */
    public final ScheduledExecutorService f43068c;

    /* renamed from: d */
    public final C0786MU f43069d;

    /* renamed from: e */
    public final InterfaceC1478XU f43070e;

    /* renamed from: f */
    public final C0409GU f43071f;

    /* renamed from: g */
    public final InterfaceC9347fG0 f43072g;

    /* renamed from: h */
    public final String f43073h;

    /* renamed from: a */
    public final HashMap f43066a = new HashMap();

    /* renamed from: i */
    public final HashMap f43074i = new HashMap();

    public C11159tQ0(Context context, ScheduledExecutorService scheduledExecutorService, C0786MU c0786mu, InterfaceC1478XU interfaceC1478XU, C0409GU c0409gu, InterfaceC9347fG0 interfaceC9347fG0) {
        this.f43067b = context;
        this.f43068c = scheduledExecutorService;
        this.f43069d = c0786mu;
        this.f43070e = interfaceC1478XU;
        this.f43071f = c0409gu;
        this.f43072g = interfaceC9347fG0;
        c0786mu.m5379a();
        this.f43073h = c0786mu.f7176c.f27219b;
        AtomicReference atomicReference = C11031sQ0.f42428a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = C11031sQ0.f42428a;
        if (atomicReference2.get() == null) {
            C11031sQ0 c11031sQ0 = new C11031sQ0();
            while (true) {
                if (atomicReference2.compareAndSet(null, c11031sQ0)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(c11031sQ0);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        AbstractC9376fU1.m18242c(scheduledExecutorService, new CallableC0361Fj(7, this));
    }

    /* renamed from: a */
    public final synchronized C6621pV m24929a(C0786MU c0786mu, String str, InterfaceC1478XU interfaceC1478XU, C0409GU c0409gu, Executor executor, C7169xw c7169xw, C7169xw c7169xw2, C7169xw c7169xw3, C0248Dw c0248Dw, C0311Ew c0311Ew, C0877Nw c0877Nw, C10919rY0 c10919rY0) {
        C0409GU c0409gu2;
        try {
            if (!this.f43066a.containsKey(str)) {
                Context context = this.f43067b;
                if (str.equals("firebase")) {
                    c0786mu.m5379a();
                    if (c0786mu.f7175b.equals("[DEFAULT]")) {
                        c0409gu2 = c0409gu;
                    }
                    C6621pV c6621pV = new C6621pV(context, interfaceC1478XU, c0409gu2, executor, c7169xw, c7169xw2, c7169xw3, c0248Dw, c0311Ew, c0877Nw, m24933e(c0786mu, interfaceC1478XU, c0248Dw, c7169xw2, this.f43067b, str, c0877Nw), c10919rY0);
                    c7169xw2.m26005c();
                    c7169xw3.m26005c();
                    c7169xw.m26005c();
                    this.f43066a.put(str, c6621pV);
                    f43065l.put(str, c6621pV);
                }
                c0409gu2 = null;
                C6621pV c6621pV2 = new C6621pV(context, interfaceC1478XU, c0409gu2, executor, c7169xw, c7169xw2, c7169xw3, c0248Dw, c0311Ew, c0877Nw, m24933e(c0786mu, interfaceC1478XU, c0248Dw, c7169xw2, this.f43067b, str, c0877Nw), c10919rY0);
                c7169xw2.m26005c();
                c7169xw3.m26005c();
                c7169xw.m26005c();
                this.f43066a.put(str, c6621pV2);
                f43065l.put(str, c6621pV2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C6621pV) this.f43066a.get(str);
    }

    /* renamed from: b */
    public final synchronized C6621pV m24930b(String str) {
        C7169xw c7169xwM24931c;
        C7169xw c7169xwM24931c2;
        C7169xw c7169xwM24931c3;
        C0877Nw c0877Nw;
        C0311Ew c0311Ew;
        C10919rY0 c10919rY0;
        ScheduledExecutorService scheduledExecutorService;
        try {
            c7169xwM24931c = m24931c(str, "fetch");
            c7169xwM24931c2 = m24931c(str, "activate");
            c7169xwM24931c3 = m24931c(str, "defaults");
            c0877Nw = new C0877Nw(this.f43067b.getSharedPreferences("frc_" + this.f43073h + "_" + str + "_settings", 0));
            c0311Ew = new C0311Ew(this.f43068c, c7169xwM24931c2, c7169xwM24931c3);
            C0786MU c0786mu = this.f43069d;
            InterfaceC9347fG0 interfaceC9347fG0 = this.f43072g;
            c0786mu.m5379a();
            C4238iN c4238iN = (c0786mu.f7175b.equals("[DEFAULT]") && str.equals("firebase")) ? new C4238iN(interfaceC9347fG0) : null;
            if (c4238iN != null) {
                c0311Ew.m2457a(new BiConsumer() { // from class: rQ0
                    public /* synthetic */ C10903rQ0() {
                    }

                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        JSONObject jSONObjectOptJSONObject;
                        C4238iN c4238iN2 = c4238iN;
                        String str2 = (String) obj;
                        C7232yw c7232yw = (C7232yw) obj2;
                        InterfaceC1136S3 interfaceC1136S3 = (InterfaceC1136S3) ((InterfaceC9347fG0) c4238iN2.f29113b).get();
                        if (interfaceC1136S3 == null) {
                            return;
                        }
                        JSONObject jSONObject = c7232yw.f46546e;
                        if (jSONObject.length() < 1) {
                            return;
                        }
                        JSONObject jSONObject2 = c7232yw.f46543b;
                        if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                            if (strOptString.isEmpty()) {
                                return;
                            }
                            synchronized (((Map) c4238iN2.f29114c)) {
                                try {
                                    if (!strOptString.equals(((Map) c4238iN2.f29114c).get(str2))) {
                                        ((Map) c4238iN2.f29114c).put(str2, strOptString);
                                        Bundle bundle = new Bundle();
                                        bundle.putString("arm_key", str2);
                                        bundle.putString("arm_value", jSONObject2.optString(str2));
                                        bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                        bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                        bundle.putString(NotificationConstants.GROUP, jSONObjectOptJSONObject.optString(NotificationConstants.GROUP));
                                        C1199T3 c1199t3 = (C1199T3) interfaceC1136S3;
                                        c1199t3.m7538a("fp", "personalization_assignment", bundle);
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("_fpid", strOptString);
                                        c1199t3.m7538a("fp", "_fpc", bundle2);
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                });
            }
            C0827N8 c0827n8 = new C0827N8(20, false);
            c0827n8.f7523b = c7169xwM24931c2;
            c0827n8.f7524c = c7169xwM24931c3;
            c10919rY0 = new C10919rY0(13, false);
            c10919rY0.f41731e = Collections.newSetFromMap(new ConcurrentHashMap());
            c10919rY0.f41728b = c7169xwM24931c2;
            c10919rY0.f41729c = c0827n8;
            scheduledExecutorService = this.f43068c;
            c10919rY0.f41730d = scheduledExecutorService;
        } catch (Throwable th) {
            throw th;
        }
        return m24929a(this.f43069d, str, this.f43070e, this.f43071f, scheduledExecutorService, c7169xwM24931c, c7169xwM24931c2, c7169xwM24931c3, m24932d(str, c7169xwM24931c, c0877Nw), c0311Ew, c0877Nw, c10919rY0);
    }

    /* renamed from: c */
    public final C7169xw m24931c(String str, String str2) {
        C0940Ow c0940Ow;
        String strM8593l = AbstractC1374Vq.m8593l(F91.m2541x("frc_", this.f43073h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f43068c;
        Context context = this.f43067b;
        HashMap map = C0940Ow.f8689c;
        synchronized (C0940Ow.class) {
            try {
                HashMap map2 = C0940Ow.f8689c;
                if (!map2.containsKey(strM8593l)) {
                    map2.put(strM8593l, new C0940Ow(context, strM8593l));
                }
                c0940Ow = (C0940Ow) map2.get(strM8593l);
            } catch (Throwable th) {
                throw th;
            }
        }
        return C7169xw.m26003e(scheduledExecutorService, c0940Ow);
    }

    /* renamed from: d */
    public final synchronized C0248Dw m24932d(String str, C7169xw c7169xw, C0877Nw c0877Nw) {
        InterfaceC1478XU interfaceC1478XU;
        InterfaceC9347fG0 c0876Nv;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str2;
        C0786MU c0786mu;
        try {
            interfaceC1478XU = this.f43070e;
            C0786MU c0786mu2 = this.f43069d;
            c0786mu2.m5379a();
            c0876Nv = c0786mu2.f7175b.equals("[DEFAULT]") ? this.f43072g : new C0876Nv(10);
            scheduledExecutorService = this.f43068c;
            clock = f43063j;
            random = f43064k;
            C0786MU c0786mu3 = this.f43069d;
            c0786mu3.m5379a();
            str2 = c0786mu3.f7176c.f27218a;
            c0786mu = this.f43069d;
            c0786mu.m5379a();
        } catch (Throwable th) {
            throw th;
        }
        return new C0248Dw(interfaceC1478XU, c0876Nv, scheduledExecutorService, clock, random, c7169xw, new ConfigFetchHttpClient(this.f43067b, c0786mu.f7176c.f27219b, str2, str, c0877Nw.f8136a.getLong("fetch_timeout_in_seconds", 60L), c0877Nw.f8136a.getLong("fetch_timeout_in_seconds", 60L)), c0877Nw, this.f43074i);
    }

    /* renamed from: e */
    public final synchronized C10910rT1 m24933e(C0786MU c0786mu, InterfaceC1478XU interfaceC1478XU, C0248Dw c0248Dw, C7169xw c7169xw, Context context, String str, C0877Nw c0877Nw) {
        return new C10910rT1(c0786mu, interfaceC1478XU, c0248Dw, c7169xw, context, str, c0877Nw, this.f43068c);
    }
}
