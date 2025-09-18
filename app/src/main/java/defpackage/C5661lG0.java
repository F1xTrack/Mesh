package defpackage;

import io.sentry.android.replay.o;
import io.sentry.android.replay.q;
import java.util.ArrayList;

/* renamed from: lG0 */
/* loaded from: classes2.dex */
public final class C5661lG0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5661lG0(int i, Object obj) {
        super(1);
        this.e = i;
        this.f = obj;
    }

    private final Object a(Object obj) {
        o oVar;
        ArrayList arrayList = (ArrayList) obj;
        O90.f(arrayList, "mViews");
        q qVar = (q) this.f;
        synchronized (qVar.b) {
            oVar = qVar.d;
            oVar.addAll(arrayList);
        }
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:379:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x03b3  */
    /* JADX WARN: Type inference failed for: r15v38, types: [Vg0, mZ] */
    @Override // defpackage.InterfaceC6099nZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5661lG0.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5661lG0(InterfaceC7492us interfaceC7492us, C6243oJ0 c6243oJ0, X01 x01, C8203yb0 c8203yb0) {
        super(1);
        this.e = 1;
        this.f = interfaceC7492us;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5661lG0(InterfaceC5908mZ interfaceC5908mZ) {
        super(1);
        this.e = 5;
        this.f = (AbstractC1676Vg0) interfaceC5908mZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5661lG0(Q81 q81, Object obj, int i) {
        super(1);
        this.e = i;
        this.f = obj;
    }
}
