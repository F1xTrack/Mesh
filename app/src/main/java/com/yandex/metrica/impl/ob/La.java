package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2781gg;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes2.dex */
public class La {
    private C2713dn a;

    public La(C2713dn c2713dn) {
        this.a = c2713dn;
    }

    public P9<C2656bg> a() {
        return new N9(new K9(), new C2738en(AESEncrypter.DEFAULT_ALGORITHM, this.a.b(), this.a.a()));
    }

    public P9<C2681cg> b() {
        return new N9(new C3091t3(), new C2738en(AESEncrypter.DEFAULT_ALGORITHM, this.a.b(), this.a.a()));
    }

    public P9<C2706dg> c() {
        return new N9(new M9(), new C2738en(AESEncrypter.DEFAULT_ALGORITHM, this.a.b(), this.a.a()));
    }

    public P9<C2756fg> d() {
        return new N9(new O9(), new C2738en(AESEncrypter.DEFAULT_ALGORITHM, this.a.b(), this.a.a()));
    }

    public P9<C2781gg> e() {
        return new N9(new Ge(), new C2738en(AESEncrypter.DEFAULT_ALGORITHM, this.a.b(), this.a.a()));
    }

    @Deprecated
    public P9<C2781gg.a> f() {
        return new N9(new Oe(), new C2738en(AESEncrypter.DEFAULT_ALGORITHM, this.a.b(), this.a.a()));
    }

    public P9<C2806hg> g() {
        return new N9(new R9(), new C2738en(AESEncrypter.DEFAULT_ALGORITHM, this.a.b(), this.a.a()));
    }

    public P9<C2855jg> h() {
        return new N9(new T9(), new C2738en(AESEncrypter.DEFAULT_ALGORITHM, this.a.b(), this.a.a()));
    }

    public P9<C2880kg> i() {
        return new N9(new U9(), new C2738en(AESEncrypter.DEFAULT_ALGORITHM, this.a.b(), this.a.a()));
    }
}
