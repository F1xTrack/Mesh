package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import defpackage.AbstractC1705Vq;

/* renamed from: com.yandex.metrica.impl.ob.bc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2652bc {
    public final C2627ac a;
    public final EnumC2716e1 b;
    public final String c;

    public C2652bc() {
        this(null, EnumC2716e1.UNKNOWN, "identifier info has never been updated");
    }

    public boolean a() {
        C2627ac c2627ac = this.a;
        return (c2627ac == null || TextUtils.isEmpty(c2627ac.b)) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdTrackingInfoResult{mAdTrackingInfo=");
        sb.append(this.a);
        sb.append(", mStatus=");
        sb.append(this.b);
        sb.append(", mErrorExplanation='");
        return AbstractC1705Vq.l(sb, this.c, "'}");
    }

    public C2652bc(C2627ac c2627ac, EnumC2716e1 enumC2716e1, String str) {
        this.a = c2627ac;
        this.b = enumC2716e1;
        this.c = str;
    }
}
