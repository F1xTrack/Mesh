package p000;

import com.p019vk.push.core.base.AsyncCallback;
import com.p019vk.push.core.domain.model.CallingAppIds;
import kotlin.jvm.functions.Function2;

/* renamed from: et1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9298et1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public String f26930a;

    /* renamed from: b */
    public int f26931b;

    /* renamed from: c */
    public final /* synthetic */ C10962rt1 f26932c;

    /* renamed from: d */
    public final /* synthetic */ CallingAppIds f26933d;

    /* renamed from: e */
    public final /* synthetic */ AsyncCallback f26934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9298et1(C10962rt1 c10962rt1, CallingAppIds callingAppIds, AsyncCallback asyncCallback, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f26932c = c10962rt1;
        this.f26933d = callingAppIds;
        this.f26934e = asyncCallback;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C9298et1(this.f26932c, this.f26933d, this.f26934e, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9298et1) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9298et1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
