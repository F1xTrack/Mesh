package defpackage;

import com.vk.push.core.network.data.source.MasterHostApi;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: Mn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0995Mn0 extends AbstractC4286i71 implements Function2 {
    public HS0 a;
    public int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ MasterHostApi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0995Mn0(List list, MasterHostApi masterHostApi, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = list;
        this.d = masterHostApi;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0995Mn0(this.c, this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0995Mn0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:27:0x00b7, B:29:0x00bf, B:30:0x00d5, B:32:0x00db, B:33:0x00e6, B:13:0x001e, B:23:0x009e, B:20:0x0095), top: B:38:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:27:0x00b7, B:29:0x00bf, B:30:0x00d5, B:32:0x00db, B:33:0x00e6, B:13:0x001e, B:23:0x009e, B:20:0x0095), top: B:38:0x0006 }] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0995Mn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
