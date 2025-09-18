package com.yandex.metrica.impl.ob;

import android.content.Context;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;

/* renamed from: com.yandex.metrica.impl.ob.dc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2702dc implements InterfaceC2677cc {
    private final InterfaceC2677cc a;

    /* renamed from: com.yandex.metrica.impl.ob.dc$a */
    public class a implements Ym<C2652bc> {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.yandex.metrica.impl.ob.Ym
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2652bc a() {
            return C2702dc.this.a.a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dc$b */
    public class b implements Ym<C2652bc> {
        final /* synthetic */ Context a;
        final /* synthetic */ InterfaceC2951nc b;

        public b(Context context, InterfaceC2951nc interfaceC2951nc) {
            this.a = context;
            this.b = interfaceC2951nc;
        }

        @Override // com.yandex.metrica.impl.ob.Ym
        public C2652bc a() {
            return C2702dc.this.a.a(this.a, this.b);
        }
    }

    public C2702dc(InterfaceC2677cc interfaceC2677cc) {
        this.a = interfaceC2677cc;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2677cc
    public C2652bc a(Context context) {
        return a(new a(context));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2677cc
    public C2652bc a(Context context, InterfaceC2951nc interfaceC2951nc) {
        return a(new b(context, interfaceC2951nc));
    }

    private C2652bc a(Ym<C2652bc> ym) {
        C2652bc c2652bcA = ym.a();
        C2627ac c2627ac = c2652bcA.a;
        return (c2627ac == null || !DeviceIdUtils.NULL_UUID.equals(c2627ac.b)) ? c2652bcA : new C2652bc(null, EnumC2716e1.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
