package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m22267d2 = {"Lh81;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-system-ui_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* renamed from: h81 */
/* loaded from: classes2.dex */
public final class C9588h81 extends AbstractC11598ws0 {
    /* renamed from: d */
    public static final SharedPreferences m18727d(C9588h81 c9588h81) throws C6861t2 {
        Context contextM987c = c9588h81.m25721b().m987c();
        if (contextM987c == null) {
            throw new C6861t2(9);
        }
        SharedPreferences sharedPreferences = contextM987c.getSharedPreferences("expo_ui_preferences", 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new C6861t2(9);
    }

    @Override // p000.AbstractC11598ws0
    /* renamed from: a */
    public final C7350As0 mo2834a() {
        AbstractC1049Qf c0486Hi;
        OY1.m6083a("[ExpoModulesCore] " + (C9588h81.class + ".ModuleDefinition"));
        try {
            C11979zs0 c11979zs0 = new C11979zs0(this);
            c11979zs0.f47055a = "ExpoSystemUI";
            if (Integer.class.equals(InterfaceC11518wE0.class)) {
                c0486Hi = new C6599p9("setBackgroundColorAsync", new C0887O5[0], new C6920tz(2, this));
            } else {
                C0887O5[] c0887o5Arr = {new C0887O5(new C8420Vh0(BP0.f799a.mo3846b(Integer.class), true, C10789qX0.f41009r))};
                C9460g81 c9460g81 = new C9460g81(this, 0);
                c0486Hi = C8313Tf1.class.equals(Integer.TYPE) ? new C0486Hi("setBackgroundColorAsync", c0887o5Arr, c9460g81, false, 3) : C8313Tf1.class.equals(Boolean.TYPE) ? new C0486Hi("setBackgroundColorAsync", c0887o5Arr, c9460g81, false, 0) : C8313Tf1.class.equals(Double.TYPE) ? new C0486Hi("setBackgroundColorAsync", c0887o5Arr, c9460g81, false, 1) : C8313Tf1.class.equals(Float.TYPE) ? new C0486Hi("setBackgroundColorAsync", c0887o5Arr, c9460g81, false, 2) : C8313Tf1.class.equals(String.class) ? new C0486Hi("setBackgroundColorAsync", c0887o5Arr, c9460g81, false, 4) : new C6599p9("setBackgroundColorAsync", c0887o5Arr, c9460g81);
            }
            ((LinkedHashMap) c11979zs0.f47060f).put("setBackgroundColorAsync", c0486Hi);
            c0486Hi.f9708d = BG0.f694a;
            ((LinkedHashMap) c11979zs0.f47060f).put("getBackgroundColorAsync", new C6599p9("getBackgroundColorAsync", new C0887O5[0], new C9460g81(this, 1)));
            C7350As0 c7350As0M26561b = c11979zs0.m26561b();
            Trace.endSection();
            return c7350As0M26561b;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
