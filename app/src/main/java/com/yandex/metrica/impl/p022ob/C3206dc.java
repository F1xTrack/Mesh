package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import ru.p031ok.tracer.base.deviceid.DeviceIdUtils;

/* renamed from: com.yandex.metrica.impl.ob.dc */
/* loaded from: classes2.dex */
public class C3206dc implements InterfaceC3180cc {

    /* renamed from: a */
    private final InterfaceC3180cc f23222a;

    /* renamed from: com.yandex.metrica.impl.ob.dc$a */
    public class a implements InterfaceC3088Ym<C3154bc> {

        /* renamed from: a */
        final /* synthetic */ Context f23223a;

        public a(Context context) {
            this.f23223a = context;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3088Ym
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3154bc mo15519a() {
            return C3206dc.this.f23222a.mo15706a(this.f23223a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dc$b */
    public class b implements InterfaceC3088Ym<C3154bc> {

        /* renamed from: a */
        final /* synthetic */ Context f23225a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3466nc f23226b;

        public b(Context context, InterfaceC3466nc interfaceC3466nc) {
            this.f23225a = context;
            this.f23226b = interfaceC3466nc;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3088Ym
        /* renamed from: a */
        public C3154bc mo15519a() {
            return C3206dc.this.f23222a.mo15707a(this.f23225a, this.f23226b);
        }
    }

    public C3206dc(InterfaceC3180cc interfaceC3180cc) {
        this.f23222a = interfaceC3180cc;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3180cc
    /* renamed from: a */
    public C3154bc mo15706a(Context context) {
        return m15747a(new a(context));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3180cc
    /* renamed from: a */
    public C3154bc mo15707a(Context context, InterfaceC3466nc interfaceC3466nc) {
        return m15747a(new b(context, interfaceC3466nc));
    }

    /* renamed from: a */
    private C3154bc m15747a(InterfaceC3088Ym<C3154bc> interfaceC3088Ym) {
        C3154bc c3154bcMo15519a = interfaceC3088Ym.mo15519a();
        C3128ac c3128ac = c3154bcMo15519a.f23129a;
        return (c3128ac == null || !DeviceIdUtils.NULL_UUID.equals(c3128ac.f23041b)) ? c3154bcMo15519a : new C3154bc(null, EnumC3221e1.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
