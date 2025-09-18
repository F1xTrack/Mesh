package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: fU0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3781fU0 {
    public final C1296Qj1 a;

    public C3781fU0(Context context, Map map) {
        C5534kb1 c5534kb1;
        this.a = new C1296Qj1(context);
        synchronized (AbstractC3857ft1.class) {
            c5534kb1 = C5534kb1.h;
            if (c5534kb1 == null) {
                c5534kb1 = new C5534kb1(context, map);
                C5534kb1.h = c5534kb1;
            }
        }
        C4242hu1 c4242hu1 = (C4242hu1) ((F71) c5534kb1.c).getValue();
        C8261yu1 c8261yu1 = new C8261yu1((Map) c4242hu1.c.getValue());
        C0787Jv1 c0787Jv1 = c4242hu1.a;
        c0787Jv1.getClass();
        AbstractC6080nS1.a(new C4074h11(AbstractC6653qS1.c(new C4265i11(new C3311d11(new C1719Vu1(c0787Jv1, 0, c8261yu1)), new C5661lG0(22, c0787Jv1), 1), FK.a()), C1404Rt1.o), C5284jI.w, C1404Rt1.n);
    }
}
