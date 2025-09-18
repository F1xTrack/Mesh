package com.yandex.metrica;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.u */
/* loaded from: classes2.dex */
public final class C3802u extends ReporterConfig {

    /* renamed from: a */
    public final Map f25521a;

    public C3802u(C3801t c3801t) {
        super(c3801t.f25519a);
        LinkedHashMap linkedHashMap = c3801t.f25520b;
        this.f25521a = linkedHashMap == null ? null : Collections.unmodifiableMap(linkedHashMap);
    }

    public C3802u(ReporterConfig reporterConfig) {
        super(reporterConfig);
        if (reporterConfig instanceof C3802u) {
            this.f25521a = ((C3802u) reporterConfig).f25521a;
        } else {
            this.f25521a = null;
        }
    }
}
