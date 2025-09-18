package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.C3804w;
import com.yandex.metrica.impl.p022ob.C2766M;
import com.yandex.metrica.impl.p022ob.C3006Vf;
import com.yandex.metrica.impl.p022ob.C3028Wc;
import com.yandex.metrica.impl.p022ob.C3762ym;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ye */
/* loaded from: classes2.dex */
public class C3080Ye {

    /* renamed from: g */
    private static Map<EnumC2792N0, Integer> f22877g;

    /* renamed from: h */
    private static final C3080Ye f22878h;

    /* renamed from: a */
    private final InterfaceC3235ef f22879a;

    /* renamed from: b */
    private final InterfaceC3443mf f22880b;

    /* renamed from: c */
    private final InterfaceC3005Ve f22881c;

    /* renamed from: d */
    private final InterfaceC3105Ze f22882d;

    /* renamed from: e */
    private final InterfaceC3209df f22883e;

    /* renamed from: f */
    private final InterfaceC3261ff f22884f;

    /* renamed from: com.yandex.metrica.impl.ob.Ye$b */
    public static class b {

        /* renamed from: a */
        private InterfaceC3235ef f22885a;

        /* renamed from: b */
        private InterfaceC3443mf f22886b;

        /* renamed from: c */
        private InterfaceC3005Ve f22887c;

        /* renamed from: d */
        private InterfaceC3105Ze f22888d;

        /* renamed from: e */
        private InterfaceC3209df f22889e;

        /* renamed from: f */
        private InterfaceC3261ff f22890f;

        public /* synthetic */ b(C3080Ye c3080Ye, a aVar) {
            this(c3080Ye);
        }

        private b(C3080Ye c3080Ye) {
            this.f22885a = c3080Ye.f22879a;
            this.f22886b = c3080Ye.f22880b;
            this.f22887c = c3080Ye.f22881c;
            this.f22888d = c3080Ye.f22882d;
            this.f22889e = c3080Ye.f22883e;
            this.f22890f = c3080Ye.f22884f;
        }

        /* renamed from: a */
        public b m15504a(InterfaceC3235ef interfaceC3235ef) {
            this.f22885a = interfaceC3235ef;
            return this;
        }

        /* renamed from: a */
        public b m15506a(InterfaceC3443mf interfaceC3443mf) {
            this.f22886b = interfaceC3443mf;
            return this;
        }

        /* renamed from: a */
        public b m15501a(InterfaceC3005Ve interfaceC3005Ve) {
            this.f22887c = interfaceC3005Ve;
            return this;
        }

        /* renamed from: a */
        public b m15502a(InterfaceC3105Ze interfaceC3105Ze) {
            this.f22888d = interfaceC3105Ze;
            return this;
        }

        /* renamed from: a */
        public b m15503a(InterfaceC3209df interfaceC3209df) {
            this.f22889e = interfaceC3209df;
            return this;
        }

        /* renamed from: a */
        public b m15505a(InterfaceC3261ff interfaceC3261ff) {
            this.f22890f = interfaceC3261ff;
            return this;
        }

        /* renamed from: a */
        public C3080Ye m15507a() {
            return new C3080Ye(this);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(EnumC2792N0.FIRST_OCCURRENCE, 1);
        map.put(EnumC2792N0.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC2792N0.UNKNOWN, -1);
        f22877g = Collections.unmodifiableMap(map);
        f22878h = new C3080Ye(new C3365jf(), new C3391kf(), new C3287gf(), new C3339if(), new C3131af(), new C3157bf());
    }

    public /* synthetic */ C3080Ye(b bVar, a aVar) {
        this(bVar);
    }

    private C3080Ye(b bVar) {
        this(bVar.f22885a, bVar.f22886b, bVar.f22887c, bVar.f22888d, bVar.f22889e, bVar.f22890f);
    }

    /* renamed from: b */
    public static C3080Ye m15488b() {
        return f22878h;
    }

