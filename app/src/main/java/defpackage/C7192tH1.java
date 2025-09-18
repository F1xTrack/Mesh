package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;

/* renamed from: tH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7192tH1 implements InterfaceC6053nJ1, BI1, RemoteCall {
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        QJ1 qj1 = (QJ1) ((C7183tE1) obj).getService();
        C1806Wx1 c1806Wx1 = new C1806Wx1(null, null);
        BinderC5778lt0 binderC5778lt0 = new BinderC5778lt0((S81) obj2);
        qj1.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = JC1.a;
        parcelObtain.writeInt(1);
        c1806Wx1.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC5778lt0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            qj1.a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // defpackage.BI1
    public C8340zJ1 b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.BI1
    public boolean d(Class cls) {
        return false;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        PW1.b.get();
        return (String) UW1.T.a();
    }
}
