package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.InterfaceC2517C0;
import com.yandex.metrica.impl.p022ob.InterfaceC2592F0;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.B0 */
/* loaded from: classes2.dex */
public class C2492B0<CANDIDATE, CHOSEN extends InterfaceC2592F0, STORAGE extends InterfaceC2517C0<CANDIDATE, CHOSEN>> {

    /* renamed from: a */
    private final Context f20878a;

    /* renamed from: b */
    private final C2876Q9 f20879b;

    /* renamed from: c */
    private final AbstractC2542D0<CHOSEN> f20880c;

    /* renamed from: d */
    private final InterfaceC2943T2<CANDIDATE, CHOSEN> f20881d;

    /* renamed from: e */
    private final InterfaceC2744L2<CANDIDATE, CHOSEN, STORAGE> f20882e;

    /* renamed from: f */
    private final InterfaceC3664v2<CHOSEN> f20883f;

    /* renamed from: g */
    private final InterfaceC3586s2 f20884g;

    /* renamed from: h */
    private final InterfaceC3428m0 f20885h;

    /* renamed from: i */
    private STORAGE f20886i;

    /* JADX WARN: Multi-variable type inference failed */
    public C2492B0(Context context, C2876Q9 c2876q9, AbstractC2542D0 abstractC2542D0, InterfaceC2943T2 interfaceC2943T2, InterfaceC2744L2 interfaceC2744L2, InterfaceC3664v2 interfaceC3664v2, InterfaceC3586s2 interfaceC3586s2, InterfaceC3428m0 interfaceC3428m0, InterfaceC2517C0 interfaceC2517C0, String str) {
        this.f20878a = context;
        this.f20879b = c2876q9;
        this.f20880c = abstractC2542D0;
        this.f20881d = interfaceC2943T2;
        this.f20882e = interfaceC2744L2;
        this.f20883f = interfaceC3664v2;
        this.f20884g = interfaceC3586s2;
        this.f20885h = interfaceC3428m0;
        this.f20886i = interfaceC2517C0;
    }

    /* renamed from: a */
    public final CHOSEN m13874a() {
        this.f20885h.mo13968a(this.f20878a);
        return (CHOSEN) m13873b();
    }

    /* renamed from: b */
    public final synchronized boolean m13876b(CHOSEN chosen) {
        boolean z = false;
        if (chosen.mo14053a() == EnumC2567E0.UNDEFINED) {
            return false;
        }
        List<CANDIDATE> listMo13931a = (List) this.f20881d.invoke(this.f20886i.mo13931a(), chosen);
        boolean z2 = listMo13931a != null;
        if (listMo13931a == null) {
            listMo13931a = this.f20886i.mo13931a();
        }
        if (this.f20880c.mo13976a(chosen, this.f20886i.mo13932b())) {
            z = true;
        } else {
            chosen = (CHOSEN) this.f20886i.mo13932b();
        }
        if (z || z2) {
            STORAGE storage = (STORAGE) this.f20882e.invoke(chosen, listMo13931a);
            this.f20886i = storage;
            this.f20879b.m14813a(storage);
        }
        return z;
    }

    /* renamed from: a */
    public final CHOSEN m13875a(CHOSEN chosen) {
        CHOSEN chosen2;
        this.f20885h.mo13968a(this.f20878a);
        synchronized (this) {
            m13876b(chosen);
            chosen2 = (CHOSEN) m13873b();
        }
        return chosen2;
    }

    /* renamed from: b */
    private final synchronized CHOSEN m13873b() {
        try {
            if (!this.f20884g.mo14440a()) {
                InterfaceC2592F0 interfaceC2592F0 = (InterfaceC2592F0) this.f20883f.invoke();
                this.f20884g.mo14441b();
                if (interfaceC2592F0 != null) {
                    m13876b(interfaceC2592F0);
                }
            }
            C2494B2.m13906a("Choosing distribution data: %s", this.f20886i);
        } catch (Throwable th) {
            throw th;
        }
        return (CHOSEN) this.f20886i.mo13932b();
    }
}
