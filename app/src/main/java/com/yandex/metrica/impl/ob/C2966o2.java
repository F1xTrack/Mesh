package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.ob.C3194x1;
import com.yandex.metrica.impl.ob.S;
import defpackage.InterfaceC7694vv1;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2966o2 implements C3194x1.c, InterfaceC7694vv1 {
    private final Z0 a;
    private final C3194x1 b;
    private final Object c;
    private final InterfaceExecutorC3086sn d;
    private final V6 e;

    /* renamed from: com.yandex.metrica.impl.ob.o2$a */
    public class a extends g {
        final /* synthetic */ U3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U3 u3) {
            super(C2966o2.this, null);
            this.b = u3;
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.g
        public void a(IMetricaService iMetricaService) throws RemoteException {
            Z0 z0 = C2966o2.this.a;
            U3 u3 = this.b;
            ((C2941n2) z0).getClass();
            Bundle bundle = new Bundle();
            synchronized (u3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", u3);
            }
            iMetricaService.b(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$b */
    public class b extends g {
        final /* synthetic */ U3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(U3 u3) {
            super(C2966o2.this, null);
            this.b = u3;
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.g
        public void a(IMetricaService iMetricaService) throws RemoteException {
            Z0 z0 = C2966o2.this.a;
            U3 u3 = this.b;
            ((C2941n2) z0).getClass();
            Bundle bundle = new Bundle();
            synchronized (u3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", u3);
            }
            iMetricaService.a(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$c */
    public class c extends d {
        private boolean d;
        private final Dm e;

        public c(f fVar, Dm dm) {
            super(fVar);
            this.d = false;
            this.e = dm;
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.g
        public boolean b() {
            f fVar = this.b;
            if (fVar.b().h != 0) {
                C2966o2.this.e.a(fVar);
                return false;
            }
            Context contextA = ((C2941n2) C2966o2.this.a).a();
            Intent intentB = H2.b(contextA);
            fVar.b().e = EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b();
            intentB.putExtras(fVar.b().b(fVar.a().c()));
            try {
                contextA.startService(intentB);
                return false;
            } catch (Throwable unused) {
                C2966o2.this.e.a(fVar);
                return false;
            }
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.g
        /* renamed from: a */
        public synchronized Void call() {
            if (this.d) {
                return null;
            }
            this.d = true;
            Dm dm = this.e;
            dm.getClass();
            try {
                if (!TextUtils.isEmpty(dm.b())) {
                    if (dm.b().endsWith(":Metrica")) {
                        a(this.b);
                        return null;
                    }
                }
            } catch (Throwable unused) {
            }
            C2966o2.this.b.g();
            return super.call();
        }

        public void a(f fVar) {
            C2966o2.this.e.a(fVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$d */
    public class d extends g {
        final f b;

        public d(f fVar) {
            super(C2966o2.this, null);
            this.b = fVar;
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.g
        public void a(Throwable th) {
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.g, java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
            return call();
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.g
        public void a(IMetricaService iMetricaService) throws RemoteException {
            f fVar = this.b;
            ((C2941n2) C2966o2.this.a).a(iMetricaService, fVar.e(), fVar.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$e */
    public interface e {
        C2864k0 a(C2864k0 c2864k0);
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$f */
    public static class f {
        private C2864k0 a;
        private C2866k2 b;
        private boolean c = false;
        private e d;
        private HashMap<S.a, Integer> e;

        public f(C2864k0 c2864k0, C2866k2 c2866k2) {
            this.a = c2864k0;
            this.b = new C2866k2(new U3(c2866k2.a()), new CounterConfiguration(c2866k2.b()), c2866k2.e());
        }

        public C2864k0 b() {
            return this.a;
        }

        public HashMap<S.a, Integer> c() {
            return this.e;
        }

        public boolean d() {
            return this.c;
        }

        public C2864k0 e() {
            e eVar = this.d;
            return eVar != null ? eVar.a(this.a) : this.a;
        }

        public String toString() {
            return "ReportToSend{mReport=" + this.a + ", mEnvironment=" + this.b + ", mCrash=" + this.c + ", mAction=" + this.d + ", mTrimmedFields=" + this.e + '}';
        }

        public f a(e eVar) {
            this.d = eVar;
            return this;
        }

        public f a(HashMap<S.a, Integer> map) {
            this.e = map;
            return this;
        }

        public f a(boolean z) {
            this.c = z;
            return this;
        }

        public C2866k2 a() {
            return this.b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$g */
    public abstract class g implements Callable<Void> {
        private g() {
        }

        public abstract void a(IMetricaService iMetricaService) throws RemoteException;

        public void a(Throwable th) {
        }

        public boolean b() {
            C2966o2.this.b.b();
            synchronized (C2966o2.this.c) {
                if (!C2966o2.this.b.e()) {
                    try {
                        C2966o2.this.c.wait(500L, 0);
                    } catch (InterruptedException unused) {
                        C2966o2.this.c.notifyAll();
                    }
                }
            }
            return true;
        }

        public /* synthetic */ g(C2966o2 c2966o2, a aVar) {
            this();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            int i = 0;
            do {
                try {
                    IMetricaService iMetricaServiceD = C2966o2.this.b.d();
                    if (iMetricaServiceD != null) {
                        try {
                            a(iMetricaServiceD);
                            return null;
                        } catch (RemoteException unused) {
                        }
                    }
                    i++;
                    if (!b() || P1.a()) {
                        break;
                    }
                } catch (Throwable th) {
                    a(th);
                    return null;
                }
            } while (i < 20);
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$h */
    public class h extends g {
        private final int b;
        private final Bundle c;

        public h(C2966o2 c2966o2, int i, Bundle bundle) {
            super(c2966o2, null);
            this.b = i;
            this.c = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.g
        public void a(IMetricaService iMetricaService) throws RemoteException {
            iMetricaService.a(this.b, this.c);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2966o2(Z0 z0) {
        C2941n2 c2941n2 = (C2941n2) z0;
        this(c2941n2, Y.g().d().d(), new V6(c2941n2.a()));
    }

    @Override // com.yandex.metrica.impl.ob.C3194x1.c
    public void onServiceConnected() {
        synchronized (this.c) {
            this.c.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.ob.C3194x1.c
    public void onServiceDisconnected() {
    }

    public Future<Void> queuePauseUserSession(U3 u3) {
        return ((C3061rn) this.d).a(new b(u3));
    }

    public Future<Void> queueReport(f fVar) {
        return ((C3061rn) this.d).a(fVar.d() ? new c(fVar, Y.g().h()) : new d(fVar));
    }

    public Future<Void> queueResumeUserSession(U3 u3) {
        return ((C3061rn) this.d).a(new a(u3));
    }

    public void reportData(int i, Bundle bundle) {
        ((C3061rn) this.d).a(new h(this, i, bundle));
    }

    public void sendCrash(f fVar) {
        c cVar = new c(fVar, Y.g().h());
        if (this.b.e()) {
            try {
                ((FutureTask) ((C3061rn) this.d).a(cVar)).get(4L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (cVar.d) {
            return;
        }
        try {
            cVar.call();
        } catch (Throwable unused2) {
        }
    }

    public C2966o2(Z0 z0, InterfaceExecutorC3086sn interfaceExecutorC3086sn, V6 v6) {
        this.c = new Object();
        this.a = z0;
        this.d = interfaceExecutorC3086sn;
        this.e = v6;
        C3194x1 c3194x1C = ((C2941n2) z0).c();
        this.b = c3194x1C;
        c3194x1C.a(this);
    }
}
