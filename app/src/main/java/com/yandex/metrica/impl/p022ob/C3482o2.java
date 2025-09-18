package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p022ob.C2915S;
import com.yandex.metrica.impl.p022ob.C3715x1;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import p000.InterfaceC11478vv1;

/* renamed from: com.yandex.metrica.impl.ob.o2 */
/* loaded from: classes2.dex */
public class C3482o2 implements C3715x1.c, InterfaceC11478vv1 {

    /* renamed from: a */
    private final InterfaceC3091Z0 f24338a;

    /* renamed from: b */
    private final C3715x1 f24339b;

    /* renamed from: c */
    private final Object f24340c;

    /* renamed from: d */
    private final InterfaceExecutorC3607sn f24341d;

    /* renamed from: e */
    private final C2997V6 f24342e;

    /* renamed from: com.yandex.metrica.impl.ob.o2$a */
    public class a extends g {

        /* renamed from: b */
        final /* synthetic */ C2969U3 f24343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2969U3 c2969u3) {
            super(C3482o2.this, null);
            this.f24343b = c2969u3;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.g
        /* renamed from: a */
        public void mo16510a(IMetricaService iMetricaService) throws RemoteException {
            InterfaceC3091Z0 interfaceC3091Z0 = C3482o2.this.f24338a;
            C2969U3 c2969u3 = this.f24343b;
            ((C3456n2) interfaceC3091Z0).getClass();
            Bundle bundle = new Bundle();
            synchronized (c2969u3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", c2969u3);
            }
            iMetricaService.mo13789b(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$b */
    public class b extends g {

        /* renamed from: b */
        final /* synthetic */ C2969U3 f24345b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2969U3 c2969u3) {
            super(C3482o2.this, null);
            this.f24345b = c2969u3;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.g
        /* renamed from: a */
        public void mo16510a(IMetricaService iMetricaService) throws RemoteException {
            InterfaceC3091Z0 interfaceC3091Z0 = C3482o2.this.f24338a;
            C2969U3 c2969u3 = this.f24345b;
            ((C3456n2) interfaceC3091Z0).getClass();
            Bundle bundle = new Bundle();
            synchronized (c2969u3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", c2969u3);
            }
            iMetricaService.mo13788a(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$c */
    public class c extends d {

        /* renamed from: d */
        private boolean f24347d;

        /* renamed from: e */
        private final C2564Dm f24348e;

        public c(f fVar, C2564Dm c2564Dm) {
            super(fVar);
            this.f24347d = false;
            this.f24348e = c2564Dm;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.g
        /* renamed from: b */
        public boolean mo16514b() {
            f fVar = this.f24350b;
            if (fVar.m16521b().f23834h != 0) {
                C3482o2.this.f24342e.m15301a(fVar);
                return false;
            }
            Context contextM16443a = ((C3456n2) C3482o2.this.f24338a).m16443a();
            Intent intentM14217b = C2644H2.m14217b(contextM16443a);
            fVar.m16521b().f23831e = EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.m16250b();
            intentM14217b.putExtras(fVar.m16521b().m16228b(fVar.m16517a().m16254c()));
            try {
                contextM16443a.startService(intentM14217b);
                return false;
            } catch (Throwable unused) {
                C3482o2.this.f24342e.m15301a(fVar);
                return false;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.g
        /* renamed from: a */
        public synchronized Void call() {
            if (this.f24347d) {
                return null;
            }
            this.f24347d = true;
            C2564Dm c2564Dm = this.f24348e;
            c2564Dm.getClass();
            try {
                if (!TextUtils.isEmpty(c2564Dm.m14015b())) {
                    if (c2564Dm.m14015b().endsWith(":Metrica")) {
                        m16513a(this.f24350b);
                        return null;
                    }
                }
            } catch (Throwable unused) {
            }
            C3482o2.this.f24339b.m17169g();
            return super.call();
        }

        /* renamed from: a */
        public void m16513a(f fVar) {
            C3482o2.this.f24342e.m15301a(fVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$d */
    public class d extends g {

        /* renamed from: b */
        final f f24350b;

        public d(f fVar) {
            super(C3482o2.this, null);
            this.f24350b = fVar;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.g
        /* renamed from: a */
        public void mo16515a(Throwable th) {
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.g, java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
            return call();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.g
        /* renamed from: a */
        public void mo16510a(IMetricaService iMetricaService) throws RemoteException {
            f fVar = this.f24350b;
            ((C3456n2) C3482o2.this.f24338a).m16446a(iMetricaService, fVar.m16524e(), fVar.f24353b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$e */
    public interface e {
        /* renamed from: a */
        C3376k0 mo16474a(C3376k0 c3376k0);
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$f */
    public static class f {

        /* renamed from: a */
        private C3376k0 f24352a;

        /* renamed from: b */
        private C3378k2 f24353b;

        /* renamed from: c */
        private boolean f24354c = false;

        /* renamed from: d */
        private e f24355d;

        /* renamed from: e */
        private HashMap<C2915S.a, Integer> f24356e;

        public f(C3376k0 c3376k0, C3378k2 c3378k2) {
            this.f24352a = c3376k0;
            this.f24353b = new C3378k2(new C2969U3(c3378k2.m15167a()), new CounterConfiguration(c3378k2.m15168b()), c3378k2.m16256e());
        }

        /* renamed from: b */
        public C3376k0 m16521b() {
            return this.f24352a;
        }

        /* renamed from: c */
        public HashMap<C2915S.a, Integer> m16522c() {
            return this.f24356e;
        }

        /* renamed from: d */
        public boolean m16523d() {
            return this.f24354c;
        }

        /* renamed from: e */
        public C3376k0 m16524e() {
            e eVar = this.f24355d;
            return eVar != null ? eVar.mo16474a(this.f24352a) : this.f24352a;
        }

        public String toString() {
            return "ReportToSend{mReport=" + this.f24352a + ", mEnvironment=" + this.f24353b + ", mCrash=" + this.f24354c + ", mAction=" + this.f24355d + ", mTrimmedFields=" + this.f24356e + '}';
        }

        /* renamed from: a */
        public f m16518a(e eVar) {
            this.f24355d = eVar;
            return this;
        }

        /* renamed from: a */
        public f m16519a(HashMap<C2915S.a, Integer> map) {
            this.f24356e = map;
            return this;
        }

        /* renamed from: a */
        public f m16520a(boolean z) {
            this.f24354c = z;
            return this;
        }

        /* renamed from: a */
        public C3378k2 m16517a() {
            return this.f24353b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$g */
    public abstract class g implements Callable<Void> {
        private g() {
        }

        /* renamed from: a */
        public abstract void mo16510a(IMetricaService iMetricaService) throws RemoteException;

        /* renamed from: a */
        public void mo16515a(Throwable th) {
        }

        /* renamed from: b */
        public boolean mo16514b() {
            C3482o2.this.f24339b.m17164b();
            synchronized (C3482o2.this.f24340c) {
                if (!C3482o2.this.f24339b.m17167e()) {
                    try {
                        C3482o2.this.f24340c.wait(500L, 0);
                    } catch (InterruptedException unused) {
                        C3482o2.this.f24340c.notifyAll();
                    }
                }
            }
            return true;
        }

        public /* synthetic */ g(C3482o2 c3482o2, a aVar) {
            this();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            int i = 0;
            do {
                try {
                    IMetricaService iMetricaServiceM17166d = C3482o2.this.f24339b.m17166d();
                    if (iMetricaServiceM17166d != null) {
                        try {
                            mo16510a(iMetricaServiceM17166d);
                            return null;
                        } catch (RemoteException unused) {
                        }
                    }
                    i++;
                    if (!mo16514b() || C2843P1.m14756a()) {
                        break;
                    }
                } catch (Throwable th) {
                    mo16515a(th);
                    return null;
                }
            } while (i < 20);
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$h */
    public class h extends g {

        /* renamed from: b */
        private final int f24358b;

        /* renamed from: c */
        private final Bundle f24359c;

        public h(C3482o2 c3482o2, int i, Bundle bundle) {
            super(c3482o2, null);
            this.f24358b = i;
            this.f24359c = bundle;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.g
        /* renamed from: a */
        public void mo16510a(IMetricaService iMetricaService) throws RemoteException {
            iMetricaService.mo13787a(this.f24358b, this.f24359c);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3482o2(InterfaceC3091Z0 interfaceC3091Z0) {
        C3456n2 c3456n2 = (C3456n2) interfaceC3091Z0;
        this(c3456n2, C3065Y.m15442g().m15446d().m16640d(), new C2997V6(c3456n2.m16443a()));
    }

    @Override // com.yandex.metrica.impl.p022ob.C3715x1.c
    public void onServiceConnected() {
        synchronized (this.f24340c) {
            this.f24340c.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.C3715x1.c
    public void onServiceDisconnected() {
    }

    public Future<Void> queuePauseUserSession(C2969U3 c2969u3) {
        return ((C3581rn) this.f24341d).m16702a(new b(c2969u3));
    }

    public Future<Void> queueReport(f fVar) {
        return ((C3581rn) this.f24341d).m16702a(fVar.m16523d() ? new c(fVar, C3065Y.m15442g().m15449h()) : new d(fVar));
    }

    public Future<Void> queueResumeUserSession(C2969U3 c2969u3) {
        return ((C3581rn) this.f24341d).m16702a(new a(c2969u3));
    }

    public void reportData(int i, Bundle bundle) {
        ((C3581rn) this.f24341d).m16702a(new h(this, i, bundle));
    }

    public void sendCrash(f fVar) {
        c cVar = new c(fVar, C3065Y.m15442g().m15449h());
        if (this.f24339b.m17167e()) {
            try {
                ((FutureTask) ((C3581rn) this.f24341d).m16702a(cVar)).get(4L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (cVar.f24347d) {
            return;
        }
        try {
            cVar.call();
        } catch (Throwable unused2) {
        }
    }

    public C3482o2(InterfaceC3091Z0 interfaceC3091Z0, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2997V6 c2997v6) {
        this.f24340c = new Object();
        this.f24338a = interfaceC3091Z0;
        this.f24341d = interfaceExecutorC3607sn;
        this.f24342e = c2997v6;
        C3715x1 c3715x1M16468c = ((C3456n2) interfaceC3091Z0).m16468c();
        this.f24339b = c3715x1M16468c;
        c3715x1M16468c.m17163a(this);
    }
}
