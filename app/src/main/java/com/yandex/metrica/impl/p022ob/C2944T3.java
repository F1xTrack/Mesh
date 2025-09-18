package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.T3 */
/* loaded from: classes2.dex */
public class C2944T3 {

    /* renamed from: a */
    private final C2969U3 f22365a;

    /* renamed from: b */
    private final CounterConfiguration f22366b;

    /* JADX WARN: Removed duplicated region for block: B:74:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2944T3(android.os.Bundle r5) {
        /*
            r4 = this;
            r4.<init>()
            com.yandex.metrica.impl.ob.U3 r0 = com.yandex.metrica.impl.p022ob.C2969U3.m15252a(r5)
            r4.f22365a = r0
            r0 = 0
            if (r5 == 0) goto L15
            java.lang.String r1 = "COUNTER_CFG_OBJ"
            android.os.Parcelable r1 = r5.getParcelable(r1)     // Catch: java.lang.Throwable -> La5
            com.yandex.metrica.CounterConfiguration r1 = (com.yandex.metrica.CounterConfiguration) r1     // Catch: java.lang.Throwable -> La5
            r0 = r1
        L15:
            if (r0 != 0) goto L1c
            com.yandex.metrica.CounterConfiguration r0 = new com.yandex.metrica.CounterConfiguration
            r0.<init>()
        L1c:
            monitor-enter(r0)
            if (r5 != 0) goto L21
            goto La4
        L21:
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L42
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3d
            android.content.ContentValues r2 = r0.f20731a     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "CFG_DISPATCH_PERIOD"
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r5 = move-exception
            goto La8
        L3f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r5     // Catch: java.lang.Throwable -> L3d
        L42:
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L61
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3d
            android.content.ContentValues r2 = r0.f20731a     // Catch: java.lang.Throwable -> L5e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "CFG_SESSION_TIMEOUT"
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            goto L61
        L5e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r5     // Catch: java.lang.Throwable -> L3d
        L61:
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L85
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L3d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3d
            android.content.ContentValues r2 = r0.f20731a     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "CFG_MAX_REPORTS_COUNT"
            if (r1 > 0) goto L79
            r1 = 2147483647(0x7fffffff, float:NaN)
        L79:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L82
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            goto L85
        L82:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r5     // Catch: java.lang.Throwable -> L3d
        L85:
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto La4
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "-1"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto La4
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r5 = r5.getString(r1)     // Catch: java.lang.Throwable -> L3d
            r0.m13777j(r5)     // Catch: java.lang.Throwable -> L3d
        La4:
            monitor-exit(r0)
        La5:
            r4.f22366b = r0
            return
        La8:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2944T3.<init>(android.os.Bundle):void");
    }

    /* renamed from: a */
    public C2969U3 m15167a() {
        return this.f22365a;
    }

    /* renamed from: b */
    public CounterConfiguration m15168b() {
        return this.f22366b;
    }

    public String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f22365a + ", mCounterConfiguration=" + this.f22366b + '}';
    }

    /* renamed from: a */
    public static boolean m15166a(C2944T3 c2944t3, Context context) {
        return (c2944t3.f22365a != null && context.getPackageName().equals(c2944t3.f22365a.m15264f()) && c2944t3.f22365a.m15267i() == YandexMetrica.getLibraryApiLevel()) ? false : true;
    }

    public C2944T3(C2969U3 c2969u3, CounterConfiguration counterConfiguration) {
        this.f22365a = c2969u3;
        this.f22366b = counterConfiguration;
    }
}
