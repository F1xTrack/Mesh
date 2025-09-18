package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class SS0 implements Parcelable {
    public static final Parcelable.Creator<SS0> CREATOR = new C7856Kl0(24);

    /* renamed from: a */
    public G50 f10770a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f10770a == null) {
                    this.f10770a = new RS0(this);
                }
                parcel.writeStrongBinder(this.f10770a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo7371a(int i, Bundle bundle) {
    }
}
