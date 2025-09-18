package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvz;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vz */
/* loaded from: classes2.dex */
public final class C7704vz extends AbstractC7874ws0 {
    @Override // defpackage.AbstractC7874ws0
    public final C0075As0 a() {
        AbstractC1282Qf c0590Hi;
        OY1.a("[ExpoModulesCore] " + (C7704vz.class + ".ModuleDefinition"));
        try {
            C8444zs0 c8444zs0 = new C8444zs0(this);
            ((LinkedHashMap) c8444zs0.d).put("uuidv4", new C7734w71("uuidv4", new O5[0], new C1404Rt1(1, 11)));
            X2 x2 = X2.n;
            IP0 ip0 = BP0.a;
            ((LinkedHashMap) c8444zs0.d).put("uuidv5", new C7734w71("uuidv5", new O5[]{new O5(new C1679Vh0(ip0.b(String.class), false, x2)), new O5(new C1679Vh0(ip0.b(String.class), false, X2.o))}, new C1404Rt1(1, 10)));
            ((LinkedHashMap) c8444zs0.d).put("getViewConfig", new C7734w71("getViewConfig", new O5[]{new O5(new C1679Vh0(ip0.b(String.class), false, X2.p))}, new C7513uz(this, 1)));
            if (String.class.equals(InterfaceC7754wE0.class)) {
                c0590Hi = new C6403p9("reloadAppAsync", new O5[0], new C7322tz(0, this));
            } else {
                O5[] o5Arr = {new O5(new C1679Vh0(ip0.b(String.class), false, X2.m))};
                C7513uz c7513uz = new C7513uz(this, 0);
                c0590Hi = C1518Tf1.class.equals(Integer.TYPE) ? new C0590Hi("reloadAppAsync", o5Arr, c7513uz, false, 3) : C1518Tf1.class.equals(Boolean.TYPE) ? new C0590Hi("reloadAppAsync", o5Arr, c7513uz, false, 0) : C1518Tf1.class.equals(Double.TYPE) ? new C0590Hi("reloadAppAsync", o5Arr, c7513uz, false, 1) : C1518Tf1.class.equals(Float.TYPE) ? new C0590Hi("reloadAppAsync", o5Arr, c7513uz, false, 2) : C1518Tf1.class.equals(String.class) ? new C0590Hi("reloadAppAsync", o5Arr, c7513uz, false, 4) : new C6403p9("reloadAppAsync", o5Arr, c7513uz);
            }
            ((LinkedHashMap) c8444zs0.f).put("reloadAppAsync", c0590Hi);
            C0075As0 c0075As0B = c8444zs0.b();
            Trace.endSection();
            return c0075As0B;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
