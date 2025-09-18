package com.huawei.hms.hatool;

import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.hms.hatool.f */
/* loaded from: classes.dex */
public class C2143f implements InterfaceRunnableC2146g {

    /* renamed from: a */
    private byte[] f19169a;

    /* renamed from: b */
    private String f19170b;

    /* renamed from: c */
    private String f19171c;

    /* renamed from: d */
    private String f19172d;

    /* renamed from: e */
    private String f19173e;

    /* renamed from: f */
    private List<C2133b1> f19174f;

    public C2143f(byte[] bArr, String str, String str2, String str3, String str4, List<C2133b1> list) {
        this.f19169a = (byte[]) bArr.clone();
        this.f19170b = str;
        this.f19171c = str2;
        this.f19173e = str3;
        this.f19172d = str4;
        this.f19174f = list;
    }

    /* renamed from: a */
    private C2168n0 m11987a(Map<String, String> map) {
        return AbstractC2188w.m12278a(this.f19170b, this.f19169a, map);
    }

    /* renamed from: b */
    private void m11989b() {
        C2132b0.m11928c().m11929a(new C2139d1(this.f19174f, this.f19171c, this.f19172d, this.f19173e));
    }

    @Override // java.lang.Runnable
    public void run() {
        C2186v.m12271c("hmsSdk", "send data running");
        int iM12135b = m11987a(m11988a()).m12135b();
        if (iM12135b != 200) {
            m11989b();
            return;
        }
        C2186v.m12269b("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f19172d, this.f19173e, this.f19171c, Integer.valueOf(iM12135b));
    }

    /* renamed from: a */
    private Map<String, String> m11988a() {
        return C2158k.m12079b(this.f19171c, this.f19173e, this.f19172d);
    }
}
