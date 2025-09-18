package defpackage;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: wV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7806wV1 implements XU1 {
    public final C6697qh0 a;
    public final RU1 b;

    public C7806wV1(Context context, RU1 ru1) {
        this.b = ru1;
        C1141Ok c1141Ok = C1141Ok.e;
        C2362bd1.b(context);
        C1587Uc1 c1587Uc1C = C2362bd1.a().c(c1141Ok);
        if (C1141Ok.d.contains(new C7973xO("json"))) {
            new C6697qh0(new C6852rV1(c1587Uc1C, 0));
        }
        this.a = new C6697qh0(new C6852rV1(c1587Uc1C, 1));
    }

    @Override // defpackage.XU1
    public final void a(C1632Ur1 c1632Ur1) {
        InterfaceC1275Qc1 interfaceC1275Qc1 = (InterfaceC1275Qc1) this.a.get();
        ((C8444zs0) c1632Ur1.c).i = false;
        C8444zs0 c8444zs0 = (C8444zs0) c1632Ur1.c;
        c8444zs0.g = Boolean.FALSE;
        C7800wT1 c7800wT1 = new C7800wT1(c8444zs0);
        C2407bs1 c2407bs1 = (C2407bs1) c1632Ur1.b;
        c2407bs1.a = c7800wT1;
        try {
            NV1.D();
            C3759fN c3759fN = C3759fN.h;
            C3961gQ1 c3961gQ1 = new C3961gQ1(c2407bs1);
            C0145Bp1 c0145Bp1 = new C0145Bp1();
            c0145Bp1.b = new HashMap();
            c0145Bp1.a = new HashMap();
            c0145Bp1.c = C1731Vy1.c;
            c3759fN.h(c0145Bp1);
            ((C1665Vc1) interfaceC1275Qc1).a(new C0029Ad(new C2216as1(new HashMap((HashMap) c0145Bp1.b), new HashMap((HashMap) c0145Bp1.a), (C1731Vy1) c0145Bp1.c).e(c3961gQ1), EnumC7370uD0.b, null), new C0681Im0(29));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
