package com.huawei.hms.framework.network.grs.p011h;

import com.huawei.hms.framework.common.Logger;

/* renamed from: com.huawei.hms.framework.network.grs.h.e */
/* loaded from: classes.dex */
public class C2120e {

    /* renamed from: a */
    private static final String f19118a = "e";

    /* renamed from: a */
    public static boolean m11870a(Long l) {
        if (l == null) {
            Logger.m11687v(f19118a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.m11687v(f19118a, "isSpExpire spValue NumberFormatException.");
        }
        if (l.longValue() - System.currentTimeMillis() >= 0) {
            Logger.m11685i(f19118a, "isSpExpire false.");
            return false;
        }
        Logger.m11685i(f19118a, "isSpExpire true.");
        return true;
    }

    /* renamed from: a */
    public static boolean m11871a(Long l, long j) {
        if (l == null) {
            Logger.m11687v(f19118a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l.longValue() - (System.currentTimeMillis() + j) >= 0) {
                Logger.m11687v(f19118a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.m11687v(f19118a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
