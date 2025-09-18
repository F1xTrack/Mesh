package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.hms.framework.network.grs.d */
/* loaded from: classes.dex */
public class C2094d {

    /* renamed from: a */
    private static final Map<String, C2093c> f19023a = new ConcurrentHashMap(16);

    /* renamed from: b */
    private static final Object f19024b = new Object();

    /* renamed from: a */
    public static C2093c m11730a(GrsBaseInfo grsBaseInfo, Context context) {
        synchronized (f19024b) {
            try {
                int iUniqueCode = grsBaseInfo.uniqueCode();
                Map<String, C2093c> map = f19023a;
                C2093c c2093c = map.get(context.getPackageName() + iUniqueCode);
                if (c2093c == null) {
                    Logger.m11685i("GrsClientManager", "grsClientImpl == null, and new GrsClientImpl");
                    C2093c c2093c2 = new C2093c(context, grsBaseInfo);
                    map.put(context.getPackageName() + iUniqueCode, c2093c2);
                    return c2093c2;
                }
                if (c2093c.m11728a((Object) new C2093c(grsBaseInfo))) {
                    return c2093c;
                }
                Logger.m11685i("GrsClientManager", "The app_name, ser_country, reg_country and issue_country is equal, but other not.");
                C2093c c2093c3 = new C2093c(context, grsBaseInfo);
                map.put(context.getPackageName() + iUniqueCode, c2093c3);
                return c2093c3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
