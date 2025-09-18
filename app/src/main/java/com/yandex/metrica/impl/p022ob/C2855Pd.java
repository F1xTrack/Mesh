package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3211dh;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Pd */
/* loaded from: classes2.dex */
public class C2855Pd extends C3211dh {

    /* renamed from: m */
    private final C2978Uc f21948m;

    /* renamed from: com.yandex.metrica.impl.ob.Pd$b */
    public static class b {

        /* renamed from: a */
        public final C2885Qi f21949a;

        /* renamed from: b */
        public final C2978Uc f21950b;

        public b(C2885Qi c2885Qi, C2978Uc c2978Uc) {
            this.f21949a = c2885Qi;
            this.f21950b = c2978Uc;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Pd$c */
    public static class c implements C3211dh.d<C2855Pd, b> {

        /* renamed from: a */
        private final Context f21951a;

        /* renamed from: b */
        private final C3159bh f21952b;

        public c(Context context, C3159bh c3159bh) {
            this.f21951a = context;
            this.f21952b = c3159bh;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3211dh.d
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public C2855Pd mo14785a(b bVar) {
            C2855Pd c2855Pd = new C2855Pd(bVar.f21950b);
            C3159bh c3159bh = this.f21952b;
            Context context = this.f21951a;
            c3159bh.getClass();
            c2855Pd.m15775b(C2968U2.m15230a(context, context.getPackageName()));
            C3159bh c3159bh2 = this.f21952b;
            Context context2 = this.f21951a;
            c3159bh2.getClass();
            c2855Pd.m15773a(String.valueOf(C2968U2.m15248b(context2, context2.getPackageName())));
            c2855Pd.m15768a(bVar.f21949a);
            c2855Pd.m15769a(C3168c0.m15699a());
            c2855Pd.m15772a(C2842P0.m14728i().m14745p().m17210a());
            c2855Pd.m15781e(this.f21951a.getPackageName());
            c2855Pd.m15770a(C2842P0.m14728i().m14749t().m15837a(this.f21951a));
            c2855Pd.m15771a(C2842P0.m14728i().m14732b().m16087a());
            return c2855Pd;
        }
    }

    /* renamed from: A */
    public C2978Uc m14783A() {
        return this.f21948m;
    }

    /* renamed from: B */
    public List<String> m14784B() {
        return m15799w().m14899y();
    }

    private C2855Pd(C2978Uc c2978Uc) {
        this.f21948m = c2978Uc;
    }
}
