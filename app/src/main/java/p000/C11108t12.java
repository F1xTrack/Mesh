package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: t12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11108t12 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11108t12> CREATOR = new C7363Ay1(0);

    /* renamed from: a */
    public String f42769a;

    /* renamed from: b */
    public String f42770b;

    /* renamed from: c */
    public int f42771c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f42769a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42770b, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f42771c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
