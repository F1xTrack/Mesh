package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: qz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10846qz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C10846qz1> CREATOR = new C7363Ay1(4);

    /* renamed from: a */
    public final int f41277a;

    /* renamed from: b */
    public final String[] f41278b;

    public C10846qz1(int i, String[] strArr) {
        this.f41277a = i;
        this.f41278b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f41277a);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f41278b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
