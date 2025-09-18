package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

/* renamed from: ex1 */
/* loaded from: classes.dex */
public final class C3678ex1 extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<C3678ex1> CREATOR = new C6767r31(18);
    public final ArrayList a;
    public final String b;

    public C3678ex1(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.b != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
