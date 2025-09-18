package p000;

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
public final class BinderC10193lt0 extends Binder implements IInterface {

    /* renamed from: a */
    public final /* synthetic */ int f37339a = 2;

    /* renamed from: b */
    public final /* synthetic */ Object f37340b;

    public BinderC10193lt0(ServiceConnectionC8647Zq1 serviceConnectionC8647Zq1) {
        this.f37340b = serviceConnectionC8647Zq1;
        attachInterface(this, "ru.vk.store.provider.review.LaunchReviewFlowCallback");
    }

    /* renamed from: G */
    public void m22571G(int i, String[] strArr) {
        O90.m5968f(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f37340b;
        synchronized (multiInstanceInvalidationService.f16559c) {
            try {
                String str = (String) multiInstanceInvalidationService.f16558b.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f16559c.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f16559c.getBroadcastCookie(i2);
                        O90.m5966d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f16558b.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((Z40) multiInstanceInvalidationService.f16559c.getBroadcastItem(i2)).m9473G(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.f16559c.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: H */
    public int m22572H(Z40 z40, String str) {
        O90.m5968f(z40, "callback");
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f37340b;
        synchronized (multiInstanceInvalidationService.f16559c) {
            try {
                int i2 = multiInstanceInvalidationService.f16557a + 1;
                multiInstanceInvalidationService.f16557a = i2;
                if (multiInstanceInvalidationService.f16559c.register(z40, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.f16558b.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.f16557a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f37339a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object c9503gU0;
        Object c9503gU02;
        boolean z = false;
        Z40 z40 = null;
        Z40 z402 = null;
        switch (this.f37339a) {
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
                            z40.f14705a = strongBinder;
                        } else {
                            z40 = (Z40) iInterfaceQueryLocalInterface;
                        }
                    }
                    int iM22572H = m22572H(z40, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iM22572H);
                    return true;
                }
                if (i != 2) {
                    if (i != 3) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    m22571G(parcel.readInt(), parcel.createStringArray());
                    return true;
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof Z40)) {
                        z402 = new Z40();
                        z402.f14705a = strongBinder2;
                    } else {
                        z402 = (Z40) iInterfaceQueryLocalInterface2;
                    }
                }
                int i3 = parcel.readInt();
                O90.m5968f(z402, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.f37340b;
                synchronized (multiInstanceInvalidationService.f16559c) {
                    multiInstanceInvalidationService.f16559c.unregister(z402);
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
                ServiceConnectionC8647Zq1 serviceConnectionC8647Zq1 = (ServiceConnectionC8647Zq1) this.f37340b;
                try {
                    if (i == 1) {
                        serviceConnectionC8647Zq1.f15152d.invoke();
                        serviceConnectionC8647Zq1.f15149a.unbindService(serviceConnectionC8647Zq1);
                    } else {
                        if (i != 2) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        int i4 = parcel.readInt();
                        String string = parcel.readString();
                        C8501Wv1 c8501Wv1 = serviceConnectionC8647Zq1.f15153e;
                        if (i4 == 1001) {
                            c9503gU0 = new C9503gU0();
                        } else if (i4 == 1004) {
                            c9503gU0 = new ST0(1);
                        } else if (i4 != 1005) {
                            switch (i4) {
                                case 3001:
                                    c9503gU0 = new RuStoreRequestLimitReached();
                                    break;
                                case 3002:
                                    c9503gU0 = new RuStoreReviewExists();
                                    break;
                                case 3003:
                                    c9503gU0 = new RuStoreInvalidReviewInfo();
                                    break;
                                default:
                                    if (string == null) {
                                        string = "";
                                    }
                                    c9503gU0 = new TT0(string);
                                    break;
                            }
                        } else {
                            c9503gU0 = new ST0(0);
                        }
                        c8501Wv1.invoke(c9503gU0);
                        serviceConnectionC8647Zq1.f15149a.unbindService(serviceConnectionC8647Zq1);
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
                ServiceConnectionC7665Gt1 serviceConnectionC7665Gt1 = (ServiceConnectionC7665Gt1) this.f37340b;
                try {
                    if (i == 1) {
                        Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                        O90.m5968f(bundle, "reviewInfo");
                        serviceConnectionC7665Gt1.f3948c.invoke(new ReviewInfo(bundle));
                        serviceConnectionC7665Gt1.f3946a.unbindService(serviceConnectionC7665Gt1);
                    } else {
                        if (i != 2) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        int i5 = parcel.readInt();
                        String string2 = parcel.readString();
                        C8501Wv1 c8501Wv12 = serviceConnectionC7665Gt1.f3949d;
                        if (i5 == 1001) {
                            c9503gU02 = new C9503gU0();
                        } else if (i5 == 1004) {
                            c9503gU02 = new ST0(1);
                        } else if (i5 != 1005) {
                            switch (i5) {
                                case 3001:
                                    c9503gU02 = new RuStoreRequestLimitReached();
                                    break;
                                case 3002:
                                    c9503gU02 = new RuStoreReviewExists();
                                    break;
                                case 3003:
                                    c9503gU02 = new RuStoreInvalidReviewInfo();
                                    break;
                                default:
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    c9503gU02 = new TT0(string2);
                                    break;
                            }
                        } else {
                            c9503gU02 = new ST0(0);
                        }
                        c8501Wv12.invoke(c9503gU02);
                        serviceConnectionC7665Gt1.f3946a.unbindService(serviceConnectionC7665Gt1);
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
                    int i6 = JC1.f5381a;
                    Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                    PC1 pc1CreateFromParcel = parcel.readInt() == 0 ? null : PC1.CREATOR.createFromParcel(parcel);
                    TaskUtil.setResultOrApiException(statusCreateFromParcel, pc1CreateFromParcel != null ? new C0952P7(pc1CreateFromParcel.f8890a, pc1CreateFromParcel.f8891b) : null, (S81) this.f37340b);
                    z = true;
                }
                return z;
        }
    }

    public BinderC10193lt0(ServiceConnectionC7665Gt1 serviceConnectionC7665Gt1) {
        this.f37340b = serviceConnectionC7665Gt1;
        attachInterface(this, "ru.vk.store.provider.review.RequestReviewFlowCallback");
    }

    public BinderC10193lt0(S81 s81) {
        this.f37340b = s81;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    public BinderC10193lt0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f37340b = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
}
