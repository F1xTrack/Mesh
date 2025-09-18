package p000;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: fw */
/* loaded from: classes.dex */
public final class C4084fw {

    /* renamed from: a */
    public final Context f27466a;

    /* renamed from: b */
    public final int f27467b;

    /* renamed from: c */
    public final ArrayList f27468c;

    /* renamed from: d */
    public C6686qX f27469d;

    /* renamed from: e */
    public long f27470e;

    /* renamed from: f */
    public boolean f27471f;

    /* renamed from: g */
    public long f27472g;

    /* renamed from: h */
    public InterfaceC8217Rj1 f27473h;

    /* renamed from: i */
    public Executor f27474i;

    /* renamed from: j */
    public final /* synthetic */ C4147gw f27475j;

    public C4084fw(C4147gw c4147gw, Context context) {
        this.f27475j = c4147gw;
        this.f27466a = context;
        this.f27467b = AbstractC7485Dh1.m1799N(context) ? 1 : 5;
        this.f27468c = new ArrayList();
        this.f27470e = -9223372036854775807L;
        this.f27473h = InterfaceC8217Rj1.f10402h1;
        this.f27474i = C4147gw.f28091m;
    }

    /* renamed from: a */
    public final void m18305a(boolean z) {
        this.f27471f = false;
        this.f27470e = -9223372036854775807L;
        C4147gw c4147gw = this.f27475j;
        if (c4147gw.f28103l == 1) {
            c4147gw.f28102k++;
            c4147gw.f28094c.m2370a();
            R71 r71 = c4147gw.f28100i;
            YN1.m9283h(r71);
            r71.m6905c(new RunnableC0383G4(25, c4147gw));
        }
        if (z) {
            C11962zj1 c11962zj1 = c4147gw.f28093b;
            C7489Dj1 c7489Dj1 = c11962zj1.f46959b;
            c7489Dj1.f2218m = 0L;
            c7489Dj1.f2221p = -1L;
            c7489Dj1.f2219n = -1L;
            c11962zj1.f46964g = -9223372036854775807L;
            c11962zj1.f46962e = -9223372036854775807L;
            c11962zj1.m26525c(1);
            c11962zj1.f46965h = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public final void m18306b(C6686qX c6686qX) throws C8269Sj1 {
        C4147gw c4147gw = this.f27475j;
        YN1.m9281f(c4147gw.f28103l == 0);
        C0372Fu c0372Fu = c6686qX.f40987z;
        if (c0372Fu == null || !c0372Fu.m2822d()) {
            c0372Fu = C0372Fu.f3463h;
        }
        if (c0372Fu.f3466c != 7 || AbstractC7485Dh1.f2166a < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        YN1.m9283h(looperMyLooper);
        c4147gw.f28100i = c4147gw.f28096e.m5274a(looperMyLooper, null);
        try {
            C3958dw c3958dw = c4147gw.f28095d;
            N70 n70 = P70.f8867b;
            C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
            c3958dw.m17777a();
            Pair pair = c4147gw.f28101j;
            if (pair == null) {
                throw null;
            }
            int i = ((C8673a21) pair.second).f15292a;
            throw null;
        } catch (C11708xj1 e) {
            throw new C8269Sj1(e, c6686qX);
        }
    }

    /* renamed from: c */
    public final void m18307c() {
        if (this.f27469d == null) {
            return;
        }
        new ArrayList().addAll(this.f27468c);
        C6686qX c6686qX = this.f27469d;
        c6686qX.getClass();
        YN1.m9283h(null);
        C0372Fu c0372Fu = c6686qX.f40987z;
        if (c0372Fu == null || !c0372Fu.m2822d()) {
            C0372Fu c0372Fu2 = C0372Fu.f3463h;
        }
        int i = c6686qX.f40980s;
        YN1.m9277b("width must be positive, but is: " + i, i > 0);
        int i2 = c6686qX.f40981t;
        YN1.m9277b("height must be positive, but is: " + i2, i2 > 0);
        throw null;
    }

    /* renamed from: d */
    public final void m18308d(long j, long j2) throws C8269Sj1 {
        try {
            this.f27475j.m18674a(j, j2);
        } catch (C0531IQ e) {
            C6686qX c6686qX = this.f27469d;
            if (c6686qX == null) {
                c6686qX = new C6686qX(new C6623pX());
            }
            throw new C8269Sj1(e, c6686qX);
        }
    }

    /* renamed from: e */
    public final void m18309e(Surface surface, C8673a21 c8673a21) {
        C4147gw c4147gw = this.f27475j;
        Pair pair = c4147gw.f28101j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C8673a21) c4147gw.f28101j.second).equals(c8673a21)) {
            return;
        }
        c4147gw.f28101j = Pair.create(surface, c8673a21);
        int i = c8673a21.f15292a;
    }
}
