package p000;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public final class EC1 implements InterfaceC8859bU1 {

    /* renamed from: a */
    public final /* synthetic */ CG1 f2540a;

    public EC1(CG1 cg1) {
        this.f2540a = cg1;
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: b */
    public final int mo1571b(String str) {
        return this.f2540a.m1132a(str);
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: c */
    public final void mo1572c(String str, String str2, Bundle bundle) {
        CG1 cg1 = this.f2540a;
        cg1.m1136f(new TG1(cg1, str, str2, bundle, 0));
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: d */
    public final void mo1573d(String str) {
        CG1 cg1 = this.f2540a;
        cg1.m1136f(new C8961cH1(cg1, str, 2));
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: e */
    public final void mo1574e(String str) {
        CG1 cg1 = this.f2540a;
        cg1.m1136f(new C8961cH1(cg1, str, 1));
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: f */
    public final Map mo1575f(String str, String str2, boolean z) {
        return this.f2540a.m1134c(str, str2, z);
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: g */
    public final void mo1576g(String str, String str2, Bundle bundle) {
        CG1 cg1 = this.f2540a;
        cg1.m1136f(new LG1(cg1, str, str2, bundle, true, 2));
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: h */
    public final List mo1577h(String str, String str2) {
        return this.f2540a.m1133b(str, str2);
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: m */
    public final String mo1578m() {
        CG1 cg1 = this.f2540a;
        BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
        cg1.m1136f(new QH1(cg1, binderC9218eF1, 3));
        return binderC9218eF1.m17889J(500L);
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: n */
    public final String mo1579n() {
        CG1 cg1 = this.f2540a;
        BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
        cg1.m1136f(new QH1(cg1, binderC9218eF1, 0));
        return binderC9218eF1.m17889J(500L);
    }

    @Override // p000.InterfaceC8859bU1
    public final void zza(Bundle bundle) {
        CG1 cg1 = this.f2540a;
        cg1.m1136f(new YG1(cg1, bundle, 0));
    }

    @Override // p000.InterfaceC8859bU1
    public final long zzf() {
        CG1 cg1 = this.f2540a;
        BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
        cg1.m1136f(new QH1(cg1, binderC9218eF1, 1));
        Long l = (Long) BinderC9218eF1.m17887I(binderC9218eF1.m17888H(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ cg1.f1288b.currentTimeMillis()).nextLong();
        int i = cg1.f1292f + 1;
        cg1.f1292f = i;
        return jNextLong + i;
    }

    @Override // p000.InterfaceC8859bU1
    public final String zzg() {
        CG1 cg1 = this.f2540a;
        BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
        cg1.m1136f(new QH1(cg1, binderC9218eF1, 2));
        return binderC9218eF1.m17889J(50L);
    }

    @Override // p000.InterfaceC8859bU1
    public final String zzi() {
        CG1 cg1 = this.f2540a;
        BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
        cg1.m1136f(new QH1(cg1, binderC9218eF1, 4));
        return binderC9218eF1.m17889J(500L);
    }
}
