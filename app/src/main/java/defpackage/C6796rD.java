package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: rD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6796rD implements InterfaceC6708ql {
    public static final Parcelable.Creator<C6796rD> CREATOR = new H2(15);
    public final long a;

    public C6796rD(long j) {
        this.a = j;
    }

    @Override // defpackage.InterfaceC6708ql
    public final boolean S(long j) {
        return j >= this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6796rD) && this.a == ((C6796rD) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
