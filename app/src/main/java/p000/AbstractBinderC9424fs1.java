package p000;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fs1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC9424fs1 extends Binder implements IInterface {

    /* renamed from: a */
    public final /* synthetic */ int f27443a;

    public /* synthetic */ AbstractBinderC9424fs1(int i) {
        this.f27443a = i;
    }

    /* renamed from: G */
    private final boolean m18302G(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        KM1 km1 = (KM1) this;
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i3 = CC1.f1252a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC11153tN0.m24909u(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        C11364v12 c11364v12 = km1.f6035h.f6060a;
        if (c11364v12 != null) {
            S81 s81 = km1.f6034g;
            synchronized (c11364v12.f44097f) {
                c11364v12.f44096e.remove(s81);
            }
            synchronized (c11364v12.f44097f) {
                try {
                    if (c11364v12.f44102k.get() <= 0 || c11364v12.f44102k.decrementAndGet() <= 0) {
                        c11364v12.m25306a().post(new WV1(0, c11364v12));
                    } else {
                        c11364v12.f44093b.m24361q("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                } finally {
                }
            }
        }
        km1.f6033b.m24361q("onGetLaunchReviewFlowInfo", new Object[0]);
        km1.f6034g.m7186d(new C7985Mx1((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
        return true;
    }

    /* renamed from: H */
    public abstract boolean mo416H(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.f27443a;
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (this.f27443a) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                BinderC11480vw1 binderC11480vw1 = (BinderC11480vw1) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i3 = AbstractC7975Ms1.f7377a;
                    Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(AbstractC11153tN0.m24909u(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    C7463Cw1 c7463Cw1 = binderC11480vw1.f44616h.f45911c;
                    S81 s81 = binderC11480vw1.f44615g;
                    synchronized (c7463Cw1.f1772f) {
                        c7463Cw1.f1771e.remove(s81);
                    }
                    synchronized (c7463Cw1.f1772f) {
                        try {
                            if (c7463Cw1.f1777k.get() <= 0 || c7463Cw1.f1777k.decrementAndGet() <= 0) {
                                c7463Cw1.m1477a().post(new C9816iw1(0, c7463Cw1));
                            } else {
                                c7463Cw1.f1768b.m409a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            }
                        } finally {
                        }
                    }
                    binderC11480vw1.f44614b.m409a("onRequestIntegrityToken", new Object[0]);
                    int i4 = bundle.getInt("error");
                    if (i4 != 0) {
                        binderC11480vw1.f44615g.m7185c(new C10101l90(i4, null));
                    } else {
                        String string = bundle.getString("token");
                        if (string == null) {
                            binderC11480vw1.f44615g.m7185c(new C10101l90(-100, null));
                        } else {
                            binderC11480vw1.f44615g.m7186d(new C10324mu1(string));
                        }
                    }
                    z = true;
                }
                return z;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo416H(i, parcel, parcel2);
            case 2:
                return m18302G(i, parcel, parcel2, i2);
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    public AbstractBinderC9424fs1(String str) {
        this.f27443a = 1;
        attachInterface(this, str);
    }
}
