package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zav;

/* renamed from: jx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5409jx1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5409jx1> CREATOR = new C6767r31(20);
    public final int a;
    public final ConnectionResult b;
    public final zav c;

    public C5409jx1(int i, ConnectionResult connectionResult, zav zavVar) {
        this.a = i;
        this.b = connectionResult;
        this.c = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
