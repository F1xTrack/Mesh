package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: c41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8935c41 implements Parcelable {
    public static final Parcelable.Creator<C8935c41> CREATOR = new C10857r31(3);

    /* renamed from: a */
    public int f17282a;

    /* renamed from: b */
    public int f17283b;

    /* renamed from: c */
    public int f17284c;

    /* renamed from: d */
    public int[] f17285d;

    /* renamed from: e */
    public int f17286e;

    /* renamed from: f */
    public int[] f17287f;

    /* renamed from: g */
    public ArrayList f17288g;

    /* renamed from: h */
    public boolean f17289h;

    /* renamed from: i */
    public boolean f17290i;

    /* renamed from: j */
    public boolean f17291j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17282a);
        parcel.writeInt(this.f17283b);
        parcel.writeInt(this.f17284c);
        if (this.f17284c > 0) {
            parcel.writeIntArray(this.f17285d);
        }
        parcel.writeInt(this.f17286e);
        if (this.f17286e > 0) {
            parcel.writeIntArray(this.f17287f);
        }
        parcel.writeInt(this.f17289h ? 1 : 0);
        parcel.writeInt(this.f17290i ? 1 : 0);
        parcel.writeInt(this.f17291j ? 1 : 0);
        parcel.writeList(this.f17288g);
    }
}
