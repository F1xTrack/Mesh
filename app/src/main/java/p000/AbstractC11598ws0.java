package p000;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import expo.modules.kotlin.jni.JavaScriptModuleObject;

/* renamed from: ws0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11598ws0 {

    /* renamed from: a */
    public C0134C7 f45149a;

    /* renamed from: b */
    public final F71 f45150b = AbstractC0705LB.m4915b(new C10801qd0(10, this));

    /* renamed from: a */
    public abstract C7350As0 mo2834a();

    /* renamed from: b */
    public final C0134C7 m25721b() {
        C0134C7 c0134c7 = this.f45149a;
        if (c0134c7 != null) {
            return c0134c7;
        }
        throw new IllegalArgumentException("The module wasn't created! You can't access the app context.");
    }

    /* renamed from: c */
    public final void m25722c(Bundle bundle, String str) {
        InterfaceC7199yP interfaceC7199yP = (InterfaceC7199yP) this.f45150b.getValue();
        if (interfaceC7199yP != null) {
            C7558Es0 c7558Es0 = ((C11443ve0) interfaceC7199yP).f44462a;
            C7621Fx1 c7621Fx1 = c7558Es0.f2934b.f459f;
            if (c7621Fx1 == null || !AbstractC0576J8.m4178e((String[]) c7621Fx1.f3494a, str)) {
                throw new IllegalArgumentException(AbstractC7222ym.m26234k("Unsupported event: ", str, ".").toString());
            }
            ReadableMap readableMapM25739c = AbstractC11622x22.m25739c(bundle, C4049fN.f27159d);
            ((JavaScriptModuleObject) c7558Es0.f2935c.getValue()).emitEvent(c7558Es0.f2933a.m25721b().m986b(), str, readableMapM25739c instanceof ReadableNativeMap ? (ReadableNativeMap) readableMapM25739c : null);
        }
    }
}
