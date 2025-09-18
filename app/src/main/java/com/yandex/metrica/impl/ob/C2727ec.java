package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.ec */
/* loaded from: classes2.dex */
public class C2727ec implements InterfaceC2901lc {
    private final Object a;
    private Qi b;
    private volatile FutureTask<Void> c;
    private final g d;
    private final g e;
    private final g f;
    private final InterfaceC2677cc g;
    private final InterfaceC2677cc h;
    private final InterfaceC2677cc i;
    private Context j;
    private InterfaceExecutorC3086sn k;
    private volatile C2777gc l;

    /* renamed from: com.yandex.metrica.impl.ob.ec$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            C2727ec c2727ec = C2727ec.this;
            C2652bc c2652bcA = C2727ec.a(c2727ec, c2727ec.j);
            C2727ec c2727ec2 = C2727ec.this;
            C2652bc c2652bcB = C2727ec.b(c2727ec2, c2727ec2.j);
            C2727ec c2727ec3 = C2727ec.this;
            c2727ec.l = new C2777gc(c2652bcA, c2652bcB, C2727ec.a(c2727ec3, c2727ec3.j, new C2926mc()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$b */
    public class b implements Callable<Void> {
        final /* synthetic */ Context a;
        final /* synthetic */ InterfaceC2951nc b;

