package p000;

import android.os.Trace;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m22267d2 = {"LGf0;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-keep-awake_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: Gf0 */
/* loaded from: classes2.dex */
public final class C7636Gf0 extends AbstractC11598ws0 {
    /* renamed from: d */
    public static final C6489nR m3119d(C7636Gf0 c7636Gf0) throws C8180Qr0 {
        Object obj;
        try {
            obj = c7636Gf0.m25721b().f1196a.f5762a.get(C6489nR.class);
        } catch (Exception unused) {
            obj = null;
        }
        C6489nR c6489nR = (C6489nR) obj;
        if (c6489nR != null) {
            return c6489nR;
        }
        throw new C8180Qr0("Module 'KeepAwakeManager' not found. Are you sure all modules are linked correctly?", null);
    }

    @Override // p000.AbstractC11598ws0
    /* renamed from: a */
    public final C7350As0 mo2834a() {
        OY1.m6083a("[ExpoModulesCore] " + (C7636Gf0.class + ".ModuleDefinition"));
        try {
            C11979zs0 c11979zs0 = new C11979zs0(this);
            c11979zs0.f47055a = "ExpoKeepAwake";
            C1225TT c1225tt = C1225TT.f11387w;
            IP0 ip0 = BP0.f799a;
            ((LinkedHashMap) c11979zs0.f47060f).put("activate", new C6599p9("activate", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, c1225tt))}, new C7584Ff0(this, 0)));
            ((LinkedHashMap) c11979zs0.f47060f).put("deactivate", new C6599p9("deactivate", new C0887O5[]{new C0887O5(new C8420Vh0(ip0.mo3846b(String.class), false, C1225TT.f11388x))}, new C7584Ff0(this, 1)));
            C0887O5[] c0887o5Arr = new C0887O5[0];
            C7236z c7236z = new C7236z(21, this);
            ((LinkedHashMap) c11979zs0.f47060f).put("isActivated", Boolean.class.equals(Integer.TYPE) ? new C0486Hi("isActivated", c0887o5Arr, c7236z, false, 3) : Boolean.class.equals(Boolean.TYPE) ? new C0486Hi("isActivated", c0887o5Arr, c7236z, false, 0) : Boolean.class.equals(Double.TYPE) ? new C0486Hi("isActivated", c0887o5Arr, c7236z, false, 1) : Boolean.class.equals(Float.TYPE) ? new C0486Hi("isActivated", c0887o5Arr, c7236z, false, 2) : Boolean.class.equals(String.class) ? new C0486Hi("isActivated", c0887o5Arr, c7236z, false, 4) : new C6599p9("isActivated", c0887o5Arr, c7236z));
            C7350As0 c7350As0M26561b = c11979zs0.m26561b();
            Trace.endSection();
            return c7350As0M26561b;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
