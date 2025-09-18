package io.sentry;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.config.InterfaceC6006d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.d */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6008d {
    /* renamed from: a */
    public static List m21771a(InterfaceC6006d interfaceC6006d, String str) {
        String strMo21768a = interfaceC6006d.mo21768a(str);
        return strMo21768a != null ? Arrays.asList(strMo21768a.split(StringUtils.COMMA)) : Collections.emptyList();
    }

    /* renamed from: b */
    public static boolean m21772b(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.mo21407k(EnumC6069n1.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    /* renamed from: c */
    public static void m21773c(ConcurrentHashMap concurrentHashMap, String str, InterfaceC5749A0 interfaceC5749A0, String str2, ILogger iLogger) {
        Object obj = concurrentHashMap.get(str);
        interfaceC5749A0.mo13828u(str2);
        interfaceC5749A0.mo13825r(iLogger, obj);
    }
}
