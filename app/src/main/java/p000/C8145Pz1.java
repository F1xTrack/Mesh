package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: Pz1 */
/* loaded from: classes.dex */
public final class C8145Pz1 extends AbstractC9336fA1 {

    /* renamed from: a */
    public final /* synthetic */ boolean f9391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8145Pz1(GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.f9391a = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C11900zE1) anyClient).m26336c(C9976kA1.m22159a(this), this.f9391a);
    }
}
