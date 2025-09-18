package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: qD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6606qD implements InterfaceC6708ql {
    public static final Parcelable.Creator<C6606qD> CREATOR = new H2(14);
    public final long a;

    public C6606qD(long j) {
        this.a = j;
    }

    @Override // defpackage.InterfaceC6708ql
    public final boolean S(long j) {
        return j <= this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6606qD) && this.a == ((C6606qD) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
