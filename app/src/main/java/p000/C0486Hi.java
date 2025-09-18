package p000;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.exception.InvalidArgsNumberException;

/* renamed from: Hi */
/* loaded from: classes2.dex */
public final class C0486Hi extends C6599p9 {

    /* renamed from: g */
    public final /* synthetic */ int f4442g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0486Hi(String str, C0887O5[] c0887o5Arr, InterfaceC6497nZ interfaceC6497nZ, int i) {
        super(str, c0887o5Arr, interfaceC6497nZ);
        this.f4442g = i;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r5v2, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r5v3, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r5v5, types: [Vg0, nZ] */
    @Override // p000.C6599p9
    /* renamed from: f */
    public final void mo3551f(Object[] objArr, InterfaceC11518wE0 interfaceC11518wE0, C0134C7 c0134c7) throws InvalidArgsNumberException, C6281k8 {
        switch (this.f4442g) {
            case 0:
                O90.m5968f(objArr, "args");
                O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC11518wE0.mo8104b(((Boolean) this.f39867f.invoke(m5540c(objArr, c0134c7))).booleanValue());
                break;
            case 1:
                O90.m5968f(objArr, "args");
                O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC11518wE0.mo8106d(((Number) this.f39867f.invoke(m5540c(objArr, c0134c7))).doubleValue());
                break;
            case 2:
                O90.m5968f(objArr, "args");
                O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC11518wE0.mo8107e(((Number) this.f39867f.invoke(m5540c(objArr, c0134c7))).floatValue());
                break;
            case 3:
                O90.m5968f(objArr, "args");
                O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC11518wE0.mo8105c(((Number) this.f39867f.invoke(m5540c(objArr, c0134c7))).intValue());
                break;
            default:
                O90.m5968f(objArr, "args");
                O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC11518wE0.mo8103a((String) this.f39867f.invoke(m5540c(objArr, c0134c7)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0486Hi(String str, C0887O5[] c0887o5Arr, InterfaceC6497nZ interfaceC6497nZ, boolean z, int i) {
        super(str, c0887o5Arr, interfaceC6497nZ);
        this.f4442g = i;
    }
}
