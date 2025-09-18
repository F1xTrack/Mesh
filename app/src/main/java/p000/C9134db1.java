package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: db1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9134db1 extends AbstractC6984v {
    public static final Parcelable.Creator<C9134db1> CREATOR = new C6921u(12);

    /* renamed from: c */
    public int f26146c;

    /* renamed from: d */
    public boolean f26147d;

    public C9134db1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f26146c = parcel.readInt();
        this.f26147d = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f26146c);
        parcel.writeInt(this.f26147d ? 1 : 0);
    }
}
