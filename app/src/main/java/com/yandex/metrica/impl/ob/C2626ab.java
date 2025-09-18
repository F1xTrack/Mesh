package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.ab, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2626ab {

    /* renamed from: com.yandex.metrica.impl.ob.ab$a */
    public class a implements Vm<Xa, Wa> {
        public a(C2626ab c2626ab) {
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public Wa a(Xa xa) {
            return xa.a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$b */
    public class b implements Vm<Xa, Wa> {
        public b(C2626ab c2626ab) {
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public Wa a(Xa xa) {
            return xa.c;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$c */
    public class c implements InterfaceC2676cb {
        public c(C2626ab c2626ab) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2676cb
        public long a(D9 d9) {
            return d9.c(Long.MAX_VALUE);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2676cb
        public void a(D9 d9, long j) {
            d9.e(j);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$d */
    public class d implements Vm<Xa, Wa> {
        public d(C2626ab c2626ab) {
        }

        @Override // com.yandex.metrica.impl.ob.Vm
        public Wa a(Xa xa) {
            return xa.b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ab$e */
    public class e implements InterfaceC2676cb {
        public e(C2626ab c2626ab) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2676cb
        public long a(D9 d9) {
            return d9.b(Long.MAX_VALUE);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2676cb
        public void a(D9 d9, long j) {
            d9.d(j);
        }
    }

    public Za<YandexMetricaConfig> a(Context context, InterfaceC2616a1 interfaceC2616a1) {
        Dm dm = new Dm();
        return new Za<>(context, interfaceC2616a1, "activation", new Ta(dm, new C2726eb()), new a(this), new Ua(dm));
    }

    public Za<P3> b(Context context, InterfaceC2616a1 interfaceC2616a1) {
        return new Za<>(context, interfaceC2616a1, "clids_info", new Va(), new d(this), new e(this));
    }

    public Za<Be> c(Context context, InterfaceC2616a1 interfaceC2616a1) {
        return new Za<>(context, interfaceC2616a1, "preload_info", new C2701db(), new b(this), new c(this));
    }
}
