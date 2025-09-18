package defpackage;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* renamed from: p9 */
/* loaded from: classes2.dex */
public class C6403p9 extends AbstractC1282Qf {
    public final /* synthetic */ int e = 1;
    public final AbstractC1676Vg0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public C6403p9(String str, O5[] o5Arr, InterfaceC6099nZ interfaceC6099nZ) {
        super(str, o5Arr);
        this.d = BG0.b;
        this.f = (AbstractC1676Vg0) interfaceC6099nZ;
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
        javaScriptModuleObject.registerAsyncFunction(this.a, false, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new C4290i9(weakReferenceB, javaScriptModuleObject.a, this, c7, 0));
    }

    @Override // defpackage.AbstractC1282Qf
    public final void d(C0387Es0 c0387Es0, ReadableArray readableArray, C1592Ue0 c1592Ue0) throws InvalidArgsNumberException {
        C1339Qy c1339Qy;
        O90.f(c0387Es0, "holder");
        O90.f(readableArray, "args");
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            c1339Qy = c0387Es0.a.b().l;
        } else {
            if (iOrdinal != 1) {
                throw new C7074sg();
            }
            c1339Qy = null;
        }
        if (c1339Qy == null) {
            e(readableArray, c1592Ue0);
        } else {
            AbstractC3767fP1.b(c1339Qy, null, new C5448k9(c1592Ue0, this, c0387Es0, readableArray, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Vg0, kotlin.jvm.functions.Function2] */
    public final void e(ReadableArray readableArray, C1592Ue0 c1592Ue0) throws InvalidArgsNumberException {
        switch (this.e) {
            case 0:
                O90.f(readableArray, "args");
                c1592Ue0.resolve(this.f.invoke(b(readableArray)));
                break;
            default:
                O90.f(readableArray, "args");
                this.f.invoke(b(readableArray), c1592Ue0);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Vg0, kotlin.jvm.functions.Function2] */
    public void f(Object[] objArr, InterfaceC7754wE0 interfaceC7754wE0, C7 c7) throws InvalidArgsNumberException, C5445k8 {
        switch (this.e) {
            case 0:
                O90.f(objArr, "args");
                O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC7754wE0.resolve(this.f.invoke(c(objArr, c7)));
                break;
            default:
                O90.f(objArr, "args");
                O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                this.f.invoke(c(objArr, c7), interfaceC7754wE0);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6403p9(String str, O5[] o5Arr, Function2 function2) {
        super(str, o5Arr);
        this.d = BG0.b;
        this.f = (AbstractC1676Vg0) function2;
    }
}
