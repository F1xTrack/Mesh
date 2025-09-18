package p000;

import android.os.Trace;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.util.Iterator;

/* renamed from: Ds0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7506Ds0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f2285e;

    /* renamed from: f */
    public final /* synthetic */ C7558Es0 f2286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7506Ds0(C7558Es0 c7558Es0, int i) {
        super(0);
        this.f2285e = i;
        this.f2286f = c7558Es0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f2285e) {
            case 0:
                C7558Es0 c7558Es0 = this.f2286f;
                OY1.m6083a("[ExpoModulesCore] " + c7558Es0.f2934b.f454a.concat(".jsObject"));
                try {
                    AbstractC11598ws0 abstractC11598ws0 = c7558Es0.f2933a;
                    C7350As0 c7350As0 = c7558Es0.f2934b;
                    C0134C7 c0134c7M25721b = abstractC11598ws0.m25721b();
                    JavaScriptModuleObject javaScriptModuleObject = new JavaScriptModuleObject(c0134c7M25721b.f1208m, c7350As0.f454a);
                    javaScriptModuleObject.m18102b(c0134c7M25721b, c7350As0.f455b);
                    javaScriptModuleObject.registerProperty("__expo_module_name__", false, new ExpectedType[0], new G10(22, javaScriptModuleObject), false, new ExpectedType[0], null);
                    Trace.beginSection(OY1.m6088f("[ExpoModulesCore] Attaching classes"));
                    Iterator it = c7350As0.f457d.iterator();
                    if (!it.hasNext()) {
                        Trace.endSection();
                        return javaScriptModuleObject;
                    }
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Throwable th) {
                    throw th;
                } finally {
                    Trace.endSection();
                }
            default:
                C7064wG c7064wG = C0399GK.f3695b;
                C10480o61 c10480o61M3069a = GT1.m3069a();
                c7064wG.getClass();
                return AbstractC11432vY1.m25444a(AbstractC11551wU1.m25639c(c7064wG, c10480o61M3069a).mo936f(new C0503Hz(this.f2286f.f2934b.f454a)));
        }
    }
}
