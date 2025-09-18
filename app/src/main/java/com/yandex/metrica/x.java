package com.yandex.metrica;

import com.yandex.metrica.YandexMetricaConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class x {
    public final YandexMetricaConfig.Builder a;
    public List b;
    public Integer c;
    public Map d;
    public Integer e;
    public Integer f;
    public final LinkedHashMap g = new LinkedHashMap();
    public Boolean h;
    public Boolean i;

    public x(String str) {
        this.a = YandexMetricaConfig.newConfigBuilder(str);
    }
}
