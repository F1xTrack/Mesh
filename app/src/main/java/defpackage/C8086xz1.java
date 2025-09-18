package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: xz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8086xz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C8086xz1> CREATOR = new C0094Ay1(14);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;

    public C8086xz1(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeInt(parcel, 6, this.f);
        SafeParcelWriter.writeBoolean(parcel, 7, this.g);
        SafeParcelWriter.writeString(parcel, 8, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
