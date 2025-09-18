package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class VX1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VX1> CREATOR = new C8697aD1(13);

    /* renamed from: a */
    public final ArrayList f12609a;

    public VX1(ArrayList arrayList) {
        this.f12609a = arrayList;
    }

    /* renamed from: i0 */
    public static VX1 m8460i0(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(RI1.m6942f(i)));
        }
        return new VX1(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.f12609a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
