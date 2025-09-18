package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: wz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11613wz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11613wz1> CREATOR = new C7363Ay1(5);

    /* renamed from: a */
    public int f45241a;

    /* renamed from: b */
    public final int f45242b;

    /* renamed from: c */
    public final int f45243c;

    /* renamed from: d */
    public final long f45244d;

    /* renamed from: e */
    public final int f45245e;

    public C11613wz1(int i, int i2, long j, int i3, int i4) {
        this.f45241a = i;
        this.f45242b = i2;
        this.f45243c = i3;
        this.f45244d = j;
        this.f45245e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f45241a);
        SafeParcelWriter.writeInt(parcel, 3, this.f45242b);
        SafeParcelWriter.writeInt(parcel, 4, this.f45243c);
        SafeParcelWriter.writeLong(parcel, 5, this.f45244d);
        SafeParcelWriter.writeInt(parcel, 6, this.f45245e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
