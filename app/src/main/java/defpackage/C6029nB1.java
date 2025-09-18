package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;

/* renamed from: nB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6029nB1 extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator<C6029nB1> CREATOR = new C0094Ay1(17);
    public final Bundle a;

    public C6029nB1(Bundle bundle) {
        this.a = bundle;
    }

    public final Double i0() {
        return Double.valueOf(this.a.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6122ng1(this);
    }

    public final Bundle m0() {
        return new Bundle(this.a);
    }

    public final String n0() {
        return this.a.getString("currency");
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, m0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
