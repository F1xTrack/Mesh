package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2566E;
import p000.C6838sg;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Pb */
/* loaded from: classes2.dex */
public final class C2853Pb {

    /* renamed from: a */
    private C3654ui f21931a;

    /* renamed from: b */
    private C2778Mb f21932b;

    /* renamed from: c */
    private final C2566E f21933c;

    /* renamed from: d */
    private final C2803Nb f21934d;

    /* renamed from: com.yandex.metrica.impl.ob.Pb$a */
    public static final class a implements C2566E.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C2566E.b
        /* renamed from: a */
        public final void mo14025a(C2566E.a aVar) {
            C2853Pb.this.m14765b();
        }
    }

    public C2853Pb(C2566E c2566e, C2803Nb c2803Nb) {
        this.f21933c = c2566e;
        this.f21934d = c2803Nb;
    }

    /* renamed from: b */
    public synchronized void m14767b(C2885Qi c2885Qi) {
        C3654ui c3654ui;
        try {
            if (!O90.m5963a(c2885Qi.m14888n(), this.f21931a)) {
                this.f21931a = c2885Qi.m14888n();
                C2778Mb c2778Mb = this.f21932b;
                if (c2778Mb != null) {
                    c2778Mb.m14616a();
                }
                this.f21932b = null;
                if (m14764a() && this.f21932b == null && (c3654ui = this.f21931a) != null) {
                    this.f21932b = this.f21934d.m14643a(c3654ui);
                }
            }
        } finally {
        }
    }

    /* renamed from: a */
    public final synchronized void m14766a(C2885Qi c2885Qi) {
        this.f21931a = c2885Qi.m14888n();
        this.f21933c.m14018a(new a());
        m14765b();
    }

    /* renamed from: a */
    private final boolean m14764a() {
        boolean zM16928d;
        C3654ui c3654ui = this.f21931a;
        if (c3654ui == null) {
            return false;
        }
        C2566E.a aVarM14023c = this.f21933c.m14023c();
        O90.m5967e(aVarM14023c, "applicationStateProvider.currentState");
        if (c3654ui.m16927c().length() <= 0) {
            return false;
        }
        int iOrdinal = aVarM14023c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            zM16928d = c3654ui.m16928d();
        } else {
            if (iOrdinal != 2) {
                throw new C6838sg();
            }
            zM16928d = true;
        }
        return zM16928d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized void m14765b() {
        C3654ui c3654ui;
        try {
            boolean z = this.f21932b != null;
            if (m14764a() == z) {
                return;
            }
            if (z) {
                C2778Mb c2778Mb = this.f21932b;
                if (c2778Mb != null) {
                    c2778Mb.m14616a();
                }
                this.f21932b = null;
                return;
            }
            if (this.f21932b == null && (c3654ui = this.f21931a) != null) {
                this.f21932b = this.f21934d.m14643a(c3654ui);
            }
        } finally {
        }
    }
}
