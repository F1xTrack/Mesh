package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: CL */
/* loaded from: classes.dex */
public final class C0148CL extends AbstractC6984v {
    public static final Parcelable.Creator<C0148CL> CREATOR = new C6921u(5);

    /* renamed from: c */
    public int f1319c;

    /* renamed from: d */
    public int f1320d;

    /* renamed from: e */
    public int f1321e;

    /* renamed from: f */
    public int f1322f;

    /* renamed from: g */
    public int f1323g;

    public C0148CL(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1319c = 0;
        this.f1319c = parcel.readInt();
        this.f1320d = parcel.readInt();
        this.f1321e = parcel.readInt();
        this.f1322f = parcel.readInt();
        this.f1323g = parcel.readInt();
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1319c);
        parcel.writeInt(this.f1320d);
        parcel.writeInt(this.f1321e);
        parcel.writeInt(this.f1322f);
        parcel.writeInt(this.f1323g);
    }
}
