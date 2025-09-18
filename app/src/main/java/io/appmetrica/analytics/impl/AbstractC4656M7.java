package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.M7 */
/* loaded from: classes2.dex */
public abstract class AbstractC4656M7 {

    /* renamed from: a */
    public final Context f30467a;

    /* renamed from: b */
    public final ProtobufStateStorage f30468b;

    /* renamed from: c */
    public final AbstractC4704O7 f30469c;

    /* renamed from: d */
    public final InterfaceC4934Xm f30470d;

    /* renamed from: e */
    public final InterfaceC4622Kl f30471e;

    /* renamed from: f */
    public final InterfaceC5252ki f30472f;

    /* renamed from: g */
    public final InterfaceC5202ii f30473g;

    /* renamed from: h */
    public final InterfaceC5615z6 f30474h;

    /* renamed from: i */
    public InterfaceC4680N7 f30475i;

    public AbstractC4656M7(Context context, ProtobufStateStorage protobufStateStorage, AbstractC4704O7 abstractC4704O7, InterfaceC4934Xm interfaceC4934Xm, InterfaceC4622Kl interfaceC4622Kl, InterfaceC5252ki interfaceC5252ki, InterfaceC5202ii interfaceC5202ii, InterfaceC5615z6 interfaceC5615z6, InterfaceC4680N7 interfaceC4680N7) {
        this.f30467a = context;
        this.f30468b = protobufStateStorage;
        this.f30469c = abstractC4704O7;
        this.f30470d = interfaceC4934Xm;
        this.f30471e = interfaceC4622Kl;
        this.f30472f = interfaceC5252ki;
        this.f30473g = interfaceC5202ii;
        this.f30474h = interfaceC5615z6;
        this.f30475i = interfaceC4680N7;
    }

    /* renamed from: a */
    public final synchronized InterfaceC4680N7 m19628a() {
        return this.f30475i;
    }

    /* renamed from: b */
    public final synchronized boolean m19631b(InterfaceC4752Q7 interfaceC4752Q7) {
        boolean z;
        try {
            if (interfaceC4752Q7.mo19471a() == EnumC4728P7.f30604b) {
                return false;
            }
            if (interfaceC4752Q7.equals(this.f30475i.mo19524b())) {
                return false;
            }
            List listMo19523a = (List) this.f30470d.invoke(this.f30475i.mo19523a(), interfaceC4752Q7);
            boolean z2 = listMo19523a != null;
            if (listMo19523a == null) {
                listMo19523a = this.f30475i.mo19523a();
            }
            if (this.f30469c.mo19235a(interfaceC4752Q7, this.f30475i.mo19524b())) {
                z = true;
            } else {
                interfaceC4752Q7 = (InterfaceC4752Q7) this.f30475i.mo19524b();
                z = false;
            }
            if (z || z2) {
                InterfaceC4680N7 interfaceC4680N7 = this.f30475i;
                InterfaceC4680N7 interfaceC4680N72 = (InterfaceC4680N7) this.f30471e.invoke(interfaceC4752Q7, listMo19523a);
                this.f30475i = interfaceC4680N72;
                this.f30468b.save(interfaceC4680N72);
                AbstractC5527vi.m21161a("Update distribution data: %s -> %s", interfaceC4680N7, this.f30475i);
            }
            return z;
        } finally {
        }
    }

    /* renamed from: c */
    public final synchronized InterfaceC4752Q7 m19632c() {
        try {
            if (!this.f30473g.mo19413a()) {
                InterfaceC4752Q7 interfaceC4752Q7 = (InterfaceC4752Q7) this.f30472f.invoke();
                this.f30473g.mo19414b();
                if (interfaceC4752Q7 != null) {
                    m19631b(interfaceC4752Q7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC4752Q7) this.f30475i.mo19524b();
    }

    /* renamed from: a */
    public final InterfaceC4752Q7 m19629a(InterfaceC4752Q7 interfaceC4752Q7) {
        InterfaceC4752Q7 interfaceC4752Q7M19632c;
        this.f30474h.mo19398a(this.f30467a);
        synchronized (this) {
            m19631b(interfaceC4752Q7);
            interfaceC4752Q7M19632c = m19632c();
        }
        return interfaceC4752Q7M19632c;
    }

    /* renamed from: b */
    public final InterfaceC4752Q7 m19630b() {
        this.f30474h.mo19398a(this.f30467a);
        return m19632c();
    }
}
