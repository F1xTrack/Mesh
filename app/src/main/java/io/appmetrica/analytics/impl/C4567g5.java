package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.rn.push.constants.ResultCode;
import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.g5 */
/* loaded from: classes2.dex */
public class C4567g5 implements Ma, Ba, InterfaceC4833r9, Dg {
    public final Context a;
    public final Z4 b;
    public final C4743ne c;
    public final C4815qe d;
    public final Mh e;
    public final L6 f;
    public final Kh g;
    public final V8 h;
    public final C4439b0 i;
    public final C4464c0 j;
    public final Uj k;
    public final C4602hg l;
    public final I8 m;
    public final PublicLogger n;
    public final C4619i9 o;
    public final C4444b5 p;
    public final C4762o9 q;
    public final D5 r;
    public final D3 s;
    public final TimePassedChecker t;
    public final Ke u;
    public final tn v;
    public final Mj w;

    public C4567g5(Context context, C4583gl c4583gl, Z4 z4, C4 c4, Bg bg, AbstractC4519e5 abstractC4519e5) {
        this(context, z4, new C4464c0(), new TimePassedChecker(), new C4686l5(context, z4, c4, abstractC4519e5, c4583gl, bg, C4667ka.h().u().d(), PackageManagerUtils.getAppVersionCodeInt(context), C4667ka.h().i()));
    }

    public final boolean A() {
        Eg eg = (Eg) this.l.a();
        return eg.o && this.t.didTimePassSeconds(this.o.l, eg.u, "should force send permissions");
    }

