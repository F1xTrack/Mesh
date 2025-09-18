package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import ru.rustore.sdk.review.errors.RuStoreInvalidReviewInfo;
import ru.rustore.sdk.review.errors.RuStoreRequestLimitReached;
import ru.rustore.sdk.review.errors.RuStoreReviewExists;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: lt0 */
/* loaded from: classes.dex */
public final class BinderC5778lt0 extends Binder implements IInterface {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;

    public BinderC5778lt0(ServiceConnectionC2019Zq1 serviceConnectionC2019Zq1) {
        this.b = serviceConnectionC2019Zq1;
        attachInterface(this, "ru.vk.store.provider.review.LaunchReviewFlowCallback");
    }

    public void G(int i, String[] strArr) {
        O90.f(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.b;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.c.getBroadcastCookie(i2);
                        O90.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((Z40) multiInstanceInvalidationService.c.getBroadcastItem(i2)).G(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.c.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int H(Z40 z40, String str) {
        O90.f(z40, "callback");
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.b;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                if (multiInstanceInvalidationService.c.register(z40, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.b.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object c3972gU0;
        Object c3972gU02;
        boolean z = false;
        Z40 z40 = null;
        Z40 z402 = null;
        switch (this.a) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                }
                if (i == 1598968902) {
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                if (i == 1) {
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Z40)) {
                            z40 = new Z40();
                            z40.a = strongBinder;
                        } else {
                            z40 = (Z40) iInterfaceQueryLocalInterface;
                        }
                    }
                    int iH = H(z40, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iH);
                    return true;
                }
                if (i != 2) {
                    if (i != 3) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    G(parcel.readInt(), parcel.createStringArray());
                    return true;
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof Z40)) {
                        z402 = new Z40();
                        z402.a = strongBinder2;
                    } else {
                        z402 = (Z40) iInterfaceQueryLocalInterface2;
                    }
                }
                int i3 = parcel.readInt();
                O90.f(z402, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.b;
                synchronized (multiInstanceInvalidationService.c) {
                    multiInstanceInvalidationService.c.unregister(z402);
                }
                parcel2.writeNoException();
                return true;
            case 1:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("ru.vk.store.provider.review.LaunchReviewFlowCallback");
                }
                if (i == 1598968902) {
                    parcel2.writeString("ru.vk.store.provider.review.LaunchReviewFlowCallback");
                    return true;
                }
                ServiceConnectionC2019Zq1 serviceConnectionC2019Zq1 = (ServiceConnectionC2019Zq1) this.b;
                try {
                    if (i == 1) {
                        serviceConnectionC2019Zq1.d.invoke();
                        serviceConnectionC2019Zq1.a.unbindService(serviceConnectionC2019Zq1);
                    } else {
                        if (i != 2) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        int i4 = parcel.readInt();
                        String string = parcel.readString();
                        C1800Wv1 c1800Wv1 = serviceConnectionC2019Zq1.e;
                        if (i4 == 1001) {
                            c3972gU0 = new C3972gU0();
                        } else if (i4 == 1004) {
                            c3972gU0 = new ST0(1);
                        } else if (i4 != 1005) {
                            switch (i4) {
                                case 3001:
                                    c3972gU0 = new RuStoreRequestLimitReached();
                                    break;
                                case 3002:
                                    c3972gU0 = new RuStoreReviewExists();
                                    break;
                                case 3003:
                                    c3972gU0 = new RuStoreInvalidReviewInfo();
                                    break;
                                default:
                                    if (string == null) {
                                        string = "";
                                    }
                                    c3972gU0 = new TT0(string);
                                    break;
                            }
                        } else {
                            c3972gU0 = new ST0(0);
                        }
                        c1800Wv1.invoke(c3972gU0);
                        serviceConnectionC2019Zq1.a.unbindService(serviceConnectionC2019Zq1);
                    }
                } catch (Throwable unused) {
                }
                parcel2.writeNoException();
                return true;
            case 2:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("ru.vk.store.provider.review.RequestReviewFlowCallback");
                }
                if (i == 1598968902) {
                    parcel2.writeString("ru.vk.store.provider.review.RequestReviewFlowCallback");
                    return true;
                }
                ServiceConnectionC0547Gt1 serviceConnectionC0547Gt1 = (ServiceConnectionC0547Gt1) this.b;
                try {
                    if (i == 1) {
                        Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                        O90.f(bundle, "reviewInfo");
                        serviceConnectionC0547Gt1.c.invoke(new ReviewInfo(bundle));
                        serviceConnectionC0547Gt1.a.unbindService(serviceConnectionC0547Gt1);
                    } else {
                        if (i != 2) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        int i5 = parcel.readInt();
                        String string2 = parcel.readString();
                        C1800Wv1 c1800Wv12 = serviceConnectionC0547Gt1.d;
                        if (i5 == 1001) {
                            c3972gU02 = new C3972gU0();
                        } else if (i5 == 1004) {
                            c3972gU02 = new ST0(1);
                        } else if (i5 != 1005) {
                            switch (i5) {
                                case 3001:
                                    c3972gU02 = new RuStoreRequestLimitReached();
                                    break;
                                case 3002:
                                    c3972gU02 = new RuStoreReviewExists();
                                    break;
                                case 3003:
                                    c3972gU02 = new RuStoreInvalidReviewInfo();
                                    break;
                                default:
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    c3972gU02 = new TT0(string2);
                                    break;
                            }
                        } else {
                            c3972gU02 = new ST0(0);
                        }
                        c1800Wv12.invoke(c3972gU02);
                        serviceConnectionC0547Gt1.a.unbindService(serviceConnectionC0547Gt1);
                    }
                } catch (Throwable unused2) {
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                if (i == 1) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i6 = JC1.a;
                    Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    PC1 pc1CreateFromParcel = parcel.readInt() == 0 ? null : PC1.CREATOR.createFromParcel(parcel);
                    TaskUtil.setResultOrApiException(statusCreateFromParcel, pc1CreateFromParcel != null ? new P7(pc1CreateFromParcel.a, pc1CreateFromParcel.b) : null, (S81) this.b);
                    z = true;
                }
                return z;
        }
    }

    public BinderC5778lt0(ServiceConnectionC0547Gt1 serviceConnectionC0547Gt1) {
        this.b = serviceConnectionC0547Gt1;
        attachInterface(this, "ru.vk.store.provider.review.RequestReviewFlowCallback");
    }

    public BinderC5778lt0(S81 s81) {
        this.b = s81;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    public BinderC5778lt0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.b = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
