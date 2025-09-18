package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh81;", "Lws0;", "<init>", "()V", "LAs0;", "a", "()LAs0;", "expo-system-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: h81 */
/* loaded from: classes2.dex */
public final class C4098h81 extends AbstractC7874ws0 {
    public static final SharedPreferences d(C4098h81 c4098h81) throws C7143t2 {
        Context contextC = c4098h81.b().c();
        if (contextC == null) {
            throw new C7143t2(9);
        }
        SharedPreferences sharedPreferences = contextC.getSharedPreferences("expo_ui_preferences", 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new C7143t2(9);
    }

    @Override // defpackage.AbstractC7874ws0
    public final C0075As0 a() {
        AbstractC1282Qf c0590Hi;
        OY1.a("[ExpoModulesCore] " + (C4098h81.class + ".ModuleDefinition"));
        try {
            C8444zs0 c8444zs0 = new C8444zs0(this);
            c8444zs0.a = "ExpoSystemUI";
            if (Integer.class.equals(InterfaceC7754wE0.class)) {
                c0590Hi = new C6403p9("setBackgroundColorAsync", new O5[0], new C7322tz(2, this));
            } else {
                O5[] o5Arr = {new O5(new C1679Vh0(BP0.a.b(Integer.class), true, C6667qX0.r))};
                C3907g81 c3907g81 = new C3907g81(this, 0);
                c0590Hi = C1518Tf1.class.equals(Integer.TYPE) ? new C0590Hi("setBackgroundColorAsync", o5Arr, c3907g81, false, 3) : C1518Tf1.class.equals(Boolean.TYPE) ? new C0590Hi("setBackgroundColorAsync", o5Arr, c3907g81, false, 0) : C1518Tf1.class.equals(Double.TYPE) ? new C0590Hi("setBackgroundColorAsync", o5Arr, c3907g81, false, 1) : C1518Tf1.class.equals(Float.TYPE) ? new C0590Hi("setBackgroundColorAsync", o5Arr, c3907g81, false, 2) : C1518Tf1.class.equals(String.class) ? new C0590Hi("setBackgroundColorAsync", o5Arr, c3907g81, false, 4) : new C6403p9("setBackgroundColorAsync", o5Arr, c3907g81);
            }
            ((LinkedHashMap) c8444zs0.f).put("setBackgroundColorAsync", c0590Hi);
            c0590Hi.d = BG0.a;
            ((LinkedHashMap) c8444zs0.f).put("getBackgroundColorAsync", new C6403p9("getBackgroundColorAsync", new O5[0], new C3907g81(this, 1)));
            C0075As0 c0075As0B = c8444zs0.b();
            Trace.endSection();
            return c0075As0B;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
