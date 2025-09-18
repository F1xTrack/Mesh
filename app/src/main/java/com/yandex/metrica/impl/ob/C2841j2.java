package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.yandex.metrica.impl.ob.A;
import com.yandex.metrica.impl.ob.T1;
import com.yandex.metrica.impl.ob.Vf;
import defpackage.NX;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2841j2 extends U1<C3031qh> {
    private final Pn<byte[]> A;
    private final Im B;
    private C2856jh C;
    private final I8 D;
    private final W0 E;
    private int F;
    private final C2744f4 r;
    private final Map<String, String> s;
    private C2807hh t;
    Vf u;
    C3096t8 v;
    List<Long> w;
    int x;
    int y;
    private b z;

    /* renamed from: com.yandex.metrica.impl.ob.j2$a */
    public static final class a {
        final Vf.d a;
        final A.a b;
        final boolean c;

        public a(Vf.d dVar, A.a aVar, boolean z) {
            this.a = dVar;
            this.b = aVar;
            this.c = z;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j2$b */
    public static final class b {
        final List<Vf.d> a;
        final List<Long> b;
        final JSONObject c;

        public b(List<Vf.d> list, List<Long> list2, JSONObject jSONObject) {
            this.a = list;
            this.b = list2;
            this.c = jSONObject;
        }
    }

    public C2841j2(C2744f4 c2744f4) {
        this(c2744f4, c2744f4.i(), c2744f4.q(), c2744f4.w());
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean A() {
        return super.A() & (!m());
    }

    @Override // com.yandex.metrica.impl.ob.U1
    public void C() {
        a(false);
    }

    @Override // com.yandex.metrica.impl.ob.U1
    public void D() {
        a(true);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void a(Uri.Builder builder) {
        ((C3031qh) this.j).a(builder, this.C);
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void b(Throwable th) {
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public Ci j() {
        return this.r.m().r();
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01e7 A[LOOP:2: B:86:0x01e1->B:88:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0200 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0202  */
    @Override // com.yandex.metrica.impl.ob.T1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean o() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2841j2.o():boolean");
    }

    @Override // com.yandex.metrica.impl.ob.U1, com.yandex.metrica.impl.ob.T1
    public boolean r() {
        boolean zR = super.r();
        if (zR && this.B.c()) {
            for (int i = 0; i < this.z.a.size(); i++) {
                this.B.a(this.z.a.get(i), "Event sent");
            }
        }
        return zR;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void t() {
        this.r.l().c();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public boolean v() {
        this.r.l().a();
        return true;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void w() {
        this.r.i().a();
        this.r.l().b();
        super.w();
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public void x() {
        this.r.l().b();
        super.x();
    }

    private Vf.a[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        Vf.a[] aVarArr = new Vf.a[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Vf.a aVar = new Vf.a();
                aVar.b = next;
                aVar.c = jSONObject.getString(next);
                aVarArr[i] = aVar;
            } catch (Throwable unused) {
            }
            i++;
        }
        return aVarArr;
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public T1.a b() {
        return T1.a.REPORT;
    }

    private C2841j2(C2744f4 c2744f4, C3096t8 c3096t8, Im im, I8 i8) {
        this(c2744f4, im, c3096t8, new C3031qh(), i8, new Dn(1024000, "event value in ReportTask", im), Oh.a());
    }

    public C2841j2(C2744f4 c2744f4, Im im, C3096t8 c3096t8, C3031qh c3031qh, I8 i8, Dn dn, W0 w0) {
        super(c3031qh);
        this.s = new LinkedHashMap();
        this.x = 0;
        this.y = -1;
        this.r = c2744f4;
        this.v = c3096t8;
        this.B = im;
        this.A = dn;
        this.D = i8;
        this.E = w0;
    }

    private void a(boolean z) {
        this.D.c(this.F);
        Vf.d[] dVarArr = this.u.b;
        for (int i = 0; i < dVarArr.length; i++) {
            try {
                Vf.d dVar = dVarArr[i];
                this.v.a(this.w.get(i).longValue(), C2692d2.a(dVar.c.d).a(), dVar.d.length, z);
            } catch (Throwable unused) {
            }
        }
        this.v.a(this.r.u().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, blocks: (B:5:0x0022, B:6:0x0028, B:8:0x002f, B:20:0x0054, B:23:0x0060, B:26:0x006f, B:28:0x0078, B:37:0x009a, B:44:0x00af, B:46:0x00bd, B:53:0x00c9, B:52:0x00c8, B:49:0x00c3, B:54:0x00cf, B:57:0x00e1, B:60:0x00e8, B:41:0x00a7, B:63:0x00f0, B:18:0x004e, B:64:0x00f5, B:66:0x00fb, B:67:0x0110, B:69:0x0114), top: B:83:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.ob.C2841j2.a a(long r17, com.yandex.metrica.impl.ob.Vf.d.b r19, com.yandex.metrica.impl.ob.C2856jh r20, java.util.List<java.lang.Throwable> r21, int r22) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2841j2.a(long, com.yandex.metrica.impl.ob.Vf$d$b, com.yandex.metrica.impl.ob.jh, java.util.List, int):com.yandex.metrica.impl.ob.j2$a");
    }

    @Override // com.yandex.metrica.impl.ob.T1
    public String a() {
        StringBuilder sb = new StringBuilder();
        NX.n(C2841j2.class, sb, "_");
        sb.append(this.r.e().a());
        return sb.toString();
    }
}
