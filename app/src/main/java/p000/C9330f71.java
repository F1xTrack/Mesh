package p000;

import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: f71 */
/* loaded from: classes2.dex */
public final class C9330f71 extends AbstractC1049Qf {

    /* renamed from: e */
    public final AbstractC9714i71 f27083e;

    /* JADX WARN: Multi-variable type inference failed */
    public C9330f71(String str, C0887O5[] c0887o5Arr, InterfaceC6625pZ interfaceC6625pZ) {
        super(str, c0887o5Arr);
        this.f9708d = BG0.f695b;
        this.f27083e = (AbstractC9714i71) interfaceC6625pZ;
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
        javaScriptModuleObject.registerAsyncFunction(this.f7489a, false, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new C4224i9(weakReferenceM18092b, javaScriptModuleObject.f26959a, this, c0134c7, 20));
    }

    @Override // p000.AbstractC1049Qf
    /* renamed from: d */
    public final void mo6740d(C7558Es0 c7558Es0, ReadableArray readableArray, C8362Ue0 c8362Ue0) {
        C1068Qy c1068Qy;
        O90.m5968f(c7558Es0, "holder");
        O90.m5968f(readableArray, "args");
        C0134C7 c0134c7M25721b = c7558Es0.f2933a.m25721b();
        int iOrdinal = this.f9708d.ordinal();
        if (iOrdinal == 0) {
            c1068Qy = c0134c7M25721b.f1207l;
        } else {
            if (iOrdinal != 1) {
                throw new C6838sg();
            }
            c1068Qy = c0134c7M25721b.f1206k;
        }
        AbstractC9366fP1.m18230b(c1068Qy, null, new C9202e71(c8362Ue0, this, c7558Es0, readableArray, null), 3);
    }
}
