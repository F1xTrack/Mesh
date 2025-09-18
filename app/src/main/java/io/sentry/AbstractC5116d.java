package io.sentry;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5116d {
    public static List a(io.sentry.config.d dVar, String str) {
        String strA = dVar.a(str);
        return strA != null ? Arrays.asList(strA.split(StringUtils.COMMA)) : Collections.emptyList();
    }

    public static boolean b(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.k(EnumC5148n1.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public static void c(ConcurrentHashMap concurrentHashMap, String str, A0 a0, String str2, ILogger iLogger) {
        Object obj = concurrentHashMap.get(str);
        a0.u(str2);
        a0.r(iLogger, obj);
    }
}
