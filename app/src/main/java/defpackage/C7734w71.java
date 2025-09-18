package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.util.ArrayList;

/* renamed from: w71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7734w71 extends N5 {
    public final AbstractC1676Vg0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public C7734w71(String str, O5[] o5Arr, InterfaceC6099nZ interfaceC6099nZ) {
        super(str, o5Arr);
        this.d = (AbstractC1676Vg0) interfaceC6099nZ;
    }

    @Override // defpackage.N5
    public final void a(C7 c7, JavaScriptModuleObject javaScriptModuleObject) {
        O90.f(javaScriptModuleObject, "jsObject");
        O5[] o5Arr = this.b;
        ArrayList arrayList = new ArrayList(o5Arr.length);
        for (O5 o5 : o5Arr) {
            arrayList.add(((AbstractC1512Td1) o5.b.getValue()).b());
        }
        javaScriptModuleObject.registerSyncFunction(this.a, false, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new C4290i9(21, this, c7, javaScriptModuleObject.a));
    }
}
