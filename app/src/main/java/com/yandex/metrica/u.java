package com.yandex.metrica;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u extends ReporterConfig {
    public final Map a;

    public u(t tVar) {
        super(tVar.a);
        LinkedHashMap linkedHashMap = tVar.b;
        this.a = linkedHashMap == null ? null : Collections.unmodifiableMap(linkedHashMap);
    }

    public u(ReporterConfig reporterConfig) {
        super(reporterConfig);
        if (reporterConfig instanceof u) {
            this.a = ((u) reporterConfig).a;
        } else {
            this.a = null;
        }
    }
}
