package com.huawei.hms.hatool;

import java.util.ArrayList;
import java.util.UUID;

/* renamed from: com.huawei.hms.hatool.i1 */
/* loaded from: classes.dex */
public class C2154i1 {

    /* renamed from: a */
    private String f19206a;

    /* renamed from: b */
    private String f19207b;

    /* renamed from: c */
    private String f19208c;

    /* renamed from: d */
    private String f19209d;

    /* renamed from: e */
    private long f19210e;

    public C2154i1(String str, String str2, String str3, String str4, long j) {
        this.f19206a = str;
        this.f19207b = str2;
        this.f19208c = str3;
        this.f19209d = str4;
        this.f19210e = j;
    }

    /* renamed from: a */
    public void m12054a() {
        C2186v.m12271c("StreamEventHandler", "Begin to handle stream events...");
        C2133b1 c2133b1 = new C2133b1();
        c2133b1.m11934b(this.f19208c);
        c2133b1.m11938d(this.f19207b);
        c2133b1.m11931a(this.f19209d);
        c2133b1.m11936c(String.valueOf(this.f19210e));
        if ("oper".equals(this.f19207b) && AbstractC2194z.m12315i(this.f19206a, "oper")) {
            C2174p0 c2174p0M12303a = C2192y.m12301a().m12303a(this.f19206a, this.f19210e);
            String strM12166a = c2174p0M12303a.m12166a();
            Boolean boolValueOf = Boolean.valueOf(c2174p0M12303a.m12168b());
            c2133b1.m11940f(strM12166a);
            c2133b1.m11939e(String.valueOf(boolValueOf));
        }
        String strReplace = UUID.randomUUID().toString().replace("-", "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(c2133b1);
        new C2162l0(this.f19206a, this.f19207b, AbstractC2177q0.m12193g(), arrayList, strReplace).m12104a();
    }
}
