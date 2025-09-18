package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: k21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5427k21 implements Parcelable {
    public static final Parcelable.Creator<C5427k21> CREATOR = new C0834Kl0(27);
    public final long a;
    public final long b;
    public final int c;

    public C5427k21(long j, long j2, int i) {
        YN1.c(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5427k21.class != obj.getClass()) {
            return false;
        }
        C5427k21 c5427k21 = (C5427k21) obj;
        return this.a == c5427k21.a && this.b == c5427k21.b && this.c == c5427k21.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = AbstractC0277Dh1.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.a + ", endTimeMs=" + this.b + ", speedDivisor=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
