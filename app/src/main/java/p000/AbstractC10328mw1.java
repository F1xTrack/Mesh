package p000;

import com.p019vk.push.common.DefaultLogger;
import com.p019vk.push.common.Logger;

/* renamed from: mw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10328mw1 {

    /* renamed from: a */
    public static final Logger f37997a;

    /* renamed from: b */
    public static final F71 f37998b;

    /* renamed from: c */
    public static final F71 f37999c;

    static {
        Logger defaultLogger;
        C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
        if (c7981Mv1 == null || (defaultLogger = c7981Mv1.f7398d) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        f37997a = defaultLogger;
        f37998b = AbstractC0705LB.m4915b(C7719Hu1.f4579F);
        f37999c = AbstractC0705LB.m4915b(C7719Hu1.f4580G);
    }

    /* renamed from: a */
    public static C7561Et1 m23021a() {
        C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
        if (c7981Mv1 != null) {
            return c7981Mv1.f7403i ? (C7561Et1) f37998b.getValue() : (C7561Et1) f37999c.getValue();
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }
}
