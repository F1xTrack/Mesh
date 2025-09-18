package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v */
/* loaded from: classes.dex */
public abstract class AbstractC6984v implements Parcelable {

    /* renamed from: a */
    public final Parcelable f44064a;

    /* renamed from: b */
    public static final C6858t f44063b = new C6858t();
    public static final Parcelable.Creator<AbstractC6984v> CREATOR = new C6921u(0);

    public AbstractC6984v() {
        this.f44064a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f44064a, i);
    }

    public AbstractC6984v(Parcelable parcelable) {
        if (parcelable != null) {
            this.f44064a = parcelable == f44063b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC6984v(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f44064a = parcelable == null ? f44063b : parcelable;
    }
}
