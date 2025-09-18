package p000;

import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class F90 extends H90 implements InterfaceC1492Xi {

    /* renamed from: d */
    public final Object f3083d;

    public F90(Object obj, Method method) {
        super(method, C0779MN.f7117a);
        this.f3083d = obj;
    }

    @Override // p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        O90.m5968f(objArr, "args");
        BQ1.m716a(this, objArr);
        return this.f4150a.invoke(this.f3083d, Arrays.copyOf(objArr, objArr.length));
    }
}
