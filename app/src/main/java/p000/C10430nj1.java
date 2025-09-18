package p000;

import com.huawei.hms.p015rn.push.constants.Core;

/* renamed from: nj1 */
/* loaded from: classes.dex */
public final class C10430nj1 extends AbstractC8418Vg0 implements InterfaceC6625pZ {

    /* renamed from: e */
    public final /* synthetic */ C9817ix0 f38494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10430nj1(C9817ix0 c9817ix0) {
        super(3);
        this.f38494e = c9817ix0;
    }

    @Override // p000.InterfaceC6625pZ
    /* renamed from: b */
    public final Object mo300b(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Exception exc = (Exception) obj2;
        String str2 = (String) obj3;
        O90.m5968f(str, "errorString");
        O90.m5968f(exc, Core.Event.Result.EXCEPTION);
        O90.m5968f(str2, "errorCode");
        this.f38494e.m21947d(EnumC1158SP.f10721e, new C1800bg(exc, str, str2, 1));
        return C8313Tf1.f11463a;
    }
}
