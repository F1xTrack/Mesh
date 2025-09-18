package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class F90 extends H90 implements InterfaceC1837Xi {
    public final Object d;

    public F90(Object obj, Method method) {
        super(method, MN.a);
        this.d = obj;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        O90.f(objArr, "args");
        BQ1.a(this, objArr);
        return this.a.invoke(this.d, Arrays.copyOf(objArr, objArr.length));
    }
}
