package com.yandex.metrica.impl.p022ob;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.InterfaceC2465i;

/* renamed from: com.yandex.metrica.impl.ob.z1 */
/* loaded from: classes2.dex */
public class C3767z1 implements InterfaceC3741y1 {

    /* renamed from: a */
    private InterfaceExecutorC3607sn f25355a;

    /* renamed from: b */
    private InterfaceC3741y1 f25356b;

    /* renamed from: c */
    private final C3481o1 f25357c;

    /* renamed from: d */
    private boolean f25358d;

    /* renamed from: com.yandex.metrica.impl.ob.z1$a */
    public class a extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Bundle f25359a;

        public a(Bundle bundle) {
            this.f25359a = bundle;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3767z1.this.f25356b.mo13902b(this.f25359a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$b */
    public class b extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Bundle f25361a;

        public b(Bundle bundle) {
            this.f25361a = bundle;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3767z1.this.f25356b.mo13896a(this.f25361a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$c */
    public class c extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Configuration f25363a;

        public c(Configuration configuration) {
            this.f25363a = configuration;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3767z1.this.f25356b.onConfigurationChanged(this.f25363a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$d */
    public class d extends AbstractRunnableC2739Km {
        public d() {
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() {
            synchronized (C3767z1.this) {
                try {
                    if (C3767z1.this.f25358d) {
                        C3767z1.this.f25357c.m16504e();
                        C3767z1.this.f25356b.mo13891a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$e */
    public class e extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Intent f25366a;

        /* renamed from: b */
        final /* synthetic */ int f25367b;

        public e(Intent intent, int i) {
            this.f25366a = intent;
            this.f25367b = i;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() {
            C3767z1.this.f25356b.mo13894a(this.f25366a, this.f25367b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$f */
    public class f extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Intent f25369a;

        /* renamed from: b */
        final /* synthetic */ int f25370b;

        /* renamed from: c */
        final /* synthetic */ int f25371c;

        public f(Intent intent, int i, int i2) {
            this.f25369a = intent;
            this.f25370b = i;
            this.f25371c = i2;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() {
            C3767z1.this.f25356b.mo13895a(this.f25369a, this.f25370b, this.f25371c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$g */
    public class g extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Intent f25373a;

        public g(Intent intent) {
            this.f25373a = intent;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() {
            C3767z1.this.f25356b.mo13893a(this.f25373a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$h */
    public class h extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Intent f25375a;

        public h(Intent intent) {
            this.f25375a = intent;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() {
            C3767z1.this.f25356b.mo13903c(this.f25375a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$i */
    public class i extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Intent f25377a;

        public i(Intent intent) {
            this.f25377a = intent;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() {
            C3767z1.this.f25356b.mo13901b(this.f25377a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$j */
    public class j extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ String f25379a;

        /* renamed from: b */
        final /* synthetic */ int f25380b;

        /* renamed from: c */
        final /* synthetic */ String f25381c;

        /* renamed from: d */
        final /* synthetic */ Bundle f25382d;

        public j(String str, int i, String str2, Bundle bundle) {
            this.f25379a = str;
            this.f25380b = i;
            this.f25381c = str2;
            this.f25382d = bundle;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws RemoteException {
            C3767z1.this.f25356b.mo13899a(this.f25379a, this.f25380b, this.f25381c, this.f25382d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$k */
    public class k extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Bundle f25384a;

        public k(Bundle bundle) {
            this.f25384a = bundle;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3767z1.this.f25356b.reportData(this.f25384a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z1$l */
    public class l extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ int f25386a;

        /* renamed from: b */
        final /* synthetic */ Bundle f25387b;

        public l(int i, Bundle bundle) {
            this.f25386a = i;
            this.f25387b = bundle;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3767z1.this.f25356b.mo13892a(this.f25386a, this.f25387b);
        }
    }

    public C3767z1(InterfaceC3741y1 interfaceC3741y1) {
        this(C2842P0.m14728i().m14748s().m17352d(), interfaceC3741y1, C2842P0.m14728i().m14739j());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    public void onConfigurationChanged(Configuration configuration) {
        ((C3581rn) this.f25355a).execute(new c(configuration));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    public void reportData(Bundle bundle) {
        ((C3581rn) this.f25355a).execute(new k(bundle));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: a */
    public synchronized void mo13891a() {
        this.f25358d = true;
        ((C3581rn) this.f25355a).execute(new d());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: b */
    public void mo13901b(Intent intent) {
        ((C3581rn) this.f25355a).execute(new i(intent));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: c */
    public void mo13903c(Intent intent) {
        ((C3581rn) this.f25355a).execute(new h(intent));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: b */
    public void mo13900b() {
        ((C3581rn) this.f25355a).m16708d();
        synchronized (this) {
            this.f25357c.m16505f();
            this.f25358d = false;
        }
        this.f25356b.mo13900b();
    }

    public C3767z1(InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC3741y1 interfaceC3741y1, C3481o1 c3481o1) {
        this.f25358d = false;
        this.f25355a = interfaceExecutorC3607sn;
        this.f25356b = interfaceC3741y1;
        this.f25357c = c3481o1;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: a */
    public void mo13894a(Intent intent, int i2) {
        ((C3581rn) this.f25355a).execute(new e(intent, i2));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: a */
    public void mo13895a(Intent intent, int i2, int i3) {
        ((C3581rn) this.f25355a).execute(new f(intent, i2, i3));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: a */
    public void mo13893a(Intent intent) {
        ((C3581rn) this.f25355a).execute(new g(intent));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    /* renamed from: a */
    public void mo13899a(String str, int i2, String str2, Bundle bundle) {
        ((C3581rn) this.f25355a).execute(new j(str, i2, str2, bundle));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    /* renamed from: a */
    public void mo13892a(int i2, Bundle bundle) {
        ((C3581rn) this.f25355a).execute(new l(i2, bundle));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    /* renamed from: a */
    public void mo13896a(Bundle bundle) {
        ((C3581rn) this.f25355a).execute(new b(bundle));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    /* renamed from: a */
    public void mo13897a(InterfaceC2465i interfaceC2465i) {
        this.f25356b.mo13897a(interfaceC2465i);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    /* renamed from: b */
    public void mo13902b(Bundle bundle) {
        ((C3581rn) this.f25355a).execute(new a(bundle));
    }
}
