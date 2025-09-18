package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: fw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3864fw {
    public final Context a;
    public final int b;
    public final ArrayList c;
    public C6666qX d;
    public long e;
    public boolean f;
    public long g;
    public InterfaceC1374Rj1 h;
    public Executor i;
    public final /* synthetic */ C4055gw j;

    public C3864fw(C4055gw c4055gw, Context context) {
        this.j = c4055gw;
        this.a = context;
        this.b = AbstractC0277Dh1.N(context) ? 1 : 5;
        this.c = new ArrayList();
        this.e = -9223372036854775807L;
        this.h = InterfaceC1374Rj1.h1;
        this.i = C4055gw.m;
    }

    public final void a(boolean z) {
        this.f = false;
        this.e = -9223372036854775807L;
        C4055gw c4055gw = this.j;
        if (c4055gw.l == 1) {
            c4055gw.k++;
            c4055gw.c.a();
            R71 r71 = c4055gw.i;
            YN1.h(r71);
            r71.c(new G4(25, c4055gw));
        }
        if (z) {
            C8418zj1 c8418zj1 = c4055gw.b;
            C0283Dj1 c0283Dj1 = c8418zj1.b;
            c0283Dj1.m = 0L;
            c0283Dj1.p = -1L;
            c0283Dj1.n = -1L;
            c8418zj1.g = -9223372036854775807L;
            c8418zj1.e = -9223372036854775807L;
            c8418zj1.c(1);
            c8418zj1.h = -9223372036854775807L;
        }
    }

    public final void b(C6666qX c6666qX) throws C1452Sj1 {
        C4055gw c4055gw = this.j;
        YN1.f(c4055gw.l == 0);
        C0470Fu c0470Fu = c6666qX.z;
        if (c0470Fu == null || !c0470Fu.d()) {
            c0470Fu = C0470Fu.h;
        }
        if (c0470Fu.c != 7 || AbstractC0277Dh1.a < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        YN1.h(looperMyLooper);
        c4055gw.i = c4055gw.e.a(looperMyLooper, null);
        try {
            C3482dw c3482dw = c4055gw.d;
            N70 n70 = P70.b;
            C3769fQ0 c3769fQ0 = C3769fQ0.e;
            c3482dw.a();
            Pair pair = c4055gw.j;
            if (pair == null) {
                throw null;
            }
            int i = ((C2058a21) pair.second).a;
            throw null;
        } catch (C8038xj1 e) {
            throw new C1452Sj1(e, c6666qX);
        }
    }

    public final void c() {
        if (this.d == null) {
            return;
        }
        new ArrayList().addAll(this.c);
        C6666qX c6666qX = this.d;
        c6666qX.getClass();
        YN1.h(null);
        C0470Fu c0470Fu = c6666qX.z;
        if (c0470Fu == null || !c0470Fu.d()) {
            C0470Fu c0470Fu2 = C0470Fu.h;
        }
        int i = c6666qX.s;
        YN1.b("width must be positive, but is: " + i, i > 0);
        int i2 = c6666qX.t;
        YN1.b("height must be positive, but is: " + i2, i2 > 0);
        throw null;
    }

    public final void d(long j, long j2) throws C1452Sj1 {
        try {
            this.j.a(j, j2);
        } catch (IQ e) {
            C6666qX c6666qX = this.d;
            if (c6666qX == null) {
                c6666qX = new C6666qX(new C6475pX());
            }
            throw new C1452Sj1(e, c6666qX);
        }
    }

    public final void e(Surface surface, C2058a21 c2058a21) {
        C4055gw c4055gw = this.j;
        Pair pair = c4055gw.j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C2058a21) c4055gw.j.second).equals(c2058a21)) {
            return;
        }
        c4055gw.j = Pair.create(surface, c2058a21);
        int i = c2058a21.a;
    }
}
