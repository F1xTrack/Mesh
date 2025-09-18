package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes2.dex */
public final class YI0 extends AbstractC7886La0 {

    /* renamed from: n */
    public final C0734Lf f14229n;

    /* renamed from: o */
    public final C0734Lf f14230o;

    /* renamed from: p */
    public final C0734Lf f14231p;

    /* renamed from: q */
    public final C0734Lf f14232q;

    /* renamed from: r */
    public final C0734Lf f14233r;

    /* renamed from: s */
    public final C0734Lf f14234s;

    /* renamed from: t */
    public final C0734Lf f14235t;

    /* renamed from: u */
    public final C0734Lf f14236u;

    /* renamed from: v */
    public final List f14237v;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public YI0(p000.C0734Lf r17, p000.C0734Lf r18, p000.C0734Lf r19, p000.C0734Lf r20, p000.C0734Lf r21, p000.C0734Lf r22, p000.C0734Lf r23, p000.C0734Lf r24, java.util.ArrayList r25, p000.C8208Rf0 r26, java.util.LinkedHashSet r27, p000.C0697L3 r28, java.lang.String r29, java.net.URI r30, p000.C0734Lf r31, p000.C0734Lf r32, java.util.LinkedList r33, java.util.Date r34, java.util.Date r35, java.util.Date r36) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.YI0.<init>(Lf, Lf, Lf, Lf, Lf, Lf, Lf, Lf, java.util.ArrayList, Rf0, java.util.LinkedHashSet, L3, java.lang.String, java.net.URI, Lf, Lf, java.util.LinkedList, java.util.Date, java.util.Date, java.util.Date):void");
    }

    @Override // p000.AbstractC7886La0
    /* renamed from: b */
    public final boolean mo5029b() {
        return (this.f14231p == null && this.f14232q == null) ? false : true;
    }

    @Override // p000.AbstractC7886La0
    /* renamed from: c */
    public final HashMap mo5030c() {
        HashMap mapMo5030c = super.mo5030c();
        mapMo5030c.put("n", this.f14229n.f6248a);
        mapMo5030c.put("e", this.f14230o.f6248a);
        C0734Lf c0734Lf = this.f14231p;
        if (c0734Lf != null) {
            mapMo5030c.put(UcumUtils.UCUM_DAYS, c0734Lf.f6248a);
        }
        C0734Lf c0734Lf2 = this.f14232q;
        if (c0734Lf2 != null) {
            mapMo5030c.put("p", c0734Lf2.f6248a);
        }
        C0734Lf c0734Lf3 = this.f14233r;
        if (c0734Lf3 != null) {
            mapMo5030c.put("q", c0734Lf3.f6248a);
        }
        C0734Lf c0734Lf4 = this.f14234s;
        if (c0734Lf4 != null) {
            mapMo5030c.put("dp", c0734Lf4.f6248a);
        }
        C0734Lf c0734Lf5 = this.f14235t;
        if (c0734Lf5 != null) {
            mapMo5030c.put("dq", c0734Lf5.f6248a);
        }
        C0734Lf c0734Lf6 = this.f14236u;
        if (c0734Lf6 != null) {
            mapMo5030c.put("qi", c0734Lf6.f6248a);
        }
        List<XI0> list = this.f14237v;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (XI0 xi0 : list) {
                C1753aw c1753aw = AbstractC11943za0.f46877a;
                HashMap map = new HashMap();
                map.put("r", xi0.f13665a.f6248a);
                map.put(UcumUtils.UCUM_DAYS, xi0.f13666b.f6248a);
                map.put("t", xi0.f13667c.f6248a);
                arrayList.add(map);
            }
            mapMo5030c.put("oth", arrayList);
        }
        return mapMo5030c;
    }

    @Override // p000.AbstractC7886La0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YI0) || !super.equals(obj)) {
            return false;
        }
        YI0 yi0 = (YI0) obj;
        return Objects.equals(this.f14229n, yi0.f14229n) && Objects.equals(this.f14230o, yi0.f14230o) && Objects.equals(this.f14231p, yi0.f14231p) && Objects.equals(this.f14232q, yi0.f14232q) && Objects.equals(this.f14233r, yi0.f14233r) && Objects.equals(this.f14234s, yi0.f14234s) && Objects.equals(this.f14235t, yi0.f14235t) && Objects.equals(this.f14236u, yi0.f14236u) && Objects.equals(this.f14237v, yi0.f14237v);
    }

    @Override // p000.AbstractC7886La0
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f14229n, this.f14230o, this.f14231p, this.f14232q, this.f14233r, this.f14234s, this.f14235t, this.f14236u, this.f14237v, null);
    }
}
