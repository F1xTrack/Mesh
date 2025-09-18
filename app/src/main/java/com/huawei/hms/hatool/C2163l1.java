package com.huawei.hms.hatool;

/* renamed from: com.huawei.hms.hatool.l1 */
/* loaded from: classes.dex */
public class C2163l1 {

    /* renamed from: a */
    private C2181s0 f19243a;

    /* renamed from: b */
    private C2181s0 f19244b;

    /* renamed from: c */
    private C2181s0 f19245c;

    /* renamed from: d */
    private C2181s0 f19246d;

    public C2163l1(String str) {
    }

    /* renamed from: a */
    public C2181s0 m12105a() {
        return this.f19245c;
    }

    /* renamed from: b */
    public C2181s0 m12108b() {
        return this.f19243a;
    }

    /* renamed from: c */
    public C2181s0 m12110c() {
        return this.f19244b;
    }

    /* renamed from: d */
    public C2181s0 m12111d() {
        return this.f19246d;
    }

    /* renamed from: a */
    public C2181s0 m12106a(String str) {
        if (str.equals("oper")) {
            return m12110c();
        }
        if (str.equals("maint")) {
            return m12108b();
        }
        if (str.equals("diffprivacy")) {
            return m12105a();
        }
        if (str.equals("preins")) {
            return m12111d();
        }
        C2186v.m12276f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: ".concat(str));
        return null;
    }

    /* renamed from: b */
    public void m12109b(C2181s0 c2181s0) {
        this.f19244b = c2181s0;
    }

    /* renamed from: a */
    public void m12107a(C2181s0 c2181s0) {
        this.f19243a = c2181s0;
    }
}
