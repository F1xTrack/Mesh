package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.plugins.YandexMetricaPlugins;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.q3 */
/* loaded from: classes2.dex */
public final class C3535q3 {

    /* renamed from: a */
    private static final YandexMetricaPlugins f24534a;

    static {
        C3065Y c3065yM15442g = C3065Y.m15442g();
        O90.m5967e(c3065yM15442g, "ClientServiceLocator.getInstance()");
        InterfaceExecutorC3607sn interfaceExecutorC3607snM15445c = c3065yM15442g.m15445c();
        O90.m5967e(interfaceExecutorC3607snM15445c, "ClientServiceLocator.get…stance().apiProxyExecutor");
        f24534a = new C3509p3(new C3652ug(interfaceExecutorC3607snM15445c));
    }

    /* renamed from: a */
    public static final YandexMetricaPlugins m16600a() {
        return f24534a;
    }
}
