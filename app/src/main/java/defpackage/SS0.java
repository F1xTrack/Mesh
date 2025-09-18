package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class SS0 implements Parcelable {
    public static final Parcelable.Creator<SS0> CREATOR = new C0834Kl0(24);
    public G50 a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new RS0(this);
                }
                parcel.writeStrongBinder(this.a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
