package io.sentry.config;

import io.sentry.util.h;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class c implements d {
    public static String b(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.d
    public final String a(String str) {
        return h.b(System.getenv(b(str)));
    }

    @Override // io.sentry.config.d
    public final Map getMap() {
        String strB;
        String str = b("tags") + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (strB = h.b(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(str.length()).toLowerCase(Locale.ROOT), strB);
            }
        }
        return concurrentHashMap;
    }
}
