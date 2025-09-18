package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class DF implements InterfaceC8291z30 {
    public final /* synthetic */ FF a;

    public DF(FF ff) {
        this.a = ff;
    }

    @Override // defpackage.InterfaceC8291z30
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // defpackage.InterfaceC8291z30
    public final boolean c(Uri uri, C1204Pf c1204Pf, boolean z) {
        HashMap map;
        EF ef;
        FF ff = this.a;
        if (ff.l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C7339u30 c7339u30 = ff.j;
            int i = AbstractC0277Dh1.a;
            List list = c7339u30.e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                map = ff.d;
                if (i2 >= size) {
                    break;
                }
                EF ef2 = (EF) map.get(((C7148t30) list.get(i2)).a);
                if (ef2 != null && jElapsedRealtime < ef2.h) {
                    i3++;
                }
                i2++;
            }
            C3638ek0 c3638ek0 = new C3638ek0(1, 0, ff.j.e.size(), i3);
            ff.c.getClass();
            C3829fk0 c3829fk0C = C3547eG.c(c3638ek0, c1204Pf);
            if (c3829fk0C != null && c3829fk0C.a == 2 && (ef = (EF) map.get(uri)) != null) {
                EF.a(ef, c3829fk0C.b);
            }
        }
        return false;
    }
}
