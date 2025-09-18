package p000;

import com.p019vk.push.core.network.data.source.MasterHostApi;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: Mn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7964Mn0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public HS0 f7344a;

    /* renamed from: b */
    public int f7345b;

    /* renamed from: c */
    public final /* synthetic */ List f7346c;

    /* renamed from: d */
    public final /* synthetic */ MasterHostApi f7347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7964Mn0(List list, MasterHostApi masterHostApi, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f7346c = list;
        this.f7347d = masterHostApi;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7964Mn0(this.f7346c, this.f7347d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7964Mn0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:27:0x00b7, B:29:0x00bf, B:30:0x00d5, B:32:0x00db, B:33:0x00e6, B:13:0x001e, B:23:0x009e, B:20:0x0095), top: B:38:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:27:0x00b7, B:29:0x00bf, B:30:0x00d5, B:32:0x00db, B:33:0x00e6, B:13:0x001e, B:23:0x009e, B:20:0x0095), top: B:38:0x0006 }] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7964Mn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
