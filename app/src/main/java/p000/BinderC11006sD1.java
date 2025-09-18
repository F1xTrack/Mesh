package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

/* renamed from: sD1 */
/* loaded from: classes.dex */
public final class BinderC11006sD1 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ Boolean f42318a;

    /* renamed from: b */
    public final /* synthetic */ S81 f42319b;

    public BinderC11006sD1(Boolean bool, S81 s81) {
        this.f42318a = bool;
        this.f42319b = s81;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f42318a, this.f42319b);
    }
}
