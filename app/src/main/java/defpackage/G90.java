package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class G90 extends H90 {
    @Override // defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        O90.f(objArr, "args");
        BQ1.a(this, objArr);
        Object obj = objArr[0];
        Object[] objArrJ = objArr.length <= 1 ? new Object[0] : J8.j(objArr, 1, objArr.length);
        return this.a.invoke(obj, Arrays.copyOf(objArrJ, objArrJ.length));
    }
}
