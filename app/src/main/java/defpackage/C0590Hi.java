package defpackage;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.exception.InvalidArgsNumberException;

/* renamed from: Hi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0590Hi extends C6403p9 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0590Hi(String str, O5[] o5Arr, InterfaceC6099nZ interfaceC6099nZ, int i) {
        super(str, o5Arr, interfaceC6099nZ);
        this.g = i;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r5v2, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r5v3, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r5v5, types: [Vg0, nZ] */
    @Override // defpackage.C6403p9
    public final void f(Object[] objArr, InterfaceC7754wE0 interfaceC7754wE0, C7 c7) throws InvalidArgsNumberException, C5445k8 {
        switch (this.g) {
            case 0:
                O90.f(objArr, "args");
                O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC7754wE0.b(((Boolean) this.f.invoke(c(objArr, c7))).booleanValue());
                break;
            case 1:
                O90.f(objArr, "args");
                O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC7754wE0.d(((Number) this.f.invoke(c(objArr, c7))).doubleValue());
                break;
            case 2:
                O90.f(objArr, "args");
                O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC7754wE0.e(((Number) this.f.invoke(c(objArr, c7))).floatValue());
                break;
            case 3:
                O90.f(objArr, "args");
                O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC7754wE0.c(((Number) this.f.invoke(c(objArr, c7))).intValue());
                break;
            default:
                O90.f(objArr, "args");
                O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC7754wE0.a((String) this.f.invoke(c(objArr, c7)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0590Hi(String str, O5[] o5Arr, InterfaceC6099nZ interfaceC6099nZ, boolean z, int i) {
        super(str, o5Arr, interfaceC6099nZ);
        this.g = i;
    }
}
