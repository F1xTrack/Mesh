package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class x32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<x32> CREATOR = new C8697aD1(24);

    /* renamed from: a */
    public final int f45345a;

    /* renamed from: b */
    public final int f45346b;

    /* renamed from: c */
    public final int f45347c;

    /* renamed from: d */
    public final int f45348d;

    /* renamed from: e */
    public final int f45349e;

    /* renamed from: f */
    public final int f45350f;

    /* renamed from: g */
    public final boolean f45351g;

    /* renamed from: h */
    public final String f45352h;

    public x32(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f45345a = i;
        this.f45346b = i2;
        this.f45347c = i3;
        this.f45348d = i4;
        this.f45349e = i5;
        this.f45350f = i6;
        this.f45351g = z;
        this.f45352h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45345a);
        SafeParcelWriter.writeInt(parcel, 2, this.f45346b);
        SafeParcelWriter.writeInt(parcel, 3, this.f45347c);
        SafeParcelWriter.writeInt(parcel, 4, this.f45348d);
        SafeParcelWriter.writeInt(parcel, 5, this.f45349e);
        SafeParcelWriter.writeInt(parcel, 6, this.f45350f);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f45351g);
        SafeParcelWriter.writeString(parcel, 8, this.f45352h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
