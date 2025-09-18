package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Cr */
/* loaded from: classes.dex */
public final class C0180Cr extends AbstractC6984v {
    public static final Parcelable.Creator<C0180Cr> CREATOR = new C6921u(3);

    /* renamed from: c */
    public boolean f1728c;

    public C0180Cr(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1728c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1728c ? 1 : 0);
    }
}
