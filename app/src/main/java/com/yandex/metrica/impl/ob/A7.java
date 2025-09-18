package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public class A7 implements InterfaceC2725ea<C2846j7, Mf> {
    private final E7 a;
    private final C3045r7 b;
    private final C3095t7 c;
    private final B7 d;
    private final C3225y7 e;
    private final C3250z7 f;

    public A7() {
        this(new E7(), new C3045r7(new D7()), new C3095t7(), new B7(), new C3225y7(), new C3250z7());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2846j7 a(Mf mf) {
        throw new UnsupportedOperationException();
    }

    public A7(E7 e7, C3045r7 c3045r7, C3095t7 c3095t7, B7 b7, C3225y7 c3225y7, C3250z7 c3250z7) {
        this.a = e7;
        this.b = c3045r7;
        this.c = c3095t7;
        this.d = b7;
        this.e = c3225y7;
        this.f = c3250z7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mf b(C2846j7 c2846j7) {
        Mf mf = new Mf();
        String str = c2846j7.a;
        String str2 = mf.g;
        if (str == null) {
            str = str2;
        }
        mf.g = str;
        C2996p7 c2996p7 = c2846j7.b;
        if (c2996p7 != null) {
            C2946n7 c2946n7 = c2996p7.a;
            if (c2946n7 != null) {
                mf.b = this.a.b(c2946n7);
            }
            C2722e7 c2722e7 = c2996p7.b;
            if (c2722e7 != null) {
                mf.c = this.b.b(c2722e7);
            }
            List<C2896l7> list = c2996p7.c;
            if (list != null) {
                mf.f = this.d.b(list);
            }
            String str3 = c2996p7.g;
            String str4 = mf.d;
            if (str3 == null) {
                str3 = str4;
            }
            mf.d = str3;
            mf.e = this.c.a(c2996p7.h);
            if (!TextUtils.isEmpty(c2996p7.d)) {
                mf.j = this.e.b(c2996p7.d);
            }
            if (!TextUtils.isEmpty(c2996p7.e)) {
                mf.k = c2996p7.e.getBytes();
            }
            if (!U2.b(c2996p7.f)) {
                mf.l = this.f.a(c2996p7.f);
            }
        }
        return mf;
    }
}
