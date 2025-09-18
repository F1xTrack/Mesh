package p000;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.util.ArrayList;

/* renamed from: w71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11505w71 extends AbstractC0824N5 {

    /* renamed from: d */
    public final AbstractC8418Vg0 f44683d;

    /* JADX WARN: Multi-variable type inference failed */
    public C11505w71(String str, C0887O5[] c0887o5Arr, InterfaceC6497nZ interfaceC6497nZ) {
        super(str, c0887o5Arr);
        this.f44683d = (AbstractC8418Vg0) interfaceC6497nZ;
    }

    @Override // p000.AbstractC0824N5
    /* renamed from: a */
    public final void mo5538a(C0134C7 c0134c7, JavaScriptModuleObject javaScriptModuleObject) {
        O90.m5968f(javaScriptModuleObject, "jsObject");
        C0887O5[] c0887o5Arr = this.f7490b;
        ArrayList arrayList = new ArrayList(c0887o5Arr.length);
        for (C0887O5 c0887o5 : c0887o5Arr) {
            arrayList.add(((AbstractC8309Td1) c0887o5.f8216b.getValue()).mo3313b());
        }
        javaScriptModuleObject.registerSyncFunction(this.f7489a, false, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new C4224i9(21, this, c0134c7, javaScriptModuleObject.f26959a));
    }
}
