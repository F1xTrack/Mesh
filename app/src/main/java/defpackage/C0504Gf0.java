package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LGf0;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-keep-awake_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gf0 */
/* loaded from: classes2.dex */
public final class C0504Gf0 extends AbstractC7874ws0 {
    public static final C6075nR d(C0504Gf0 c0504Gf0) throws C1319Qr0 {
        Object obj;
        try {
            obj = c0504Gf0.b().a.a.get(C6075nR.class);
        } catch (Exception unused) {
            obj = null;
        }
        C6075nR c6075nR = (C6075nR) obj;
        if (c6075nR != null) {
            return c6075nR;
        }
        throw new C1319Qr0("Module 'KeepAwakeManager' not found. Are you sure all modules are linked correctly?", null);
    }

    @Override // defpackage.AbstractC7874ws0
    public final C0075As0 a() {
        OY1.a("[ExpoModulesCore] " + (C0504Gf0.class + ".ModuleDefinition"));
        try {
            C8444zs0 c8444zs0 = new C8444zs0(this);
            c8444zs0.a = "ExpoKeepAwake";
            TT tt = TT.w;
            IP0 ip0 = BP0.a;
            ((LinkedHashMap) c8444zs0.f).put("activate", new C6403p9("activate", new O5[]{new O5(new C1679Vh0(ip0.b(String.class), false, tt))}, new C0426Ff0(this, 0)));
            ((LinkedHashMap) c8444zs0.f).put("deactivate", new C6403p9("deactivate", new O5[]{new O5(new C1679Vh0(ip0.b(String.class), false, TT.x))}, new C0426Ff0(this, 1)));
            O5[] o5Arr = new O5[0];
            C8277z c8277z = new C8277z(21, this);
            ((LinkedHashMap) c8444zs0.f).put("isActivated", Boolean.class.equals(Integer.TYPE) ? new C0590Hi("isActivated", o5Arr, c8277z, false, 3) : Boolean.class.equals(Boolean.TYPE) ? new C0590Hi("isActivated", o5Arr, c8277z, false, 0) : Boolean.class.equals(Double.TYPE) ? new C0590Hi("isActivated", o5Arr, c8277z, false, 1) : Boolean.class.equals(Float.TYPE) ? new C0590Hi("isActivated", o5Arr, c8277z, false, 2) : Boolean.class.equals(String.class) ? new C0590Hi("isActivated", o5Arr, c8277z, false, 4) : new C6403p9("isActivated", o5Arr, c8277z));
            C0075As0 c0075As0B = c8444zs0.b();
            Trace.endSection();
            return c0075As0B;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
