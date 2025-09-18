package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class Q32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Q32> CREATOR = new P32(5);

    /* renamed from: a */
    public final int f9461a;

    /* renamed from: b */
    public final int f9462b;

    /* renamed from: c */
    public final int f9463c;

    /* renamed from: d */
    public final int f9464d;

    /* renamed from: e */
    public final long f9465e;

    public Q32(int i, int i2, long j, int i3, int i4) {
        this.f9461a = i;
        this.f9462b = i2;
        this.f9463c = i3;
        this.f9464d = i4;
        this.f9465e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f9461a);
        SafeParcelWriter.writeInt(parcel, 2, this.f9462b);
        SafeParcelWriter.writeInt(parcel, 3, this.f9463c);
        SafeParcelWriter.writeInt(parcel, 4, this.f9464d);
        SafeParcelWriter.writeLong(parcel, 5, this.f9465e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
