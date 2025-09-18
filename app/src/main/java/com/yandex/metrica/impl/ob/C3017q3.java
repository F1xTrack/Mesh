package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.YandexMetricaPlugins;
import defpackage.O90;

/* renamed from: com.yandex.metrica.impl.ob.q3 */
/* loaded from: classes2.dex */
public final class C3017q3 {
    private static final YandexMetricaPlugins a;

    static {
        Y yG = Y.g();
        O90.e(yG, "ClientServiceLocator.getInstance()");
        InterfaceExecutorC3086sn interfaceExecutorC3086snC = yG.c();
        O90.e(interfaceExecutorC3086snC, "ClientServiceLocator.get…stance().apiProxyExecutor");
        a = new C2992p3(new C3129ug(interfaceExecutorC3086snC));
    }

    public static final YandexMetricaPlugins a() {
        return a;
    }
}
