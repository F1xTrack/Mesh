package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class WC1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WC1> CREATOR = new C8697aD1(0);

    /* renamed from: a */
    public final int f13060a;

    /* renamed from: b */
    public final int f13061b;

    /* renamed from: c */
    public final int f13062c;

    /* renamed from: d */
    public final int f13063d;

    /* renamed from: e */
    public final long f13064e;

    public WC1(int i, int i2, long j, int i3, int i4) {
        this.f13060a = i;
        this.f13061b = i2;
        this.f13062c = i3;
        this.f13063d = i4;
        this.f13064e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f13060a);
        SafeParcelWriter.writeInt(parcel, 2, this.f13061b);
        SafeParcelWriter.writeInt(parcel, 3, this.f13062c);
        SafeParcelWriter.writeInt(parcel, 4, this.f13063d);
        SafeParcelWriter.writeLong(parcel, 5, this.f13064e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
