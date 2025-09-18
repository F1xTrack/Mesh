package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class QX1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QX1> CREATOR = new C8697aD1(12);

    /* renamed from: a */
    public final long f9659a;

    /* renamed from: b */
    public byte[] f9660b;

    /* renamed from: c */
    public final String f9661c;

    /* renamed from: d */
    public final Bundle f9662d;

    /* renamed from: e */
    public final int f9663e;

    /* renamed from: f */
    public final long f9664f;

    /* renamed from: g */
    public String f9665g;

    public QX1(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.f9659a = j;
        this.f9660b = bArr;
        this.f9661c = str;
        this.f9662d = bundle;
        this.f9663e = i;
        this.f9664f = j2;
        this.f9665g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f9659a);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f9660b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f9661c, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.f9662d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f9663e);
        SafeParcelWriter.writeLong(parcel, 6, this.f9664f);
        SafeParcelWriter.writeString(parcel, 7, this.f9665g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
