package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: Pz1 */
/* loaded from: classes.dex */
public final class C1266Pz1 extends AbstractC3722fA1 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266Pz1(GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.a = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C8325zE1) anyClient).c(C5453kA1.a(this), this.a);
    }
}
