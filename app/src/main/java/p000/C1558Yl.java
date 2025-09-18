package p000;

import java.lang.reflect.Method;

/* renamed from: Yl */
/* loaded from: classes2.dex */
public final class C1558Yl extends AbstractC1243Tl {

    /* renamed from: g */
    public final /* synthetic */ int f14502g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558Yl(int i, Method method) {
        super(method, false, 6);
        this.f14502g = i;
        switch (i) {
            case 1:
                O90.m5968f(method, "method");
                super(method, true, 4);
                break;
            case 2:
                O90.m5968f(method, "method");
                super(method, false, 6);
                break;
            default:
                O90.m5968f(method, "method");
                break;
        }
    }

    @Override // p000.AbstractC1243Tl, p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        switch (this.f14502g) {
            case 0:
                O90.m5968f(objArr, "args");
                BQ1.m716a(this, objArr);
                return m7737e(objArr.length <= 1 ? new Object[0] : AbstractC0576J8.m4183j(objArr, 1, objArr.length), objArr[0]);
            case 1:
                O90.m5968f(objArr, "args");
                BQ1.m716a(this, objArr);
                m9585d(AbstractC0576J8.m4188o(objArr));
                return m7737e(objArr.length <= 1 ? new Object[0] : AbstractC0576J8.m4183j(objArr, 1, objArr.length), null);
            default:
                O90.m5968f(objArr, "args");
                BQ1.m716a(this, objArr);
                return m7737e(objArr, null);
        }
    }
}
