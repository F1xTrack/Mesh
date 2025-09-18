package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3044X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.r4 */
/* loaded from: classes2.dex */
public class C3562r4 implements InterfaceC2760Li, InterfaceC3406l4 {

    /* renamed from: a */
    private final Context f24576a;

    /* renamed from: b */
    private final C3172c4 f24577b;

    /* renamed from: c */
    private final InterfaceC2671I4<InterfaceC3432m4> f24578c;

    /* renamed from: d */
    private final C2934Si f24579d;

    /* renamed from: e */
    private final C3692w4 f24580e;

    /* renamed from: f */
    private InterfaceC3432m4 f24581f;

    /* renamed from: g */
    private InterfaceC3380k4 f24582g;

    /* renamed from: h */
    private List<InterfaceC2760Li> f24583h = new ArrayList();

    /* renamed from: i */
    private final C3198d4 f24584i;

    public C3562r4(Context context, C3172c4 c3172c4, C3044X3 c3044x3, C3692w4 c3692w4, InterfaceC2671I4<InterfaceC3432m4> interfaceC2671I4, C3198d4 c3198d4, C2610Fi c2610Fi) {
        this.f24576a = context;
        this.f24577b = c3172c4;
        this.f24580e = c3692w4;
        this.f24578c = interfaceC2671I4;
        this.f24584i = c3198d4;
        this.f24579d = c2610Fi.m14139a(context, c3172c4, c3044x3.f22748a);
        c2610Fi.m14140a(c3172c4, this);
    }

    /* renamed from: a */
    public void m16650a(C3376k0 c3376k0, C3044X3 c3044x3) {
        InterfaceC3432m4 interfaceC3432m4M16648a;
        ((C2945T4) m16648a()).m15172b();
        if (C2692J0.m14398a(c3376k0.m16244n())) {
            interfaceC3432m4M16648a = m16648a();
        } else {
            if (this.f24581f == null) {
                synchronized (this) {
                    InterfaceC3432m4 interfaceC3432m4Mo13917a = this.f24578c.mo13917a(this.f24576a, this.f24577b, this.f24580e.m17116a(), this.f24579d);
                    this.f24581f = interfaceC3432m4Mo13917a;
                    this.f24583h.add(interfaceC3432m4Mo13917a);
                }
            }
            interfaceC3432m4M16648a = this.f24581f;
        }
        if (!C2692J0.m14401b(c3376k0.m16244n())) {
            C3044X3.a aVar = c3044x3.f22749b;
            synchronized (this) {
                try {
                    this.f24580e.m17117a(aVar);
                    InterfaceC3380k4 interfaceC3380k4 = this.f24582g;
                    if (interfaceC3380k4 != null) {
                        ((C2945T4) interfaceC3380k4).mo15170a(aVar);
                    }
                    InterfaceC3432m4 interfaceC3432m4 = this.f24581f;
                    if (interfaceC3432m4 != null) {
                        interfaceC3432m4.mo15170a(aVar);
                    }
                } finally {
                }
            }
        }
        interfaceC3432m4M16648a.mo15171a(c3376k0);
    }

    /* renamed from: b */
    public synchronized void m16651b(InterfaceC2571E4 interfaceC2571E4) {
        this.f24584i.m15739b(interfaceC2571E4);
    }

    /* renamed from: a */
    public synchronized void m16649a(InterfaceC2571E4 interfaceC2571E4) {
        this.f24584i.m15738a(interfaceC2571E4);
    }

    /* renamed from: a */
    private InterfaceC3380k4 m16648a() {
        if (this.f24582g == null) {
            synchronized (this) {
                InterfaceC3380k4 interfaceC3380k4Mo13918b = this.f24578c.mo13918b(this.f24576a, this.f24577b, this.f24580e.m17116a(), this.f24579d);
                this.f24582g = interfaceC3380k4Mo13918b;
                this.f24583h.add(interfaceC3380k4Mo13918b);
            }
        }
        return this.f24582g;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2760Li
    /* renamed from: a */
    public synchronized void mo14544a(C2885Qi c2885Qi) {
        Iterator<InterfaceC2760Li> it = this.f24583h.iterator();
        while (it.hasNext()) {
            it.next().mo14544a(c2885Qi);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2760Li
    /* renamed from: a */
    public synchronized void mo14543a(EnumC2660Hi enumC2660Hi, C2885Qi c2885Qi) {
        Iterator<InterfaceC2760Li> it = this.f24583h.iterator();
        while (it.hasNext()) {
            it.next().mo14543a(enumC2660Hi, c2885Qi);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3406l4
    /* renamed from: a */
    public void mo15531a(C3044X3 c3044x3) {
        this.f24579d.m15131a(c3044x3.f22748a);
        C3044X3.a aVar = c3044x3.f22749b;
        synchronized (this) {
            try {
                this.f24580e.m17117a(aVar);
                InterfaceC3380k4 interfaceC3380k4 = this.f24582g;
                if (interfaceC3380k4 != null) {
                    ((C2945T4) interfaceC3380k4).mo15170a(aVar);
                }
                InterfaceC3432m4 interfaceC3432m4 = this.f24581f;
                if (interfaceC3432m4 != null) {
                    interfaceC3432m4.mo15170a(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
