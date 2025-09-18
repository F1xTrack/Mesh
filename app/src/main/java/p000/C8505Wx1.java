package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Wx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8505Wx1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C8505Wx1> CREATOR = new C7363Ay1(10);

    /* renamed from: a */
    public final String f13465a;

    /* renamed from: b */
    public final String f13466b;

    public C8505Wx1(String str, String str2) {
        this.f13465a = str;
        this.f13466b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f13465a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f13466b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
