package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;

/* renamed from: nB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10362nB1 extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator<C10362nB1> CREATOR = new C7363Ay1(17);

    /* renamed from: a */
    public final Bundle f38167a;

    public C10362nB1(Bundle bundle) {
        this.f38167a = bundle;
    }

    /* renamed from: i0 */
    public final Double m23097i0() {
        return Double.valueOf(this.f38167a.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10424ng1(this);
    }

    /* renamed from: m0 */
    public final Bundle m23098m0() {
        return new Bundle(this.f38167a);
    }

    /* renamed from: n0 */
    public final String m23099n0() {
        return this.f38167a.getString("currency");
    }

    public final String toString() {
        return this.f38167a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, m23098m0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
