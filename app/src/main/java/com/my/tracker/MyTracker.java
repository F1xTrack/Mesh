package com.my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.c3;
import com.my.tracker.obfuscated.d1;
import com.my.tracker.obfuscated.y2;
import com.my.tracker.obfuscated.z2;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MyTracker {
    public static final String VERSION = "3.3.2";
    private static final List a = Collections.synchronizedList(new ArrayList());
    private static volatile d1 b;

    public interface AttributionListener {
        void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);
    }

    public static final class a {
        public static final z2 a;
        static final MyTrackerConfig b;

        static {
            z2 z2VarX = z2.x();
            a = z2VarX;
            b = MyTrackerConfig.newConfig(z2VarX);
        }
    }

    private static void a(int i, boolean z) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(i, z);
        }
    }

    public static void applyPlugin(MyTrackerPluginConfig myTrackerPluginConfig) {
        a.add(myTrackerPluginConfig);
    }

    public static void flush() {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a();
        }
    }

    public static String getInstanceId(Context context) {
        return c3.a(context);
    }

    public static MyTrackerConfig getTrackerConfig() {
        return a.b;
    }

    public static MyTrackerParams getTrackerParams() {
        return a.a.m();
    }

    public static String handleDeeplink(Intent intent) {
        d1 d1Var = b;
        if (d1Var != null) {
            return d1Var.a(intent);
        }
        y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    public static void incrementEventTimeSpent(int i) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(i);
        }
    }

    public static void initTracker(String str, Application application) {
        if (TextUtils.isEmpty(str)) {
            y2.b("MyTracker initialization failed: id can't be empty");
            return;
        }
        if (b != null) {
            y2.c("MyTracker has already been initialized");
            return;
        }
        synchronized (MyTracker.class) {
            try {
                if (b != null) {
                    y2.c("MyTracker has already been initialized");
                    return;
                }
                z2 z2Var = a.a;
                ArrayList arrayList = new ArrayList(a);
                d1 d1VarA = d1.a(str, z2Var, application);
                d1VarA.a(arrayList);
                b = d1VarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isDebugMode() {
        return y2.a();
    }

    public static void onActivityResult(int i, Intent intent) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(i, intent);
        }
    }

    public static void onPurchasesUpdated(int i, List<Object> list) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(i, list);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    public static void setDebugMode(boolean z) {
        y2.a(z);
    }

    public static void startAnytimeTimeSpent(int i) {
        a(i, true);
    }

    public static void startForegroundTimeSpent(int i) {
        a(i, false);
    }

    public static void stopAnytimeTimeSpent(int i) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.b(i, true);
        }
    }

    public static void stopForegroundTimeSpent(int i) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.b(i, false);
        }
    }

    public static void trackAdEvent(AdEvent adEvent) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(adEvent);
        }
    }

    public static void trackAppGalleryPurchaseEvent(Object obj, String str, String str2, String str3, Map<String, String> map) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(obj, str, str2, str3, map);
        }
    }

    public static void trackEvent(String str) {
        trackEvent(str, null);
    }

    public static void trackInviteEvent() {
        trackInviteEvent(null);
    }

    public static void trackLaunchManually(Activity activity) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(activity);
        }
    }

    public static void trackLevelEvent() {
        trackLevelEvent(null);
    }

    public static void trackLoginEvent(String str, String str2) {
        trackLoginEvent(str, str2, null);
    }

    public static void trackMiniAppEvent(MiniAppEvent miniAppEvent) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(miniAppEvent);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, null);
    }

    public static void trackRegistrationEvent(String str, String str2) {
        trackRegistrationEvent(str, str2, null);
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        a.a.a(attributionListener, handler);
    }

    public static void trackEvent(String str, Map<String, String> map) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(str, map);
        }
    }

    public static void trackInviteEvent(Map<String, String> map) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(map);
        }
    }

    public static void trackLevelEvent(int i, Map<String, String> map) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(i, map);
        }
    }

    public static void trackLoginEvent(String str, String str2, Map<String, String> map) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(str, str2, map);
        }
    }

    public static void trackPurchaseEvent(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.a(jSONObject, jSONObject2, str, map);
        }
    }

    public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.b(str, str2, map);
        }
    }

    public static void trackLevelEvent(Map<String, String> map) {
        d1 d1Var = b;
        if (d1Var == null) {
            y2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            d1Var.b(map);
        }
    }
}
