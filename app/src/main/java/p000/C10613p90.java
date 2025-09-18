package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10613p90 implements Parcelable {
    public static final Parcelable.Creator<C10613p90> CREATOR = new C0444H2(27);

    /* renamed from: a */
    public final IntentSender f39868a;

    /* renamed from: b */
    public final Intent f39869b;

    /* renamed from: c */
    public final int f39870c;

    /* renamed from: d */
    public final int f39871d;

    public C10613p90(IntentSender intentSender, Intent intent, int i, int i2) {
        O90.m5968f(intentSender, "intentSender");
        this.f39868a = intentSender;
        this.f39869b = intent;
        this.f39870c = i;
        this.f39871d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        O90.m5968f(parcel, "dest");
        parcel.writeParcelable(this.f39868a, i);
        parcel.writeParcelable(this.f39869b, i);
        parcel.writeInt(this.f39870c);
        parcel.writeInt(this.f39871d);
    }
}