    public final boolean B() {
        C4583gl c4583gl;
        Ke ke = this.u;
        ke.h.a(ke.a);
        boolean z = ((He) ke.c()).d;
        C4602hg c4602hg = this.l;
        synchronized (c4602hg) {
            c4583gl = c4602hg.c.a;
        }
        return !(z && c4583gl.q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Ma, io.appmetrica.analytics.impl.Rk
    public final void a(Kk kk, C4583gl c4583gl) {
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final Z4 b() {
        return this.b;
    }

    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C4439b0 c4439b0 = this.i;
        synchronized (c4439b0) {
            c4439b0.a = new C4813qc();
        }
        this.j.a(this.i.a(), this.c);
    }

    public final synchronized void e() {
        this.e.b();
    }

    public final D3 f() {
        return this.s;
    }

    public final C4743ne g() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final Context getContext() {
        return this.a;
    }

    public final L6 h() {
        return this.f;
    }

    public final I8 i() {
        return this.m;
    }

    public final V8 j() {
        return this.h;
    }

    public final C4619i9 k() {
        return this.o;
    }

    public final C4762o9 l() {
        return this.q;
    }

    public final Eg m() {
        return (Eg) this.l.a();
    }

    public final String n() {
        return this.c.i();
    }

    public final PublicLogger o() {
        return this.n;
    }

    public final O8 p() {
        return this.r;
    }

    public final C4815qe q() {
        return this.d;
    }

    public final Mj r() {
        return this.w;
    }

    public final Uj s() {
        return this.k;
    }

    public final C4583gl t() {
        C4583gl c4583gl;
        C4602hg c4602hg = this.l;
        synchronized (c4602hg) {
            c4583gl = c4602hg.c.a;
        }
        return c4583gl;
    }

    public final tn u() {
        return this.v;
    }

    public final void v() {
        C4619i9 c4619i9 = this.o;
        int i = c4619i9.k;
        c4619i9.m = i;
        c4619i9.a.a(i).b();
    }

    public final void w() {
        int iOptInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        tn tnVar = this.v;
        synchronized (tnVar) {
            iOptInt = tnVar.a.a().optInt("last_migration_api_level", 0);
        }
        if (iOptInt < libraryApiLevel) {
            this.p.getClass();
            Iterator it = AbstractC8259yu.e(new C4494d5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC4469c5) it.next()).a(iOptInt);
            }
            this.v.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        Eg eg = (Eg) this.l.a();
        return eg.o && eg.isIdentifiersValid() && this.t.didTimePassSeconds(this.o.l, eg.t, "need to check permissions");
    }

    public final boolean y() {
        C4619i9 c4619i9 = this.o;
        return c4619i9.m < c4619i9.k && ((Eg) this.l.a()).p && ((Eg) this.l.a()).isIdentifiersValid();
    }

    public final void z() {
        C4602hg c4602hg = this.l;
        synchronized (c4602hg) {
            c4602hg.a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(T5 t5) {
        String strA = AbstractC4553ff.a("Event received on service", Wa.a(t5.d), t5.getName(), t5.getValue());
        if (strA != null) {
            this.n.info(strA, new Object[0]);
        }
        String str = this.b.b;
        if (TextUtils.isEmpty(str) || ResultCode.ERROR.equals(str)) {
            return;
        }
        this.g.a(t5, new Jh());
    }

    public final void b(T5 t5) {
        this.i.a(t5.f);
        C4414a0 c4414a0A = this.i.a();
        C4464c0 c4464c0 = this.j;
        C4743ne c4743ne = this.c;
        synchronized (c4464c0) {
            if (c4414a0A.b > c4743ne.d().b) {
                c4743ne.a(c4414a0A).b();
                this.n.info("Save new app environment for %s. Value: %s", this.b, c4414a0A.a);
            }
        }
    }

    public C4567g5(Context context, Z4 z4, C4464c0 c4464c0, TimePassedChecker timePassedChecker, C4686l5 c4686l5) {
        this.a = context.getApplicationContext();
        this.b = z4;
        this.j = c4464c0;
        this.t = timePassedChecker;
        tn tnVarF = c4686l5.f();
        this.v = tnVarF;
        this.u = C4667ka.h().q();
        C4602hg c4602hgA = c4686l5.a(this);
        this.l = c4602hgA;
        PublicLogger publicLoggerA = c4686l5.d().a();
        this.n = publicLoggerA;
        C4743ne c4743neA = c4686l5.e().a();
        this.c = c4743neA;
        this.d = C4667ka.h().w();
        C4439b0 c4439b0A = c4464c0.a(z4, publicLoggerA, c4743neA);
        this.i = c4439b0A;
        this.m = c4686l5.a();
        L6 l6B = c4686l5.b(this);
        this.f = l6B;
        Mh mhD = c4686l5.d(this);
        this.e = mhD;
        this.p = C4686l5.b();
        C4789pc c4789pcA = C4686l5.a(l6B, c4602hgA);
        D5 d5A = C4686l5.a(l6B);
        this.r = d5A;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c4789pcA);
        arrayList.add(d5A);
        this.q = C4686l5.a(arrayList, this);
        w();
        Uj ujA = C4686l5.a(this, tnVarF, new C4543f5(this));
        this.k = ujA;
        publicLoggerA.info("Read app environment for component %s. Value: %s", z4.toString(), c4439b0A.a().a);
        Mj mjC = c4686l5.c();
        this.w = mjC;
        this.o = c4686l5.a(c4743neA, tnVarF, ujA, l6B, c4439b0A, mjC, mhD);
        V8 v8C = C4686l5.c(this);
        this.h = v8C;
        this.g = C4686l5.a(this, v8C);
        this.s = c4686l5.a(c4743neA);
        l6B.d();
    }

    @Override // io.appmetrica.analytics.impl.Ma, io.appmetrica.analytics.impl.Ba
    public synchronized void a(C4 c4) {
        try {
            this.l.a(c4);
            if (Boolean.TRUE.equals(c4.h)) {
                this.n.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c4.h)) {
                    this.n.setEnabled(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ma, io.appmetrica.analytics.impl.Rk
    public synchronized void a(C4583gl c4583gl) {
        this.l.a(c4583gl);
        this.q.b();
    }

    public final void a(String str) {
        this.c.j(str).b();
    }
}
