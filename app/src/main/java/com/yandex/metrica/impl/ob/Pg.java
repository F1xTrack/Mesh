package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Og;

/* loaded from: classes2.dex */
public final class Pg implements Og.a {
    final /* synthetic */ Og.b a;

    public static final class a implements Xg {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Xg
        public void a(Fg fg) {
            Og og = Og.this;
            Og.a(og, fg, Og.c(og));
        }

        @Override // com.yandex.metrica.impl.ob.Xg
        public void a(Throwable th) {
            Og og = Og.this;
            Og.a(og, null, Og.c(og));
        }
    }

    public Pg(Og.b bVar) {
        this.a = bVar;
    }

    @Override // com.yandex.metrica.impl.ob.Og.a
    public void a() {
        Og.this.g.a(new a());
    }
}
