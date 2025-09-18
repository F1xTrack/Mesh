package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: da1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3419da1 implements InterfaceC0755Jl {
    public static final C3419da1 a = new C3419da1();

    @Override // defpackage.InterfaceC0755Jl
    public final List a() {
        return MN.a;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        O90.f(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Type getReturnType() {
        Class cls = Void.TYPE;
        O90.e(cls, "TYPE");
        return cls;
    }
}