        public b(Context context, InterfaceC2951nc interfaceC2951nc) {
            this.a = context;
            this.b = interfaceC2951nc;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            C2777gc c2777gc = C2727ec.this.l;
            C2727ec c2727ec = C2727ec.this;
            C2652bc c2652bcA = C2727ec.a(c2727ec, C2727ec.a(c2727ec, this.a), c2777gc.a());
            C2727ec c2727ec2 = C2727ec.this;
            C2652bc c2652bcA2 = C2727ec.a(c2727ec2, C2727ec.b(c2727ec2, this.a), c2777gc.b());
            C2727ec c2727ec3 = C2727ec.this;
            c2727ec.l = new C2777gc(c2652bcA, c2652bcA2, C2727ec.a(c2727ec3, C2727ec.a(c2727ec3, this.a, this.b), c2777gc.c()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$c */
    public static class c implements g {
        @Override // com.yandex.metrica.impl.ob.C2727ec.g
        public boolean a(Qi qi) {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$d */
    public static class d implements g {
        @Override // com.yandex.metrica.impl.ob.C2727ec.g
        public boolean a(Qi qi) {
            return qi != null && (qi.f().w || !qi.r());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$e */
    public static class e implements g {
        @Override // com.yandex.metrica.impl.ob.C2727ec.g
        public boolean a(Qi qi) {
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$f */
    public static class f implements g {
        @Override // com.yandex.metrica.impl.ob.C2727ec.g
        public boolean a(Qi qi) {
            return qi != null && qi.f().w;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$g */
    public interface g {
        boolean a(Qi qi);
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$h */
    public static class h implements g {
        @Override // com.yandex.metrica.impl.ob.C2727ec.g
        public boolean a(Qi qi) {
            return qi != null && (qi.f().o || !qi.r());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$i */
    public static class i implements g {
        @Override // com.yandex.metrica.impl.ob.C2727ec.g
        public boolean a(Qi qi) {
            return qi != null && qi.f().o;
        }
    }

    public C2727ec(g gVar, g gVar2, g gVar3, InterfaceExecutorC3086sn interfaceExecutorC3086sn, String str) {
        this(gVar, gVar2, gVar3, interfaceExecutorC3086sn, new C2702dc(new C3050rc("google")), new C2702dc(new C3050rc("huawei")), new C2702dc(new C3050rc("yandex")), str);
    }

    public static C2652bc a(C2727ec c2727ec, C2652bc c2652bc, C2652bc c2652bc2) {
        c2727ec.getClass();
        EnumC2716e1 enumC2716e1 = c2652bc.b;
        return enumC2716e1 != EnumC2716e1.OK ? new C2652bc(c2652bc2.a, enumC2716e1, c2652bc.c) : c2652bc;
    }

    public void c(Context context) {
        this.j = context.getApplicationContext();
    }

    public C2727ec(g gVar, g gVar2, g gVar3, InterfaceExecutorC3086sn interfaceExecutorC3086sn, InterfaceC2677cc interfaceC2677cc, InterfaceC2677cc interfaceC2677cc2, InterfaceC2677cc interfaceC2677cc3, String str) {
        this.a = new Object();
        this.d = gVar;
        this.e = gVar2;
        this.f = gVar3;
        this.g = interfaceC2677cc;
        this.h = interfaceC2677cc2;
        this.i = interfaceC2677cc3;
        this.k = interfaceExecutorC3086sn;
        this.l = new C2777gc();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            r2 = this;
            android.content.Context r0 = r2.j
            if (r0 == 0) goto L2b
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.gc r0 = r2.l     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.bc r0 = r0.a()     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.e1 r0 = r0.b     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.e1 r1 = com.yandex.metrica.impl.ob.EnumC2716e1.UNKNOWN     // Catch: java.lang.Throwable -> L1d
            if (r0 == r1) goto L1f
            com.yandex.metrica.impl.ob.gc r0 = r2.l     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.bc r0 = r0.b()     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.e1 r0 = r0.b     // Catch: java.lang.Throwable -> L1d
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
            android.content.Context r0 = r2.j
            r2.a(r0)
            goto L2b
        L29:
            monitor-exit(r2)
            throw r0
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2727ec.c():void");
    }

    public void b(Context context) {
        this.j = context.getApplicationContext();
        if (this.c == null) {
            synchronized (this.a) {
                try {
                    if (this.c == null) {
                        this.c = new FutureTask<>(new a());
                        ((C3061rn) this.k).execute(this.c);
                    }
                } finally {
                }
            }
        }
    }

    public void a(Context context, Qi qi) {
        this.b = qi;
        b(context);
    }

    public void a(Qi qi) {
        this.b = qi;
    }

    public static C2652bc b(C2727ec c2727ec, Context context) {
        if (c2727ec.e.a(c2727ec.b)) {
            return c2727ec.h.a(context);
        }
        Qi qi = c2727ec.b;
        if (qi != null && qi.r()) {
            if (!c2727ec.b.f().w) {
                return new C2652bc(null, EnumC2716e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
            }
            return new C2652bc(null, EnumC2716e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new C2652bc(null, EnumC2716e1.NO_STARTUP, "startup has not been received yet");
    }

    public C2777gc a(Context context) throws ExecutionException, InterruptedException {
        b(context);
        try {
            this.c.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.l;
    }

    public C2777gc a(Context context, InterfaceC2951nc interfaceC2951nc) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new b(context.getApplicationContext(), interfaceC2951nc));
        ((C3061rn) this.k).execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.l;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2901lc
    @Deprecated
    public Boolean b() throws ExecutionException, InterruptedException {
        c();
        C2627ac c2627ac = this.l.a().a;
        if (c2627ac == null) {
            return null;
        }
        return c2627ac.c;
    }

    public static C2652bc a(C2727ec c2727ec, Context context) {
        if (c2727ec.d.a(c2727ec.b)) {
            return c2727ec.g.a(context);
        }
        Qi qi = c2727ec.b;
        if (qi != null && qi.r()) {
            if (!c2727ec.b.f().o) {
                return new C2652bc(null, EnumC2716e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
            }
            return new C2652bc(null, EnumC2716e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new C2652bc(null, EnumC2716e1.NO_STARTUP, "startup has not been received yet");
    }

    public static C2652bc a(C2727ec c2727ec, Context context, InterfaceC2951nc interfaceC2951nc) {
        if (c2727ec.f.a(c2727ec.b)) {
            return c2727ec.i.a(context, interfaceC2951nc);
        }
        return new C2652bc(null, EnumC2716e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2901lc
    @Deprecated
    public String a() throws ExecutionException, InterruptedException {
        c();
        C2627ac c2627ac = this.l.a().a;
        if (c2627ac == null) {
            return null;
        }
        return c2627ac.b;
    }
}
