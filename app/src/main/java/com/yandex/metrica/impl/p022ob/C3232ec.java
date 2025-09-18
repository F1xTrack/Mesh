package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.ec */
/* loaded from: classes2.dex */
public class C3232ec implements InterfaceC3414lc {

    /* renamed from: a */
    private final Object f23339a;

    /* renamed from: b */
    private C2885Qi f23340b;

    /* renamed from: c */
    private volatile FutureTask<Void> f23341c;

    /* renamed from: d */
    private final g f23342d;

    /* renamed from: e */
    private final g f23343e;

    /* renamed from: f */
    private final g f23344f;

    /* renamed from: g */
    private final InterfaceC3180cc f23345g;

    /* renamed from: h */
    private final InterfaceC3180cc f23346h;

    /* renamed from: i */
    private final InterfaceC3180cc f23347i;

    /* renamed from: j */
    private Context f23348j;

    /* renamed from: k */
    private InterfaceExecutorC3607sn f23349k;

    /* renamed from: l */
    private volatile C3284gc f23350l;

    /* renamed from: com.yandex.metrica.impl.ob.ec$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            C3232ec c3232ec = C3232ec.this;
            C3154bc c3154bcM15829a = C3232ec.m15829a(c3232ec, c3232ec.f23348j);
            C3232ec c3232ec2 = C3232ec.this;
            C3154bc c3154bcM15835b = C3232ec.m15835b(c3232ec2, c3232ec2.f23348j);
            C3232ec c3232ec3 = C3232ec.this;
            c3232ec.f23350l = new C3284gc(c3154bcM15829a, c3154bcM15835b, C3232ec.m15830a(c3232ec3, c3232ec3.f23348j, new C3440mc()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$b */
    public class b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Context f23352a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3466nc f23353b;

