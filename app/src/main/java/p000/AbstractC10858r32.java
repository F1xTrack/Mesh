package p000;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10858r32 {

    /* renamed from: a */
    public static final /* synthetic */ int f41324a = 0;

    static {
        AbstractC10858r32.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m24151a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m24152b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC11153tN0.m24909u(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
