package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: Eq */
/* loaded from: classes.dex */
public final class C0305Eq implements InterfaceC8255Sc1 {

    /* renamed from: a */
    public final C8170Qm0 f2916a;

    /* renamed from: b */
    public final ConnectivityManager f2917b;

    /* renamed from: c */
    public final Context f2918c;

    /* renamed from: d */
    public final URL f2919d;

    /* renamed from: e */
    public final InterfaceC6645pt f2920e;

    /* renamed from: f */
    public final InterfaceC6645pt f2921f;

    /* renamed from: g */
    public final int f2922g;

    public C0305Eq(Context context, InterfaceC6645pt interfaceC6645pt, InterfaceC6645pt interfaceC6645pt2) {
        C10415nc0 c10415nc0 = new C10415nc0();
        C3938db c3938db = C3938db.f26144a;
        c10415nc0.mo884a(AbstractC1364Vg.class, c3938db);
        c10415nc0.mo884a(C7149xc.class, c3938db);
        C6310kb c6310kb = C6310kb.f36550a;
        c10415nc0.mo884a(AbstractC10177ll0.class, c6310kb);
        c10415nc0.mo884a(C1487Xd.class, c6310kb);
        C4000eb c4000eb = C4000eb.f26756a;
        c10415nc0.mo884a(AbstractC3893ct.class, c4000eb);
        c10415nc0.mo884a(C0291Ec.class, c4000eb);
        C1857cb c1857cb = C1857cb.f17631a;
        c10415nc0.mo884a(AbstractC4219i4.class, c1857cb);
        c10415nc0.mo884a(C6628pc.class, c1857cb);
        C6247jb c6247jb = C6247jb.f35252a;
        c10415nc0.mo884a(AbstractC9793il0.class, c6247jb);
        c10415nc0.mo884a(C1424Wd.class, c6247jb);
        C4063fb c4063fb = C4063fb.f27247a;
        c10415nc0.mo884a(AbstractC6710qv.class, c4063fb);
        c10415nc0.mo884a(C0354Fc.class, c4063fb);
        C4252ib c4252ib = C4252ib.f29336a;
        c10415nc0.mo884a(AbstractC1286UR.class, c4252ib);
        c10415nc0.mo884a(C0418Gd.class, c4252ib);
        C4189hb c4189hb = C4189hb.f28468a;
        c10415nc0.mo884a(AbstractC1223TR.class, c4189hb);
        c10415nc0.mo884a(C0355Fd.class, c4189hb);
        C6373lb c6373lb = C6373lb.f37175a;
        c10415nc0.mo884a(AbstractC8238Ru0.class, c6373lb);
        c10415nc0.mo884a(C1798be.class, c6373lb);
        C4126gb c4126gb = C4126gb.f27855a;
        c10415nc0.mo884a(AbstractC6300kR.class, c4126gb);
        c10415nc0.mo884a(C0292Ed.class, c4126gb);
        c10415nc0.f38409d = true;
        this.f2916a = new C8170Qm0(22, c10415nc0);
        this.f2918c = context;
        this.f2917b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2919d = m2432b(C0928Ok.f8585c);
        this.f2920e = interfaceC6645pt2;
        this.f2921f = interfaceC6645pt;
        this.f2922g = 130000;
    }

    /* renamed from: b */
    public static URL m2432b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC7222ym.m26245v("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C0166Cd m2433a(p000.C0166Cd r7) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0305Eq.m2433a(Cd):Cd");
    }
}
