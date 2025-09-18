package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.ab */
/* loaded from: classes2.dex */
public class C3127ab {

    /* renamed from: com.yandex.metrica.impl.ob.ab$a */
    public class a implements InterfaceC3013Vm<C3051Xa, C3026Wa> {
        public a(C3127ab c3127ab) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public C3026Wa mo13948a(C3051Xa c3051Xa) {
            return c3051Xa.f22781a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$b */
    public class b implements InterfaceC3013Vm<C3051Xa, C3026Wa> {
        public b(C3127ab c3127ab) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public C3026Wa mo13948a(C3051Xa c3051Xa) {
            return c3051Xa.f22783c;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$c */
    public class c implements InterfaceC3179cb {
        public c(C3127ab c3127ab) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3179cb
        /* renamed from: a */
        public long mo15270a(C2551D9 c2551d9) {
            return c2551d9.m13987c(Long.MAX_VALUE);
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3179cb
        /* renamed from: a */
        public void mo15271a(C2551D9 c2551d9, long j) {
            c2551d9.m13989e(j);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$d */
    public class d implements InterfaceC3013Vm<C3051Xa, C3026Wa> {
        public d(C3127ab c3127ab) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public C3026Wa mo13948a(C3051Xa c3051Xa) {
            return c3051Xa.f22782b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$e */
    public class e implements InterfaceC3179cb {
        public e(C3127ab c3127ab) {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3179cb
        /* renamed from: a */
        public long mo15270a(C2551D9 c2551d9) {
            return c2551d9.m13986b(Long.MAX_VALUE);
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3179cb
        /* renamed from: a */
        public void mo15271a(C2551D9 c2551d9, long j) {
            c2551d9.m13988d(j);
        }
    }

    /* renamed from: a */
    public C3101Za<YandexMetricaConfig> m15605a(Context context, InterfaceC3117a1 interfaceC3117a1) {
        C2564Dm c2564Dm = new C2564Dm();
        return new C3101Za<>(context, interfaceC3117a1, "activation", new C2951Ta(c2564Dm, new C3231eb()), new a(this), new C2976Ua(c2564Dm));
    }

    /* renamed from: b */
    public C3101Za<C2845P3> m15606b(Context context, InterfaceC3117a1 interfaceC3117a1) {
        return new C3101Za<>(context, interfaceC3117a1, "clids_info", new C3001Va(), new d(this), new e(this));
    }

    /* renamed from: c */
    public C3101Za<C2506Be> m15607c(Context context, InterfaceC3117a1 interfaceC3117a1) {
        return new C3101Za<>(context, interfaceC3117a1, "preload_info", new C3205db(), new b(this), new c(this));
    }
}
