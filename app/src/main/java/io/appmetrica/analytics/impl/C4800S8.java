package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.S8 */
/* loaded from: classes2.dex */
public final class C4800S8 {

    /* renamed from: h */
    public static final Map f30722h;

    /* renamed from: i */
    public static final C4800S8 f30723i;

    /* renamed from: a */
    public final InterfaceC4997ad f30724a;

    /* renamed from: b */
    public final InterfaceC5382pn f30725b;

    /* renamed from: c */
    public final InterfaceC5517v8 f30726c;

    /* renamed from: d */
    public final InterfaceC5368p9 f30727d;

    /* renamed from: e */
    public final InterfaceC4684Nb f30728e;

    /* renamed from: f */
    public final InterfaceC5372pd f30729f;

    /* renamed from: g */
    public final InterfaceC4610K9 f30730g;

    static {
        HashMap map = new HashMap();
        map.put(EnumC4994aa.FIRST_OCCURRENCE, 1);
        map.put(EnumC4994aa.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC4994aa.UNKNOWN, -1);
        f30722h = Collections.unmodifiableMap(map);
        f30723i = new C4800S8(new C5177hi(), new C4981Zl(), new C5572xd(), new C5152gi(), new C5144ga(), new C5169ha(), new C5119fa());
    }

    public C4800S8(C4776R8 c4776r8) {
        this(c4776r8.f30679a, c4776r8.f30680b, c4776r8.f30681c, c4776r8.f30682d, c4776r8.f30683e, c4776r8.f30684f, c4776r8.f30685g);
    }

    /* renamed from: a */
    public final C5043c9 m19808a(C4585J8 c4585j8, C4473Eg c4473Eg) {
        C5043c9 c5043c9 = new C5043c9();
        C5018b9 c5018b9Mo19909a = this.f30729f.mo19909a(c4585j8.f30348l, c4585j8.f30349m);
        C4920X8 c4920x8Mo19655a = this.f30728e.mo19655a(c4585j8.f30343g);
        if (c5018b9Mo19909a != null) {
            c5043c9.f31397g = c5018b9Mo19909a;
        }
        if (c4920x8Mo19655a != null) {
            c5043c9.f31396f = c4920x8Mo19655a;
        }
        String strMo20120a = this.f30724a.mo20120a(c4585j8.f30337a);
        if (strMo20120a != null) {
            c5043c9.f31394d = strMo20120a;
        }
        c5043c9.f31395e = this.f30725b.mo19606a(c4585j8, c4473Eg);
        String str = c4585j8.f30346j;
        if (str != null) {
            c5043c9.f31398h = str;
        }
        Integer numMo20287a = this.f30727d.mo20287a(c4585j8);
        if (numMo20287a != null) {
            c5043c9.f31393c = numMo20287a.intValue();
        }
        Long l = c4585j8.f30339c;
        if (l != null) {
            c5043c9.f31391a = l.longValue();
        }
        Long l2 = c4585j8.f30340d;
        if (l2 != null) {
            c5043c9.f31404n = l2.longValue();
        }
        Long l3 = c4585j8.f30341e;
        if (l3 != null) {
            c5043c9.f31405o = l3.longValue();
        }
        Long l4 = c4585j8.f30342f;
        if (l4 != null) {
            c5043c9.f31392b = l4.longValue();
        }
        Integer num = c4585j8.f30347k;
        if (num != null) {
            c5043c9.f31399i = num.intValue();
        }
        c5043c9.f31400j = this.f30726c.mo20123a(c4585j8.f30351o);
        C5216j7 c5216j7 = c4585j8.f30343g;
        c5043c9.f31401k = c5216j7 != null ? new C5240k6().m19468a(c5216j7.f31957a) : -1;
        String str2 = c4585j8.f30350n;
        if (str2 != null) {
            c5043c9.f31402l = str2.getBytes();
        }
        EnumC4994aa enumC4994aa = c4585j8.f30352p;
        Integer num2 = enumC4994aa != null ? (Integer) f30722h.get(enumC4994aa) : null;
        if (num2 != null) {
            c5043c9.f31403m = num2.intValue();
        }
        EnumC5243k9 enumC5243k9 = c4585j8.f30353q;
        if (enumC5243k9 != null) {
            c5043c9.f31406p = enumC5243k9.f32037a;
        }
        Boolean bool = c4585j8.f30354r;
        if (bool != null) {
            c5043c9.f31407q = bool.booleanValue();
        }
        if (c4585j8.f30355s != null) {
            c5043c9.f31408r = r6.intValue();
        }
        c5043c9.f31409s = ((C5119fa) this.f30730g).m20381a(c4585j8.f30356t);
        return c5043c9;
    }

    public C4800S8(InterfaceC4997ad interfaceC4997ad, InterfaceC5382pn interfaceC5382pn, InterfaceC5517v8 interfaceC5517v8, InterfaceC5368p9 interfaceC5368p9, InterfaceC4684Nb interfaceC4684Nb, InterfaceC5372pd interfaceC5372pd, InterfaceC4610K9 interfaceC4610K9) {
        this.f30724a = interfaceC4997ad;
        this.f30725b = interfaceC5382pn;
        this.f30726c = interfaceC5517v8;
        this.f30727d = interfaceC5368p9;
        this.f30728e = interfaceC4684Nb;
        this.f30729f = interfaceC5372pd;
        this.f30730g = interfaceC4610K9;
    }

    /* renamed from: a */
    public static C4776R8 m19800a() {
        return new C4776R8(f30723i);
    }
}
