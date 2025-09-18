package com.huawei.hms.rn.push.logger;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.utils.HMSBIInitializer;
import defpackage.C1167Os1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class HMSLogger {
    private static final String KIT = "Push";
    private static final String NETWORK_TYPE_WIFI = "WIFI";
    private static final String NOT_AVAILABLE = "NOT_AVAILABLE";
    private static final String PERIODIC_EVENT_ID = "60001";
    private static final String PLATFORM = "ReactNative";
    private static final String SERVICE = "Cross-Platform";
    private static final String SINGLE_EVENT_ID = "60000";
    private static final String SUCCESS = "0";
    private static final String TAG = "HMSLogger";
    private static final String UNKNOWN = "UNKNOWN";
    private static final String VERSION = "6.12.0.301";
    private static volatile HMSLogger instance;
    private final Map<String, Long> allCountMap;
    private final ConnectivityManager connectivityManager;
    private final Map<String, Long> failCountMap;
    private final Map<String, Long> firstReceiveTimeMap;
    private final HiAnalyticsUtils hiAnalyticsUtils;
    private boolean isEnabled;
    private final Map<String, Long> lastReceiveTimeMap;
    private final Map<Integer, String> networkTypeMap;
    private final Map<String, Object> periodicEventMap;
    private final Map<String, Map<String, Long>> resultCodeCountMap;
    private final Map<String, Object> singleEventMap;
    private final Map<String, Long> startTimeMap;
    private final WeakReference<Context> weakContext;

    private HMSLogger(Context context) {
        HashMap map = new HashMap();
        this.singleEventMap = map;
        HashMap map2 = new HashMap();
        this.periodicEventMap = map2;
        this.allCountMap = new HashMap();
        this.failCountMap = new HashMap();
        this.startTimeMap = new HashMap();
        this.firstReceiveTimeMap = new HashMap();
        this.lastReceiveTimeMap = new HashMap();
        this.resultCodeCountMap = new HashMap();
        this.networkTypeMap = createNetworkTypeMap();
        this.isEnabled = false;
        this.weakContext = new WeakReference<>(context);
        HiAnalyticsUtils hiAnalyticsUtils = HiAnalyticsUtils.getInstance();
        this.hiAnalyticsUtils = hiAnalyticsUtils;
        this.connectivityManager = (ConnectivityManager) objectCast(context.getSystemService("connectivity"), ConnectivityManager.class);
        hiAnalyticsUtils.enableLog();
        HMSBIInitializer.getInstance(context).initBI();
        setupEventMap(map);
        setupEventMap(map2);
        enableLogger();
    }

    private synchronized Map<Integer, String> createNetworkTypeMap() {
        HashMap map;
        map = new HashMap();
        map.put(0, "UNKNOWN");
        map.put(1, "2G");
        map.put(2, "2G");
        map.put(3, "3G");
        map.put(4, "3G");
        map.put(5, "3G");
        map.put(6, "3G");
        map.put(7, "2G");
        map.put(8, "3G");
        map.put(9, "3G");
        map.put(10, "3G");
        map.put(11, "2G");
        map.put(12, "3G");
        map.put(13, "4G");
        map.put(14, "3G");
        map.put(15, "3G");
        map.put(16, "2G");
        map.put(17, "3G");
        map.put(18, "4G");
        map.put(19, "4G");
        map.put(20, "5G");
        return Collections.unmodifiableMap(map);
    }

    private synchronized String getAppId() {
        try {
        } catch (NullPointerException unused) {
            return NOT_AVAILABLE;
        }
        return C1167Os1.c(getContext()).getString(Core.CLIENT_APP_ID);
    }

    private synchronized String getAppVersionName(String str) {
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            return NOT_AVAILABLE;
        }
        return getContext().getPackageManager().getPackageInfo(str, 0).versionName;
    }

    private synchronized Context getContext() {
        return this.weakContext.get();
    }

    public static synchronized HMSLogger getInstance(Context context) {
        try {
            if (instance == null) {
                synchronized (HMSLogger.class) {
                    try {
                        if (instance == null) {
                            instance = new HMSLogger(context.getApplicationContext());
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    private synchronized String getNetworkType() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager == null) {
            return NOT_AVAILABLE;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return NOT_AVAILABLE;
        }
        int type = activeNetworkInfo.getType();
        if (1 == type) {
            return NETWORK_TYPE_WIFI;
        }
        if (type != 0) {
            return "UNKNOWN";
        }
        return (String) getOrDefault(this.networkTypeMap, Integer.valueOf(activeNetworkInfo.getSubtype()), "UNKNOWN");
    }

    private synchronized <K, V> V getOrDefault(Map<K, V> map, K k, V v) {
        if (map.containsKey(k)) {
            v = map.get(k);
        }
        return v;
    }

    private synchronized void increaseMapValue(String str, Map<String, Long> map) {
        map.put(str, Long.valueOf(((Long) getOrDefault(map, str, 0L)).longValue() + 1));
    }

    private synchronized void increaseResultCodeCount(String str, String str2) {
        Map<String, Long> map = (Map) getOrDefault(this.resultCodeCountMap, str, new HashMap());
        increaseMapValue(str2, map);
        this.resultCodeCountMap.put(str, map);
    }

    private synchronized <S, D> D objectCast(S s, Class<D> cls) {
        return cls.cast(s);
    }

    private synchronized <K, V> void putIfAbsent(Map<K, V> map, K k, V v) {
        if (!map.containsKey(k)) {
            map.put(k, v);
        }
    }

    private synchronized void putToPeriodicEventMap(String str, String str2, long j) {
        try {
            increaseResultCodeCount(str, str2);
            increaseMapValue(str, this.allCountMap);
            if (!str2.equals("0")) {
                increaseMapValue(str, this.failCountMap);
            }
            Long l = (Long) getOrDefault(this.firstReceiveTimeMap, str, Long.valueOf(j));
            l.longValue();
            this.periodicEventMap.put("callTime", l);
            this.periodicEventMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, Integer.valueOf((int) (j - ((Long) getOrDefault(this.lastReceiveTimeMap, str, Long.valueOf(j))).longValue())));
            this.periodicEventMap.put("apiName", str);
            this.periodicEventMap.put("result", this.resultCodeCountMap.get(str));
            Long l2 = (Long) getOrDefault(this.allCountMap, str, 0L);
            l2.longValue();
            this.periodicEventMap.put("allCnt", l2);
            Long l3 = (Long) getOrDefault(this.failCountMap, str, 0L);
            l3.longValue();
            this.periodicEventMap.put("failCnt", l3);
            this.periodicEventMap.put("lastCallTime", Long.valueOf(j));
            this.periodicEventMap.put("networkType", getNetworkType());
            putIfAbsent(this.firstReceiveTimeMap, str, Long.valueOf(j));
            this.lastReceiveTimeMap.put(str, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void putToSingleEventMap(String str, String str2, long j) {
        int iLongValue = (int) (j - ((Long) getOrDefault(this.startTimeMap, str, Long.valueOf(j))).longValue());
        this.singleEventMap.put("apiName", str);
        this.singleEventMap.put("result", str2);
        this.singleEventMap.put("callTime", Long.valueOf(j));
        this.singleEventMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, Integer.valueOf(iLongValue));
        this.singleEventMap.put("networkType", getNetworkType());
    }

    private synchronized void sendEvent(String str, String str2, String str3) {
        try {
            if (this.isEnabled) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (str.equals("60000")) {
                    putToSingleEventMap(str2, str3, jCurrentTimeMillis);
                    this.hiAnalyticsUtils.onNewEvent(getContext(), "60000", this.singleEventMap);
                    Objects.toString(this.singleEventMap);
                } else {
                    putToPeriodicEventMap(str2, str3, jCurrentTimeMillis);
                    this.hiAnalyticsUtils.onNewEvent(getContext(), PERIODIC_EVENT_ID, this.periodicEventMap);
                    Objects.toString(this.periodicEventMap);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void setupEventMap(Map<String, Object> map) {
        map.put("kit", KIT);
        map.put("platform", PLATFORM);
        map.put("version", VERSION);
        map.put("service", SERVICE);
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, getAppId());
        map.put("package", getContext().getPackageName());
        map.put(WiseOpenHianalyticsData.UNION_APP_VERSION, getAppVersionName(getContext().getPackageName()));
        map.put(CommonUrlParts.MODEL, Build.DEVICE);
    }

    public synchronized void disableLogger() {
        this.isEnabled = false;
    }

    public synchronized void enableLogger() {
        this.isEnabled = true;
    }

    public synchronized void sendPeriodicEvent(String str) {
        sendEvent(PERIODIC_EVENT_ID, str, "0");
    }

    public synchronized void sendSingleEvent(String str) {
        sendEvent("60000", str, "0");
    }

    public synchronized void startMethodExecutionTimer(String str) {
        this.startTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public synchronized void sendPeriodicEvent(String str, String str2) {
        sendEvent(PERIODIC_EVENT_ID, str, str2);
    }

    public synchronized void sendSingleEvent(String str, String str2) {
        sendEvent("60000", str, str2);
    }
}
