package io.appmetrica.analytics.identifiers.impl;

import defpackage.F91;
import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes2.dex */
public final class c {
    public final IdentifierStatus a;
    public final a b;
    public final String c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.a = identifierStatus;
        this.b = aVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && O90.a(this.b, cVar.b) && O90.a(this.c, cVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvIdResult(status=");
        sb.append(this.a);
        sb.append(", advIdInfo=");
        sb.append(this.b);
        sb.append(", errorExplanation=");
        return F91.v(sb, this.c, ')');
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i) {
        this(identifierStatus, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : str);
    }
}
