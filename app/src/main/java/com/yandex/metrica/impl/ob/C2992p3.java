package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.YandexMetricaPlugins;

/* renamed from: com.yandex.metrica.impl.ob.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2992p3 implements YandexMetricaPlugins {
    private final C3129ug a;

    public C2992p3(C3129ug c3129ug) {
        this.a = c3129ug;
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.a.a(pluginErrorDetails, str);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.a.a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.YandexMetricaPlugins
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.a.a(str, str2, pluginErrorDetails);
    }
}
