package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

/* renamed from: sD1 */
/* loaded from: classes.dex */
public final class BinderC6989sD1 extends IStatusCallback.Stub {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ S81 b;

    public BinderC6989sD1(Boolean bool, S81 s81) {
        this.a = bool;
        this.b = s81;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.a, this.b);
    }
}
