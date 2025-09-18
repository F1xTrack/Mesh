package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Rz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8249Rz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C8249Rz1> CREATOR = new C7363Ay1(19);

    /* renamed from: a */
    public final int f10515a;

    /* renamed from: b */
    public final String f10516b;

    /* renamed from: c */
    public final String f10517c;

    /* renamed from: d */
    public final String f10518d;

    public C8249Rz1(String str, int i, String str2, String str3) {
        this.f10515a = i;
        this.f10516b = str;
        this.f10517c = str2;
        this.f10518d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f10515a);
        SafeParcelWriter.writeString(parcel, 2, this.f10516b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f10517c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f10518d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
