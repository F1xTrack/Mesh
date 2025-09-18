package p000;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes.dex */
public final class FD1 extends AbstractBinderC9697i02 {

    /* renamed from: a */
    public final /* synthetic */ S81 f3092a;

    public FD1(S81 s81) {
        this.f3092a = s81;
    }

    @Override // p000.J02
    /* renamed from: f */
    public final void mo2555f(LocationSettingsResult locationSettingsResult) {
        TaskUtil.setResultOrApiException(locationSettingsResult.getStatus(), new LocationSettingsResponse(locationSettingsResult), this.f3092a);
    }
}
