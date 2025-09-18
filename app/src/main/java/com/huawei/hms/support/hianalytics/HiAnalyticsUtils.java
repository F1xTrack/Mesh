package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.C2246a;
import com.huawei.hms.stats.HiAnalyticsOfCpUtils;
import com.huawei.hms.stats.HianalyticsExist;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AnalyticsSwitchHolder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class HiAnalyticsUtils {

    /* renamed from: c */
    private static final Object f19538c = new Object();

    /* renamed from: d */
    private static final Object f19539d = new Object();

    /* renamed from: e */
    private static HiAnalyticsUtils f19540e;

    /* renamed from: a */
    private int f19541a = 0;

    /* renamed from: b */
    private final boolean f19542b = HianalyticsExist.isHianalyticsExist();

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$a */
    public class RunnableC2263a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19543a;

        /* renamed from: b */
        final /* synthetic */ String f19544b;

        /* renamed from: c */
        final /* synthetic */ Map f19545c;

        public RunnableC2263a(Context context, String str, Map map) {
            this.f19543a = context;
            this.f19544b = str;
            this.f19545c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent(this.f19543a, this.f19544b, this.f19545c);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$b */
    public class RunnableC2264b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19547a;

        /* renamed from: b */
        final /* synthetic */ String f19548b;

        /* renamed from: c */
        final /* synthetic */ String f19549c;

        public RunnableC2264b(Context context, String str, String str2) {
            this.f19547a = context;
            this.f19548b = str;
            this.f19549c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onEvent2(this.f19547a, this.f19548b, this.f19549c);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$c */
    public class RunnableC2265c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19551a;

        /* renamed from: b */
        final /* synthetic */ String f19552b;

        /* renamed from: c */
        final /* synthetic */ Map f19553c;

        public RunnableC2265c(Context context, String str, Map map) {
            this.f19551a = context;
            this.f19552b = str;
            this.f19553c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.f19551a, this.f19552b, this.f19553c);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$d */
    public class RunnableC2266d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19555a;

        /* renamed from: b */
        final /* synthetic */ String f19556b;

        /* renamed from: c */
        final /* synthetic */ Map f19557c;

        /* renamed from: d */
        final /* synthetic */ int f19558d;

        public RunnableC2266d(Context context, String str, Map map, int i) {
            this.f19555a = context;
            this.f19556b = str;
            this.f19557c = map;
            this.f19558d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onNewEvent(this.f19555a, this.f19556b, this.f19557c, this.f19558d);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$e */
    public class RunnableC2267e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19560a;

        /* renamed from: b */
        final /* synthetic */ String f19561b;

        /* renamed from: c */
        final /* synthetic */ Map f19562c;

        public RunnableC2267e(Context context, String str, Map map) {
            this.f19560a = context;
            this.f19561b = str;
            this.f19562c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.f19560a, this.f19561b, this.f19562c);
        }
    }

    /* renamed from: com.huawei.hms.support.hianalytics.HiAnalyticsUtils$f */
    public class RunnableC2268f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19564a;

        /* renamed from: b */
        final /* synthetic */ String f19565b;

        /* renamed from: c */
        final /* synthetic */ Map f19566c;

        /* renamed from: d */
        final /* synthetic */ int f19567d;

        public RunnableC2268f(Context context, String str, Map map, int i) {
            this.f19564a = context;
            this.f19565b = str;
            this.f19566c = map;
            this.f19567d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            HiAnalyticsUtils.getInstance().onReport(this.f19564a, this.f19565b, this.f19566c, this.f19567d);
        }
    }

    private HiAnalyticsUtils() {
    }

    /* renamed from: a */
    private static LinkedHashMap<String, String> m12601a(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    private void m12607b(Context context) {
        synchronized (f19539d) {
            try {
                int i = this.f19541a;
                if (i < 60) {
                    this.f19541a = i + 1;
                } else {
                    this.f19541a = 0;
                    if (this.f19542b) {
                        HiAnalyticsOfCpUtils.onReport(context, 0);
                        HiAnalyticsOfCpUtils.onReport(context, 1);
                    } else {
                        HmsHiAnalyticsUtils.onReport();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    private void m12611c(Context context, String str, Map map) {
        try {
            C2246a.m12561c().m12563a(new RunnableC2267e(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            HMSLog.m12620e("HiAnalyticsUtils", "<addOnReportToCache> failed. " + th.getMessage());
        }
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (f19538c) {
            try {
                if (f19540e == null) {
                    f19540e = new HiAnalyticsUtils();
                }
                hiAnalyticsUtils = f19540e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hiAnalyticsUtils;
    }

    public static String versionCodeToName(String str) throws NumberFormatException {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + "." + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + "." + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + "." + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public void enableLog(Context context) {
        HMSLog.m12622i("HiAnalyticsUtils", "Enable Log");
        if (this.f19542b) {
            HiAnalyticTools.enableLog(context);
        } else {
            HmsHiAnalyticsUtils.enableLog();
        }
    }

    public boolean getInitFlag() {
        return !this.f19542b ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public int getOobeAnalyticsState(Context context) throws Settings.SettingNotFoundException {
        if (context == null) {
            return 0;
        }
        int iM12600a = m12600a(context);
        if (iM12600a == 1) {
            return iM12600a;
        }
        Bundle bundle = new Bundle();
        bundle.putString("hms_cp_bundle_key", "content://com.huawei.hms.contentprovider/com.huawei.hms.privacy.HmsAnalyticsStateProvider");
        try {
            Bundle bundleCall = context.getApplicationContext().getContentResolver().call(Uri.parse("content://com.huawei.hms.contentprovider"), "getAnalyticsState", (String) null, bundle);
            if (bundleCall == null) {
                return iM12600a;
            }
            iM12600a = bundleCall.getInt("SWITCH_IS_CHECKED");
            HMSLog.m12622i("HiAnalyticsUtils", "get hms analyticsOobe state " + iM12600a);
            return iM12600a;
        } catch (IllegalArgumentException unused) {
            HMSLog.m12622i("HiAnalyticsUtils", "getOobeAnalyticsState IllegalArgumentException ");
            return iM12600a;
        } catch (SecurityException unused2) {
            HMSLog.m12622i("HiAnalyticsUtils", "getOobeAnalyticsState SecurityException ");
            return iM12600a;
        } catch (Exception unused3) {
            HMSLog.m12622i("HiAnalyticsUtils", "getOobeAnalyticsState Exception ");
            return iM12600a;
        }
    }

    public boolean hasError(Context context) {
        return AnalyticsSwitchHolder.isAnalyticsDisabled(context);
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        onEvent2(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.m12620e("HiAnalyticsUtils", "<onEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (m12606a(initFlag, andRefreshAnalyticsState != 2, map)) {
            m12603a(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f19542b) {
                HiAnalyticsOfCpUtils.onEvent(context, 0, str, m12601a(map));
                HiAnalyticsOfCpUtils.onEvent(context, 1, str, m12601a(map));
            } else {
                HmsHiAnalyticsUtils.onEvent(0, str, m12601a(map));
                HmsHiAnalyticsUtils.onEvent(1, str, m12601a(map));
            }
            m12607b(context);
        }
    }

    public void onEvent2(Context context, String str, String str2) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (context == null) {
            HMSLog.m12620e("HiAnalyticsUtils", "<onEvent2> context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (!initFlag && andRefreshAnalyticsState != 2 && m12605a(str2)) {
            m12602a(context, str, str2);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f19542b) {
                HiAnalyticsOfCpUtils.onEvent(context, str, str2);
            } else {
                HmsHiAnalyticsUtils.onEvent(context, str, str2);
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.m12620e("HiAnalyticsUtils", "<onNewEvent> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (m12606a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            m12608b(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f19542b) {
                HiAnalyticsOfCpUtils.onEvent(context, 0, str, m12601a((Map<String, String>) map));
                HiAnalyticsOfCpUtils.onEvent(context, 1, str, m12601a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onEvent(0, str, m12601a((Map<String, String>) map));
                HmsHiAnalyticsUtils.onEvent(1, str, m12601a((Map<String, String>) map));
            }
            m12607b(context);
        }
    }

    public void onReport(Context context, String str, Map map) {
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map == null || map.isEmpty() || context == null) {
            HMSLog.m12620e("HiAnalyticsUtils", "<onReport> map or context is null, state: " + andRefreshAnalyticsState);
            return;
        }
        boolean initFlag = getInitFlag();
        if (m12606a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
            m12611c(context, str, map);
        }
        if (andRefreshAnalyticsState == 1 && initFlag) {
            if (this.f19542b) {
                HiAnalyticsOfCpUtils.onStreamEvent(context, 0, str, m12601a((Map<String, String>) map));
                HiAnalyticsOfCpUtils.onStreamEvent(context, 1, str, m12601a((Map<String, String>) map));
            } else {
                HmsHiAnalyticsUtils.onStreamEvent(0, str, m12601a((Map<String, String>) map));
                HmsHiAnalyticsUtils.onStreamEvent(1, str, m12601a((Map<String, String>) map));
            }
        }
    }

    public void enableLog() {
        HMSLog.m12622i("HiAnalyticsUtils", "Enable Log");
        if (!this.f19542b) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HMSLog.m12622i("HiAnalyticsUtils", "cp needs to pass in the context, this method is not supported");
        }
    }

    /* renamed from: a */
    private int m12600a(Context context) throws Settings.SettingNotFoundException {
        int i = 0;
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state");
            HMSLog.m12622i("HiAnalyticsUtils", "getOobeStateForSettings value is " + i);
            return i;
        } catch (Settings.SettingNotFoundException e) {
            HMSLog.m12622i("HiAnalyticsUtils", "Settings.SettingNotFoundException " + e.getMessage());
            return i;
        }
    }

    /* renamed from: a */
    private boolean m12606a(boolean z, boolean z2, Map<?, ?> map) {
        return !z && z2 && m12610b(map);
    }

    /* renamed from: b */
    private boolean m12610b(Map<?, ?> map) {
        try {
            Iterator<?> it = map.values().iterator();
            long length = 0;
            while (it.hasNext()) {
                if (it.next() instanceof String) {
                    length += ((String) r3).getBytes(Charset.forName("UTF-8")).length;
                }
            }
            return length <= 512;
        } catch (Throwable th) {
            HMSLog.m12620e("HiAnalyticsUtils", "<isValidSize map> Exception: " + th.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private boolean m12605a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return str.getBytes(Charset.forName("UTF-8")).length <= 512;
        } catch (Throwable th) {
            HMSLog.m12620e("HiAnalyticsUtils", "<isValidSize String> Exception: " + th.getMessage());
            return false;
        }
    }

    public void onReport(Context context, String str, Map map, int i) {
        if (i != 0 && i != 1) {
            HMSLog.m12620e("HiAnalyticsUtils", "<onReport with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (m12606a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
                m12609b(context, str, map, i);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.f19542b) {
                    HmsHiAnalyticsUtils.onStreamEvent(i, str, m12601a((Map<String, String>) map));
                    return;
                } else {
                    HiAnalyticsOfCpUtils.onStreamEvent(context, i, str, m12601a((Map<String, String>) map));
                    return;
                }
            }
            return;
        }
        HMSLog.m12620e("HiAnalyticsUtils", "<onReport with type> map or context is null, state: " + andRefreshAnalyticsState);
    }

    /* renamed from: a */
    private void m12603a(Context context, String str, Map<String, String> map) {
        try {
            C2246a.m12561c().m12563a(new RunnableC2263a(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            HMSLog.m12620e("HiAnalyticsUtils", "<addOnEventToCache> failed. " + th.getMessage());
        }
    }

    public void onNewEvent(Context context, String str, Map map, int i) {
        if (i != 0 && i != 1) {
            HMSLog.m12620e("HiAnalyticsUtils", "<onNewEvent with type> Data reporting type is not supported");
            return;
        }
        int andRefreshAnalyticsState = AnalyticsSwitchHolder.getAndRefreshAnalyticsState(context);
        if (map != null && !map.isEmpty() && context != null) {
            boolean initFlag = getInitFlag();
            if (m12606a(initFlag, andRefreshAnalyticsState != 2, (Map<?, ?>) map)) {
                m12604a(context, str, map, i);
            }
            if (andRefreshAnalyticsState == 1 && initFlag) {
                if (!this.f19542b) {
                    HmsHiAnalyticsUtils.onEvent(i, str, m12601a((Map<String, String>) map));
                } else {
                    HiAnalyticsOfCpUtils.onEvent(context, i, str, m12601a((Map<String, String>) map));
                }
                m12607b(context);
                return;
            }
            return;
        }
        HMSLog.m12620e("HiAnalyticsUtils", "<onNewEvent with type> map or context is null, state: " + andRefreshAnalyticsState);
    }

    /* renamed from: b */
    private void m12608b(Context context, String str, Map map) {
        try {
            C2246a.m12561c().m12563a(new RunnableC2265c(context.getApplicationContext(), str, map));
        } catch (Throwable th) {
            HMSLog.m12620e("HiAnalyticsUtils", "<addOnNewEventToCache> failed. " + th.getMessage());
        }
    }

    /* renamed from: a */
    private void m12602a(Context context, String str, String str2) {
        try {
            C2246a.m12561c().m12563a(new RunnableC2264b(context.getApplicationContext(), str, str2));
        } catch (Throwable th) {
            HMSLog.m12620e("HiAnalyticsUtils", "<addOnEvent2ToCache> Failed. " + th.getMessage());
        }
    }

    /* renamed from: b */
    private void m12609b(Context context, String str, Map map, int i) {
        try {
            C2246a.m12561c().m12563a(new RunnableC2268f(context.getApplicationContext(), str, map, i));
        } catch (Throwable th) {
            HMSLog.m12620e("HiAnalyticsUtils", "<addOnReportToCache with type> failed. " + th.getMessage());
        }
    }

    /* renamed from: a */
    private void m12604a(Context context, String str, Map map, int i) {
        try {
            C2246a.m12561c().m12563a(new RunnableC2266d(context.getApplicationContext(), str, map, i));
        } catch (Throwable th) {
            HMSLog.m12620e("HiAnalyticsUtils", "<addOnNewEventToCache with type> failed. " + th.getMessage());
        }
    }
}
