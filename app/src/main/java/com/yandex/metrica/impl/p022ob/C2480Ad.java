package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3687w;

/* renamed from: com.yandex.metrica.impl.ob.Ad */
/* loaded from: classes2.dex */
class C2480Ad implements InterfaceC3467nd {

    /* renamed from: a */
    private final Context f20845a;

    /* renamed from: b */
    private C2885Qi f20846b;

    /* renamed from: c */
    private volatile C2978Uc f20847c;

    /* renamed from: d */
    private final C2500B8 f20848d;

    /* renamed from: e */
    private final C2475A8 f20849e;

    /* renamed from: f */
    private final InterfaceC2839Om f20850f;

    /* renamed from: g */
    private final C2830Od f20851g;

    /* renamed from: h */
    private final C3687w f20852h;

    /* renamed from: i */
    private final C3687w.c f20853i;

    /* renamed from: j */
    private final InterfaceExecutorC3607sn f20854j;

    /* renamed from: k */
    private boolean f20855k;

    /* renamed from: com.yandex.metrica.impl.ob.Ad$a */
    public class a implements C3687w.c {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C3687w.c
        /* renamed from: a */
        public void mo13859a() {
            C2480Ad.this.f20855k = true;
            C2480Ad.this.m13855b();
        }
    }

    public C2480Ad(Context context, C2885Qi c2885Qi, C2978Uc c2978Uc, C2500B8 c2500b8, C2475A8 c2475a8, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(context, c2885Qi, c2978Uc, c2500b8, c2475a8, interfaceExecutorC3607sn, new C2814Nm(), new C2830Od(), C2842P0.m14728i().m14729a());
    }

    /* renamed from: b */
    public void m13855b() {
        C2892R1 c2892r1M14741l = C2842P0.m14728i().m14741l();
        C2978Uc c2978Uc = this.f20847c;
        if (c2978Uc == null || c2892r1M14741l == null) {
            return;
        }
        c2892r1M14741l.m14967b(this.f20851g.m14700a(this.f20845a, this.f20846b, c2978Uc, this));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3467nd
    /* renamed from: a */
    public void mo13856a() {
        boolean zM13854a = m13854a(this.f20848d);
        boolean zM13854a2 = m13854a(this.f20849e);
        if (zM13854a || zM13854a2) {
            if (!this.f20855k) {
                this.f20852h.m17102a(C3687w.f25138c, this.f20854j, this.f20853i);
            } else {
                m13855b();
            }
        }
    }

    public C2480Ad(Context context, C2885Qi c2885Qi, C2978Uc c2978Uc, C2500B8 c2500b8, C2475A8 c2475a8, InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC2839Om interfaceC2839Om, C2830Od c2830Od, C3687w c3687w) {
        this.f20855k = false;
        this.f20845a = context;
        this.f20847c = c2978Uc;
        this.f20846b = c2885Qi;
        this.f20848d = c2500b8;
        this.f20849e = c2475a8;
        this.f20854j = interfaceExecutorC3607sn;
        this.f20850f = interfaceC2839Om;
        this.f20851g = c2830Od;
        this.f20852h = c3687w;
        this.f20853i = new a();
    }

    /* renamed from: a */
    private boolean m13854a(AbstractC3566r8 abstractC3566r8) {
        if (this.f20847c != null) {
            if (this.f20847c != null) {
                if (abstractC3566r8.m16681c() < r0.f22441c) {
                }
                return true;
            }
            C2978Uc c2978Uc = this.f20847c;
            if (c2978Uc != null) {
                if (this.f20850f.mo14674a() - abstractC3566r8.m16679b() > c2978Uc.f22443e) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m13857a(C2885Qi c2885Qi) {
        this.f20846b = c2885Qi;
    }

    /* renamed from: a */
    public void m13858a(C2978Uc c2978Uc) {
        this.f20847c = c2978Uc;
    }
}
