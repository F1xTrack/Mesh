package p000;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class OC1 {
    static {
        OC1.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m5981a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m5982b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC11153tN0.m24909u(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
