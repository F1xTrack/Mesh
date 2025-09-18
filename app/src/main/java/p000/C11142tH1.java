package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;

/* renamed from: tH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11142tH1 implements InterfaceC10378nJ1, BI1, RemoteCall {
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        QJ1 qj1 = (QJ1) ((C11136tE1) obj).getService();
        C8505Wx1 c8505Wx1 = new C8505Wx1(null, null);
        BinderC10193lt0 binderC10193lt0 = new BinderC10193lt0((S81) obj2);
        qj1.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = JC1.f5381a;
        parcelObtain.writeInt(1);
        c8505Wx1.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC10193lt0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            qj1.f9563a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // p000.BI1
    /* renamed from: b */
    public C11910zJ1 mo577b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // p000.BI1
    /* renamed from: d */
    public boolean mo578d(Class cls) {
        return false;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        PW1.f9104b.get();
        return (String) UW1.f11852T.m8754a();
    }
}
