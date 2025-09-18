package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C2707dh;
import java.util.List;

/* loaded from: classes2.dex */
public class Pd extends C2707dh {
    private final Uc m;

    public static class b {
        public final Qi a;
        public final Uc b;

        public b(Qi qi, Uc uc) {
            this.a = qi;
            this.b = uc;
        }
    }

    public static class c implements C2707dh.d<Pd, b> {
        private final Context a;
        private final C2657bh b;

        public c(Context context, C2657bh c2657bh) {
            this.a = context;
            this.b = c2657bh;
        }

        @Override // com.yandex.metrica.impl.ob.C2707dh.d
        public Pd a(b bVar) {
            Pd pd = new Pd(bVar.b);
            C2657bh c2657bh = this.b;
            Context context = this.a;
            c2657bh.getClass();
            pd.b(U2.a(context, context.getPackageName()));
            C2657bh c2657bh2 = this.b;
            Context context2 = this.a;
            c2657bh2.getClass();
            pd.a(String.valueOf(U2.b(context2, context2.getPackageName())));
            pd.a(bVar.a);
            pd.a(C2665c0.a());
            pd.a(P0.i().p().a());
            pd.e(this.a.getPackageName());
            pd.a(P0.i().t().a(this.a));
            pd.a(P0.i().b().a());
            return pd;
        }
    }

    public Uc A() {
        return this.m;
    }

    public List<String> B() {
        return w().y();
    }

    private Pd(Uc uc) {
        this.m = uc;
    }
}
