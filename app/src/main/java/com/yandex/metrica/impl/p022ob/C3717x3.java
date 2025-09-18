package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.concurrent.Executor;
import p000.C0471HT;
import p000.C0487Hj;
import p000.EnumC9040cs1;

/* renamed from: com.yandex.metrica.impl.ob.x3 */
/* loaded from: classes2.dex */
public final class C3717x3 {
    /* renamed from: a */
    public final InterfaceC3557r m17172a(Context context, Executor executor, Executor executor2, EnumC9040cs1 enumC9040cs1, InterfaceC3635u interfaceC3635u, InterfaceC3609t interfaceC3609t) {
        InterfaceC3557r c0487Hj;
        int iOrdinal = enumC9040cs1.ordinal();
        if (iOrdinal == 0) {
            C3349j c3349j = new C3349j(interfaceC3635u);
            C3375k c3375k = new C3375k();
            C0471HT c0471ht = new C0471HT();
            c0471ht.f4309a = context;
            c0471ht.f4310b = executor;
            c0471ht.f4311c = executor2;
            c0471ht.f4312d = c3349j;
            c0471ht.f4313e = c3375k;
            c0471ht.f4314f = interfaceC3609t;
            c0487Hj = c0471ht;
        } else {
            if (iOrdinal != 1) {
                return new C2470A3();
            }
            c0487Hj = new C0487Hj(context, executor, executor2, interfaceC3635u, interfaceC3609t, new C3427m(interfaceC3635u), new C3479o(null, 1));
        }
        return c0487Hj;
    }
}
