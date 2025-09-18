package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Ug;
import com.yandex.metrica.impl.ob.X3;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2968o4 extends C2744f4 implements Kg, Jg {
    private final Vg A;
    private final M2 B;
    private final M7<File> C;
    private final C3221y3 D;
    private final Ug z;

    /* renamed from: com.yandex.metrica.impl.ob.o4$a */
    public class a implements Um<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(File file) {
            C2968o4.a(C2968o4.this, file);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o4$b */
    public class b implements Ug.a {
        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.Ug.a
        public void a(Fg fg) {
            if (fg == null) {
                return;
            }
            C2968o4.this.a(new C2864k0().a(fg.a()).a(EnumC2865k1.EVENT_TYPE_SEND_REFERRER.b()));
        }
    }

    public C2968o4(Context context, Qi qi, C2669c4 c2669c4, X3.a aVar, Ug ug, M2 m2, Wi wi) {
        this(context, c2669c4, qi, aVar, new V3(), new R2(), new L0(), new C2993p4(context, c2669c4, aVar, wi, qi, new C2943n4(m2), P0.i().s().e(), U2.b(context, c2669c4.b()), P0.i().s(), P0.i().j()), ug, m2);
    }

    private void a(Context context, L0 l0) {
        File fileA = l0.a(context, "YandexMetricaNativeCrashes");
        if (fileA != null) {
            new G7(fileA, new a()).a();
        }
    }

    @Override // com.yandex.metrica.impl.ob.C2744f4
    public void F() {
        this.z.a(this.A);
    }

    @Override // com.yandex.metrica.impl.ob.C2744f4
    public com.yandex.metrica.c s() {
        return com.yandex.metrica.c.MAIN;
    }

    @Override // com.yandex.metrica.impl.ob.Jg
    public void a() {
        w().c(true);
    }

    @Override // com.yandex.metrica.impl.ob.C2744f4, com.yandex.metrica.impl.ob.InterfaceC2918m4
    public synchronized void a(X3.a aVar) {
        super.a(aVar);
        this.B.a(aVar.l);
    }

    @Override // com.yandex.metrica.impl.ob.C2744f4, com.yandex.metrica.impl.ob.Li
    public void a(Qi qi) {
        super.a(qi);
        this.D.a(qi);
    }

    public C2968o4(Context context, C2669c4 c2669c4, Qi qi, X3.a aVar, V3 v3, R2 r2, L0 l0, C2993p4 c2993p4, Ug ug, M2 m2) {
        super(context, c2669c4, v3, r2, c2993p4);
        this.z = ug;
        C2695d5 c2695d5K = k();
        c2695d5K.a(EnumC2865k1.EVENT_TYPE_REGULAR, new W5(c2695d5K.b()));
        this.A = c2993p4.c(this);
        this.B = m2;
        V7 v7A = c2993p4.a(c2993p4.e(), c2993p4.b(this), f());
        this.C = v7A;
        v7A.a();
        a(context, l0);
        C3221y3 c3221y3A = c2993p4.a(this);
        this.D = c3221y3A;
        c3221y3A.a(qi, aVar.q);
    }

    public static void a(C2968o4 c2968o4, File file) {
        c2968o4.C.a(file);
    }
}
