package defpackage;

import android.os.Trace;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.util.Iterator;

/* renamed from: Ds0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0309Ds0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C0387Es0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0309Ds0(C0387Es0 c0387Es0, int i) {
        super(0);
        this.e = i;
        this.f = c0387Es0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                C0387Es0 c0387Es0 = this.f;
                OY1.a("[ExpoModulesCore] " + c0387Es0.b.a.concat(".jsObject"));
                try {
                    AbstractC7874ws0 abstractC7874ws0 = c0387Es0.a;
                    C0075As0 c0075As0 = c0387Es0.b;
                    C7 c7B = abstractC7874ws0.b();
                    JavaScriptModuleObject javaScriptModuleObject = new JavaScriptModuleObject(c7B.m, c0075As0.a);
                    javaScriptModuleObject.b(c7B, c0075As0.b);
                    javaScriptModuleObject.registerProperty("__expo_module_name__", false, new ExpectedType[0], new G10(22, javaScriptModuleObject), false, new ExpectedType[0], null);
                    Trace.beginSection(OY1.f("[ExpoModulesCore] Attaching classes"));
                    Iterator it = c0075As0.d.iterator();
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
                C7759wG c7759wG = GK.b;
                C6205o61 c6205o61A = GT1.a();
                c7759wG.getClass();
                return AbstractC7625vY1.a(AbstractC7803wU1.c(c7759wG, c6205o61A).f(new C0641Hz(this.f.b.a)));
        }
    }
}
