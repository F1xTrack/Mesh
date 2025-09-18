package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I2 */
/* loaded from: classes.dex */
public final class C0507I2 implements Parcelable {
    public static final Parcelable.Creator<C0507I2> CREATOR = new C0444H2(0);

    /* renamed from: a */
    public final int f4659a;

    /* renamed from: b */
    public final Intent f4660b;

    public C0507I2(int i, Intent intent) {
        this.f4659a = i;
        this.f4660b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f4659a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f4660b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        O90.m5968f(parcel, "dest");
        parcel.writeInt(this.f4659a);
        Intent intent = this.f4660b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
