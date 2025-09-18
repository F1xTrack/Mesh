package p000;

import io.sentry.android.replay.C5955o;
import io.sentry.android.replay.C5957q;
import java.util.ArrayList;

/* renamed from: lG0 */
/* loaded from: classes2.dex */
public final class C10115lG0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f36991e;

    /* renamed from: f */
    public final /* synthetic */ Object f36992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10115lG0(int i, Object obj) {
        super(1);
        this.f36991e = i;
        this.f36992f = obj;
    }

    /* renamed from: a */
    private final Object m22378a(Object obj) {
        C5955o c5955o;
        ArrayList arrayList = (ArrayList) obj;
        O90.m5968f(arrayList, "mViews");
        C5957q c5957q = (C5957q) this.f36992f;
        synchronized (c5957q.f34008b) {
            c5955o = c5957q.f34010d;
            c5955o.addAll(arrayList);
        }
        return c5955o;
    }

    /* JADX WARN: Removed duplicated region for block: B:379:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x03b3  */
    /* JADX WARN: Type inference failed for: r15v38, types: [Vg0, mZ] */
    @Override // p000.InterfaceC6497nZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10115lG0.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10115lG0(InterfaceC6976us interfaceC6976us, C10505oJ0 c10505oJ0, X01 x01, C11818yb0 c11818yb0) {
        super(1);
        this.f36991e = 1;
        this.f36992f = interfaceC6976us;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10115lG0(InterfaceC6434mZ interfaceC6434mZ) {
        super(1);
        this.f36991e = 5;
        this.f36992f = (AbstractC8418Vg0) interfaceC6434mZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10115lG0(Q81 q81, Object obj, int i) {
        super(1);
        this.f36991e = i;
        this.f36992f = obj;
    }
}
