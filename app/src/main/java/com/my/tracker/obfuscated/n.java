package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class n {
    final AtomicBoolean a = new AtomicBoolean(false);
    final z2 b;
    final Context c;

    public n(z2 z2Var, Context context) {
        this.b = z2Var;
        this.c = context.getApplicationContext();
    }

    public boolean a() {
        if (this.a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(q1.a(this.c).h());
    }

    public void a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AttributionHandler: referrer is empty";
        } else {
            if (!a()) {
                try {
                    String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
                    if (TextUtils.isEmpty(queryParameter)) {
                        y2.a("AttributionHandler: deeplink is empty");
                        return;
                    } else {
                        a(new JSONObject().put("deeplink", queryParameter));
                        return;
                    }
                } catch (Throwable th) {
                    y2.b("AttributionHandler error: handling referrer failed with error: ", th);
                    return;
                }
            }
            str2 = "AttributionHandler: attribution has already been received";
        }
        y2.a(str2);
    }

    public void b(String str) {
        if (a()) {
            y2.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (jSONObjectOptJSONObject == null) {
                y2.a("AttributionHandler: empty attribution object has been returned");
                return;
            }
            if (!jSONObjectOptJSONObject.has("error")) {
                a(jSONObjectOptJSONObject);
                return;
            }
            y2.a("AttributionHandler: attribution response returned error " + jSONObjectOptJSONObject.optInt("error"));
        } catch (Throwable th) {
            y2.b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }

    public void a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(strOptString)) {
            y2.a("AttributionHandler: deeplink is empty");
            return;
        }
        if (!this.a.compareAndSet(false, true)) {
            y2.a("AttributionHandler: attribution has already been received");
            return;
        }
        q1 q1VarA = q1.a(this.c);
        if (!TextUtils.isEmpty(q1VarA.h())) {
            y2.a("AttributionHandler: attribution has already been received");
            return;
        }
        q1VarA.i(jSONObject.toString());
        MyTracker.AttributionListener attributionListenerD = this.b.d();
        if (attributionListenerD == null) {
            return;
        }
        Handler handlerC = this.b.c();
        if (handlerC == null) {
            handlerC = m.a;
        }
        try {
            handlerC.post(new io.sentry.cache.f(attributionListenerD, 7, MyTrackerAttribution.newAttribution(strOptString)));
        } catch (Throwable th) {
            y2.b("AttributionHandler error: exception occurred while post runnable", th);
        }
    }

    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            y2.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }

    public static n a(z2 z2Var, Context context) {
        return new n(z2Var, context);
    }
}
