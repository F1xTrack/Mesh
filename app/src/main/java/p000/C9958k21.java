package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: k21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9958k21 implements Parcelable {
    public static final Parcelable.Creator<C9958k21> CREATOR = new C7856Kl0(27);

    /* renamed from: a */
    public final long f36231a;

    /* renamed from: b */
    public final long f36232b;

    /* renamed from: c */
    public final int f36233c;

    public C9958k21(long j, long j2, int i) {
        YN1.m9278c(j < j2);
        this.f36231a = j;
        this.f36232b = j2;
        this.f36233c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9958k21.class != obj.getClass()) {
            return false;
        }
        C9958k21 c9958k21 = (C9958k21) obj;
        return this.f36231a == c9958k21.f36231a && this.f36232b == c9958k21.f36232b && this.f36233c == c9958k21.f36233c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f36231a), Long.valueOf(this.f36232b), Integer.valueOf(this.f36233c)});
    }

    public final String toString() {
        int i = AbstractC7485Dh1.f2166a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f36231a + ", endTimeMs=" + this.f36232b + ", speedDivisor=" + this.f36233c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f36231a);
        parcel.writeLong(this.f36232b);
        parcel.writeInt(this.f36233c);
    }
}
