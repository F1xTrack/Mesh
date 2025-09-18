package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.YandexMetricaPlugins;

/* renamed from: com.yandex.metrica.impl.ob.p3 */
/* loaded from: classes2.dex */
public final class C3509p3 implements YandexMetricaPlugins {

    /* renamed from: a */
    private final C3652ug f24407a;

    public C3509p3(C3652ug c3652ug) {
        this.f24407a = c3652ug;
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f24407a.m16923a(pluginErrorDetails, str);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f24407a.m16922a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f24407a.m16924a(str, str2, pluginErrorDetails);
    }
}
