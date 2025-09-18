package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import p000.F91;
import p000.O90;

/* renamed from: io.appmetrica.analytics.identifiers.impl.c */
/* loaded from: classes2.dex */
public final class C4337c {

    /* renamed from: a */
    public final IdentifierStatus f29814a;

    /* renamed from: b */
    public final C4335a f29815b;

    /* renamed from: c */
    public final String f29816c;

    public C4337c(IdentifierStatus identifierStatus, C4335a c4335a, String str) {
        this.f29814a = identifierStatus;
        this.f29815b = c4335a;
        this.f29816c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4337c)) {
            return false;
        }
        C4337c c4337c = (C4337c) obj;
        return this.f29814a == c4337c.f29814a && O90.m5963a(this.f29815b, c4337c.f29815b) && O90.m5963a(this.f29816c, c4337c.f29816c);
    }

    public final int hashCode() {
        int iHashCode = this.f29814a.hashCode() * 31;
        C4335a c4335a = this.f29815b;
        int iHashCode2 = (iHashCode + (c4335a == null ? 0 : c4335a.hashCode())) * 31;
        String str = this.f29816c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvIdResult(status=");
        sb.append(this.f29814a);
        sb.append(", advIdInfo=");
        sb.append(this.f29815b);
        sb.append(", errorExplanation=");
        return F91.m2539v(sb, this.f29816c, ')');
    }

    public /* synthetic */ C4337c(IdentifierStatus identifierStatus, C4335a c4335a, String str, int i) {
        this(identifierStatus, (i & 2) != 0 ? null : c4335a, (i & 4) != 0 ? null : str);
    }
}
