package com.huawei.hms.aaid.plugin;

/* loaded from: classes.dex */
public class ProxyCenter {
    private PushProxy proxy;

    /* renamed from: com.huawei.hms.aaid.plugin.ProxyCenter$a */
    public static class C2014a {

        /* renamed from: a */
        private static ProxyCenter f18687a = new ProxyCenter();
    }

    private static ProxyCenter getInstance() {
        return C2014a.f18687a;
    }

    public static PushProxy getProxy() {
        return getInstance().proxy;
    }

    public static void register(PushProxy pushProxy) {
        getInstance().proxy = pushProxy;
    }
}
