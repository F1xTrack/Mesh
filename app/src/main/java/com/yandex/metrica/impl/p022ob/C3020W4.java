package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3006Vf;
import com.yandex.metrica.impl.p022ob.C3095Z4;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.W4 */
/* loaded from: classes2.dex */
public class C3020W4 {

    /* renamed from: h */
    public static final Map<Integer, Integer> f22673h = Collections.unmodifiableMap(new a());

    /* renamed from: a */
    private final C3376k0 f22674a;

    /* renamed from: b */
    private final C3045X4 f22675b;

    /* renamed from: c */
    private final C3095Z4 f22676c;

    /* renamed from: d */
    private final C2790Mn f22677d;

    /* renamed from: e */
    private final C2790Mn f22678e;

    /* renamed from: f */
    private final InterfaceC2839Om f22679f;

    /* renamed from: g */
    private final C3328i4 f22680g;

    /* renamed from: com.yandex.metrica.impl.ob.W4$a */
    public class a extends HashMap<Integer, Integer> {
        public a() {
            put(Integer.valueOf(EnumC3377k1.EVENT_TYPE_DIAGNOSTIC.m16250b()), 22);
            put(Integer.valueOf(EnumC3377k1.EVENT_TYPE_DIAGNOSTIC_STATBOX.m16250b()), 23);
            put(Integer.valueOf(EnumC3377k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.m16250b()), 24);
            put(Integer.valueOf(EnumC3377k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.m16250b()), 24);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.W4$b */
    public static class b {
    }

    public C3020W4(C3376k0 c3376k0, C3045X4 c3045x4, C3095Z4 c3095z4, C3328i4 c3328i4, C2790Mn c2790Mn, C2790Mn c2790Mn2, InterfaceC2839Om interfaceC2839Om) {
        this.f22674a = c3376k0;
        this.f22675b = c3045x4;
        this.f22676c = c3095z4;
        this.f22680g = c3328i4;
        this.f22678e = c2790Mn;
        this.f22677d = c2790Mn2;
        this.f22679f = interfaceC2839Om;
    }

    /* renamed from: a */
    public byte[] m15383a() throws UnsupportedEncodingException {
        C3006Vf c3006Vf = new C3006Vf();
        C3006Vf.d dVar = new C3006Vf.d();
        c3006Vf.f22537b = new C3006Vf.d[]{dVar};
        C3095Z4.a aVarM15536a = this.f22676c.m15536a();
        dVar.f22571b = aVarM15536a.f22932a;
        C3006Vf.d.b bVar = new C3006Vf.d.b();
        dVar.f22572c = bVar;
        bVar.f22607d = 2;
        bVar.f22605b = new C3006Vf.f();
        C3006Vf.f fVar = dVar.f22572c.f22605b;
        long j = aVarM15536a.f22933b;
        fVar.f22613b = j;
        fVar.f22614c = C3323i.m16058a(j);
        dVar.f22572c.f22606c = this.f22675b.m15788l();
        C3006Vf.d.a aVar = new C3006Vf.d.a();
        dVar.f22573d = new C3006Vf.d.a[]{aVar};
        aVar.f22575b = aVarM15536a.f22934c;
        aVar.f22590q = this.f22680g.m16081a(this.f22674a.m16244n());
        aVar.f22576c = this.f22679f.mo14675b() - aVarM15536a.f22933b;
        aVar.f22577d = f22673h.get(Integer.valueOf(this.f22674a.m16244n())).intValue();
        if (!TextUtils.isEmpty(this.f22674a.m16237g())) {
            aVar.f22578e = this.f22678e.mo14016a(this.f22674a.m16237g());
        }
        if (!TextUtils.isEmpty(this.f22674a.m16246p())) {
            String strM16246p = this.f22674a.m16246p();
            String strMo14016a = this.f22677d.mo14016a(strM16246p);
            if (!TextUtils.isEmpty(strMo14016a)) {
                aVar.f22579f = strMo14016a.getBytes();
            }
            int length = strM16246p.getBytes().length;
            byte[] bArr = aVar.f22579f;
            aVar.f22584k = length - (bArr != null ? bArr.length : 0);
        }
        return AbstractC3219e.m15809a(c3006Vf);
    }
}
