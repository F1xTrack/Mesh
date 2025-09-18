package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LFx;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-constants_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fx */
/* loaded from: classes2.dex */
public final class C0479Fx extends AbstractC7874ws0 {
    @Override // defpackage.AbstractC7874ws0
    public final C0075As0 a() {
        OY1.a("[ExpoModulesCore] " + (C0479Fx.class + ".ModuleDefinition"));
        try {
            C8444zs0 c8444zs0 = new C8444zs0(this);
            c8444zs0.a = "ExponentConstants";
            c8444zs0.b = new C3881g1(9, this);
            ((LinkedHashMap) c8444zs0.f).put("getWebViewUserAgentAsync", new C6403p9("getWebViewUserAgentAsync", new O5[0], new C1404Rt1(1, 9)));
            return c8444zs0.b();
        } finally {
            Trace.endSection();
        }
    }
}
