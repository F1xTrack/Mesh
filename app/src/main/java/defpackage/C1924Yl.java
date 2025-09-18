package defpackage;

import java.lang.reflect.Method;

/* renamed from: Yl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1924Yl extends AbstractC1534Tl {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1924Yl(int i, Method method) {
        super(method, false, 6);
        this.g = i;
        switch (i) {
            case 1:
                O90.f(method, "method");
                super(method, true, 4);
                break;
            case 2:
                O90.f(method, "method");
                super(method, false, 6);
                break;
            default:
                O90.f(method, "method");
                break;
        }
    }

    @Override // defpackage.AbstractC1534Tl, defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        switch (this.g) {
            case 0:
                O90.f(objArr, "args");
                BQ1.a(this, objArr);
                return e(objArr.length <= 1 ? new Object[0] : J8.j(objArr, 1, objArr.length), objArr[0]);
            case 1:
                O90.f(objArr, "args");
                BQ1.a(this, objArr);
                d(J8.o(objArr));
                return e(objArr.length <= 1 ? new Object[0] : J8.j(objArr, 1, objArr.length), null);
            default:
                O90.f(objArr, "args");
                BQ1.a(this, objArr);
                return e(objArr, null);
        }
    }
}
