package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.bc */
/* loaded from: classes2.dex */
public class C3154bc {

    /* renamed from: a */
    public final C3128ac f23129a;

    /* renamed from: b */
    public final EnumC3221e1 f23130b;

    /* renamed from: c */
    public final String f23131c;

    public C3154bc() {
        this(null, EnumC3221e1.UNKNOWN, "identifier info has never been updated");
    }

    /* renamed from: a */
    public boolean m15682a() {
        C3128ac c3128ac = this.f23129a;
        return (c3128ac == null || TextUtils.isEmpty(c3128ac.f23041b)) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdTrackingInfoResult{mAdTrackingInfo=");
        sb.append(this.f23129a);
        sb.append(", mStatus=");
        sb.append(this.f23130b);
        sb.append(", mErrorExplanation='");
        return AbstractC1374Vq.m8593l(sb, this.f23131c, "'}");
    }

    public C3154bc(C3128ac c3128ac, EnumC3221e1 enumC3221e1, String str) {
        this.f23129a = c3128ac;
        this.f23130b = enumC3221e1;
        this.f23131c = str;
    }
}
