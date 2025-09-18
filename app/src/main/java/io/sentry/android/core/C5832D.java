package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import io.sentry.ILogger;
import io.sentry.config.AbstractC6003a;
import io.sentry.transport.InterfaceC6155g;

/* renamed from: io.sentry.android.core.D */
/* loaded from: classes2.dex */
public final class C5832D implements InterfaceC6155g {

    /* renamed from: b */
    public static final C5832D f33521b = new C5832D();

    /* renamed from: a */
    public Object f33522a;

    public C5832D() {
        this.f33522a = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0097  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean m21516a() {
        /*
            r4 = this;
            java.lang.String r0 = "google_sdk"
            java.lang.String r1 = "generic"
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L18
            java.lang.String r2 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            goto L18
        L15:
            r0 = move-exception
            goto L9d
        L18:
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L15
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = "unknown"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "goldfish"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            java.lang.String r2 = "ranchu"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L15
            boolean r2 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            java.lang.String r2 = "Emulator"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            java.lang.String r2 = "Android SDK built for x86"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "Genymotion"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L97
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "sdk_google"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L97
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "sdk"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "sdk_x86"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "vbox86p"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "emulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L97
            java.lang.String r0 = "simulator"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L95
            goto L97
        L95:
            r0 = 0
            goto L98
        L97:
            r0 = 1
        L98:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L15
            return r0
        L9d:
            io.sentry.n1 r1 = io.sentry.EnumC6069n1.ERROR
            java.lang.String r2 = "Error checking whether application is running in an emulator."
            java.lang.Object r3 = r4.f33522a
            io.sentry.ILogger r3 = (io.sentry.ILogger) r3
            r3.mo21406d(r1, r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5832D.m21516a():java.lang.Boolean");
    }

    @Override // io.sentry.transport.InterfaceC6155g
    public boolean isConnected() {
        int i = AbstractC5909r.f33852a[((SentryAndroidOptions) this.f33522a).getConnectionStatusProvider().mo21389b().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public C5832D(SentryAndroidOptions sentryAndroidOptions) {
        this.f33522a = sentryAndroidOptions;
    }

    public C5832D(ILogger iLogger) {
        AbstractC6003a.m21735D(iLogger, "The ILogger object is required.");
        this.f33522a = iLogger;
    }
}
