package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.yandex.metrica.impl.ob.z1 */
/* loaded from: classes2.dex */
public class C3244z1 implements InterfaceC3219y1 {
    private InterfaceExecutorC3086sn a;
    private InterfaceC3219y1 b;
    private final C2965o1 c;
    private boolean d;

    /* renamed from: com.yandex.metrica.impl.ob.z1$a */
    public class a extends Km {
        final /* synthetic */ Bundle a;

        public a(Bundle bundle) {
            this.a = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3244z1.this.b.b(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$b */
    public class b extends Km {
        final /* synthetic */ Bundle a;

        public b(Bundle bundle) {
            this.a = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3244z1.this.b.a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$c */
    public class c extends Km {
        final /* synthetic */ Configuration a;

        public c(Configuration configuration) {
            this.a = configuration;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3244z1.this.b.onConfigurationChanged(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$d */
    public class d extends Km {
        public d() {
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            synchronized (C3244z1.this) {
                try {
                    if (C3244z1.this.d) {
                        C3244z1.this.c.e();
                        C3244z1.this.b.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$e */
    public class e extends Km {
        final /* synthetic */ Intent a;
        final /* synthetic */ int b;

        public e(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C3244z1.this.b.a(this.a, this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$f */
    public class f extends Km {
        final /* synthetic */ Intent a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        public f(Intent intent, int i, int i2) {
            this.a = intent;
            this.b = i;
            this.c = i2;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C3244z1.this.b.a(this.a, this.b, this.c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$g */
    public class g extends Km {
        final /* synthetic */ Intent a;

        public g(Intent intent) {
            this.a = intent;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C3244z1.this.b.a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$h */
    public class h extends Km {
        final /* synthetic */ Intent a;

        public h(Intent intent) {
            this.a = intent;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C3244z1.this.b.c(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$i */
    public class i extends Km {
        final /* synthetic */ Intent a;

        public i(Intent intent) {
            this.a = intent;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() {
            C3244z1.this.b.b(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$j */
    public class j extends Km {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;
        final /* synthetic */ Bundle d;

        public j(String str, int i, String str2, Bundle bundle) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws RemoteException {
            C3244z1.this.b.a(this.a, this.b, this.c, this.d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$k */
    public class k extends Km {
        final /* synthetic */ Bundle a;

        public k(Bundle bundle) {
            this.a = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3244z1.this.b.reportData(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$l */
    public class l extends Km {
        final /* synthetic */ int a;
        final /* synthetic */ Bundle b;

        public l(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3244z1.this.b.a(this.a, this.b);
        }
    }

    public C3244z1(InterfaceC3219y1 interfaceC3219y1) {
        this(P0.i().s().d(), interfaceC3219y1, P0.i().j());
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void onConfigurationChanged(Configuration configuration) {
        ((C3061rn) this.a).execute(new c(configuration));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void reportData(Bundle bundle) {
        ((C3061rn) this.a).execute(new k(bundle));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public synchronized void a() {
        this.d = true;
        ((C3061rn) this.a).execute(new d());
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b(Intent intent) {
        ((C3061rn) this.a).execute(new i(intent));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void c(Intent intent) {
        ((C3061rn) this.a).execute(new h(intent));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b() {
        ((C3061rn) this.a).d();
        synchronized (this) {
            this.c.f();
            this.d = false;
        }
        this.b.b();
    }

    public C3244z1(InterfaceExecutorC3086sn interfaceExecutorC3086sn, InterfaceC3219y1 interfaceC3219y1, C2965o1 c2965o1) {
        this.d = false;
        this.a = interfaceExecutorC3086sn;
        this.b = interfaceC3219y1;
        this.c = c2965o1;
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent, int i2) {
        ((C3061rn) this.a).execute(new e(intent, i2));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent, int i2, int i3) {
        ((C3061rn) this.a).execute(new f(intent, i2, i3));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent) {
        ((C3061rn) this.a).execute(new g(intent));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void a(String str, int i2, String str2, Bundle bundle) {
        ((C3061rn) this.a).execute(new j(str, i2, str2, bundle));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void a(int i2, Bundle bundle) {
        ((C3061rn) this.a).execute(new l(i2, bundle));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void a(Bundle bundle) {
        ((C3061rn) this.a).execute(new b(bundle));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void a(com.yandex.metrica.i iVar) {
        this.b.a(iVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void b(Bundle bundle) {
        ((C3061rn) this.a).execute(new a(bundle));
    }
}
