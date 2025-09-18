package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.E;
import defpackage.C7074sg;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class Pb {
    private C3131ui a;
    private Mb b;
    private final E c;
    private final Nb d;

    public static final class a implements E.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.E.b
        public final void a(E.a aVar) {
            Pb.this.b();
        }
    }

    public Pb(E e, Nb nb) {
        this.c = e;
        this.d = nb;
    }

    public synchronized void b(Qi qi) {
        C3131ui c3131ui;
        try {
            if (!O90.a(qi.n(), this.a)) {
                this.a = qi.n();
                Mb mb = this.b;
                if (mb != null) {
                    mb.a();
                }
                this.b = null;
                if (a() && this.b == null && (c3131ui = this.a) != null) {
                    this.b = this.d.a(c3131ui);
                }
            }
        } finally {
        }
    }

    public final synchronized void a(Qi qi) {
        this.a = qi.n();
        this.c.a(new a());
        b();
    }

    private final boolean a() {
        boolean zD;
        C3131ui c3131ui = this.a;
        if (c3131ui == null) {
            return false;
        }
        E.a aVarC = this.c.c();
        O90.e(aVarC, "applicationStateProvider.currentState");
        if (c3131ui.c().length() <= 0) {
            return false;
        }
        int iOrdinal = aVarC.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            zD = c3131ui.d();
        } else {
            if (iOrdinal != 2) {
                throw new C7074sg();
            }
            zD = true;
        }
        return zD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void b() {
        C3131ui c3131ui;
        try {
            boolean z = this.b != null;
            if (a() == z) {
                return;
            }
            if (z) {
                Mb mb = this.b;
                if (mb != null) {
                    mb.a();
                }
                this.b = null;
                return;
            }
            if (this.b == null && (c3131ui = this.a) != null) {
                this.b = this.d.a(c3131ui);
            }
        } finally {
        }
    }
}
