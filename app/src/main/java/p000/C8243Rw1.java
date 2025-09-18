package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Rw1 */
/* loaded from: classes.dex */
public final class C8243Rw1 extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<C8243Rw1> CREATOR = new C10857r31(15);

    /* renamed from: a */
    public final int f10489a;

    /* renamed from: b */
    public final int f10490b;

    /* renamed from: c */
    public final Intent f10491c;

    public C8243Rw1(int i, int i2, Intent intent) {
        this.f10489a = i;
        this.f10490b = i2;
        this.f10491c = intent;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f10490b == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f10489a);
        SafeParcelWriter.writeInt(parcel, 2, this.f10490b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f10491c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
