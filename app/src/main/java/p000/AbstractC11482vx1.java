package p000;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11482vx1 {

    /* renamed from: a */
    public static final /* synthetic */ int f44620a = 0;

    static {
        AbstractC11482vx1.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m25533a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m25534b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC11153tN0.m24909u(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
