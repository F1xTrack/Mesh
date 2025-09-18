package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.C0444H2;
import p000.C6893tY;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C1720b implements Parcelable {
    public static final Parcelable.Creator<C1720b> CREATOR = new C0444H2(5);

    /* renamed from: a */
    public final int[] f16161a;

    /* renamed from: b */
    public final ArrayList f16162b;

    /* renamed from: c */
    public final int[] f16163c;

    /* renamed from: d */
    public final int[] f16164d;

    /* renamed from: e */
    public final int f16165e;

    /* renamed from: f */
    public final String f16166f;

    /* renamed from: g */
    public final int f16167g;

    /* renamed from: h */
    public final int f16168h;

    /* renamed from: i */
    public final CharSequence f16169i;

    /* renamed from: j */
    public final int f16170j;

    /* renamed from: k */
    public final CharSequence f16171k;

    /* renamed from: l */
    public final ArrayList f16172l;

    /* renamed from: m */
    public final ArrayList f16173m;

    /* renamed from: n */
    public final boolean f16174n;

    public C1720b(C1719a c1719a) {
        int size = c1719a.f43732a.size();
        this.f16161a = new int[size * 6];
        if (!c1719a.f43738g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f16162b = new ArrayList(size);
        this.f16163c = new int[size];
        this.f16164d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C6893tY c6893tY = (C6893tY) c1719a.f43732a.get(i2);
            int i3 = i + 1;
            this.f16161a[i] = c6893tY.f43124a;
            ArrayList arrayList = this.f16162b;
            Fragment fragment = c6893tY.f43125b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f16161a;
            iArr[i3] = c6893tY.f43126c ? 1 : 0;
            iArr[i + 2] = c6893tY.f43127d;
            iArr[i + 3] = c6893tY.f43128e;
            int i4 = i + 5;
            iArr[i + 4] = c6893tY.f43129f;
            i += 6;
            iArr[i4] = c6893tY.f43130g;
            this.f16163c[i2] = c6893tY.f43131h.ordinal();
            this.f16164d[i2] = c6893tY.f43132i.ordinal();
        }
        this.f16165e = c1719a.f43737f;
        this.f16166f = c1719a.f43739h;
        this.f16167g = c1719a.f16160s;
        this.f16168h = c1719a.f43740i;
        this.f16169i = c1719a.f43741j;
        this.f16170j = c1719a.f43742k;
        this.f16171k = c1719a.f43743l;
        this.f16172l = c1719a.f43744m;
        this.f16173m = c1719a.f43745n;
        this.f16174n = c1719a.f43746o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f16161a);
        parcel.writeStringList(this.f16162b);
        parcel.writeIntArray(this.f16163c);
        parcel.writeIntArray(this.f16164d);
        parcel.writeInt(this.f16165e);
        parcel.writeString(this.f16166f);
        parcel.writeInt(this.f16167g);
        parcel.writeInt(this.f16168h);
        TextUtils.writeToParcel(this.f16169i, parcel, 0);
        parcel.writeInt(this.f16170j);
        TextUtils.writeToParcel(this.f16171k, parcel, 0);
        parcel.writeStringList(this.f16172l);
        parcel.writeStringList(this.f16173m);
        parcel.writeInt(this.f16174n ? 1 : 0);
    }

    public C1720b(Parcel parcel) {
        this.f16161a = parcel.createIntArray();
        this.f16162b = parcel.createStringArrayList();
        this.f16163c = parcel.createIntArray();
        this.f16164d = parcel.createIntArray();
        this.f16165e = parcel.readInt();
        this.f16166f = parcel.readString();
        this.f16167g = parcel.readInt();
        this.f16168h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f16169i = (CharSequence) creator.createFromParcel(parcel);
        this.f16170j = parcel.readInt();
        this.f16171k = (CharSequence) creator.createFromParcel(parcel);
        this.f16172l = parcel.createStringArrayList();
        this.f16173m = parcel.createStringArrayList();
        this.f16174n = parcel.readInt() != 0;
    }
}
