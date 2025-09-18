package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2867k3 {
    private final Pm a;
    private Boolean b;
    private InterfaceC2666c1 c;
    private InterfaceC2691d1 d;

    public C2867k3() {
        this(new Pm());
    }

    public synchronized InterfaceC2666c1 a(Context context, C3037qn c3037qn) {
        try {
            if (this.c == null) {
                if (a(context)) {
                    this.c = new Oj(c3037qn.b(), c3037qn.b().a(), c3037qn.a(), new Z());
                } else {
                    this.c = new C2842j3(context, c3037qn);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public C2867k3(Pm pm) {
        this.a = pm;
    }

    public synchronized InterfaceC2691d1 a(Context context, InterfaceC2666c1 interfaceC2666c1) {
        try {
            if (this.d == null) {
                if (a(context)) {
                    this.d = new Pj();
                } else {
                    this.d = new C2942n3(context, interfaceC2666c1);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    private synchronized boolean a(Context context) {
        try {
            if (this.b == null) {
                this.b = Boolean.valueOf(!this.a.a(context));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b.booleanValue();
    }
}