    /* renamed from: a */
    public C3006Vf.d.a m15494a(C3055Xe c3055Xe, C3367jh c3367jh) {
        C3006Vf.d.a.C7304a c7304a;
        int iM15523a;
        C3006Vf.d.a aVar = new C3006Vf.d.a();
        C3006Vf.d.a.b bVarMo15119a = this.f22884f.mo15119a(c3055Xe.f22800o, c3055Xe.f22801p, c3055Xe.f22794i, c3055Xe.f22793h);
        C3006Vf.b bVarMo14998a = this.f22883e.mo14998a(c3055Xe.f22792g);
        String str = c3055Xe.f22798m;
        if (TextUtils.isEmpty(str)) {
            c7304a = null;
        } else {
            C3804w c3804wM16062a = C3323i.m16062a(str);
            c7304a = new C3006Vf.d.a.C7304a();
            if (!TextUtils.isEmpty(c3804wM16062a.f25529a)) {
                c7304a.f22598b = c3804wM16062a.f25529a;
            }
            if (!TextUtils.isEmpty(c3804wM16062a.f25530b)) {
                c7304a.f22599c = c3804wM16062a.f25530b;
            }
            if (!C2968U2.m15250b(c3804wM16062a.f25531c)) {
                c7304a.f22600d = C3762ym.m17305g(c3804wM16062a.f25531c);
            }
        }
        if (bVarMo15119a != null) {
            aVar.f22581h = bVarMo15119a;
        }
        if (bVarMo14998a != null) {
            aVar.f22580g = bVarMo14998a;
        }
        String strMo15195a = this.f22879a.mo15195a(c3055Xe.f22786a);
        if (strMo15195a != null) {
            aVar.f22578e = strMo15195a;
        }
        aVar.f22579f = this.f22880b.mo14848a(c3055Xe, c3367jh);
        String str2 = c3055Xe.f22797l;
        if (str2 != null) {
            aVar.f22582i = str2;
        }
        if (c7304a != null) {
            aVar.f22583j = c7304a;
        }
        Integer numMo15542a = this.f22882d.mo15542a(c3055Xe);
        if (numMo15542a != null) {
            aVar.f22577d = numMo15542a.intValue();
        }
        if (c3055Xe.f22788c != null) {
            aVar.f22575b = r9.intValue();
        }
        if (c3055Xe.f22789d != null) {
            aVar.f22589p = r9.intValue();
        }
        if (c3055Xe.f22790e != null) {
            aVar.f22590q = r9.intValue();
        }
        Long l = c3055Xe.f22791f;
        if (l != null) {
            aVar.f22576c = l.longValue();
        }
        Integer num = c3055Xe.f22799n;
        if (num != null) {
            aVar.f22584k = num.intValue();
        }
        aVar.f22585l = this.f22881c.mo15308a(c3055Xe.f22803r);
        String str3 = c3055Xe.f22792g;
        if (str3 != null) {
            try {
                iM15523a = new C3617t7().m15523a(Boolean.valueOf(new C3762ym.a(str3).getBoolean("enabled")));
            } catch (Throwable unused) {
            }
        } else {
            iM15523a = -1;
        }
        aVar.f22586m = iM15523a;
        String str4 = c3055Xe.f22802q;
        if (str4 != null) {
            aVar.f22587n = str4.getBytes();
        }
        EnumC2792N0 enumC2792N0 = c3055Xe.f22804s;
        Integer num2 = enumC2792N0 != null ? f22877g.get(enumC2792N0) : null;
        if (num2 != null) {
            aVar.f22588o = num2.intValue();
        }
        C2766M.b.a aVar2 = c3055Xe.f22805t;
        if (aVar2 != null) {
            aVar.f22591r = C3196d2.m15723a(aVar2);
        }
        C3028Wc.a aVar3 = c3055Xe.f22806u;
        int iM15724a = aVar3 != null ? C3196d2.m15724a(aVar3) : 3;
        Integer num3 = c3055Xe.f22807v;
        if (num3 != null) {
            aVar.f22593t = num3.intValue();
        }
        aVar.f22592s = iM15724a;
        Integer num4 = c3055Xe.f22808w;
        aVar.f22594u = num4 == null ? 0 : num4.intValue();
        EnumC2667I0 enumC2667I0 = c3055Xe.f22809x;
        if (enumC2667I0 != null) {
            aVar.f22595v = enumC2667I0.f21387a;
        }
        Boolean bool = c3055Xe.f22810y;
        if (bool != null) {
            aVar.f22596w = bool.booleanValue();
        }
        if (c3055Xe.f22811z != null) {
            aVar.f22597x = r8.intValue();
        }
        return aVar;
    }

    private C3080Ye(InterfaceC3235ef interfaceC3235ef, InterfaceC3443mf interfaceC3443mf, InterfaceC3005Ve interfaceC3005Ve, InterfaceC3105Ze interfaceC3105Ze, InterfaceC3209df interfaceC3209df, InterfaceC3261ff interfaceC3261ff) {
        this.f22879a = interfaceC3235ef;
        this.f22880b = interfaceC3443mf;
        this.f22881c = interfaceC3005Ve;
        this.f22882d = interfaceC3105Ze;
        this.f22883e = interfaceC3209df;
        this.f22884f = interfaceC3261ff;
    }

    /* renamed from: a */
    public static b m15486a() {
        return new b();
    }
}
