package com.p019vk.push.core.remote.config.omicron;

import java.util.concurrent.ExecutorService;
import p000.AbstractC11989zx0;
import p000.C7360Ax0;

/* renamed from: com.vk.push.core.remote.config.omicron.d */
/* loaded from: classes2.dex */
public final class C2425d extends AbstractC11989zx0 {

    /* renamed from: f */
    public final ExecutorService f20542f;

    /* renamed from: g */
    public final /* synthetic */ C7360Ax0 f20543g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2425d(C7360Ax0 c7360Ax0, OmicronConfig omicronConfig) {
        super(c7360Ax0, omicronConfig);
        this.f20543g = c7360Ax0;
        this.f20542f = c7360Ax0.f488e.newSingleThreadExecutor();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC11989zx0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.p019vk.push.core.remote.config.omicron.Data mo13753c() {
        /*
            r8 = this;
            com.vk.push.core.remote.config.omicron.DataId r0 = r8.f47113d
            Fj r1 = new Fj
            r2 = 4
            r1.<init>(r2, r8)
            java.util.concurrent.ExecutorService r2 = r8.f20542f
            java.util.concurrent.Future r1 = r2.submit(r1)
            com.vk.push.core.remote.config.omicron.OmicronConfig r2 = r8.f47112c
            float r3 = r2.f20513i
            com.vk.push.core.remote.config.omicron.AnalyticsHandler r4 = r2.f20510f
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r5
            long r5 = (long) r3
            r3 = 0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.get(r5, r7)     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.Throwable -> L2c
            com.vk.push.core.remote.config.omicron.Data r1 = (com.p019vk.push.core.remote.config.omicron.Data) r1     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.Throwable -> L2c
            r4.onWaitForActualOnTime(r0)     // Catch: java.util.concurrent.TimeoutException -> L25 java.lang.Throwable -> L27
            goto L2d
        L25:
            r3 = r1
            goto L29
        L27:
            r3 = r1
            goto L2c
        L29:
            r4.onWaitForActualTimeout(r0)
        L2c:
            r1 = r3
        L2d:
            if (r1 != 0) goto L4a
            Ax0 r1 = r8.f20543g
            com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage r1 = r1.f484a
            com.vk.push.core.remote.config.omicron.Data r1 = r1.getData(r0)
            if (r1 != 0) goto L47
            com.vk.push.core.remote.config.omicron.Data$Builder r1 = com.p019vk.push.core.remote.config.omicron.Data.newBuilder()
            com.vk.push.core.remote.config.omicron.Data r1 = r1.build()
            com.vk.push.core.remote.config.omicron.AnalyticsHandler r2 = r2.f20510f
            r2.onCacheMiss(r0)
            goto L4a
        L47:
            r8.m26592d()
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p019vk.push.core.remote.config.omicron.C2425d.mo13753c():com.vk.push.core.remote.config.omicron.Data");
    }
}
