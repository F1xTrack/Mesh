package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: dG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3359dG1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C3359dG1> CREATOR = new C2093aD1(7);
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;
    public final String h;

    public C3359dG1(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bundle;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.g, false);
        SafeParcelWriter.writeString(parcel, 8, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
