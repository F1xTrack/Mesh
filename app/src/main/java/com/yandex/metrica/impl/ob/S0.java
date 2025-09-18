package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.IPluginReporter;
import java.util.Map;

/* loaded from: classes2.dex */
public interface S0 extends W0, IPluginReporter {
    void a(int i, String str, String str2, Map<String, String> map);

    void a(String str, String str2);

    void b(String str);

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.s
    /* synthetic */ void b(String str, String str2);

    void c(String str);

    @Override // com.yandex.metrica.impl.ob.W0, com.yandex.metrica.s
    /* synthetic */ void d(String str, String str2);
}
