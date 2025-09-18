package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: da1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9132da1 implements InterfaceC0615Jl {

    /* renamed from: a */
    public static final C9132da1 f26143a = new C9132da1();

    @Override // p000.InterfaceC0615Jl
    /* renamed from: a */
    public final List mo3319a() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Member mo3320b() {
        return null;
    }

    @Override // p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        O90.m5968f(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // p000.InterfaceC0615Jl
    public final Type getReturnType() {
        Class cls = Void.TYPE;
        O90.m5967e(cls, "TYPE");
        return cls;
    }
}
