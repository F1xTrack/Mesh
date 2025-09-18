package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: dW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9124dW1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9124dW1> CREATOR = new C10857r31(24);

    /* renamed from: a */
    public int f26129a;

    /* renamed from: b */
    public String f26130b;

    /* renamed from: c */
    public String f26131c;

    /* renamed from: d */
    public String f26132d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f26129a);
        SafeParcelWriter.writeString(parcel, 3, this.f26130b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f26131c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f26132d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
