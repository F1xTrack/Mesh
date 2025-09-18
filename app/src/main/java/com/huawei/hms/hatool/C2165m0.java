package com.huawei.hms.hatool;

import p000.AbstractC1374Vq;

/* renamed from: com.huawei.hms.hatool.m0 */
/* loaded from: classes.dex */
public class C2165m0 {

    /* renamed from: a */
    private boolean f19250a = false;

    /* renamed from: b */
    private int f19251b = 4;

    /* renamed from: a */
    private static String m12116a() {
        return "FormalHASDK_2.2.0.314" + C2173p.m12162a();
    }

    /* renamed from: b */
    public void m12119b(int i, String str, String str2) {
        m12118a(i, "FormalHASDK", AbstractC1374Vq.m8589h(str, "=> ", str2));
    }

    /* renamed from: a */
    public void m12117a(int i) {
        System.lineSeparator();
        System.lineSeparator();
        m12116a();
        System.lineSeparator();
        this.f19251b = i;
        this.f19250a = true;
    }

    /* renamed from: a */
    public void m12118a(int i, String str, String str2) {
    }

    /* renamed from: b */
    public boolean m12120b(int i) {
        return this.f19250a && i >= this.f19251b;
    }
}
