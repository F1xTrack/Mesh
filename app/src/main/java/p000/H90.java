package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class H90 implements InterfaceC0615Jl {

    /* renamed from: a */
    public final Method f4150a;

    /* renamed from: b */
    public final List f4151b;

    /* renamed from: c */
    public final Class f4152c;

    public H90(Method method, List list) {
        this.f4150a = method;
        this.f4151b = list;
        Class<?> returnType = method.getReturnType();
        O90.m5967e(returnType, "getReturnType(...)");
        this.f4152c = returnType;
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: a */
    public final List mo3319a() {
        return this.f4151b;
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Member mo3320b() {
        return null;
    }

    @Override // p000.InterfaceC0615Jl
    public final Type getReturnType() {
        return this.f4152c;
    }
}
