package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zav;

/* renamed from: jx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9946jx1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9946jx1> CREATOR = new C10857r31(20);

    /* renamed from: a */
    public final int f35461a;

    /* renamed from: b */
    public final ConnectionResult f35462b;

    /* renamed from: c */
    public final zav f35463c;

    public C9946jx1(int i, ConnectionResult connectionResult, zav zavVar) {
        this.f35461a = i;
        this.f35462b = connectionResult;
        this.f35463c = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f35461a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f35462b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f35463c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
