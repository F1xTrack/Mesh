package p000;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: DF */
/* loaded from: classes.dex */
public final class C0205DF implements InterfaceC11877z30 {

    /* renamed from: a */
    public final /* synthetic */ C0331FF f1916a;

    public C0205DF(C0331FF c0331ff) {
        this.f1916a = c0331ff;
    }

    @Override // p000.InterfaceC11877z30
    /* renamed from: a */
    public final void mo1601a() {
        this.f1916a.f3101e.remove(this);
    }

    @Override // p000.InterfaceC11877z30
    /* renamed from: c */
    public final boolean mo1602c(Uri uri, C0986Pf c0986Pf, boolean z) {
        HashMap map;
        C0268EF c0268ef;
        C0331FF c0331ff = this.f1916a;
        if (c0331ff.f3108l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C11240u30 c11240u30 = c0331ff.f3106j;
            int i = AbstractC7485Dh1.f2166a;
            List list = c11240u30.f43457e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                map = c0331ff.f3100d;
                if (i2 >= size) {
                    break;
                }
                C0268EF c0268ef2 = (C0268EF) map.get(((C11112t30) list.get(i2)).f42814a);
                if (c0268ef2 != null && jElapsedRealtime < c0268ef2.f2572h) {
                    i3++;
                }
                i2++;
            }
            C9279ek0 c9279ek0 = new C9279ek0(1, 0, c0331ff.f3106j.f43457e.size(), i3);
            c0331ff.f3099c.getClass();
            C9407fk0 c9407fk0M17890c = C3979eG.m17890c(c9279ek0, c0986Pf);
            if (c9407fk0M17890c != null && c9407fk0M17890c.f27363a == 2 && (c0268ef = (C0268EF) map.get(uri)) != null) {
                C0268EF.m2100a(c0268ef, c9407fk0M17890c.f27364b);
            }
        }
        return false;
    }
}
