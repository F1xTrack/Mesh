package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

/* renamed from: cC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2471cC1 extends AbstractC4110hC1 {
    public final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2471cC1(GoogleApiClient googleApiClient, List list) {
        super(googleApiClient);
        this.a = list;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        S81 s81 = new S81();
        s81.a.b(new C6446pN0(15, this));
        ((C8325zE1) anyClient).o(this.a, s81);
    }
}
