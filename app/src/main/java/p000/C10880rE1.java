package p000;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10880rE1 implements Parcelable {
    public static final Parcelable.Creator<C10880rE1> CREATOR = new C7363Ay1(9);

    /* renamed from: a */
    public final Messenger f41395a;

    public C10880rE1(IBinder iBinder) {
        this.f41395a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f41395a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((C10880rE1) obj).f41395a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f41395a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f41395a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
