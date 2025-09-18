package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes2.dex */
public final class YI0 extends AbstractC0879La0 {
    public final C0893Lf n;
    public final C0893Lf o;
    public final C0893Lf p;
    public final C0893Lf q;
    public final C0893Lf r;
    public final C0893Lf s;
    public final C0893Lf t;
    public final C0893Lf u;
    public final List v;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public YI0(defpackage.C0893Lf r17, defpackage.C0893Lf r18, defpackage.C0893Lf r19, defpackage.C0893Lf r20, defpackage.C0893Lf r21, defpackage.C0893Lf r22, defpackage.C0893Lf r23, defpackage.C0893Lf r24, java.util.ArrayList r25, defpackage.C1361Rf0 r26, java.util.LinkedHashSet r27, defpackage.L3 r28, java.lang.String r29, java.net.URI r30, defpackage.C0893Lf r31, defpackage.C0893Lf r32, java.util.LinkedList r33, java.util.Date r34, java.util.Date r35, java.util.Date r36) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YI0.<init>(Lf, Lf, Lf, Lf, Lf, Lf, Lf, Lf, java.util.ArrayList, Rf0, java.util.LinkedHashSet, L3, java.lang.String, java.net.URI, Lf, Lf, java.util.LinkedList, java.util.Date, java.util.Date, java.util.Date):void");
    }

    @Override // defpackage.AbstractC0879La0
    public final boolean b() {
        return (this.p == null && this.q == null) ? false : true;
    }

    @Override // defpackage.AbstractC0879La0
    public final HashMap c() {
        HashMap mapC = super.c();
        mapC.put("n", this.n.a);
        mapC.put("e", this.o.a);
        C0893Lf c0893Lf = this.p;
        if (c0893Lf != null) {
            mapC.put(UcumUtils.UCUM_DAYS, c0893Lf.a);
        }
        C0893Lf c0893Lf2 = this.q;
        if (c0893Lf2 != null) {
            mapC.put("p", c0893Lf2.a);
        }
        C0893Lf c0893Lf3 = this.r;
        if (c0893Lf3 != null) {
            mapC.put("q", c0893Lf3.a);
        }
        C0893Lf c0893Lf4 = this.s;
        if (c0893Lf4 != null) {
            mapC.put("dp", c0893Lf4.a);
        }
        C0893Lf c0893Lf5 = this.t;
        if (c0893Lf5 != null) {
            mapC.put("dq", c0893Lf5.a);
        }
        C0893Lf c0893Lf6 = this.u;
        if (c0893Lf6 != null) {
            mapC.put("qi", c0893Lf6.a);
        }
        List<XI0> list = this.v;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (XI0 xi0 : list) {
                C2226aw c2226aw = AbstractC8390za0.a;
                HashMap map = new HashMap();
                map.put("r", xi0.a.a);
                map.put(UcumUtils.UCUM_DAYS, xi0.b.a);
                map.put("t", xi0.c.a);
                arrayList.add(map);
            }
            mapC.put("oth", arrayList);
        }
        return mapC;
    }

    @Override // defpackage.AbstractC0879La0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YI0) || !super.equals(obj)) {
            return false;
        }
        YI0 yi0 = (YI0) obj;
        return Objects.equals(this.n, yi0.n) && Objects.equals(this.o, yi0.o) && Objects.equals(this.p, yi0.p) && Objects.equals(this.q, yi0.q) && Objects.equals(this.r, yi0.r) && Objects.equals(this.s, yi0.s) && Objects.equals(this.t, yi0.t) && Objects.equals(this.u, yi0.u) && Objects.equals(this.v, yi0.v);
    }

    @Override // defpackage.AbstractC0879La0
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, null);
    }
}
