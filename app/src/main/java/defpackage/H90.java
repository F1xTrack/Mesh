package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class H90 implements InterfaceC0755Jl {
    public final Method a;
    public final List b;
    public final Class c;

    public H90(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        O90.e(returnType, "getReturnType(...)");
        this.c = returnType;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final List a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Type getReturnType() {
        return this.c;
    }
}
