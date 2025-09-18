package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.k3 */
/* loaded from: classes2.dex */
public class C3379k3 {

    /* renamed from: a */
    private final C2864Pm f23904a;

    /* renamed from: b */
    private Boolean f23905b;

    /* renamed from: c */
    private InterfaceC3169c1 f23906c;

    /* renamed from: d */
    private InterfaceC3195d1 f23907d;

    public C3379k3() {
        this(new C2864Pm());
    }

    /* renamed from: a */
    public synchronized InterfaceC3169c1 m16260a(Context context, C3555qn c3555qn) {
        try {
            if (this.f23906c == null) {
                if (m16259a(context)) {
                    this.f23906c = new C2836Oj(c3555qn.m16638b(), c3555qn.m16638b().m16701a(), c3555qn.m16637a(), new C3090Z());
                } else {
                    this.f23906c = new C3353j3(context, c3555qn);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23906c;
    }

    public C3379k3(C2864Pm c2864Pm) {
        this.f23904a = c2864Pm;
    }

    /* renamed from: a */
    public synchronized InterfaceC3195d1 m16261a(Context context, InterfaceC3169c1 interfaceC3169c1) {
        try {
            if (this.f23907d == null) {
                if (m16259a(context)) {
                    this.f23907d = new C2861Pj();
                } else {
                    this.f23907d = new C3457n3(context, interfaceC3169c1);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23907d;
    }

    /* renamed from: a */
    private synchronized boolean m16259a(Context context) {
        try {
            if (this.f23905b == null) {
                this.f23905b = Boolean.valueOf(!this.f23904a.m14801a(context));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23905b.booleanValue();
    }
}
