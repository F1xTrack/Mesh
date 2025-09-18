package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* renamed from: aY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8739aY1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C8739aY1> CREATOR = new C8697aD1(14);

    /* renamed from: a */
    public final List f15555a;

    public C8739aY1(List list) {
        this.f15555a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f15555a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
