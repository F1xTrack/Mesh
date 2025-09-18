package p000;

import android.os.Trace;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m22267d2 = {"Lvz;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: vz */
/* loaded from: classes2.dex */
public final class C7046vz extends AbstractC11598ws0 {
    @Override // p000.AbstractC11598ws0
    /* renamed from: a */
    public final C7350As0 mo2834a() {
        AbstractC1049Qf c0486Hi;
        OY1.m6083a("[ExpoModulesCore] " + (C7046vz.class + ".ModuleDefinition"));
        try {
            C11979zs0 c11979zs0 = new C11979zs0(this);
            ((LinkedHashMap) c11979zs0.f47058d).put("uuidv4", new C11505w71("uuidv4", new C0887O5[0], new C8237Rt1(1, 11)));
            C1450X2 c1450x2 = C1450X2.f13510n;
            IP0 ip0 = BP0.f799a;
            ((LinkedHashMap) c11979zs0.f47058d).put("uuidv5", new C11505w71("uuidv5", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, c1450x2)), new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C1450X2.f13511o))}, new C8237Rt1(1, 10)));
            ((LinkedHashMap) c11979zs0.f47058d).put("getViewConfig", new C11505w71("getViewConfig", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C1450X2.f13512p))}, new C6983uz(this, 1)));
            if (String.class.equals(InterfaceC11518wE0.class)) {
                c0486Hi = new C6599p9("reloadAppAsync", new C0887O5[0], new C6920tz(0, this));
            } else {
                C0887O5[] c0887o5Arr = {new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C1450X2.f13509m))};
                C6983uz c6983uz = new C6983uz(this, 0);
                c0486Hi = C8313Tf1.class.equals(Integer.TYPE) ? new C0486Hi("reloadAppAsync", c0887o5Arr, c6983uz, false, 3) : C8313Tf1.class.equals(Boolean.TYPE) ? new C0486Hi("reloadAppAsync", c0887o5Arr, c6983uz, false, 0) : C8313Tf1.class.equals(Double.TYPE) ? new C0486Hi("reloadAppAsync", c0887o5Arr, c6983uz, false, 1) : C8313Tf1.class.equals(Float.TYPE) ? new C0486Hi("reloadAppAsync", c0887o5Arr, c6983uz, false, 2) : C8313Tf1.class.equals(String.class) ? new C0486Hi("reloadAppAsync", c0887o5Arr, c6983uz, false, 4) : new C6599p9("reloadAppAsync", c0887o5Arr, c6983uz);
            }
            ((LinkedHashMap) c11979zs0.f47060f).put("reloadAppAsync", c0486Hi);
            C7350As0 c7350As0M26561b = c11979zs0.m26561b();
            Trace.endSection();
            return c7350As0M26561b;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
