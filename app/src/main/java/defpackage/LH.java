package defpackage;

import kotlin.jvm.functions.Function2;
import ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker;

/* loaded from: classes2.dex */
public final class LH extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LH(Object obj, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(2, interfaceC1729Vy);
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new LH((DeletePushTokenIfNoHostsWorker) this.c, interfaceC1729Vy, 0);
            case 1:
                return new LH((C1632Ur1) this.c, interfaceC1729Vy, 1);
            default:
                return new LH((C0781Jt1) this.c, interfaceC1729Vy, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj2;
        switch (this.a) {
            case 0:
                return new LH((DeletePushTokenIfNoHostsWorker) this.c, interfaceC1729Vy, 0).invokeSuspend(C1518Tf1.a);
            case 1:
                return new LH((C1632Ur1) this.c, interfaceC1729Vy, 1).invokeSuspend(C1518Tf1.a);
            default:
                return new LH((C0781Jt1) this.c, interfaceC1729Vy, 2).invokeSuspend(C1518Tf1.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LH.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
