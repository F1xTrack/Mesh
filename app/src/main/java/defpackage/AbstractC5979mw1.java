package defpackage;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;

/* renamed from: mw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5979mw1 {
    public static final Logger a;
    public static final F71 b;
    public static final F71 c;

    static {
        Logger defaultLogger;
        C1020Mv1 c1020Mv1 = C1538Tm0.h;
        if (c1020Mv1 == null || (defaultLogger = c1020Mv1.d) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        a = defaultLogger;
        b = LB.b(C0628Hu1.F);
        c = LB.b(C0628Hu1.G);
    }

    public static C0391Et1 a() {
        C1020Mv1 c1020Mv1 = C1538Tm0.h;
        if (c1020Mv1 != null) {
            return c1020Mv1.i ? (C0391Et1) b.getValue() : (C0391Et1) c.getValue();
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }
}
