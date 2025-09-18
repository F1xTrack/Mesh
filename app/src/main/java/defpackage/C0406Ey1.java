package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Ey1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406Ey1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C0406Ey1> CREATOR = new C0094Ay1(3);
    public String a;
    public String b;
    public C5337jZ1 c;
    public long d;
    public boolean e;
    public String f;
    public final C8316zB1 g;
    public long h;
    public C8316zB1 i;
    public final long j;
    public final C8316zB1 k;

    public C0406Ey1(C0406Ey1 c0406Ey1) {
        Preconditions.checkNotNull(c0406Ey1);
        this.a = c0406Ey1.a;
        this.b = c0406Ey1.b;
        this.c = c0406Ey1.c;
        this.d = c0406Ey1.d;
        this.e = c0406Ey1.e;
        this.f = c0406Ey1.f;
        this.g = c0406Ey1.g;
        this.h = c0406Ey1.h;
        this.i = c0406Ey1.i;
        this.j = c0406Ey1.j;
        this.k = c0406Ey1.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.c, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.d);
        SafeParcelWriter.writeBoolean(parcel, 6, this.e);
        SafeParcelWriter.writeString(parcel, 7, this.f, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.g, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.h);
        SafeParcelWriter.writeParcelable(parcel, 10, this.i, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.j);
        SafeParcelWriter.writeParcelable(parcel, 12, this.k, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C0406Ey1(String str, String str2, C5337jZ1 c5337jZ1, long j, boolean z, String str3, C8316zB1 c8316zB1, long j2, C8316zB1 c8316zB12, long j3, C8316zB1 c8316zB13) {
        this.a = str;
        this.b = str2;
        this.c = c5337jZ1;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = c8316zB1;
        this.h = j2;
        this.i = c8316zB12;
        this.j = j3;
        this.k = c8316zB13;
    }
}
