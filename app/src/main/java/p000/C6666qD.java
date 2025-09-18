package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: qD */
/* loaded from: classes.dex */
public final class C6666qD implements InterfaceC6700ql {
    public static final Parcelable.Creator<C6666qD> CREATOR = new C0444H2(14);

    /* renamed from: a */
    public final long f40671a;

    public C6666qD(long j) {
        this.f40671a = j;
    }

    @Override // p000.InterfaceC6700ql
    /* renamed from: S */
    public final boolean mo7464S(long j) {
        return j <= this.f40671a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6666qD) && this.f40671a == ((C6666qD) obj).f40671a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f40671a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f40671a);
    }
}
