package com.huawei.hms.framework.network.grs.p011h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.hms.framework.network.grs.h.d */
/* loaded from: classes.dex */
public class C2119d {

    /* renamed from: a */
    private static final Map<String, a> f19115a = new ConcurrentHashMap(16);

    /* renamed from: com.huawei.hms.framework.network.grs.h.d$a */
    public static class a {

        /* renamed from: a */
        private final long f19116a;

        /* renamed from: b */
        private final long f19117b;

        public a(long j, long j2) {
            this.f19116a = j;
            this.f19117b = j2;
        }

        /* renamed from: a */
        public boolean m11869a() {
            return SystemClock.elapsedRealtime() - this.f19117b <= this.f19116a;
        }
    }

    /* renamed from: a */
    public static a m11867a(String str) {
        StringBuilder sb = new StringBuilder("map size of get is before: ");
        Map<String, a> map = f19115a;
        sb.append(map.size());
        Logger.m11687v("RequestUtil", sb.toString());
        a aVar = map.get(str);
        Logger.m11687v("RequestUtil", "map size of get is after: " + map.size());
        return aVar;
    }

    /* renamed from: a */
    public static void m11868a(String str, a aVar) {
        StringBuilder sb = new StringBuilder("map size of put is before: ");
        Map<String, a> map = f19115a;
        sb.append(map.size());
        Logger.m11687v("RequestUtil", sb.toString());
        map.put(str, aVar);
        Logger.m11687v("RequestUtil", "map size of put is after: " + map.size());
    }
}
