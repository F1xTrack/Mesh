package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import p000.C7539Ei1;
import p000.C7856Kl0;
import p000.InterfaceC7591Fi1;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C7856Kl0(15);

    /* renamed from: a */
    public final InterfaceC7591Fi1 f16562a;

    public ParcelImpl(Parcel parcel) {
        this.f16562a = new C7539Ei1(parcel).m1852h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new C7539Ei1(parcel).m1856l(this.f16562a);
    }
}
