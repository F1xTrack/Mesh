package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Gy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7675Gy1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7675Gy1> CREATOR = new C7363Ay1(2);

    /* renamed from: a */
    public int f3972a;

    /* renamed from: b */
    public boolean f3973b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7675Gy1)) {
            return false;
        }
        C7675Gy1 c7675Gy1 = (C7675Gy1) obj;
        return this.f3972a == c7675Gy1.f3972a && Objects.equal(Boolean.valueOf(this.f3973b), Boolean.valueOf(c7675Gy1.f3973b));
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f3972a), Boolean.valueOf(this.f3973b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f3972a);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f3973b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
