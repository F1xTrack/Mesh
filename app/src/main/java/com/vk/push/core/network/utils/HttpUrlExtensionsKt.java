package com.vk.push.core.network.utils;

import defpackage.C0084Av0;
import defpackage.C40;
import defpackage.O90;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LC40;", "", "", "params", "addQueryParams", "(LC40;Ljava/util/Map;)LC40;", "core-network_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpUrlExtensionsKt {
    public static final C40 addQueryParams(C40 c40, Map<String, String> map) {
        O90.f(c40, "<this>");
        O90.f(map, "params");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            O90.f(key, "name");
            if (c40.g == null) {
                c40.g = new ArrayList();
            }
            ArrayList arrayList = c40.g;
            O90.c(arrayList);
            arrayList.add(C0084Av0.v(key, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
            ArrayList arrayList2 = c40.g;
            O90.c(arrayList2);
            arrayList2.add(value != null ? C0084Av0.v(value, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
        }
        return c40;
    }
}
