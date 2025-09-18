package com.yandex.metrica;

import com.yandex.metrica.ReporterConfig;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class t {
    public final ReporterConfig.Builder a;
    public final LinkedHashMap b = new LinkedHashMap();

    public t(String str) {
        this.a = ReporterConfig.newConfigBuilder(str);
    }
}
