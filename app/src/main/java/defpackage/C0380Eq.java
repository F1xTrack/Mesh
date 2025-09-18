package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: Eq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380Eq implements InterfaceC1431Sc1 {
    public final C1304Qm0 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final InterfaceC6541pt e;
    public final InterfaceC6541pt f;
    public final int g;

    public C0380Eq(Context context, InterfaceC6541pt interfaceC6541pt, InterfaceC6541pt interfaceC6541pt2) {
        C6109nc0 c6109nc0 = new C6109nc0();
        C3420db c3420db = C3420db.a;
        c6109nc0.a(AbstractC1675Vg.class, c3420db);
        c6109nc0.a(C8015xc.class, c3420db);
        C5532kb c5532kb = C5532kb.a;
        c6109nc0.a(AbstractC5754ll0.class, c5532kb);
        c6109nc0.a(C1822Xd.class, c5532kb);
        C3610eb c3610eb = C3610eb.a;
        c6109nc0.a(AbstractC3283ct.class, c3610eb);
        c6109nc0.a(C0338Ec.class, c3610eb);
        C2544cb c2544cb = C2544cb.a;
        c6109nc0.a(AbstractC4275i4.class, c2544cb);
        c6109nc0.a(C6490pc.class, c2544cb);
        C5341jb c5341jb = C5341jb.a;
        c6109nc0.a(AbstractC4404il0.class, c5341jb);
        c6109nc0.a(C1744Wd.class, c5341jb);
        C3801fb c3801fb = C3801fb.a;
        c6109nc0.a(AbstractC6738qv.class, c3801fb);
        c6109nc0.a(C0416Fc.class, c3801fb);
        C4374ib c4374ib = C4374ib.a;
        c6109nc0.a(UR.class, c4374ib);
        c6109nc0.a(C0497Gd.class, c4374ib);
        C4183hb c4183hb = C4183hb.a;
        c6109nc0.a(TR.class, c4183hb);
        c6109nc0.a(C0419Fd.class, c4183hb);
        C5723lb c5723lb = C5723lb.a;
        c6109nc0.a(AbstractC1406Ru0.class, c5723lb);
        c6109nc0.a(C2363be.class, c5723lb);
        C3992gb c3992gb = C3992gb.a;
        c6109nc0.a(AbstractC5502kR.class, c3992gb);
        c6109nc0.a(C0341Ed.class, c3992gb);
        c6109nc0.d = true;
        this.a = new C1304Qm0(22, c6109nc0);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(C1141Ok.c);
        this.e = interfaceC6541pt2;
        this.f = interfaceC6541pt;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC8235ym.v("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0185Cd a(defpackage.C0185Cd r7) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0380Eq.a(Cd):Cd");
    }
}
