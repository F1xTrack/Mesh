package com.p019vk.push.core.network.utils;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p000.C40;
import p000.C7356Av0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m22267d2 = {"LC40;", "", "", "params", "addQueryParams", "(LC40;Ljava/util/Map;)LC40;", "core-network_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HttpUrlExtensionsKt {
    public static final C40 addQueryParams(C40 c40, Map<String, String> map) {
        O90.m5968f(c40, "<this>");
        O90.m5968f(map, "params");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            O90.m5968f(key, "name");
            if (c40.f1175g == null) {
                c40.f1175g = new ArrayList();
            }
            ArrayList arrayList = c40.f1175g;
            O90.m5965c(arrayList);
            arrayList.add(C7356Av0.m381v(key, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
            ArrayList arrayList2 = c40.f1175g;
            O90.m5965c(arrayList2);
            arrayList2.add(value != null ? C7356Av0.m381v(value, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
        }
        return c40;
    }
}
