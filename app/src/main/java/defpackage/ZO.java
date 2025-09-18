package defpackage;

import android.os.Trace;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LZO;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ZO extends AbstractC7874ws0 {
    @Override // defpackage.AbstractC7874ws0
    public final C0075As0 a() {
        OY1.a("[ExpoModulesCore] " + (ZO.class + ".ModuleDefinition"));
        try {
            C8444zs0 c8444zs0 = new C8444zs0(this);
            c8444zs0.a = "ExpoModulesCoreErrorManager";
            c8444zs0.c = new C0481Fx1(new String[]{"ExpoModulesCoreErrorManager.onNewException", "ExpoModulesCoreErrorManager.onNewWarning"});
            return c8444zs0.b();
        } finally {
            Trace.endSection();
        }
    }
}
