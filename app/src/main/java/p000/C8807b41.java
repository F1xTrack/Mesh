package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: b41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8807b41 implements Parcelable {
    public static final Parcelable.Creator<C8807b41> CREATOR = new C10857r31(2);

    /* renamed from: a */
    public int f16733a;

    /* renamed from: b */
    public int f16734b;

    /* renamed from: c */
    public int[] f16735c;

    /* renamed from: d */
    public boolean f16736d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f16733a + ", mGapDir=" + this.f16734b + ", mHasUnwantedGapAfter=" + this.f16736d + ", mGapPerSpan=" + Arrays.toString(this.f16735c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16733a);
        parcel.writeInt(this.f16734b);
        parcel.writeInt(this.f16736d ? 1 : 0);
        int[] iArr = this.f16735c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f16735c);
        }
    }
}
