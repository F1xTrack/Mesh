package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ok */
/* loaded from: classes2.dex */
public final class C5354ok implements InterfaceC5331nm {

    /* renamed from: d */
    public static final long f32358d = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: a */
    public final Context f32359a;

    /* renamed from: b */
    public final PermissionExtractor f32360b;

    /* renamed from: c */
    public final CachedDataProvider.CachedData f32361c;

    public C5354ok(Context context) {
        long j = f32358d;
        this.f32361c = new CachedDataProvider.CachedData(j, j, "sim-info");
        this.f32359a = context;
        this.f32360b = C5244ka.m20614h().m20623g();
    }

    /* renamed from: b */
    public final C5229jk m20881b() {
        return new C5229jk((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f32359a, "phone", "getting SimMcc", "TelephonyManager", new C5254kk()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f32359a, "phone", "getting SimMnc", "TelephonyManager", new C5279lk()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f32359a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C5329nk(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f32359a, "phone", "getting SimOperatorName", "TelephonyManager", new C5304mk()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC5331nm
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<io.appmetrica.analytics.impl.C5229jk> mo20845a() {
        /*
            r4 = this;
            monitor-enter(r4)
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r0 = r4.f32361c     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.getData()     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L66
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.f32361c     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.shouldUpdateData()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L66
            goto L1c
        L1a:
            r0 = move-exception
            goto L68
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.ka r1 = io.appmetrica.analytics.impl.C5244ka.f32038C     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.il r1 = r1.f32061u     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.gl r1 = r1.m20578a()     // Catch: java.lang.Throwable -> L1a
            io.appmetrica.analytics.impl.z4 r1 = r1.f31795n     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.f32910d     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L61
            r1 = 23
            boolean r1 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(r1)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L5a
            io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor r1 = r4.f32360b     // Catch: java.lang.Throwable -> L1a
            android.content.Context r2 = r4.f32359a     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r1 = r1.hasPermission(r2, r3)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L4c
            android.content.Context r1 = r4.f32359a     // Catch: java.lang.Throwable -> L1a
            java.util.List r1 = io.appmetrica.analytics.impl.C5379pk.m20917a(r1)     // Catch: java.lang.Throwable -> L1a
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L1a
        L4c:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L61
            io.appmetrica.analytics.impl.jk r1 = r4.m20881b()     // Catch: java.lang.Throwable -> L1a
            r0.add(r1)     // Catch: java.lang.Throwable -> L1a
            goto L61
        L5a:
            io.appmetrica.analytics.impl.jk r1 = r4.m20881b()     // Catch: java.lang.Throwable -> L1a
            r0.add(r1)     // Catch: java.lang.Throwable -> L1a
        L61:
            io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider$CachedData r1 = r4.f32361c     // Catch: java.lang.Throwable -> L1a
            r1.setData(r0)     // Catch: java.lang.Throwable -> L1a
        L66:
            monitor-exit(r4)
            return r0
        L68:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5354ok.mo20845a():java.util.List");
    }
}
