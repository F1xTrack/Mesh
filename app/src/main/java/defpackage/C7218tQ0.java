package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.huawei.hms.rn.push.constants.NotificationConstants;
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
public final class C7218tQ0 implements InterfaceC7423uV {
    public static final Clock j = DefaultClock.getInstance();
    public static final Random k = new Random();
    public static final HashMap l = new HashMap();
    public final Context b;
    public final ScheduledExecutorService c;
    public final MU d;
    public final XU e;
    public final GU f;
    public final InterfaceC3739fG0 g;
    public final String h;
    public final HashMap a = new HashMap();
    public final HashMap i = new HashMap();

    public C7218tQ0(Context context, ScheduledExecutorService scheduledExecutorService, MU mu, XU xu, GU gu, InterfaceC3739fG0 interfaceC3739fG0) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = mu;
        this.e = xu;
        this.f = gu;
        this.g = interfaceC3739fG0;
        mu.a();
        this.h = mu.c.b;
        AtomicReference atomicReference = C7027sQ0.a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = C7027sQ0.a;
        if (atomicReference2.get() == null) {
            C7027sQ0 c7027sQ0 = new C7027sQ0();
            while (true) {
                if (atomicReference2.compareAndSet(null, c7027sQ0)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(c7027sQ0);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        AbstractC3782fU1.c(scheduledExecutorService, new CallableC0437Fj(7, this));
    }

    public final synchronized C6469pV a(MU mu, String str, XU xu, GU gu, Executor executor, C8075xw c8075xw, C8075xw c8075xw2, C8075xw c8075xw3, C0320Dw c0320Dw, C0398Ew c0398Ew, C1099Nw c1099Nw, C6860rY0 c6860rY0) {
        GU gu2;
        try {
            if (!this.a.containsKey(str)) {
                Context context = this.b;
                if (str.equals("firebase")) {
                    mu.a();
                    if (mu.b.equals("[DEFAULT]")) {
                        gu2 = gu;
                    }
                    C6469pV c6469pV = new C6469pV(context, xu, gu2, executor, c8075xw, c8075xw2, c8075xw3, c0320Dw, c0398Ew, c1099Nw, e(mu, xu, c0320Dw, c8075xw2, this.b, str, c1099Nw), c6860rY0);
                    c8075xw2.c();
                    c8075xw3.c();
                    c8075xw.c();
                    this.a.put(str, c6469pV);
                    l.put(str, c6469pV);
                }
                gu2 = null;
                C6469pV c6469pV2 = new C6469pV(context, xu, gu2, executor, c8075xw, c8075xw2, c8075xw3, c0320Dw, c0398Ew, c1099Nw, e(mu, xu, c0320Dw, c8075xw2, this.b, str, c1099Nw), c6860rY0);
                c8075xw2.c();
                c8075xw3.c();
                c8075xw.c();
                this.a.put(str, c6469pV2);
                l.put(str, c6469pV2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C6469pV) this.a.get(str);
    }

    public final synchronized C6469pV b(String str) {
        C8075xw c8075xwC;
        C8075xw c8075xwC2;
        C8075xw c8075xwC3;
        C1099Nw c1099Nw;
        C0398Ew c0398Ew;
        C6860rY0 c6860rY0;
        ScheduledExecutorService scheduledExecutorService;
        try {
            c8075xwC = c(str, "fetch");
            c8075xwC2 = c(str, "activate");
            c8075xwC3 = c(str, "defaults");
            c1099Nw = new C1099Nw(this.b.getSharedPreferences("frc_" + this.h + "_" + str + "_settings", 0));
            c0398Ew = new C0398Ew(this.c, c8075xwC2, c8075xwC3);
            MU mu = this.d;
            InterfaceC3739fG0 interfaceC3739fG0 = this.g;
            mu.a();
            C4332iN c4332iN = (mu.b.equals("[DEFAULT]") && str.equals("firebase")) ? new C4332iN(interfaceC3739fG0) : null;
            if (c4332iN != null) {
                c0398Ew.a(new BiConsumer() { // from class: rQ0
                    public /* synthetic */ C6836rQ0() {
                    }

                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        JSONObject jSONObjectOptJSONObject;
                        C4332iN c4332iN2 = c4332iN;
                        String str2 = (String) obj;
                        C8265yw c8265yw = (C8265yw) obj2;
                        S3 s3 = (S3) ((InterfaceC3739fG0) c4332iN2.b).get();
                        if (s3 == null) {
                            return;
                        }
                        JSONObject jSONObject = c8265yw.e;
                        if (jSONObject.length() < 1) {
                            return;
                        }
                        JSONObject jSONObject2 = c8265yw.b;
                        if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                            if (strOptString.isEmpty()) {
                                return;
                            }
                            synchronized (((Map) c4332iN2.c)) {
                                try {
                                    if (!strOptString.equals(((Map) c4332iN2.c).get(str2))) {
                                        ((Map) c4332iN2.c).put(str2, strOptString);
                                        Bundle bundle = new Bundle();
                                        bundle.putString("arm_key", str2);
                                        bundle.putString("arm_value", jSONObject2.optString(str2));
                                        bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                        bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                        bundle.putString(NotificationConstants.GROUP, jSONObjectOptJSONObject.optString(NotificationConstants.GROUP));
                                        T3 t3 = (T3) s3;
                                        t3.a("fp", "personalization_assignment", bundle);
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("_fpid", strOptString);
                                        t3.a("fp", "_fpc", bundle2);
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                });
            }
            N8 n8 = new N8(20, false);
            n8.b = c8075xwC2;
            n8.c = c8075xwC3;
            c6860rY0 = new C6860rY0(13, false);
            c6860rY0.e = Collections.newSetFromMap(new ConcurrentHashMap());
            c6860rY0.b = c8075xwC2;
            c6860rY0.c = n8;
            scheduledExecutorService = this.c;
            c6860rY0.d = scheduledExecutorService;
        } catch (Throwable th) {
            throw th;
        }
        return a(this.d, str, this.e, this.f, scheduledExecutorService, c8075xwC, c8075xwC2, c8075xwC3, d(str, c8075xwC, c1099Nw), c0398Ew, c1099Nw, c6860rY0);
    }

    public final C8075xw c(String str, String str2) {
        C1177Ow c1177Ow;
        String strL = AbstractC1705Vq.l(F91.x("frc_", this.h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.b;
        HashMap map = C1177Ow.c;
        synchronized (C1177Ow.class) {
            try {
                HashMap map2 = C1177Ow.c;
                if (!map2.containsKey(strL)) {
                    map2.put(strL, new C1177Ow(context, strL));
                }
                c1177Ow = (C1177Ow) map2.get(strL);
            } catch (Throwable th) {
                throw th;
            }
        }
        return C8075xw.e(scheduledExecutorService, c1177Ow);
    }

    public final synchronized C0320Dw d(String str, C8075xw c8075xw, C1099Nw c1099Nw) {
        XU xu;
        InterfaceC3739fG0 c1096Nv;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str2;
        MU mu;
        try {
            xu = this.e;
            MU mu2 = this.d;
            mu2.a();
            c1096Nv = mu2.b.equals("[DEFAULT]") ? this.g : new C1096Nv(10);
            scheduledExecutorService = this.c;
            clock = j;
            random = k;
            MU mu3 = this.d;
            mu3.a();
            str2 = mu3.c.a;
            mu = this.d;
            mu.a();
        } catch (Throwable th) {
            throw th;
        }
        return new C0320Dw(xu, c1096Nv, scheduledExecutorService, clock, random, c8075xw, new ConfigFetchHttpClient(this.b, mu.c.b, str2, str, c1099Nw.a.getLong("fetch_timeout_in_seconds", 60L), c1099Nw.a.getLong("fetch_timeout_in_seconds", 60L)), c1099Nw, this.i);
    }

    public final synchronized C6846rT1 e(MU mu, XU xu, C0320Dw c0320Dw, C8075xw c8075xw, Context context, String str, C1099Nw c1099Nw) {
        return new C6846rT1(mu, xu, c0320Dw, c8075xw, context, str, c1099Nw, this.c);
    }
}
