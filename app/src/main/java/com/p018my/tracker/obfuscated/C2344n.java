package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.p018my.tracker.MyTracker;
import com.p018my.tracker.MyTrackerAttribution;
import io.sentry.cache.RunnableC5994f;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.n */
/* loaded from: classes2.dex */
public final class C2344n {

    /* renamed from: a */
    final AtomicBoolean f20047a = new AtomicBoolean(false);

    /* renamed from: b */
    final C2395z2 f20048b;

    /* renamed from: c */
    final Context f20049c;

    public C2344n(C2395z2 c2395z2, Context context) {
        this.f20048b = c2395z2;
        this.f20049c = context.getApplicationContext();
    }

    /* renamed from: a */
    public boolean m13322a() {
        if (this.f20047a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(C2358q1.m13407a(this.f20049c).m13430h());
    }

    /* renamed from: a */
    public void m13320a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AttributionHandler: referrer is empty";
        } else {
            if (!m13322a()) {
                try {
                    String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
                    if (TextUtils.isEmpty(queryParameter)) {
                        AbstractC2391y2.m13568a("AttributionHandler: deeplink is empty");
                        return;
                    } else {
                        m13321a(new JSONObject().put("deeplink", queryParameter));
                        return;
                    }
                } catch (Throwable th) {
                    AbstractC2391y2.m13573b("AttributionHandler error: handling referrer failed with error: ", th);
                    return;
                }
            }
            str2 = "AttributionHandler: attribution has already been received";
        }
        AbstractC2391y2.m13568a(str2);
    }

    /* renamed from: b */
    public void m13323b(String str) {
        if (m13322a()) {
            AbstractC2391y2.m13568a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (jSONObjectOptJSONObject == null) {
                AbstractC2391y2.m13568a("AttributionHandler: empty attribution object has been returned");
                return;
            }
            if (!jSONObjectOptJSONObject.has("error")) {
                m13321a(jSONObjectOptJSONObject);
                return;
            }
            AbstractC2391y2.m13568a("AttributionHandler: attribution response returned error " + jSONObjectOptJSONObject.optInt("error"));
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }

    /* renamed from: a */
    public void m13321a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(strOptString)) {
            AbstractC2391y2.m13568a("AttributionHandler: deeplink is empty");
            return;
        }
        if (!this.f20047a.compareAndSet(false, true)) {
            AbstractC2391y2.m13568a("AttributionHandler: attribution has already been received");
            return;
        }
        C2358q1 c2358q1M13407a = C2358q1.m13407a(this.f20049c);
        if (!TextUtils.isEmpty(c2358q1M13407a.m13430h())) {
            AbstractC2391y2.m13568a("AttributionHandler: attribution has already been received");
            return;
        }
        c2358q1M13407a.m13433i(jSONObject.toString());
        MyTracker.AttributionListener attributionListenerM13600d = this.f20048b.m13600d();
        if (attributionListenerM13600d == null) {
            return;
        }
        Handler handlerM13596c = this.f20048b.m13596c();
        if (handlerM13596c == null) {
            handlerM13596c = AbstractC2340m.f20022a;
        }
        try {
            handlerM13596c.post(new RunnableC5994f(attributionListenerM13600d, 7, MyTrackerAttribution.newAttribution(strOptString)));
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("AttributionHandler error: exception occurred while post runnable", th);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m13318a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            AbstractC2391y2.m13572b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }

    /* renamed from: a */
    public static C2344n m13317a(C2395z2 c2395z2, Context context) {
        return new C2344n(c2395z2, context);
    }
}
