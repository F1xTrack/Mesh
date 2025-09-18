package p000;

import com.p019vk.push.common.Logger;

/* renamed from: ct1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9042ct1 implements InterfaceC9179dy0, InterfaceC8296Sx0 {

    /* renamed from: a */
    public final /* synthetic */ C10962rt1 f25707a;

    @Override // p000.InterfaceC8296Sx0
    public void onFailure(Throwable th) {
        Logger.DefaultImpls.info$default(this.f25707a.f41949g, "Re-subscription is completed with exception " + th.getMessage(), null, 2, null);
    }

    @Override // p000.InterfaceC9179dy0
    public void onSuccess(Object obj) {
        Logger.DefaultImpls.info$default(this.f25707a.f41949g, "Re-subscription result is Success!", null, 2, null);
    }
}
