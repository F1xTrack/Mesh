package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: mQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5883mQ1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5883mQ1> CREATOR = new C2093aD1(18);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.a);
        SafeParcelWriter.writeInt(parcel, 3, this.b);
        SafeParcelWriter.writeInt(parcel, 4, this.c);
        SafeParcelWriter.writeInt(parcel, 5, this.d);
        SafeParcelWriter.writeInt(parcel, 6, this.e);
        SafeParcelWriter.writeInt(parcel, 7, this.f);
        SafeParcelWriter.writeBoolean(parcel, 8, this.g);
        SafeParcelWriter.writeString(parcel, 9, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
