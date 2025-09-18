package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: sj1 */
/* loaded from: classes.dex */
public final class C7085sj1 extends AbstractC1676Vg0 implements Function2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ C5217ix0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7085sj1(C5217ix0 c5217ix0, int i) {
        super(2);
        this.e = i;
        this.f = c5217ix0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                this.f.d(SP.q, new C6894rj1(zBooleanValue, zBooleanValue2));
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                long jLongValue2 = ((Number) obj2).longValue();
                this.f.d(SP.i, new C7276tj1(jLongValue, jLongValue2));
                break;
        }
        return C1518Tf1.a;
    }
}
