package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zat;

/* renamed from: gx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9562gx1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9562gx1> CREATOR = new C10857r31(19);

    /* renamed from: a */
    public final int f28113a;

    /* renamed from: b */
    public final zat f28114b;

    public C9562gx1(int i, zat zatVar) {
        this.f28113a = i;
        this.f28114b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f28113a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f28114b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
