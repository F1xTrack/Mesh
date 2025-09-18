package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: bC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8823bC1 extends AbstractC9596hC1 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f16861a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8823bC1(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f16861a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) {
        S81 s81 = new S81();
        s81.f10598a.mo11135b(new C10641pN0(15, this));
        ((C11900zE1) anyClient).m26347n(this.f16861a, s81);
    }
}
