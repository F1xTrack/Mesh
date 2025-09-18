package com.huawei.hms.hatool;

import defpackage.AbstractC1705Vq;

/* loaded from: classes.dex */
public class m0 {
    private boolean a = false;
    private int b = 4;

    private static String a() {
        return "FormalHASDK_2.2.0.314" + p.a();
    }

    public void b(int i, String str, String str2) {
        a(i, "FormalHASDK", AbstractC1705Vq.h(str, "=> ", str2));
    }

    public void a(int i) {
        System.lineSeparator();
        System.lineSeparator();
        a();
        System.lineSeparator();
        this.b = i;
        this.a = true;
    }

    public void a(int i, String str, String str2) {
    }

    public boolean b(int i) {
        return this.a && i >= this.b;
    }
}
