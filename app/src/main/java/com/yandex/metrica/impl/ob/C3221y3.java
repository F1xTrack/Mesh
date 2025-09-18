package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.E;
import defpackage.EnumC3282cs1;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3221y3 {
    private r a;
    private final Context b;
    private final Executor c;
    private final Executor d;
    private final EnumC3282cs1 e;
    private final InterfaceC3112u f;
    private final InterfaceC3087t g;
    private final E h;
    private final C3196x3 i;

    /* renamed from: com.yandex.metrica.impl.ob.y3$a */
    public class a implements E.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.E.b
        public void a(E.a aVar) {
            C3221y3.a(C3221y3.this, aVar);
        }
    }

    public C3221y3(Context context, Executor executor, Executor executor2, EnumC3282cs1 enumC3282cs1, InterfaceC3112u interfaceC3112u, InterfaceC3087t interfaceC3087t, E e, C3196x3 c3196x3) {
        this.b = context;
        this.c = executor;
        this.d = executor2;
        this.e = enumC3282cs1;
        this.f = interfaceC3112u;
        this.g = interfaceC3087t;
        this.h = e;
        this.i = c3196x3;
    }

    public static void a(C3221y3 c3221y3, E.a aVar) {
        c3221y3.getClass();
        if (aVar == E.a.VISIBLE) {
            try {
                r rVar = c3221y3.a;
                if (rVar != null) {
                    rVar.b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(Qi qi, Boolean bool) {
        r rVarA;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            synchronized (this) {
                rVarA = this.i.a(this.b, this.c, this.d, this.e, this.f, this.g);
                this.a = rVarA;
            }
            rVarA.a(qi.c());
            if (this.h.a(new a()) == E.a.VISIBLE) {
                try {
                    r rVar = this.a;
                    if (rVar != null) {
                        rVar.b();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public synchronized void a(Qi qi) {
        r rVar;
        synchronized (this) {
            rVar = this.a;
        }
        if (rVar != null) {
            rVar.a(qi.c());
        }
    }
}
