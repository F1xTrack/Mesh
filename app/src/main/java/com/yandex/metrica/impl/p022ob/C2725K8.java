package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import p000.AbstractC0705LB;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: com.yandex.metrica.impl.ob.K8 */
/* loaded from: classes2.dex */
public final class C2725K8 {

    /* renamed from: a */
    private final Map<String, C2675I8> f21576a = new LinkedHashMap();

    /* renamed from: b */
    private final Lazy f21577b = AbstractC0705LB.m4915b(new a());

    /* renamed from: c */
    private final Context f21578c;

    /* renamed from: com.yandex.metrica.impl.ob.K8$a */
    public static final class a extends AbstractC8418Vg0 implements InterfaceC6434mZ {
        public a() {
            super(0);
        }

        @Override // p000.InterfaceC6434mZ
        public Object invoke() {
            return new C2650H8(C2725K8.this.f21578c, new C2742L0());
        }
    }

    public C2725K8(Context context) {
        this.f21578c = context;
    }

    /* renamed from: a */
    public final C2650H8 m14471a() {
        return (C2650H8) this.f21577b.getValue();
    }

    /* renamed from: a */
    public final synchronized C2675I8 m14472a(String str) {
        C2675I8 c2675i8;
        String strValueOf = String.valueOf(str);
        c2675i8 = this.f21576a.get(strValueOf);
        if (c2675i8 == null) {
            c2675i8 = new C2675I8(this.f21578c, strValueOf, new C2742L0());
            this.f21576a.put(strValueOf, c2675i8);
        }
        return c2675i8;
    }
}
