package p000;

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
public class C6599p9 extends AbstractC1049Qf {

    /* renamed from: e */
    public final /* synthetic */ int f39866e = 1;

    /* renamed from: f */
    public final AbstractC8418Vg0 f39867f;

    /* JADX WARN: Multi-variable type inference failed */
    public C6599p9(String str, C0887O5[] c0887o5Arr, InterfaceC6497nZ interfaceC6497nZ) {
        super(str, c0887o5Arr);
        this.f9708d = BG0.f695b;
        this.f39867f = (AbstractC8418Vg0) interfaceC6497nZ;
    }

    @Override // p000.AbstractC0824N5
    /* renamed from: a */
    public final void mo5538a(C0134C7 c0134c7, JavaScriptModuleObject javaScriptModuleObject) {
        O90.m5968f(javaScriptModuleObject, "jsObject");
        WeakReference weakReferenceM18092b = c0134c7.m986b().m18092b();
        C0887O5[] c0887o5Arr = this.f7490b;
        ArrayList arrayList = new ArrayList(c0887o5Arr.length);
        for (C0887O5 c0887o5 : c0887o5Arr) {
            arrayList.add(((AbstractC8309Td1) c0887o5.f8216b.getValue()).mo3313b());
        }
        javaScriptModuleObject.registerAsyncFunction(this.f7489a, false, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new C4224i9(weakReferenceM18092b, javaScriptModuleObject.f26959a, this, c0134c7, 0));
    }

    @Override // p000.AbstractC1049Qf
    /* renamed from: d */
    public final void mo6740d(C7558Es0 c7558Es0, ReadableArray readableArray, C8362Ue0 c8362Ue0) throws InvalidArgsNumberException {
        C1068Qy c1068Qy;
        O90.m5968f(c7558Es0, "holder");
        O90.m5968f(readableArray, "args");
        int iOrdinal = this.f9708d.ordinal();
        if (iOrdinal == 0) {
            c1068Qy = c7558Es0.f2933a.m25721b().f1207l;
        } else {
            if (iOrdinal != 1) {
                throw new C6838sg();
            }
            c1068Qy = null;
        }
        if (c1068Qy == null) {
            m23622e(readableArray, c8362Ue0);
        } else {
            AbstractC9366fP1.m18230b(c1068Qy, null, new C6282k9(c8362Ue0, this, c7558Es0, readableArray, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Vg0, kotlin.jvm.functions.Function2] */
    /* renamed from: e */
    public final void m23622e(ReadableArray readableArray, C8362Ue0 c8362Ue0) throws InvalidArgsNumberException {
        switch (this.f39866e) {
            case 0:
                O90.m5968f(readableArray, "args");
                c8362Ue0.resolve(this.f39867f.invoke(m5539b(readableArray)));
                break;
            default:
                O90.m5968f(readableArray, "args");
                this.f39867f.invoke(m5539b(readableArray), c8362Ue0);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [Vg0, kotlin.jvm.functions.Function2] */
    /* renamed from: f */
    public void mo3551f(Object[] objArr, InterfaceC11518wE0 interfaceC11518wE0, C0134C7 c0134c7) throws InvalidArgsNumberException, C6281k8 {
        switch (this.f39866e) {
            case 0:
                O90.m5968f(objArr, "args");
                O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                interfaceC11518wE0.resolve(this.f39867f.invoke(m5540c(objArr, c0134c7)));
                break;
            default:
                O90.m5968f(objArr, "args");
                O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                this.f39867f.invoke(m5540c(objArr, c0134c7), interfaceC11518wE0);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6599p9(String str, C0887O5[] c0887o5Arr, Function2 function2) {
        super(str, c0887o5Arr);
        this.f9708d = BG0.f695b;
        this.f39867f = (AbstractC8418Vg0) function2;
    }
}
