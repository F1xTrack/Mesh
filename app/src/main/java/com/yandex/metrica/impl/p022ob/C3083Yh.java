package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Yh */
/* loaded from: classes2.dex */
class C3083Yh {

    /* renamed from: a */
    private final C3232ec f22896a;

    /* renamed from: b */
    private final Context f22897b;

    /* renamed from: c */
    private String f22898c;

    /* renamed from: d */
    private String f22899d;

    /* renamed from: e */
    private boolean f22900e;

    /* renamed from: f */
    private C2885Qi f22901f;

    public C3083Yh(Context context, C2885Qi c2885Qi) {
        this(context, c2885Qi, C2842P0.m14728i().m14749t());
    }

    /* renamed from: a */
    public String m15513a() throws ExecutionException, InterruptedException {
        C3128ac c3128ac;
        C3128ac c3128ac2;
        JSONObject jSONObject = new JSONObject();
        if (!this.f22900e) {
            C3284gc c3284gcM15837a = this.f22896a.m15837a(this.f22897b);
            C3154bc c3154bcM15990a = c3284gcM15837a.m15990a();
            String str = null;
            this.f22898c = (!c3154bcM15990a.m15682a() || (c3128ac2 = c3154bcM15990a.f23129a) == null) ? null : c3128ac2.f23041b;
            C3154bc c3154bcM15991b = c3284gcM15837a.m15991b();
            if (c3154bcM15991b.m15682a() && (c3128ac = c3154bcM15991b.f23129a) != null) {
                str = c3128ac.f23041b;
            }
            this.f22899d = str;
            this.f22900e = true;
        }
        try {
            m15512a(jSONObject, CommonUrlParts.UUID, this.f22901f.m14873V());
            m15512a(jSONObject, AnalyticsBaseParamsConstantsKt.DEVICE_ID, this.f22901f.m14883i());
            m15512a(jSONObject, "google_aid", this.f22898c);
            m15512a(jSONObject, "huawei_aid", this.f22899d);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public C3083Yh(Context context, C2885Qi c2885Qi, C3232ec c3232ec) {
        this.f22900e = false;
        this.f22897b = context;
        this.f22901f = c2885Qi;
        this.f22896a = c3232ec;
    }

    /* renamed from: a */
    public void m15514a(C2885Qi c2885Qi) {
        this.f22901f = c2885Qi;
    }

    /* renamed from: a */
    private void m15512a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }
}
