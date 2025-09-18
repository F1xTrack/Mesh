package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2627ac;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3001pc {
    public static final Map<String, C2627ac.a> a;

    static {
        HashMap map = new HashMap();
        map.put("google", C2627ac.a.GOOGLE);
        map.put("huawei", C2627ac.a.HMS);
        map.put("yandex", C2627ac.a.YANDEX);
        a = Collections.unmodifiableMap(map);
    }
}
