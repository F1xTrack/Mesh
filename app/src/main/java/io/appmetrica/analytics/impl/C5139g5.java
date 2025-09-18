package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.g5 */
/* loaded from: classes2.dex */
public class C5139g5 implements InterfaceC4659Ma, InterfaceC4392Ba, InterfaceC5418r9, InterfaceC4448Dg {

    /* renamed from: a */
    public final Context f31722a;

    /* renamed from: b */
    public final C4964Z4 f31723b;

    /* renamed from: c */
    public final C5323ne f31724c;

    /* renamed from: d */
    public final C5398qe f31725d;

    /* renamed from: e */
    public final C4666Mh f31726e;

    /* renamed from: f */
    public final C4631L6 f31727f;

    /* renamed from: g */
    public final C4618Kh f31728g;

    /* renamed from: h */
    public final C4872V8 f31729h;

    /* renamed from: i */
    public final C5009b0 f31730i;

    /* renamed from: j */
    public final C5034c0 f31731j;

    /* renamed from: k */
    public final C4859Uj f31732k;

    /* renamed from: l */
    public final C5175hg f31733l;

    /* renamed from: m */
    public final C4561I8 f31734m;

    /* renamed from: n */
    public final PublicLogger f31735n;

    /* renamed from: o */
    public final C5193i9 f31736o;

    /* renamed from: p */
    public final C5014b5 f31737p;

    /* renamed from: q */
    public final C5343o9 f31738q;

    /* renamed from: r */
    public final C4437D5 f31739r;

    /* renamed from: s */
    public final C4435D3 f31740s;

    /* renamed from: t */
    public final TimePassedChecker f31741t;

    /* renamed from: u */
    public final C4615Ke f31742u;

    /* renamed from: v */
    public final C5482tn f31743v;

    /* renamed from: w */
    public final C4668Mj f31744w;

    public C5139g5(Context context, C5155gl c5155gl, C4964Z4 c4964z4, C4411C4 c4411c4, InterfaceC4398Bg interfaceC4398Bg, AbstractC5089e5 abstractC5089e5) {
        this(context, c4964z4, new C5034c0(), new TimePassedChecker(), new C5264l5(context, c4964z4, c4411c4, abstractC5089e5, c5155gl, interfaceC4398Bg, C5244ka.m20614h().m20636u().m21141d(), PackageManagerUtils.getAppVersionCodeInt(context), C5244ka.m20614h().m20624i()));
    }

    /* renamed from: A */
    public final boolean m20409A() {
        C4473Eg c4473Eg = (C4473Eg) this.f31733l.m21113a();
        return c4473Eg.f30091o && this.f31741t.didTimePassSeconds(this.f31736o.f31928l, c4473Eg.f30097u, "should force send permissions");
    }

    /* renamed from: B */
    public final boolean m20410B() {
        C5155gl c5155gl;
        C4615Ke c4615Ke = this.f31742u;
        c4615Ke.f30474h.mo19398a(c4615Ke.f30467a);
        boolean z = ((C4543He) c4615Ke.m19632c()).f30254d;
        C5175hg c5175hg = this.f31733l;
        synchronized (c5175hg) {
            c5155gl = c5175hg.f32674c.f30602a;
        }
        return !(z && c5155gl.f31798q);
    }

    /* renamed from: C */
    public void mo20346C() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4659Ma, io.appmetrica.analytics.impl.InterfaceC4788Rk
    /* renamed from: a */
    public final void mo19571a(EnumC4621Kk enumC4621Kk, C5155gl c5155gl) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4392Ba
    /* renamed from: b */
    public final C4964Z4 mo19229b() {
        return this.f31723b;
    }

    /* renamed from: c */
    public CounterConfigurationReporterType mo19230c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    /* renamed from: d */
    public final void m20413d() {
        C5009b0 c5009b0 = this.f31730i;
        synchronized (c5009b0) {
            c5009b0.f31272a = new C5396qc();
        }
        this.f31731j.m20208a(this.f31730i.m20132a(), this.f31724c);
    }

    /* renamed from: e */
    public final synchronized void m20414e() {
        this.f31726e.m20582b();
    }

    /* renamed from: f */
    public final C4435D3 m20415f() {
        return this.f31740s;
    }

