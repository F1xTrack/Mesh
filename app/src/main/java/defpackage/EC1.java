package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public final class EC1 implements InterfaceC2335bU1 {
    public final /* synthetic */ CG1 a;

    public EC1(CG1 cg1) {
        this.a = cg1;
    }

    @Override // defpackage.InterfaceC2335bU1
    public final int b(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void c(String str, String str2, Bundle bundle) {
        CG1 cg1 = this.a;
        cg1.f(new TG1(cg1, str, str2, bundle, 0));
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void d(String str) {
        CG1 cg1 = this.a;
        cg1.f(new C2486cH1(cg1, str, 2));
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void e(String str) {
        CG1 cg1 = this.a;
        cg1.f(new C2486cH1(cg1, str, 1));
    }

    @Override // defpackage.InterfaceC2335bU1
    public final Map f(String str, String str2, boolean z) {
        return this.a.c(str, str2, z);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void g(String str, String str2, Bundle bundle) {
        CG1 cg1 = this.a;
        cg1.f(new LG1(cg1, str, str2, bundle, true, 2));
    }

    @Override // defpackage.InterfaceC2335bU1
    public final List h(String str, String str2) {
        return this.a.b(str, str2);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String m() {
        CG1 cg1 = this.a;
        BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
        cg1.f(new QH1(cg1, binderC3546eF1, 3));
        return binderC3546eF1.J(500L);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String n() {
        CG1 cg1 = this.a;
        BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
        cg1.f(new QH1(cg1, binderC3546eF1, 0));
        return binderC3546eF1.J(500L);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void zza(Bundle bundle) {
        CG1 cg1 = this.a;
        cg1.f(new YG1(cg1, bundle, 0));
    }

    @Override // defpackage.InterfaceC2335bU1
    public final long zzf() {
        CG1 cg1 = this.a;
        BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
        cg1.f(new QH1(cg1, binderC3546eF1, 1));
        Long l = (Long) BinderC3546eF1.I(binderC3546eF1.H(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ cg1.b.currentTimeMillis()).nextLong();
        int i = cg1.f + 1;
        cg1.f = i;
        return jNextLong + i;
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String zzg() {
        CG1 cg1 = this.a;
        BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
        cg1.f(new QH1(cg1, binderC3546eF1, 2));
        return binderC3546eF1.J(50L);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String zzi() {
        CG1 cg1 = this.a;
        BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
        cg1.f(new QH1(cg1, binderC3546eF1, 4));
        return binderC3546eF1.J(500L);
    }
}
