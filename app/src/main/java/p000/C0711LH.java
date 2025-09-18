package p000;

import kotlin.jvm.functions.Function2;
import ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker;

/* renamed from: LH */
/* loaded from: classes2.dex */
public final class C0711LH extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f6591a;

    /* renamed from: b */
    public int f6592b;

    /* renamed from: c */
    public final /* synthetic */ Object f6593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0711LH(Object obj, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(2, interfaceC1382Vy);
        this.f6591a = i;
        this.f6593c = obj;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f6591a) {
            case 0:
                return new C0711LH((DeletePushTokenIfNoHostsWorker) this.f6593c, interfaceC1382Vy, 0);
            case 1:
                return new C0711LH((C8389Ur1) this.f6593c, interfaceC1382Vy, 1);
            default:
                return new C0711LH((C7821Jt1) this.f6593c, interfaceC1382Vy, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj2;
        switch (this.f6591a) {
            case 0:
                return new C0711LH((DeletePushTokenIfNoHostsWorker) this.f6593c, interfaceC1382Vy, 0).invokeSuspend(C8313Tf1.f11463a);
            case 1:
                return new C0711LH((C8389Ur1) this.f6593c, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C0711LH((C7821Jt1) this.f6593c, interfaceC1382Vy, 2).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0711LH.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
