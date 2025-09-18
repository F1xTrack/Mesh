package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import p000.F91;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.S9 */
/* loaded from: classes2.dex */
public final class C4801S9 implements Parcelable {
    public static final C4777R9 CREATOR = new C4777R9();

    /* renamed from: a */
    public final Boolean f30731a;

    /* renamed from: b */
    public final IdentifierStatus f30732b;

    /* renamed from: c */
    public final String f30733c;

    public C4801S9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f30731a = bool;
        this.f30732b = identifierStatus;
        this.f30733c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4801S9)) {
            return false;
        }
        C4801S9 c4801s9 = (C4801S9) obj;
        return O90.m5963a(this.f30731a, c4801s9.f30731a) && this.f30732b == c4801s9.f30732b && O90.m5963a(this.f30733c, c4801s9.f30733c);
    }

    public final int hashCode() {
        Boolean bool = this.f30731a;
        int iHashCode = (this.f30732b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f30733c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeaturesInternal(sslPinning=");
        sb.append(this.f30731a);
        sb.append(", status=");
        sb.append(this.f30732b);
        sb.append(", errorExplanation=");
        return F91.m2539v(sb, this.f30733c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f30731a);
        parcel.writeString(this.f30732b.getValue());
        parcel.writeString(this.f30733c);
    }

    public C4801S9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
