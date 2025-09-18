package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

/* renamed from: cC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8951cC1 extends AbstractC9596hC1 {

    /* renamed from: a */
    public final /* synthetic */ List f17367a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8951cC1(GoogleApiClient googleApiClient, List list) {
        super(googleApiClient);
        this.f17367a = list;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        S81 s81 = new S81();
        s81.f10598a.mo11135b(new C10641pN0(15, this));
        ((C11900zE1) anyClient).m26348o(this.f17367a, s81);
    }
}
