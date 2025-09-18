package defpackage;

import com.vk.push.common.Logger;

/* renamed from: ct1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3285ct1 implements InterfaceC3489dy0, InterfaceC1493Sx0 {
    public final /* synthetic */ C6924rt1 a;

    @Override // defpackage.InterfaceC1493Sx0
    public void onFailure(Throwable th) {
        Logger.DefaultImpls.info$default(this.a.g, "Re-subscription is completed with exception " + th.getMessage(), null, 2, null);
    }

    @Override // defpackage.InterfaceC3489dy0
    public void onSuccess(Object obj) {
        Logger.DefaultImpls.info$default(this.a.g, "Re-subscription result is Success!", null, 2, null);
    }
}
