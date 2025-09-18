package io.sentry.config;

import io.sentry.util.AbstractC6175h;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.config.c */
/* loaded from: classes2.dex */
public final class C6005c implements InterfaceC6006d {
    /* renamed from: b */
    public static String m21770b(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.InterfaceC6006d
    /* renamed from: a */
    public final String mo21768a(String str) {
        return AbstractC6175h.m21884b(System.getenv(m21770b(str)));
    }

    @Override // io.sentry.config.InterfaceC6006d
    public final Map getMap() {
        String strM21884b;
        String str = m21770b("tags") + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (strM21884b = AbstractC6175h.m21884b(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(str.length()).toLowerCase(Locale.ROOT), strM21884b);
            }
        }
        return concurrentHashMap;
    }
}
