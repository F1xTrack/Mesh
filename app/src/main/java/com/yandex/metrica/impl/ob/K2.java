package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.yandex.metrica.impl.ob.T1;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class K2 extends X1<C3055rh, C3162vj> {
    private final Si o;
    private C3162vj p;
    private Hi q;
    private final C2881kh r;

    public K2(Si si, C2881kh c2881kh) {
        this(si, c2881kh, new C3055rh(new C2831ih()), new J2());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(Uri.Builder builder) {
        ((C3055rh) this.j).a(builder, this.r);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void b(Throwable th) {
        this.q = Hi.NETWORK;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public Ci j() {
        return this.r.r();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean o() {
        a("Accept-Encoding", "encrypted");
        return this.o.d();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean r() {
        C3162vj c3162vjB = B();
        this.p = c3162vjB;
        boolean z = c3162vjB != null;
        if (!z) {
            this.q = Hi.PARSE;
        }
        return z;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void s() {
        super.s();
        this.q = Hi.NETWORK;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void t() {
        Map<String, List<String>> map;
        C3162vj c3162vj = this.p;
        if (c3162vj == null || (map = this.g) == null) {
            return;
        }
        this.o.a(c3162vj, this.r, map);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void y() {
        if (this.q == null) {
            this.q = Hi.UNKNOWN;
        }
        this.o.a(this.q);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean z() {
        return true;
    }

    public K2(Si si, C2881kh c2881kh, C3055rh c3055rh, J2 j2) {
        super(j2, c3055rh);
        this.o = si;
        this.r = c2881kh;
        a(c2881kh.J());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public String a() {
        return "Startup task for component: " + this.o.a().toString();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public T1.a b() {
        return T1.a.STARTUP;
    }
}
