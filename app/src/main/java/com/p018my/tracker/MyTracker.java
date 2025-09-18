package com.p018my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.p018my.tracker.ads.AdEvent;
import com.p018my.tracker.miniapps.MiniAppEvent;
import com.p018my.tracker.obfuscated.AbstractC2303c3;
import com.p018my.tracker.obfuscated.AbstractC2391y2;
import com.p018my.tracker.obfuscated.C2306d1;
import com.p018my.tracker.obfuscated.C2395z2;
import com.p018my.tracker.plugins.MyTrackerPluginConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MyTracker {
    public static final String VERSION = "3.3.2";

    /* renamed from: a */
    private static final List f19672a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static volatile C2306d1 f19673b;

    public interface AttributionListener {
        void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);
    }

    /* renamed from: com.my.tracker.MyTracker$a */
    public static final class C2284a {

        /* renamed from: a */
        public static final C2395z2 f19674a;

        /* renamed from: b */
        static final MyTrackerConfig f19675b;

        static {
            C2395z2 c2395z2M13582x = C2395z2.m13582x();
            f19674a = c2395z2M13582x;
            f19675b = MyTrackerConfig.newConfig(c2395z2M13582x);
        }
    }

    /* renamed from: a */
    private static void m12747a(int i, boolean z) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12852a(i, z);
        }
    }

    public static void applyPlugin(MyTrackerPluginConfig myTrackerPluginConfig) {
        f19672a.add(myTrackerPluginConfig);
    }

    public static void flush() {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12847a();
        }
    }

    public static String getInstanceId(Context context) {
        return AbstractC2303c3.m12811a(context);
    }

    public static MyTrackerConfig getTrackerConfig() {
        return C2284a.f19675b;
    }

    public static MyTrackerParams getTrackerParams() {
        return C2284a.f19674a.m13613m();
    }

    public static String handleDeeplink(Intent intent) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 != null) {
            return c2306d1.m12846a(intent);
        }
        AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    public static void incrementEventTimeSpent(int i) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12848a(i);
        }
    }

    public static void initTracker(String str, Application application) {
        if (TextUtils.isEmpty(str)) {
            AbstractC2391y2.m13572b("MyTracker initialization failed: id can't be empty");
            return;
        }
        if (f19673b != null) {
            AbstractC2391y2.m13574c("MyTracker has already been initialized");
            return;
        }
        synchronized (MyTracker.class) {
            try {
                if (f19673b != null) {
                    AbstractC2391y2.m13574c("MyTracker has already been initialized");
                    return;
                }
                C2395z2 c2395z2 = C2284a.f19674a;
                ArrayList arrayList = new ArrayList(f19672a);
                C2306d1 c2306d1M12845a = C2306d1.m12845a(str, c2395z2, application);
                c2306d1M12845a.m12859a(arrayList);
                f19673b = c2306d1M12845a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isDebugMode() {
        return AbstractC2391y2.m13571a();
    }

    public static void onActivityResult(int i, Intent intent) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12849a(i, intent);
        }
    }

    public static void onPurchasesUpdated(int i, List<Object> list) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12850a(i, list);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    public static void setDebugMode(boolean z) {
        AbstractC2391y2.m13570a(z);
    }

    public static void startAnytimeTimeSpent(int i) {
        m12747a(i, true);
    }

    public static void startForegroundTimeSpent(int i) {
        m12747a(i, false);
    }

    public static void stopAnytimeTimeSpent(int i) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12862b(i, true);
        }
    }

    public static void stopForegroundTimeSpent(int i) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12862b(i, false);
        }
    }

    public static void trackAdEvent(AdEvent adEvent) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12854a(adEvent);
        }
    }

    public static void trackAppGalleryPurchaseEvent(Object obj, String str, String str2, String str3, Map<String, String> map) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12856a(obj, str, str2, str3, map);
        }
    }

    public static void trackEvent(String str) {
        trackEvent(str, null);
    }

    public static void trackInviteEvent() {
        trackInviteEvent(null);
    }

    public static void trackLaunchManually(Activity activity) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12853a(activity);
        }
    }

    public static void trackLevelEvent() {
        trackLevelEvent(null);
    }

    public static void trackLoginEvent(String str, String str2) {
        trackLoginEvent(str, str2, null);
    }

    public static void trackMiniAppEvent(MiniAppEvent miniAppEvent) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12855a(miniAppEvent);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, null);
    }

    public static void trackRegistrationEvent(String str, String str2) {
        trackRegistrationEvent(str, str2, null);
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        C2284a.f19674a.m13586a(attributionListener, handler);
    }

    public static void trackEvent(String str, Map<String, String> map) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12858a(str, map);
        }
    }

    public static void trackInviteEvent(Map<String, String> map) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12860a(map);
        }
    }

    public static void trackLevelEvent(int i, Map<String, String> map) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12851a(i, map);
        }
    }

    public static void trackLoginEvent(String str, String str2, Map<String, String> map) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12857a(str, str2, map);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12861a(jSONObject, jSONObject2, str, map);
        }
    }

    public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12863b(str, str2, map);
        }
    }

    public static void trackLevelEvent(Map<String, String> map) {
        C2306d1 c2306d1 = f19673b;
        if (c2306d1 == null) {
            AbstractC2391y2.m13572b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c2306d1.m12864b(map);
        }
    }
}
