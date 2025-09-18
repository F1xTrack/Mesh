package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: qA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10744qA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C10744qA1> CREATOR = new C7363Ay1(28);

    /* renamed from: a */
    public final String f40656a;

    /* renamed from: b */
    public final String f40657b;

    public C10744qA1(String str, String str2) {
        this.f40656a = str;
        this.f40657b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f40656a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f40657b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
