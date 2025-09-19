package com.facebook.hermes.intl;

import android.os.Build;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC11234u10;
import p000.AbstractC7858Km0;
import p000.AbstractC8261Sf1;
import p000.AbstractC9080dA1;
import p000.C0226Da;
import p000.C7314Aa0;
import p000.C7366Ba0;
import p000.C8170Qm0;
import p000.C8342Tu0;
import p000.CJ1;
import p000.EnumC9325f50;
import p000.EnumC9453g50;
import p000.EnumC9581h50;
import p000.InterfaceC0965PK;
import p000.InterfaceC9709i50;
import p000.N90;
import p000.Y40;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class Collator {

    /* renamed from: a */
    public final EnumC9581h50 f17794a;

    /* renamed from: b */
    public final EnumC9453g50 f17795b;

    /* renamed from: c */
    public final boolean f17796c;

    /* renamed from: d */
    public final String f17797d;

    /* renamed from: e */
    public final boolean f17798e;

    /* renamed from: f */
    public final EnumC9325f50 f17799f;

    /* renamed from: g */
    public final Y40 f17800g;

    /* renamed from: h */
    public final Y40 f17801h;

    /* renamed from: i */
    public final InterfaceC9709i50 f17802i;

    @InterfaceC0965PK
    public Collator(List<String> list, Map<String, Object> map) throws C0226Da {
        this.f17797d = "default";
        if (Build.VERSION.SDK_INT >= 24) {
            C8170Qm0 c8170Qm0 = new C8170Qm0(26);
            c8170Qm0.f9780b = null;
            this.f17802i = c8170Qm0;
        } else {
            this.f17802i = new C8342Tu0(22);
        }
        Map<String, Object> map2 = map;
        this.f17794a = (EnumC9581h50) CJ1.m1145e(EnumC9581h50.class, (String) CJ1.m1142b(map2, "usage", 2, AbstractC7858Km0.f6283e, "sort"));
        HashMap map3 = new HashMap();
        map3.put("localeMatcher", CJ1.m1142b(map2, "localeMatcher", 2, AbstractC7858Km0.f6280b, "best fit"));
        C7366Ba0 c7366Ba0 = AbstractC9080dA1.f25853a;
        Object objM1142b = CJ1.m1142b(map2, "numeric", 1, c7366Ba0, c7366Ba0);
        map3.put("kn", objM1142b instanceof C7366Ba0 ? objM1142b : String.valueOf(((Boolean) objM1142b).booleanValue()));
        map3.put("kf", CJ1.m1142b(map2, "caseFirst", 2, AbstractC7858Km0.f6282d, c7366Ba0));
        HashMap mapM5578a = N90.m5578a(list, map3, Arrays.asList("co", "kf", "kn"));
        Y40 y40 = (Y40) mapM5578a.get(CommonUrlParts.LOCALE);
        this.f17800g = y40;
        this.f17801h = y40.mo5823d();
        Object objM17501a = AbstractC9080dA1.m17501a("co", mapM5578a);
        this.f17797d = (String) (objM17501a instanceof C7314Aa0 ? "default" : objM17501a);
        Object objM17501a2 = AbstractC9080dA1.m17501a("kn", mapM5578a);
        if (objM17501a2 instanceof C7314Aa0) {
            this.f17798e = false;
        } else {
            this.f17798e = Boolean.parseBoolean((String) objM17501a2);
        }
        String strM17501a = AbstractC9080dA1.m17501a("kf", mapM5578a);
        this.f17799f = (EnumC9325f50) CJ1.m1145e(EnumC9325f50.class, (String) (strM17501a instanceof C7314Aa0 ? "false" : strM17501a));
        if (this.f17794a == EnumC9581h50.f28244b) {
            ArrayList arrayListMo5819a = this.f17800g.mo5819a();
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListMo5819a.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8261Sf1.m7411b((String) it.next()));
            }
            arrayList.add(AbstractC8261Sf1.m7411b("search"));
            this.f17800g.mo5825f("co", arrayList);
        }
        Object objM1142b2 = CJ1.m1142b(map2, "sensitivity", 2, AbstractC7858Km0.f6281c, c7366Ba0);
        if (!(objM1142b2 instanceof C7366Ba0)) {
            this.f17795b = (EnumC9453g50) CJ1.m1145e(EnumC9453g50.class, (String) objM1142b2);
        } else if (this.f17794a == EnumC9581h50.f28243a) {
            this.f17795b = EnumC9453g50.f27557d;
        } else {
            this.f17795b = EnumC9453g50.f27558e;
        }
        this.f17796c = ((Boolean) CJ1.m1142b(map2, "ignorePunctuation", 1, c7366Ba0, Boolean.FALSE)).booleanValue();
        this.f17802i.mo6768O(this.f17800g).mo6763J(this.f17798e).mo6774d(this.f17799f).mo6775f(this.f17795b).mo6773a0(this.f17796c);
    }

    @InterfaceC0965PK
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws C0226Da {
        return (Build.VERSION.SDK_INT < 24 || !((String) CJ1.m1142b(map, "localeMatcher", 2, AbstractC7858Km0.f6280b, "best fit")).equals("best fit")) ? Arrays.asList(AbstractC11234u10.m25077g((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(AbstractC11234u10.m25074d((String[]) list.toArray(new String[list.size()])));
    }

    @InterfaceC0965PK
    public double compare(String str, String str2) {
        return this.f17802i.mo6776l(str, str2);
    }

    @InterfaceC0965PK
    public Map<String, Object> resolvedOptions() throws C0226Da {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CommonUrlParts.LOCALE, this.f17801h.mo5821b().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f17794a.toString());
        EnumC9453g50 enumC9453g50 = this.f17795b;
        if (enumC9453g50 == EnumC9453g50.f27558e) {
            linkedHashMap.put("sensitivity", this.f17802i.mo6760G().toString());
        } else {
            linkedHashMap.put("sensitivity", enumC9453g50.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f17796c));
        linkedHashMap.put("collation", this.f17797d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f17798e));
        linkedHashMap.put("caseFirst", this.f17799f.toString());
        return linkedHashMap;
    }
}
