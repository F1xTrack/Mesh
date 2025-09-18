package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Gy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562Gy1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C0562Gy1> CREATOR = new C0094Ay1(2);
    public int a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0562Gy1)) {
            return false;
        }
        C0562Gy1 c0562Gy1 = (C0562Gy1) obj;
        return this.a == c0562Gy1.a && Objects.equal(Boolean.valueOf(this.b), Boolean.valueOf(c0562Gy1.b));
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.a);
        SafeParcelWriter.writeBoolean(parcel, 3, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
