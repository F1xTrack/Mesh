package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import expo.modules.kotlin.jni.JavaScriptModuleObject;

/* renamed from: ws0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7874ws0 {
    public C7 a;
    public final F71 b = LB.b(new C6685qd0(10, this));

    public abstract C0075As0 a();

    public final C7 b() {
        C7 c7 = this.a;
        if (c7 != null) {
            return c7;
        }
        throw new IllegalArgumentException("The module wasn't created! You can't access the app context.");
    }

    public final void c(Bundle bundle, String str) {
        InterfaceC8166yP interfaceC8166yP = (InterfaceC8166yP) this.b.getValue();
        if (interfaceC8166yP != null) {
            C0387Es0 c0387Es0 = ((C7642ve0) interfaceC8166yP).a;
            C0481Fx1 c0481Fx1 = c0387Es0.b.f;
            if (c0481Fx1 == null || !J8.e((String[]) c0481Fx1.a, str)) {
                throw new IllegalArgumentException(AbstractC8235ym.k("Unsupported event: ", str, ".").toString());
            }
            ReadableMap readableMapC = AbstractC7909x22.c(bundle, C3759fN.d);
            ((JavaScriptModuleObject) c0387Es0.c.getValue()).emitEvent(c0387Es0.a.b().b(), str, readableMapC instanceof ReadableNativeMap ? (ReadableNativeMap) readableMapC : null);
        }
    }
}
