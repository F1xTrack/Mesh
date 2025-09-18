package com.huawei.hms.push.utils.p014ha;

/* loaded from: classes.dex */
public class PushAnalyticsCenter {

    /* renamed from: a */
    private PushBaseAnalytics f19484a;

    /* renamed from: com.huawei.hms.push.utils.ha.PushAnalyticsCenter$a */
    public static class C2238a {

        /* renamed from: a */
        private static PushAnalyticsCenter f19485a = new PushAnalyticsCenter();
    }

    public static PushAnalyticsCenter getInstance() {
        return C2238a.f19485a;
    }

    public PushBaseAnalytics getPushAnalytics() {
        return this.f19484a;
    }

    public void register(PushBaseAnalytics pushBaseAnalytics) {
        this.f19484a = pushBaseAnalytics;
    }
}
