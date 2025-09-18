package defpackage;

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
public abstract class AbstractBinderC3854fs1 extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public /* synthetic */ AbstractBinderC3854fs1(int i) {
        this.a = i;
    }

    private final boolean G(int i, Parcel parcel, Parcel parcel2, int i2) {
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
        int i3 = CC1.a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC7209tN0.u(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        C7524v12 c7524v12 = km1.h.a;
        if (c7524v12 != null) {
            S81 s81 = km1.g;
            synchronized (c7524v12.f) {
                c7524v12.e.remove(s81);
            }
            synchronized (c7524v12.f) {
                try {
                    if (c7524v12.k.get() <= 0 || c7524v12.k.decrementAndGet() <= 0) {
                        c7524v12.a().post(new WV1(0, c7524v12));
                    } else {
                        c7524v12.b.q("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                } finally {
                }
            }
        }
        km1.b.q("onGetLaunchReviewFlowInfo", new Object[0]);
        km1.g.d(new C1026Mx1((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
        return true;
    }

    public abstract boolean H(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.a;
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        switch (this.a) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                BinderC7697vw1 binderC7697vw1 = (BinderC7697vw1) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i3 = AbstractC1011Ms1.a;
                    Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                    int iDataAvail = parcel.dataAvail();
                    if (iDataAvail > 0) {
                        throw new BadParcelableException(AbstractC7209tN0.u(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    C0244Cw1 c0244Cw1 = binderC7697vw1.h.c;
                    S81 s81 = binderC7697vw1.g;
                    synchronized (c0244Cw1.f) {
                        c0244Cw1.e.remove(s81);
                    }
                    synchronized (c0244Cw1.f) {
                        try {
                            if (c0244Cw1.k.get() <= 0 || c0244Cw1.k.decrementAndGet() <= 0) {
                                c0244Cw1.a().post(new C5215iw1(0, c0244Cw1));
                            } else {
                                c0244Cw1.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            }
                        } finally {
                        }
                    }
                    binderC7697vw1.b.a("onRequestIntegrityToken", new Object[0]);
                    int i4 = bundle.getInt("error");
                    if (i4 != 0) {
                        binderC7697vw1.g.c(new C5640l90(i4, null));
                    } else {
                        String string = bundle.getString("token");
                        if (string == null) {
                            binderC7697vw1.g.c(new C5640l90(-100, null));
                        } else {
                            binderC7697vw1.g.d(new C5973mu1(string));
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
                return H(i, parcel, parcel2);
            case 2:
                return G(i, parcel, parcel2, i2);
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    public AbstractBinderC3854fs1(String str) {
        this.a = 1;
        attachInterface(this, str);
    }
}
