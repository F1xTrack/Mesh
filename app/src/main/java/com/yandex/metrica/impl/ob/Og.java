package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1676Vg0;
import defpackage.AbstractC8069xu;
import defpackage.InterfaceC5908mZ;
import defpackage.LB;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;

/* loaded from: classes2.dex */
public final class Og {
    private final Lazy a = LB.b(new c());
    private final Lazy b = LB.b(new b());
    private final Lazy c = LB.b(new d());
    private final List<Fg> d = new ArrayList();
    private final Ug e;
    private final Yg f;
    private final Ig g;
    private final Zg h;

    public interface a {
        void a();
    }

    public static final class b extends AbstractC1676Vg0 implements InterfaceC5908mZ {
        public b() {
            super(0);
        }

        @Override // defpackage.InterfaceC5908mZ
        public Object invoke() {
            return new Pg(this);
        }
    }

    public static final class c extends AbstractC1676Vg0 implements InterfaceC5908mZ {
        public c() {
            super(0);
        }

        @Override // defpackage.InterfaceC5908mZ
        public Object invoke() {
            return new Qg(this);
        }
    }

    public static final class d extends AbstractC1676Vg0 implements InterfaceC5908mZ {
        public d() {
            super(0);
        }

        @Override // defpackage.InterfaceC5908mZ
        public Object invoke() {
            return new Rg(this);
        }
    }

    public Og(Ug ug, Yg yg, Ig ig, Zg zg) {
        this.e = ug;
        this.f = yg;
        this.g = ig;
        this.h = zg;
    }

    public static final a b(Og og) {
        return (a) og.b.getValue();
    }

    public static final a c(Og og) {
        return (a) og.a.getValue();
    }

    public static final void a(Og og, Fg fg, a aVar) {
        og.d.add(fg);
        if (og.h.a(fg)) {
            og.e.a(fg);
        } else {
            aVar.a();
        }
    }

    public final void b() {
        this.f.a((Xg) this.c.getValue());
    }

    public final void a() {
        List<Fg> list = this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.h.b((Fg) obj)) {
                arrayList.add(obj);
            }
        }
        this.e.a(this.h.a(AbstractC8069xu.y(arrayList)));
    }
}
