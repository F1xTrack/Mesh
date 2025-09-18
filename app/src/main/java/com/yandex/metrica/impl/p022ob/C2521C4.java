package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.EnumC2458c;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.C4 */
/* loaded from: classes2.dex */
public class C2521C4 {

    /* renamed from: a */
    private final String f20963a;

    /* renamed from: b */
    private final String f20964b;

    /* renamed from: c */
    private final Integer f20965c;

    /* renamed from: d */
    private final String f20966d;

    /* renamed from: e */
    private final EnumC2458c f20967e;

    public C2521C4(String str, String str2, Integer num, String str3, EnumC2458c enumC2458c) {
        this.f20963a = str;
        this.f20964b = str2;
        this.f20965c = num;
        this.f20966d = str3;
        this.f20967e = enumC2458c;
    }

    /* renamed from: a */
    public String m13950a() {
        return this.f20963a;
    }

    /* renamed from: b */
    public String m13951b() {
        return this.f20964b;
    }

    /* renamed from: c */
    public Integer m13952c() {
        return this.f20965c;
    }

    /* renamed from: d */
    public String m13953d() {
        return this.f20966d;
    }

    /* renamed from: e */
    public EnumC2458c m13954e() {
        return this.f20967e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2521C4.class != obj.getClass()) {
            return false;
        }
        C2521C4 c2521c4 = (C2521C4) obj;
        String str = this.f20963a;
        if (str == null ? c2521c4.f20963a != null : !str.equals(c2521c4.f20963a)) {
            return false;
        }
        if (!this.f20964b.equals(c2521c4.f20964b)) {
            return false;
        }
        Integer num = this.f20965c;
        if (num == null ? c2521c4.f20965c != null : !num.equals(c2521c4.f20965c)) {
            return false;
        }
        String str2 = this.f20966d;
        if (str2 == null ? c2521c4.f20966d == null : str2.equals(c2521c4.f20966d)) {
            return this.f20967e == c2521c4.f20967e;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20963a;
        int iM8586e = AbstractC1374Vq.m8586e((str != null ? str.hashCode() : 0) * 31, 31, this.f20964b);
        Integer num = this.f20965c;
        int iHashCode = (iM8586e + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f20966d;
        return this.f20967e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ClientDescription{mApiKey='" + this.f20963a + "', mPackageName='" + this.f20964b + "', mProcessID=" + this.f20965c + ", mProcessSessionID='" + this.f20966d + "', mReporterType=" + this.f20967e + '}';
    }

    /* renamed from: a */
    public static C2521C4 m13949a(C2944T3 c2944t3) {
        return new C2521C4(c2944t3.m15168b().m13768a(), c2944t3.m15167a().m15264f(), c2944t3.m15167a().m15265g(), c2944t3.m15167a().m15266h(), EnumC2458c.m13801a(c2944t3.m15168b().f20731a.getAsString("CFG_REPORTER_TYPE")));
    }
}
