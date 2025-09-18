package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6404p90 implements Parcelable {
    public static final Parcelable.Creator<C6404p90> CREATOR = new H2(27);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public C6404p90(IntentSender intentSender, Intent intent, int i, int i2) {
        O90.f(intentSender, "intentSender");
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        O90.f(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
