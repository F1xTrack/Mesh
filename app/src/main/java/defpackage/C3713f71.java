package defpackage;

import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: f71 */
/* loaded from: classes2.dex */
public final class C3713f71 extends AbstractC1282Qf {
    public final AbstractC4286i71 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C3713f71(String str, O5[] o5Arr, InterfaceC6481pZ interfaceC6481pZ) {
        super(str, o5Arr);
        this.d = BG0.b;
        this.e = (AbstractC4286i71) interfaceC6481pZ;
    }

    @Override // defpackage.N5
    public final void a(C7 c7, JavaScriptModuleObject javaScriptModuleObject) {
        O90.f(javaScriptModuleObject, "jsObject");
        WeakReference weakReferenceB = c7.b().b();
        O5[] o5Arr = this.b;
        ArrayList arrayList = new ArrayList(o5Arr.length);
        for (O5 o5 : o5Arr) {
            arrayList.add(((AbstractC1512Td1) o5.b.getValue()).b());
        }
        javaScriptModuleObject.registerAsyncFunction(this.a, false, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new C4290i9(weakReferenceB, javaScriptModuleObject.a, this, c7, 20));
    }

    @Override // defpackage.AbstractC1282Qf
    public final void d(C0387Es0 c0387Es0, ReadableArray readableArray, C1592Ue0 c1592Ue0) {
        C1339Qy c1339Qy;
        O90.f(c0387Es0, "holder");
        O90.f(readableArray, "args");
        C7 c7B = c0387Es0.a.b();
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            c1339Qy = c7B.l;
        } else {
            if (iOrdinal != 1) {
                throw new C7074sg();
            }
            c1339Qy = c7B.k;
        }
        AbstractC3767fP1.b(c1339Qy, null, new C3522e71(c1592Ue0, this, c0387Es0, readableArray, null), 3);
    }
}
