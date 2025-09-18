package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class QX1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QX1> CREATOR = new C2093aD1(12);
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String g;

    public QX1(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeByteArray(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeLong(parcel, 6, this.f);
        SafeParcelWriter.writeString(parcel, 7, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
