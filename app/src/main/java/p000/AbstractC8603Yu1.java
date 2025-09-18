package p000;

import com.p019vk.push.common.DefaultLogger;
import com.p019vk.push.common.Logger;
import com.p019vk.push.common.analytics.AnalyticsSender;
import com.p019vk.push.common.analytics.EmptyAnalyticsSender;
import com.p019vk.push.common.clientid.ClientIdCallback;
import com.p019vk.push.core.network.PusherHostProvider;

/* renamed from: Yu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8603Yu1 {

    /* renamed from: a */
    public static final Logger f14588a;

    /* renamed from: b */
    public static final F71 f14589b;

    /* renamed from: c */
    public static final F71 f14590c;

    /* renamed from: d */
    public static final F71 f14591d;

    /* renamed from: e */
    public static final F71 f14592e;

    /* renamed from: f */
    public static final F71 f14593f;

    /* renamed from: g */
    public static final F71 f14594g;

    /* renamed from: h */
    public static final F71 f14595h;

    /* renamed from: i */
    public static final F71 f14596i;

    /* renamed from: j */
    public static final F71 f14597j;

    /* renamed from: k */
    public static final F71 f14598k;

    /* renamed from: l */
    public static final F71 f14599l;

    /* renamed from: m */
    public static final F71 f14600m;

    /* renamed from: n */
    public static final F71 f14601n;

    /* renamed from: o */
    public static final F71 f14602o;

    /* renamed from: p */
    public static final F71 f14603p;

    /* renamed from: q */
    public static final F71 f14604q;

    /* renamed from: r */
    public static final F71 f14605r;

    /* renamed from: s */
    public static final F71 f14606s;

    /* renamed from: t */
    public static final F71 f14607t;

    /* renamed from: u */
    public static final F71 f14608u;

    /* renamed from: v */
    public static final F71 f14609v;

    /* renamed from: w */
    public static final F71 f14610w;

    /* renamed from: x */
    public static final F71 f14611x;

    static {
        Logger defaultLogger;
        C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
        if (c7981Mv1 == null || (defaultLogger = c7981Mv1.f7398d) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        f14588a = defaultLogger;
        f14589b = AbstractC0705LB.m4915b(C7719Hu1.f4589m);
        f14590c = AbstractC0705LB.m4915b(C7719Hu1.f4601y);
        f14591d = AbstractC0705LB.m4915b(C7719Hu1.f4576C);
        f14592e = AbstractC0705LB.m4915b(C7719Hu1.f4585i);
        f14593f = AbstractC0705LB.m4915b(C7719Hu1.f4574A);
        f14594g = AbstractC0705LB.m4915b(C7719Hu1.f4590n);
        f14595h = AbstractC0705LB.m4915b(C7719Hu1.f4599w);
        f14596i = AbstractC0705LB.m4915b(C7719Hu1.f4600x);
        f14597j = AbstractC0705LB.m4915b(C7719Hu1.f4584h);
        f14598k = AbstractC0705LB.m4915b(C7719Hu1.f4598v);
        f14599l = AbstractC0705LB.m4915b(C7719Hu1.f4588l);
        f14600m = AbstractC0705LB.m4915b(C7719Hu1.f4602z);
        f14601n = AbstractC0705LB.m4915b(C7719Hu1.f4592p);
        f14602o = AbstractC0705LB.m4915b(C7719Hu1.f4586j);
        f14603p = AbstractC0705LB.m4915b(C7719Hu1.f4575B);
        f14604q = AbstractC0705LB.m4915b(C7719Hu1.f4583g);
        f14605r = AbstractC0705LB.m4915b(C7719Hu1.f4593q);
        f14606s = AbstractC0705LB.m4915b(C7719Hu1.f4587k);
        f14607t = AbstractC0705LB.m4915b(C7719Hu1.f4596t);
        f14608u = AbstractC0705LB.m4915b(C7719Hu1.f4597u);
        f14609v = AbstractC0705LB.m4915b(C7719Hu1.f4595s);
        f14610w = AbstractC0705LB.m4915b(C7719Hu1.f4591o);
        f14611x = AbstractC0705LB.m4915b(C7719Hu1.f4594r);
    }

    /* renamed from: a */
    public static final C8389Ur1 m9423a() {
        Logger defaultLogger;
        C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
        if (c7981Mv1 == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        ClientIdCallback clientIdCallback = c7981Mv1.f7397c;
        C7981Mv1 c7981Mv12 = C8326Tm0.f11511h;
        if (c7981Mv12 == null || (defaultLogger = c7981Mv12.f7398d) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        return new C8389Ur1(clientIdCallback, defaultLogger);
    }

    /* renamed from: b */
    public static AnalyticsSender m9424b() {
        C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
        if (c7981Mv1 != null) {
            return c7981Mv1.f7403i ? (EmptyAnalyticsSender) f14605r.getValue() : (C7659Gq1) f14604q.getValue();
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }

    /* renamed from: c */
    public static InterfaceC8439Vq1 m9425c() {
        C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
        if (c7981Mv1 == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        if (c7981Mv1.f7403i) {
            return new C8165Qj1((C7765Ir1) f14590c.getValue());
        }
        C10585ox0 c10585ox0 = (C10585ox0) AbstractC8135Pu1.f9346a.getValue();
        C7981Mv1 c7981Mv12 = C8326Tm0.f11511h;
        if (c7981Mv12 == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        String str = c7981Mv12.f7396b;
        C7981Mv1 c7981Mv13 = C8326Tm0.f11511h;
        if (c7981Mv13 == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        Object pusherHostProvider = c7981Mv13.f7399e;
        if (pusherHostProvider == null) {
            pusherHostProvider = new PusherHostProvider();
        }
        O90.m5968f(c10585ox0, "okHttpClient");
        C8907bs1 c8907bs1 = new C8907bs1();
        c8907bs1.f17202a = c10585ox0;
        c8907bs1.f17203b = str;
        c8907bs1.f17204c = pusherHostProvider;
        C7765Ir1 c7765Ir1 = (C7765Ir1) f14590c.getValue();
        Logger logger = f14588a;
        C0399GK c0399gk = C0399GK.f3694a;
        ExecutorC1023QF executorC1023QF = ExecutorC1023QF.f9548c;
        O90.m5968f(c7765Ir1, "pushStorage");
        O90.m5968f(logger, "logger");
        O90.m5968f(executorC1023QF, "dispatcher");
        C8071Oo1 c8071Oo1 = new C8071Oo1();
        c8071Oo1.f8627a = c8907bs1;
        c8071Oo1.f8628b = c7765Ir1;
        c8071Oo1.f8629c = logger;
        c8071Oo1.f8630d = executorC1023QF;
        return c8071Oo1;
    }
}
