package defpackage;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.EmptyAnalyticsSender;
import com.vk.push.common.clientid.ClientIdCallback;
import com.vk.push.core.network.PusherHostProvider;

/* renamed from: Yu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1953Yu1 {
    public static final Logger a;
    public static final F71 b;
    public static final F71 c;
    public static final F71 d;
    public static final F71 e;
    public static final F71 f;
    public static final F71 g;
    public static final F71 h;
    public static final F71 i;
    public static final F71 j;
    public static final F71 k;
    public static final F71 l;
    public static final F71 m;
    public static final F71 n;
    public static final F71 o;
    public static final F71 p;
    public static final F71 q;
    public static final F71 r;
    public static final F71 s;
    public static final F71 t;
    public static final F71 u;
    public static final F71 v;
    public static final F71 w;
    public static final F71 x;

    static {
        Logger defaultLogger;
        C1020Mv1 c1020Mv1 = C1538Tm0.h;
        if (c1020Mv1 == null || (defaultLogger = c1020Mv1.d) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        a = defaultLogger;
        b = LB.b(C0628Hu1.m);
        c = LB.b(C0628Hu1.y);
        d = LB.b(C0628Hu1.C);
        e = LB.b(C0628Hu1.i);
        f = LB.b(C0628Hu1.A);
        g = LB.b(C0628Hu1.n);
        h = LB.b(C0628Hu1.w);
        i = LB.b(C0628Hu1.x);
        j = LB.b(C0628Hu1.h);
        k = LB.b(C0628Hu1.v);
        l = LB.b(C0628Hu1.l);
        m = LB.b(C0628Hu1.z);
        n = LB.b(C0628Hu1.p);
        o = LB.b(C0628Hu1.j);
        p = LB.b(C0628Hu1.B);
        q = LB.b(C0628Hu1.g);
        r = LB.b(C0628Hu1.q);
        s = LB.b(C0628Hu1.k);
        t = LB.b(C0628Hu1.t);
        u = LB.b(C0628Hu1.u);
        v = LB.b(C0628Hu1.s);
        w = LB.b(C0628Hu1.o);
        x = LB.b(C0628Hu1.r);
    }

    public static final C1632Ur1 a() {
        Logger defaultLogger;
        C1020Mv1 c1020Mv1 = C1538Tm0.h;
        if (c1020Mv1 == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        ClientIdCallback clientIdCallback = c1020Mv1.c;
        C1020Mv1 c1020Mv12 = C1538Tm0.h;
        if (c1020Mv12 == null || (defaultLogger = c1020Mv12.d) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        return new C1632Ur1(clientIdCallback, defaultLogger);
    }

    public static AnalyticsSender b() {
        C1020Mv1 c1020Mv1 = C1538Tm0.h;
        if (c1020Mv1 != null) {
            return c1020Mv1.i ? (EmptyAnalyticsSender) r.getValue() : (C0538Gq1) q.getValue();
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }

    public static InterfaceC1707Vq1 c() {
        C1020Mv1 c1020Mv1 = C1538Tm0.h;
        if (c1020Mv1 == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        if (c1020Mv1.i) {
            return new C1296Qj1((C0697Ir1) c.getValue());
        }
        C6363ox0 c6363ox0 = (C6363ox0) AbstractC1251Pu1.a.getValue();
        C1020Mv1 c1020Mv12 = C1538Tm0.h;
        if (c1020Mv12 == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        String str = c1020Mv12.b;
        C1020Mv1 c1020Mv13 = C1538Tm0.h;
        if (c1020Mv13 == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        Object pusherHostProvider = c1020Mv13.e;
        if (pusherHostProvider == null) {
            pusherHostProvider = new PusherHostProvider();
        }
        O90.f(c6363ox0, "okHttpClient");
        C2407bs1 c2407bs1 = new C2407bs1();
        c2407bs1.a = c6363ox0;
        c2407bs1.b = str;
        c2407bs1.c = pusherHostProvider;
        C0697Ir1 c0697Ir1 = (C0697Ir1) c.getValue();
        Logger logger = a;
        GK gk = GK.a;
        QF qf = QF.c;
        O90.f(c0697Ir1, "pushStorage");
        O90.f(logger, "logger");
        O90.f(qf, "dispatcher");
        C1155Oo1 c1155Oo1 = new C1155Oo1();
        c1155Oo1.a = c2407bs1;
        c1155Oo1.b = c0697Ir1;
        c1155Oo1.c = logger;
        c1155Oo1.d = qf;
        return c1155Oo1;
    }
}
