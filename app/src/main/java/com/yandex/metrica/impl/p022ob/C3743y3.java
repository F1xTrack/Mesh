package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C2566E;
import java.util.concurrent.Executor;
import p000.EnumC9040cs1;

/* renamed from: com.yandex.metrica.impl.ob.y3 */
/* loaded from: classes2.dex */
public class C3743y3 {

    /* renamed from: a */
    private InterfaceC3557r f25286a;

    /* renamed from: b */
    private final Context f25287b;

    /* renamed from: c */
    private final Executor f25288c;

    /* renamed from: d */
    private final Executor f25289d;

    /* renamed from: e */
    private final EnumC9040cs1 f25290e;

    /* renamed from: f */
    private final InterfaceC3635u f25291f;

    /* renamed from: g */
    private final InterfaceC3609t f25292g;

    /* renamed from: h */
    private final C2566E f25293h;

    /* renamed from: i */
    private final C3717x3 f25294i;

    /* renamed from: com.yandex.metrica.impl.ob.y3$a */
    public class a implements C2566E.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C2566E.b
        /* renamed from: a */
        public void mo14025a(C2566E.a aVar) {
            C3743y3.m17212a(C3743y3.this, aVar);
        }
    }

    public C3743y3(Context context, Executor executor, Executor executor2, EnumC9040cs1 enumC9040cs1, InterfaceC3635u interfaceC3635u, InterfaceC3609t interfaceC3609t, C2566E c2566e, C3717x3 c3717x3) {
        this.f25287b = context;
        this.f25288c = executor;
        this.f25289d = executor2;
        this.f25290e = enumC9040cs1;
        this.f25291f = interfaceC3635u;
        this.f25292g = interfaceC3609t;
        this.f25293h = c2566e;
        this.f25294i = c3717x3;
    }

    /* renamed from: a */
    public static void m17212a(C3743y3 c3743y3, C2566E.a aVar) {
        c3743y3.getClass();
        if (aVar == C2566E.a.VISIBLE) {
            try {
                InterfaceC3557r interfaceC3557r = c3743y3.f25286a;
                if (interfaceC3557r != null) {
                    interfaceC3557r.mo3442b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m17214a(C2885Qi c2885Qi, Boolean bool) {
        InterfaceC3557r interfaceC3557rM17172a;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            synchronized (this) {
                interfaceC3557rM17172a = this.f25294i.m17172a(this.f25287b, this.f25288c, this.f25289d, this.f25290e, this.f25291f, this.f25292g);
                this.f25286a = interfaceC3557rM17172a;
            }
            interfaceC3557rM17172a.mo3441a(c2885Qi.m14877c());
            if (this.f25293h.m14018a(new a()) == C2566E.a.VISIBLE) {
                try {
                    InterfaceC3557r interfaceC3557r = this.f25286a;
                    if (interfaceC3557r != null) {
                        interfaceC3557r.mo3442b();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m17213a(C2885Qi c2885Qi) {
        InterfaceC3557r interfaceC3557r;
        synchronized (this) {
            interfaceC3557r = this.f25286a;
        }
        if (interfaceC3557r != null) {
            interfaceC3557r.mo3441a(c2885Qi.m14877c());
        }
    }
}
