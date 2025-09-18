package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.StackTraceItem;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.zg */
/* loaded from: classes2.dex */
public class C3259zg implements IPluginReporter {
    private final uo<PluginErrorDetails> a = new ro(new qo("Error details"));
    private final uo<String> b = new ro(new po("Error identifier"));
    private final uo<Collection<StackTraceItem>> c = new oo("Stacktrace");

    public boolean a(PluginErrorDetails pluginErrorDetails, String str) {
        this.a.a(pluginErrorDetails);
        return this.c.a(pluginErrorDetails.getStacktrace()).b();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.a.a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.a.a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.b.a(str);
    }
}
