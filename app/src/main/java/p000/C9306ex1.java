package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

/* renamed from: ex1 */
/* loaded from: classes.dex */
public final class C9306ex1 extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<C9306ex1> CREATOR = new C10857r31(18);

    /* renamed from: a */
    public final ArrayList f26949a;

    /* renamed from: b */
    public final String f26950b;

    public C9306ex1(String str, ArrayList arrayList) {
        this.f26949a = arrayList;
        this.f26950b = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f26950b != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.f26949a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f26950b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
