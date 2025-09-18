package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.h0 */
/* loaded from: classes2.dex */
public final class C3298h0<T> {

    /* renamed from: a */
    private final InterfaceC3220e0<T> f23548a;

    /* renamed from: b */
    private final InterfaceC3246f0<T> f23549b;

    /* renamed from: c */
    private final C2817O0 f23550c;

    /* renamed from: d */
    private final String f23551d;

    public C3298h0(InterfaceC3220e0<T> interfaceC3220e0, InterfaceC3246f0<T> interfaceC3246f0, C2817O0 c2817o0, String str) {
        this.f23548a = interfaceC3220e0;
        this.f23549b = interfaceC3246f0;
        this.f23550c = c2817o0;
        this.f23551d = str;
    }

    /* renamed from: a */
    public final void m16025a(Context context, ContentValues contentValues) {
        try {
            Object objInvoke = this.f23548a.invoke(contentValues);
            if (objInvoke != null) {
                this.f23550c.m14684a(context);
                if (((Boolean) this.f23549b.invoke(objInvoke)).booleanValue()) {
                    C2494B2.m13906a("Successfully saved " + this.f23551d, new Object[0]);
                } else {
                    C2494B2.m13912b("Did not save " + this.f23551d + " because data is already present", new Object[0]);
                }
            }
        } catch (Throwable th) {
            C2494B2.m13907a(th, "Unexpected error occurred", new Object[0]);
        }
    }
}