    /* renamed from: g */
    public final C5323ne m20416g() {
        return this.f31724c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4392Ba
    public final Context getContext() {
        return this.f31722a;
    }

    /* renamed from: h */
    public final C4631L6 m20417h() {
        return this.f31727f;
    }

    /* renamed from: i */
    public final C4561I8 m20418i() {
        return this.f31734m;
    }

    /* renamed from: j */
    public final C4872V8 m20419j() {
        return this.f31729h;
    }

    /* renamed from: k */
    public final C5193i9 m20420k() {
        return this.f31736o;
    }

    /* renamed from: l */
    public final C5343o9 m20421l() {
        return this.f31738q;
    }

    /* renamed from: m */
    public final C4473Eg m20422m() {
        return (C4473Eg) this.f31733l.m21113a();
    }

    /* renamed from: n */
    public final String m20423n() {
        return this.f31724c.m20832i();
    }

    /* renamed from: o */
    public final PublicLogger m20424o() {
        return this.f31735n;
    }

    /* renamed from: p */
    public final InterfaceC4705O8 m20425p() {
        return this.f31739r;
    }

    /* renamed from: q */
    public final C5398qe m20426q() {
        return this.f31725d;
    }

    /* renamed from: r */
    public final C4668Mj m20427r() {
        return this.f31744w;
    }

    /* renamed from: s */
    public final C4859Uj m20428s() {
        return this.f31732k;
    }

    /* renamed from: t */
    public final C5155gl m20429t() {
        C5155gl c5155gl;
        C5175hg c5175hg = this.f31733l;
        synchronized (c5175hg) {
            c5155gl = c5175hg.f32674c.f30602a;
        }
        return c5155gl;
    }

    /* renamed from: u */
    public final C5482tn m20430u() {
        return this.f31743v;
    }

    /* renamed from: v */
    public final void m20431v() {
        C5193i9 c5193i9 = this.f31736o;
        int i = c5193i9.f31927k;
        c5193i9.f31929m = i;
        c5193i9.f31917a.m20818a(i).m20875b();
    }

    /* renamed from: w */
    public final void m20432w() {
        int iOptInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        C5482tn c5482tn = this.f31743v;
        synchronized (c5482tn) {
            iOptInt = c5482tn.f32656a.m21151a().optInt("last_migration_api_level", 0);
        }
        if (iOptInt < libraryApiLevel) {
            this.f31737p.getClass();
            Iterator it = AbstractC7230yu.m26274e(new C5064d5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC5039c5) it.next()).m20211a(iOptInt);
            }
            this.f31743v.m21100b(libraryApiLevel);
        }
    }

    /* renamed from: x */
    public final boolean m20433x() {
        C4473Eg c4473Eg = (C4473Eg) this.f31733l.m21113a();
        return c4473Eg.f30091o && c4473Eg.isIdentifiersValid() && this.f31741t.didTimePassSeconds(this.f31736o.f31928l, c4473Eg.f30096t, "need to check permissions");
    }

    /* renamed from: y */
    public final boolean m20434y() {
        C5193i9 c5193i9 = this.f31736o;
        return c5193i9.f31929m < c5193i9.f31927k && ((C4473Eg) this.f31733l.m21113a()).f30092p && ((C4473Eg) this.f31733l.m21113a()).isIdentifiersValid();
    }

    /* renamed from: z */
    public final void m20435z() {
        C5175hg c5175hg = this.f31733l;
        synchronized (c5175hg) {
            c5175hg.f32672a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4659Ma
    /* renamed from: a */
    public final void mo19635a(C4821T5 c4821t5) {
        String strM20389a = AbstractC5124ff.m20389a("Event received on service", EnumC4898Wa.m19946a(c4821t5.f30764d), c4821t5.getName(), c4821t5.getValue());
        if (strM20389a != null) {
            this.f31735n.info(strM20389a, new Object[0]);
        }
        String str = this.f31723b.f31145b;
        if (TextUtils.isEmpty(str) || ResultCode.ERROR.equals(str)) {
            return;
        }
        this.f31728g.m19645a(c4821t5, new C4594Jh());
    }

    /* renamed from: b */
    public final void m20412b(C4821T5 c4821t5) {
        this.f31730i.m20133a(c4821t5.f30766f);
        C4984a0 c4984a0M20132a = this.f31730i.m20132a();
        C5034c0 c5034c0 = this.f31731j;
        C5323ne c5323ne = this.f31724c;
        synchronized (c5034c0) {
            if (c4984a0M20132a.f31233b > c5323ne.m20824d().f31233b) {
                c5323ne.m20820a(c4984a0M20132a).m20875b();
                this.f31735n.info("Save new app environment for %s. Value: %s", this.f31723b, c4984a0M20132a.f31232a);
            }
        }
    }

    public C5139g5(Context context, C4964Z4 c4964z4, C5034c0 c5034c0, TimePassedChecker timePassedChecker, C5264l5 c5264l5) {
        this.f31722a = context.getApplicationContext();
        this.f31723b = c4964z4;
        this.f31731j = c5034c0;
        this.f31741t = timePassedChecker;
        C5482tn c5482tnM20679f = c5264l5.m20679f();
        this.f31743v = c5482tnM20679f;
        this.f31742u = C5244ka.m20614h().m20632q();
        C5175hg c5175hgM20672a = c5264l5.m20672a(this);
        this.f31733l = c5175hgM20672a;
        PublicLogger publicLoggerM20587a = c5264l5.m20677d().m20587a();
        this.f31735n = publicLoggerM20587a;
        C5323ne c5323neM20605a = c5264l5.m20678e().m20605a();
        this.f31724c = c5323neM20605a;
        this.f31725d = C5244ka.m20614h().m20638w();
        C5009b0 c5009b0M20207a = c5034c0.m20207a(c4964z4, publicLoggerM20587a, c5323neM20605a);
        this.f31730i = c5009b0M20207a;
        this.f31734m = c5264l5.m20671a();
        C4631L6 c4631l6M20674b = c5264l5.m20674b(this);
        this.f31727f = c4631l6M20674b;
        C4666Mh c4666MhM20676d = c5264l5.m20676d(this);
        this.f31726e = c4666MhM20676d;
        this.f31737p = C5264l5.m20668b();
        C5371pc c5371pcM20667a = C5264l5.m20667a(c4631l6M20674b, c5175hgM20672a);
        C4437D5 c4437d5M20663a = C5264l5.m20663a(c4631l6M20674b);
        this.f31739r = c4437d5M20663a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c5371pcM20667a);
        arrayList.add(c4437d5M20663a);
        this.f31738q = C5264l5.m20666a(arrayList, this);
        m20432w();
        C4859Uj c4859UjM20665a = C5264l5.m20665a(this, c5482tnM20679f, new C5114f5(this));
        this.f31732k = c4859UjM20665a;
        publicLoggerM20587a.info("Read app environment for component %s. Value: %s", c4964z4.toString(), c5009b0M20207a.m20132a().f31232a);
        C4668Mj c4668MjM20675c = c5264l5.m20675c();
        this.f31744w = c4668MjM20675c;
        this.f31736o = c5264l5.m20673a(c5323neM20605a, c5482tnM20679f, c4859UjM20665a, c4631l6M20674b, c5009b0M20207a, c4668MjM20675c, c4666MhM20676d);
        C4872V8 c4872v8M20669c = C5264l5.m20669c(this);
        this.f31729h = c4872v8M20669c;
        this.f31728g = C5264l5.m20664a(this, c4872v8M20669c);
        this.f31740s = c5264l5.m20670a(c5323neM20605a);
        c4631l6M20674b.m19593d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4659Ma, io.appmetrica.analytics.impl.InterfaceC4392Ba
    /* renamed from: a */
    public synchronized void mo19228a(C4411C4 c4411c4) {
        try {
            this.f31733l.m19883a(c4411c4);
            if (Boolean.TRUE.equals(c4411c4.f29945h)) {
                this.f31735n.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c4411c4.f29945h)) {
                    this.f31735n.setEnabled(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4659Ma, io.appmetrica.analytics.impl.InterfaceC4788Rk
    /* renamed from: a */
    public synchronized void mo19574a(C5155gl c5155gl) {
        this.f31733l.m21115a(c5155gl);
        this.f31738q.m20860b();
    }

    /* renamed from: a */
    public final void m20411a(String str) {
        this.f31724c.m20833j(str).m20875b();
    }
}
