package defpackage;

import com.vk.push.core.network.data.source.MasterHostApi;
import kotlin.jvm.functions.Function2;

/* renamed from: In0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0684In0 extends AbstractC4286i71 implements Function2 {
    public HS0 a;
    public int b;
    public final /* synthetic */ MasterHostApi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0684In0(MasterHostApi masterHostApi, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = masterHostApi;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0684In0(this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0684In0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:28:0x00a0, B:30:0x00a8, B:31:0x00be, B:33:0x00c4, B:34:0x00d9, B:36:0x00df, B:38:0x00ef, B:13:0x001e, B:24:0x0087, B:21:0x007e), top: B:43:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:28:0x00a0, B:30:0x00a8, B:31:0x00be, B:33:0x00c4, B:34:0x00d9, B:36:0x00df, B:38:0x00ef, B:13:0x001e, B:24:0x0087, B:21:0x007e), top: B:43:0x0006 }] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0684In0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
