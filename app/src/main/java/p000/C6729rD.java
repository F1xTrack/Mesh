package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: rD */
/* loaded from: classes.dex */
public final class C6729rD implements InterfaceC6700ql {
    public static final Parcelable.Creator<C6729rD> CREATOR = new C0444H2(15);

    /* renamed from: a */
    public final long f41385a;

    public C6729rD(long j) {
        this.f41385a = j;
    }

    @Override // p000.InterfaceC6700ql
    /* renamed from: S */
    public final boolean mo7464S(long j) {
        return j >= this.f41385a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6729rD) && this.f41385a == ((C6729rD) obj).f41385a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f41385a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f41385a);
    }
}
