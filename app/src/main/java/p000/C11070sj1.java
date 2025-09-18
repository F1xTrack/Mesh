package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: sj1 */
/* loaded from: classes.dex */
public final class C11070sj1 extends AbstractC8418Vg0 implements Function2 {

    /* renamed from: e */
    public final /* synthetic */ int f42572e;

    /* renamed from: f */
    public final /* synthetic */ C9817ix0 f42573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11070sj1(C9817ix0 c9817ix0, int i) {
        super(2);
        this.f42572e = i;
        this.f42573f = c9817ix0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42572e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                this.f42573f.m21947d(EnumC1158SP.f10733q, new C10942rj1(zBooleanValue, zBooleanValue2));
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                long jLongValue2 = ((Number) obj2).longValue();
                this.f42573f.m21947d(EnumC1158SP.f10725i, new C11198tj1(jLongValue, jLongValue2));
                break;
        }
        return C8313Tf1.f11463a;
    }
}
