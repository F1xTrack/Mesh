package defpackage;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;

/* renamed from: Du1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0316Du1 {
    public static final Logger a;

    static {
        Logger defaultLogger;
        C1020Mv1 c1020Mv1 = C1538Tm0.h;
        if (c1020Mv1 == null || (defaultLogger = c1020Mv1.d) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        a = defaultLogger;
    }
}
