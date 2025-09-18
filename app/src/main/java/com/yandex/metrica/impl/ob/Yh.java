package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class Yh {
    private final C2727ec a;
    private final Context b;
    private String c;
    private String d;
    private boolean e;
    private Qi f;

    public Yh(Context context, Qi qi) {
        this(context, qi, P0.i().t());
    }

    public String a() throws ExecutionException, InterruptedException {
        C2627ac c2627ac;
        C2627ac c2627ac2;
        JSONObject jSONObject = new JSONObject();
        if (!this.e) {
            C2777gc c2777gcA = this.a.a(this.b);
            C2652bc c2652bcA = c2777gcA.a();
            String str = null;
            this.c = (!c2652bcA.a() || (c2627ac2 = c2652bcA.a) == null) ? null : c2627ac2.b;
            C2652bc c2652bcB = c2777gcA.b();
            if (c2652bcB.a() && (c2627ac = c2652bcB.a) != null) {
                str = c2627ac.b;
            }
            this.d = str;
            this.e = true;
        }
        try {
            a(jSONObject, CommonUrlParts.UUID, this.f.V());
            a(jSONObject, AnalyticsBaseParamsConstantsKt.DEVICE_ID, this.f.i());
            a(jSONObject, "google_aid", this.c);
            a(jSONObject, "huawei_aid", this.d);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public Yh(Context context, Qi qi, C2727ec c2727ec) {
        this.e = false;
        this.b = context;
        this.f = qi;
        this.a = c2727ec;
    }

    public void a(Qi qi) {
        this.f = qi;
    }

    private void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }
}
