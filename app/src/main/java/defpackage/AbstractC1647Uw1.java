package defpackage;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: Uw1 */
/* loaded from: classes.dex */
public abstract class AbstractC1647Uw1 {
    static {
        AbstractC1647Uw1.class.getClassLoader();
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

    public static void c(Parcel parcel, AbstractSafeParcelable abstractSafeParcelable) {
        if (abstractSafeParcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            abstractSafeParcelable.writeToParcel(parcel, 0);
        }
    }

    public static void d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
