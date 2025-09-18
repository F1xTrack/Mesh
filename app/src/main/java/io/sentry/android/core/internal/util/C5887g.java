package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.android.core.C5832D;
import io.sentry.config.AbstractC6003a;
import java.nio.charset.Charset;

/* renamed from: io.sentry.android.core.internal.util.g */
/* loaded from: classes2.dex */
public final class C5887g {

    /* renamed from: g */
    public static final Charset f33763g = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f33764a;

    /* renamed from: b */
    public final C5832D f33765b;

    /* renamed from: c */
    public final ILogger f33766c;

    /* renamed from: d */
    public final String[] f33767d;

    /* renamed from: e */
    public final String[] f33768e;

    /* renamed from: f */
    public final Runtime f33769f;

    public C5887g(Context context, ILogger iLogger, C5832D c5832d) {
        Runtime runtime = Runtime.getRuntime();
        this.f33764a = context;
        AbstractC6003a.m21735D(c5832d, "The BuildInfoProvider is required.");
        this.f33765b = c5832d;
        AbstractC6003a.m21735D(iLogger, "The Logger is required.");
        this.f33766c = iLogger;
        this.f33767d = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f33768e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        AbstractC6003a.m21735D(runtime, "The Runtime is required.");
        this.f33769f = runtime;
    }
}
