package p000;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: wV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11553wV1 implements XU1 {

    /* renamed from: a */
    public final C10809qh0 f44926a;

    /* renamed from: b */
    public final RU1 f44927b;

    public C11553wV1(Context context, RU1 ru1) {
        this.f44927b = ru1;
        C0928Ok c0928Ok = C0928Ok.f8587e;
        C8877bd1.m10476b(context);
        C8359Uc1 c8359Uc1M10477c = C8877bd1.m10475a().m10477c(c0928Ok);
        if (C0928Ok.f8586d.contains(new C7135xO("json"))) {
            new C10809qh0(new C10914rV1(c8359Uc1M10477c, 0));
        }
        this.f44926a = new C10809qh0(new C10914rV1(c8359Uc1M10477c, 1));
    }

    @Override // p000.XU1
    /* renamed from: a */
    public final void mo9058a(C8389Ur1 c8389Ur1) {
        InterfaceC8151Qc1 interfaceC8151Qc1 = (InterfaceC8151Qc1) this.f44926a.get();
        ((C11979zs0) c8389Ur1.f12178c).f47063i = false;
        C11979zs0 c11979zs0 = (C11979zs0) c8389Ur1.f12178c;
        c11979zs0.f47061g = Boolean.FALSE;
        C11549wT1 c11549wT1 = new C11549wT1(c11979zs0);
        C8907bs1 c8907bs1 = (C8907bs1) c8389Ur1.f12177b;
        c8907bs1.f17202a = c11549wT1;
        try {
            NV1.m5729D();
            C4049fN c4049fN = C4049fN.f27163h;
            C9496gQ1 c9496gQ1 = new C9496gQ1(c8907bs1);
            C7397Bp1 c7397Bp1 = new C7397Bp1();
            c7397Bp1.f1052b = new HashMap();
            c7397Bp1.f1051a = new HashMap();
            c7397Bp1.f1053c = C8455Vy1.f12894c;
            c4049fN.m18226h(c7397Bp1);
            ((C8411Vc1) interfaceC8151Qc1).m8514a(new C0040Ad(new C8779as1(new HashMap((HashMap) c7397Bp1.f1052b), new HashMap((HashMap) c7397Bp1.f1051a), (C8455Vy1) c7397Bp1.f1053c).m10356e(c9496gQ1), EnumC11261uD0.f43595b, null), new C7754Im0(29));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
