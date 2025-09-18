package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* renamed from: aY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2156aY1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C2156aY1> CREATOR = new C2093aD1(14);
    public final List a;

    public C2156aY1(List list) {
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
