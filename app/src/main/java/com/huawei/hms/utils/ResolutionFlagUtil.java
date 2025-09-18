package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ResolutionFlagUtil {

    /* renamed from: a */
    private static volatile ResolutionFlagUtil f19658a;

    /* renamed from: b */
    private static final Map<String, Long> f19659b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final Object f19660c = new Object();

    private ResolutionFlagUtil() {
    }

    /* renamed from: a */
    private void m12714a() {
        long time = new Timestamp(System.currentTimeMillis()).getTime() - 10800000;
        for (String str : f19659b.keySet()) {
            Map<String, Long> map = f19659b;
            Long l = map.get(str);
            if (l == null || l.longValue() == 0) {
                map.remove(str);
                HMSLog.m12622i("ResolutionFlagUtil", "remove resolution flag because the data in this pair was abnormal: " + str);
            } else if (time >= l.longValue()) {
                map.remove(str);
                HMSLog.m12622i("ResolutionFlagUtil", "remove resolution flag because aging time: " + str);
            }
        }
    }

    public static ResolutionFlagUtil getInstance() {
        if (f19658a != null) {
            return f19658a;
        }
        synchronized (f19660c) {
            try {
                if (f19658a == null) {
                    f19658a = new ResolutionFlagUtil();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f19658a;
    }

    public long getResolutionFlag(String str) {
        if (str == null) {
            HMSLog.m12620e("ResolutionFlagUtil", "transactionId is null");
            return 0L;
        }
        Map<String, Long> map = f19659b;
        if (map.get(str) != null) {
            return map.get(str).longValue();
        }
        return 0L;
    }

    public void removeResolutionFlag(String str) {
        if (str == null) {
            HMSLog.m12620e("ResolutionFlagUtil", "transactionId is null");
        } else {
            f19659b.remove(str);
            HMSLog.m12622i("ResolutionFlagUtil", "remove resolution flag");
        }
    }

    public void saveResolutionFlag(String str, long j) {
        if (!TextUtils.isEmpty(str) && j != 0) {
            m12715a(str, j);
            return;
        }
        HMSLog.m12620e("ResolutionFlagUtil", "saveResolutionFlag error, transactionId: " + str + ", timestamp: " + j);
    }

    /* renamed from: a */
    private void m12715a(String str, long j) {
        Map<String, Long> map = f19659b;
        synchronized (map) {
            m12714a();
            map.put(str, Long.valueOf(j));
            HMSLog.m12622i("ResolutionFlagUtil", "save resolution flag");
        }
    }
}
