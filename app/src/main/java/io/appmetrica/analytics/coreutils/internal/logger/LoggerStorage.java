package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class LoggerStorage {

    /* renamed from: a */
    private static HashMap f29720a = new HashMap();

    /* renamed from: b */
    private static final Object f29721b = new Object();

    /* renamed from: c */
    private static volatile PublicLogger f29722c = PublicLogger.getAnonymousInstance();

    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f29722c;
    }

    public static PublicLogger getOrCreateMainPublicLogger(String str) {
        f29722c = getOrCreatePublicLogger(str);
        return f29722c;
    }

    public static PublicLogger getOrCreatePublicLogger(String str) {
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger = (PublicLogger) f29720a.get(str);
        if (publicLogger == null) {
            synchronized (f29721b) {
                try {
                    publicLogger = (PublicLogger) f29720a.get(str);
                    if (publicLogger == null) {
                        publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                        f29720a.put(str, publicLogger);
                    }
                } finally {
                }
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f29720a = new HashMap();
        f29722c = PublicLogger.getAnonymousInstance();
    }
}
