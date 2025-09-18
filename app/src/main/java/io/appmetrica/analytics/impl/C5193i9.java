package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.i9 */
/* loaded from: classes2.dex */
public final class C5193i9 {

    /* renamed from: a */
    public final C5323ne f31917a;

    /* renamed from: b */
    public final C5482tn f31918b;

    /* renamed from: c */
    public final C4859Uj f31919c;

    /* renamed from: d */
    public final C4631L6 f31920d;

    /* renamed from: e */
    public final C4440D8 f31921e;

    /* renamed from: f */
    public final C4668Mj f31922f;

    /* renamed from: g */
    public final C5009b0 f31923g;

    /* renamed from: h */
    public final C4729P8 f31924h;

    /* renamed from: i */
    public final C5189i5 f31925i;

    /* renamed from: j */
    public final TimeProvider f31926j;

    /* renamed from: k */
    public final int f31927k;

    /* renamed from: l */
    public long f31928l;

    /* renamed from: m */
    public int f31929m;

    public C5193i9(C5323ne c5323ne, C5482tn c5482tn, C4859Uj c4859Uj, C4631L6 c4631l6, C5009b0 c5009b0, C4440D8 c4440d8, C4668Mj c4668Mj, int i, C5189i5 c5189i5, C4729P8 c4729p8, SystemTimeProvider systemTimeProvider) {
        this.f31917a = c5323ne;
        this.f31918b = c5482tn;
        this.f31919c = c4859Uj;
        this.f31920d = c4631l6;
        this.f31923g = c5009b0;
        this.f31921e = c4440d8;
        this.f31922f = c4668Mj;
        this.f31927k = i;
        this.f31924h = c4729p8;
        this.f31926j = systemTimeProvider;
        this.f31925i = c5189i5;
        this.f31928l = c5323ne.m20829h();
        this.f31929m = c5323ne.m20828g();
    }

    /* renamed from: a */
    public final void m20572a(C4821T5 c4821t5, C4907Wj c4907Wj) {
        Map map = c4821t5.f30776p;
        C4668Mj c4668Mj = this.f31922f;
        c4668Mj.getClass();
        map.putAll(new HashMap(c4668Mj.f30488b));
        c4821t5.mo19857c(this.f31917a.m20832i());
        c4821t5.f30775o = Integer.valueOf(this.f31918b.m21099b());
        C4984a0 c4984a0M20132a = this.f31923g.m20132a();
        C4440D8 c4440d8 = this.f31921e;
        c4440d8.getClass();
        InterfaceC4415C8 interfaceC4415C8 = (InterfaceC4415C8) c4440d8.f30010b.m20862a(EnumC4898Wa.m19946a(c4821t5.f30764d));
        C4631L6 c4631l6 = this.f31920d;
        C5542w8 c5542w8Mo19265a = interfaceC4415C8.mo19265a(c4821t5);
        int i = c4821t5.f30764d;
        C4729P8 c4729p8 = this.f31924h;
        C5191i7 c5191i7 = new C5191i7(c4631l6.f30437g, c4907Wj, i, c4729p8, c5542w8Mo19265a, (C4473Eg) c4631l6.f30438h.f31733l.m21113a(), c4984a0M20132a);
        Long lValueOf = Long.valueOf(c4907Wj.f30989a);
        EnumC4955Yj enumC4955Yj = c4907Wj.f30992d;
        Long lValueOf2 = Long.valueOf(c4907Wj.f30990b);
        EnumC4898Wa enumC4898WaM19946a = EnumC4898Wa.m19946a(c5191i7.f31913h.f30764d);
        long jOptLong = 0;
        if (!AbstractC5443s9.f32559g.contains(EnumC4898Wa.m19946a(i))) {
            C5482tn c5482tn = c4729p8.f30611b;
            synchronized (c5482tn) {
                jOptLong = c5482tn.f32656a.m21151a().optLong("global_number", 0L);
            }
            c4729p8.f30611b.m21101b(1 + jOptLong);
        }
        c4631l6.m19588a(c4631l6.f30442l.fromModel(new C5116f7(lValueOf, enumC4955Yj, lValueOf2, enumC4898WaM19946a, Long.valueOf(jOptLong), Long.valueOf(c4907Wj.f30991c), c5191i7.m20566a())));
        this.f31925i.f31902a.m19641g();
    }
}
