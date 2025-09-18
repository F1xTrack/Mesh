package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: hA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9592hA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9592hA1> CREATOR = new C7363Ay1(26);

    /* renamed from: a */
    public final int f28296a;

    /* renamed from: b */
    public final String f28297b;

    public C9592hA1(int i, String str) {
        this.f28296a = i;
        this.f28297b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f28296a);
        SafeParcelWriter.writeString(parcel, 2, this.f28297b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
