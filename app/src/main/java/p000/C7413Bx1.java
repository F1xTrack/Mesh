package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: Bx1 */
/* loaded from: classes.dex */
public final class C7413Bx1 extends AbstractC7517Dx1 {
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) {
        C11990zx1 c11990zx1 = (C11990zx1) anyClient;
        C7725Hx1 c7725Hx1 = (C7725Hx1) c11990zx1.getService();
        BinderC7361Ax1 binderC7361Ax1 = new BinderC7361Ax1(this, 0);
        c7725Hx1.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c7725Hx1.f40460g);
        int i = AbstractC11482vx1.f44620a;
        parcelObtain.writeStrongBinder(binderC7361Ax1);
        GoogleSignInOptions googleSignInOptions = c11990zx1.f47115a;
        if (googleSignInOptions == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            googleSignInOptions.writeToParcel(parcelObtain, 0);
        }
        c7725Hx1.m23899H(102, parcelObtain);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
