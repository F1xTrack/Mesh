package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7700vx1 {
    public static final /* synthetic */ int a = 0;

    static {
        AbstractC7700vx1.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC7209tN0.u(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
