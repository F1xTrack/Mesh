package p000;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class G90 extends H90 {
    @Override // p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        O90.m5968f(objArr, "args");
        BQ1.m716a(this, objArr);
        Object obj = objArr[0];
        Object[] objArrM4183j = objArr.length <= 1 ? new Object[0] : AbstractC0576J8.m4183j(objArr, 1, objArr.length);
        return this.f4150a.invoke(obj, Arrays.copyOf(objArrM4183j, objArrM4183j.length));
    }
}
