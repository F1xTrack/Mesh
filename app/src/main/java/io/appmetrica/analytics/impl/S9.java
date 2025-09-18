package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.F91;
import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes2.dex */
public final class S9 implements Parcelable {
    public static final R9 CREATOR = new R9();
    public final Boolean a;
    public final IdentifierStatus b;
    public final String c;

    public S9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.a = bool;
        this.b = identifierStatus;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S9)) {
            return false;
        }
        S9 s9 = (S9) obj;
        return O90.a(this.a, s9.a) && this.b == s9.b && O90.a(this.c, s9.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeaturesInternal(sslPinning=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", errorExplanation=");
        return F91.v(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeString(this.b.getValue());
        parcel.writeString(this.c);
    }

    public S9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
