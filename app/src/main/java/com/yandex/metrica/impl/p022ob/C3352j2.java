package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import com.yandex.metrica.impl.p022ob.AbstractC2942T1;
import com.yandex.metrica.impl.p022ob.C2466A;
import com.yandex.metrica.impl.p022ob.C3006Vf;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p000.AbstractC0852NX;

/* renamed from: com.yandex.metrica.impl.ob.j2 */
/* loaded from: classes2.dex */
class C3352j2 extends AbstractC2967U1<C3549qh> {

    /* renamed from: A */
    private final InterfaceC2865Pn<byte[]> f23673A;

    /* renamed from: B */
    private final C2689Im f23674B;

    /* renamed from: C */
    private C3367jh f23675C;

    /* renamed from: D */
    private final C2675I8 f23676D;

    /* renamed from: E */
    private final InterfaceC3016W0 f23677E;

    /* renamed from: F */
    private int f23678F;

    /* renamed from: r */
    private final C3250f4 f23679r;

    /* renamed from: s */
    private final Map<String, String> f23680s;

    /* renamed from: t */
    private C3315hh f23681t;

    /* renamed from: u */
    C3006Vf f23682u;

    /* renamed from: v */
    C3618t8 f23683v;

    /* renamed from: w */
    List<Long> f23684w;

    /* renamed from: x */
    int f23685x;

    /* renamed from: y */
    int f23686y;

    /* renamed from: z */
    private b f23687z;

    /* renamed from: com.yandex.metrica.impl.ob.j2$a */
    public static final class a {

        /* renamed from: a */
        final C3006Vf.d f23688a;

        /* renamed from: b */
        final C2466A.a f23689b;

        /* renamed from: c */
        final boolean f23690c;

        public a(C3006Vf.d dVar, C2466A.a aVar, boolean z) {
            this.f23688a = dVar;
            this.f23689b = aVar;
            this.f23690c = z;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j2$b */
    public static final class b {

        /* renamed from: a */
        final List<C3006Vf.d> f23691a;

        /* renamed from: b */
        final List<Long> f23692b;

        /* renamed from: c */
        final JSONObject f23693c;

        public b(List<C3006Vf.d> list, List<Long> list2, JSONObject jSONObject) {
            this.f23691a = list;
            this.f23692b = list2;
            this.f23693c = jSONObject;
        }
    }

    public C3352j2(C3250f4 c3250f4) {
        this(c3250f4, c3250f4.m15910i(), c3250f4.m15918q(), c3250f4.m15923w());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: A */
    public boolean mo14535A() {
        return super.mo14535A() & (!m15158m());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2967U1
    /* renamed from: C */
    public void mo14536C() {
        m16110a(false);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2967U1
    /* renamed from: D */
    public void mo14537D() {
        m16110a(true);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: a */
    public void mo14458a(Uri.Builder builder) {
        ((C3549qh) this.f22346j).m16628a(builder, this.f23675C);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: b */
    public void mo14460b(Throwable th) {
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: j */
    public C2535Ci mo14461j() {
        return this.f23679r.m15914m().m15794r();
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01e7 A[LOOP:2: B:86:0x01e1->B:88:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0200 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0202  */
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo14462o() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3352j2.mo14462o():boolean");
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2967U1, com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: r */
    public boolean mo14463r() {
        boolean zMo14463r = super.mo14463r();
        if (zMo14463r && this.f23674B.m17370c()) {
            for (int i = 0; i < this.f23687z.f23691a.size(); i++) {
                this.f23674B.m14370a(this.f23687z.f23691a.get(i), "Event sent");
            }
        }
        return zMo14463r;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: t */
    public void mo14465t() {
        this.f23679r.m15913l().m15305c();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: v */
    public boolean mo15163v() {
        this.f23679r.m15913l().m15303a();
        return true;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: w */
    public void mo15164w() {
        this.f23679r.m15910i().m16832a();
        this.f23679r.m15913l().m15304b();
        super.mo15164w();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: x */
    public void mo15165x() {
        this.f23679r.m15913l().m15304b();
        super.mo15165x();
    }

    /* renamed from: a */
    private C3006Vf.a[] m16111a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C3006Vf.a[] aVarArr = new C3006Vf.a[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                C3006Vf.a aVar = new C3006Vf.a();
                aVar.f22543b = next;
                aVar.f22544c = jSONObject.getString(next);
                aVarArr[i] = aVar;
            } catch (Throwable unused) {
            }
            i++;
        }
        return aVarArr;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: b */
    public AbstractC2942T1.a mo14459b() {
        return AbstractC2942T1.a.REPORT;
    }

    private C3352j2(C3250f4 c3250f4, C3618t8 c3618t8, C2689Im c2689Im, C2675I8 c2675i8) {
        this(c3250f4, c2689Im, c3618t8, new C3549qh(), c2675i8, new C2565Dn(1024000, "event value in ReportTask", c2689Im), C2834Oh.m14711a());
    }

    public C3352j2(C3250f4 c3250f4, C2689Im c2689Im, C3618t8 c3618t8, C3549qh c3549qh, C2675I8 c2675i8, C2565Dn c2565Dn, InterfaceC3016W0 interfaceC3016W0) {
        super(c3549qh);
        this.f23680s = new LinkedHashMap();
        this.f23685x = 0;
        this.f23686y = -1;
        this.f23679r = c3250f4;
        this.f23683v = c3618t8;
        this.f23674B = c2689Im;
        this.f23673A = c2565Dn;
        this.f23676D = c2675i8;
        this.f23677E = interfaceC3016W0;
    }

    /* renamed from: a */
    private void m16110a(boolean z) {
        this.f23676D.m14290c(this.f23678F);
        C3006Vf.d[] dVarArr = this.f23682u.f22537b;
        for (int i = 0; i < dVarArr.length; i++) {
            try {
                C3006Vf.d dVar = dVarArr[i];
                this.f23683v.m16833a(this.f23684w.get(i).longValue(), C3196d2.m15729a(dVar.f22572c.f22607d).m17324a(), dVar.f22573d.length, z);
            } catch (Throwable unused) {
            }
        }
        this.f23683v.m16828a(this.f23679r.m15921u().m16952a());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, blocks: (B:5:0x0022, B:6:0x0028, B:8:0x002f, B:20:0x0054, B:23:0x0060, B:26:0x006f, B:28:0x0078, B:37:0x009a, B:44:0x00af, B:46:0x00bd, B:53:0x00c9, B:52:0x00c8, B:49:0x00c3, B:54:0x00cf, B:57:0x00e1, B:60:0x00e8, B:41:0x00a7, B:63:0x00f0, B:18:0x004e, B:64:0x00f5, B:66:0x00fb, B:67:0x0110, B:69:0x0114), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f0 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p022ob.C3352j2.a m16112a(long r17, com.yandex.metrica.impl.p022ob.C3006Vf.d.b r19, com.yandex.metrica.impl.p022ob.C3367jh r20, java.util.List<java.lang.Throwable> r21, int r22) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3352j2.m16112a(long, com.yandex.metrica.impl.ob.Vf$d$b, com.yandex.metrica.impl.ob.jh, java.util.List, int):com.yandex.metrica.impl.ob.j2$a");
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: a */
    public String mo14457a() {
        StringBuilder sb = new StringBuilder();
        AbstractC0852NX.m5765n(C3352j2.class, sb, "_");
        sb.append(this.f23679r.m15906e().m15700a());
        return sb.toString();
    }
}
