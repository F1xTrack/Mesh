package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.D;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class g {
    public static final Charset g = Charset.forName("UTF-8");
    public final Context a;
    public final D b;
    public final ILogger c;
    public final String[] d;
    public final String[] e;
    public final Runtime f;

    public g(Context context, ILogger iLogger, D d) {
        Runtime runtime = Runtime.getRuntime();
        this.a = context;
        io.sentry.config.a.D(d, "The BuildInfoProvider is required.");
        this.b = d;
        io.sentry.config.a.D(iLogger, "The Logger is required.");
        this.c = iLogger;
        this.d = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        io.sentry.config.a.D(runtime, "The Runtime is required.");
        this.f = runtime;
    }
}