        public b(Context context, InterfaceC3466nc interfaceC3466nc) {
            this.f23352a = context;
            this.f23353b = interfaceC3466nc;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            C3284gc c3284gc = C3232ec.this.f23350l;
            C3232ec c3232ec = C3232ec.this;
            C3154bc c3154bcM15831a = C3232ec.m15831a(c3232ec, C3232ec.m15829a(c3232ec, this.f23352a), c3284gc.m15990a());
            C3232ec c3232ec2 = C3232ec.this;
            C3154bc c3154bcM15831a2 = C3232ec.m15831a(c3232ec2, C3232ec.m15835b(c3232ec2, this.f23352a), c3284gc.m15991b());
            C3232ec c3232ec3 = C3232ec.this;
            c3232ec.f23350l = new C3284gc(c3154bcM15831a, c3154bcM15831a2, C3232ec.m15831a(c3232ec3, C3232ec.m15830a(c3232ec3, this.f23352a, this.f23353b), c3284gc.m15992c()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$c */
    public static class c implements g {
        @Override // com.yandex.metrica.impl.p022ob.C3232ec.g
        /* renamed from: a */
        public boolean mo15845a(C2885Qi c2885Qi) {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$d */
    public static class d implements g {
        @Override // com.yandex.metrica.impl.p022ob.C3232ec.g
        /* renamed from: a */
        public boolean mo15845a(C2885Qi c2885Qi) {
            return c2885Qi != null && (c2885Qi.m14880f().f24730w || !c2885Qi.m14892r());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$e */
    public static class e implements g {
        @Override // com.yandex.metrica.impl.p022ob.C3232ec.g
        /* renamed from: a */
        public boolean mo15845a(C2885Qi c2885Qi) {
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$f */
    public static class f implements g {
        @Override // com.yandex.metrica.impl.p022ob.C3232ec.g
        /* renamed from: a */
        public boolean mo15845a(C2885Qi c2885Qi) {
            return c2885Qi != null && c2885Qi.m14880f().f24730w;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$g */
    public interface g {
        /* renamed from: a */
        boolean mo15845a(C2885Qi c2885Qi);
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$h */
    public static class h implements g {
        @Override // com.yandex.metrica.impl.p022ob.C3232ec.g
        /* renamed from: a */
        public boolean mo15845a(C2885Qi c2885Qi) {
            return c2885Qi != null && (c2885Qi.m14880f().f24722o || !c2885Qi.m14892r());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$i */
    public static class i implements g {
        @Override // com.yandex.metrica.impl.p022ob.C3232ec.g
        /* renamed from: a */
        public boolean mo15845a(C2885Qi c2885Qi) {
            return c2885Qi != null && c2885Qi.m14880f().f24722o;
        }
    }

    public C3232ec(g gVar, g gVar2, g gVar3, InterfaceExecutorC3607sn interfaceExecutorC3607sn, String str) {
        this(gVar, gVar2, gVar3, interfaceExecutorC3607sn, new C3206dc(new C3570rc("google")), new C3206dc(new C3570rc("huawei")), new C3206dc(new C3570rc("yandex")), str);
    }

    /* renamed from: a */
    public static C3154bc m15831a(C3232ec c3232ec, C3154bc c3154bc, C3154bc c3154bc2) {
        c3232ec.getClass();
        EnumC3221e1 enumC3221e1 = c3154bc.f23130b;
        return enumC3221e1 != EnumC3221e1.OK ? new C3154bc(c3154bc2.f23129a, enumC3221e1, c3154bc.f23131c) : c3154bc;
    }

    /* renamed from: c */
    public void m15844c(Context context) {
        this.f23348j = context.getApplicationContext();
    }

    public C3232ec(g gVar, g gVar2, g gVar3, InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC3180cc interfaceC3180cc, InterfaceC3180cc interfaceC3180cc2, InterfaceC3180cc interfaceC3180cc3, String str) {
        this.f23339a = new Object();
        this.f23342d = gVar;
        this.f23343e = gVar2;
        this.f23344f = gVar3;
        this.f23345g = interfaceC3180cc;
        this.f23346h = interfaceC3180cc2;
        this.f23347i = interfaceC3180cc3;
        this.f23349k = interfaceExecutorC3607sn;
        this.f23350l = new C3284gc();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m15836c() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            r2 = this;
            android.content.Context r0 = r2.f23348j
            if (r0 == 0) goto L2b
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.gc r0 = r2.f23350l     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.bc r0 = r0.m15990a()     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.e1 r0 = r0.f23130b     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.e1 r1 = com.yandex.metrica.impl.p022ob.EnumC3221e1.UNKNOWN     // Catch: java.lang.Throwable -> L1d
            if (r0 == r1) goto L1f
            com.yandex.metrica.impl.ob.gc r0 = r2.f23350l     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.bc r0 = r0.m15991b()     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.e1 r0 = r0.f23130b     // Catch: java.lang.Throwable -> L1d
            if (r0 == r1) goto L1f
            r0 = 1
            goto L20
        L1d:
            r0 = move-exception
            goto L29
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            if (r0 != 0) goto L2b
            android.content.Context r0 = r2.f23348j
            r2.m15837a(r0)
            goto L2b
        L29:
            monitor-exit(r2)
            throw r0
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3232ec.m15836c():void");
    }

    /* renamed from: b */
    public void m15843b(Context context) {
        this.f23348j = context.getApplicationContext();
        if (this.f23341c == null) {
            synchronized (this.f23339a) {
                try {
                    if (this.f23341c == null) {
                        this.f23341c = new FutureTask<>(new a());
                        ((C3581rn) this.f23349k).execute(this.f23341c);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public void m15840a(Context context, C2885Qi c2885Qi) {
        this.f23340b = c2885Qi;
        m15843b(context);
    }

    /* renamed from: a */
    public void m15841a(C2885Qi c2885Qi) {
        this.f23340b = c2885Qi;
    }

    /* renamed from: b */
    public static C3154bc m15835b(C3232ec c3232ec, Context context) {
        if (c3232ec.f23343e.mo15845a(c3232ec.f23340b)) {
            return c3232ec.f23346h.mo15706a(context);
        }
        C2885Qi c2885Qi = c3232ec.f23340b;
        if (c2885Qi != null && c2885Qi.m14892r()) {
            if (!c3232ec.f23340b.m14880f().f24730w) {
                return new C3154bc(null, EnumC3221e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
            }
            return new C3154bc(null, EnumC3221e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new C3154bc(null, EnumC3221e1.NO_STARTUP, "startup has not been received yet");
    }

    /* renamed from: a */
    public C3284gc m15837a(Context context) throws ExecutionException, InterruptedException {
        m15843b(context);
        try {
            this.f23341c.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f23350l;
    }

    /* renamed from: a */
    public C3284gc m15838a(Context context, InterfaceC3466nc interfaceC3466nc) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new b(context.getApplicationContext(), interfaceC3466nc));
        ((C3581rn) this.f23349k).execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f23350l;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3414lc
    @Deprecated
    /* renamed from: b */
    public Boolean mo15842b() throws ExecutionException, InterruptedException {
        m15836c();
        C3128ac c3128ac = this.f23350l.m15990a().f23129a;
        if (c3128ac == null) {
            return null;
        }
        return c3128ac.f23042c;
    }

    /* renamed from: a */
    public static C3154bc m15829a(C3232ec c3232ec, Context context) {
        if (c3232ec.f23342d.mo15845a(c3232ec.f23340b)) {
            return c3232ec.f23345g.mo15706a(context);
        }
        C2885Qi c2885Qi = c3232ec.f23340b;
        if (c2885Qi != null && c2885Qi.m14892r()) {
            if (!c3232ec.f23340b.m14880f().f24722o) {
                return new C3154bc(null, EnumC3221e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
            }
            return new C3154bc(null, EnumC3221e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new C3154bc(null, EnumC3221e1.NO_STARTUP, "startup has not been received yet");
    }

    /* renamed from: a */
    public static C3154bc m15830a(C3232ec c3232ec, Context context, InterfaceC3466nc interfaceC3466nc) {
        if (c3232ec.f23344f.mo15845a(c3232ec.f23340b)) {
            return c3232ec.f23347i.mo15707a(context, interfaceC3466nc);
        }
        return new C3154bc(null, EnumC3221e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3414lc
    @Deprecated
    /* renamed from: a */
    public String mo15839a() throws ExecutionException, InterruptedException {
        m15836c();
        C3128ac c3128ac = this.f23350l.m15990a().f23129a;
        if (c3128ac == null) {
            return null;
        }
        return c3128ac.f23041b;
    }
}
