package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: Bx1 */
/* loaded from: classes.dex */
public final class C0169Bx1 extends AbstractC0325Dx1 {
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) {
        C8460zx1 c8460zx1 = (C8460zx1) anyClient;
        C0637Hx1 c0637Hx1 = (C0637Hx1) c8460zx1.getService();
        BinderC0091Ax1 binderC0091Ax1 = new BinderC0091Ax1(this, 0);
        c0637Hx1.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c0637Hx1.g);
        int i = AbstractC7700vx1.a;
        parcelObtain.writeStrongBinder(binderC0091Ax1);
        GoogleSignInOptions googleSignInOptions = c8460zx1.a;
        if (googleSignInOptions == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            googleSignInOptions.writeToParcel(parcelObtain, 0);
        }
        c0637Hx1.H(102, parcelObtain);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
