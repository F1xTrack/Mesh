package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Et */
/* loaded from: classes.dex */
public final class C0308Et extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C0308Et> CREATOR = new C10857r31(23);

    /* renamed from: a */
    public final Intent f2938a;

    public C0308Et(Intent intent) {
        this.f2938a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f2938a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
