package p000;

import com.p019vk.push.core.network.data.source.MasterHostApi;
import kotlin.jvm.functions.Function2;

/* renamed from: In0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7756In0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public HS0 f5147a;

    /* renamed from: b */
    public int f5148b;

    /* renamed from: c */
    public final /* synthetic */ MasterHostApi f5149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7756In0(MasterHostApi masterHostApi, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f5149c = masterHostApi;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7756In0(this.f5149c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7756In0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:28:0x00a0, B:30:0x00a8, B:31:0x00be, B:33:0x00c4, B:34:0x00d9, B:36:0x00df, B:38:0x00ef, B:13:0x001e, B:24:0x0087, B:21:0x007e), top: B:43:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:7:0x000e, B:28:0x00a0, B:30:0x00a8, B:31:0x00be, B:33:0x00c4, B:34:0x00d9, B:36:0x00df, B:38:0x00ef, B:13:0x001e, B:24:0x0087, B:21:0x007e), top: B:43:0x0006 }] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7756In0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
