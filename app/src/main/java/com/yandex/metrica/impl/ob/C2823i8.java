package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2823i8 implements S7 {
    private final Context a;
    private final U3 b;
    private C2773g8 c;
    private final Um<Bundle> d;
    private final C2922m8 e;
    private final C3022q8 f;
    private final Vm<Void, String> g;

    /* renamed from: com.yandex.metrica.impl.ob.i8$a */
    public class a implements Um<Bundle> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(Bundle bundle) {
            CrashpadHelper.setUpNativeUncaughtExceptionHandler(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.i8$b */
    public class b implements Vm<Void, String> {
        @Override // com.yandex.metrica.impl.ob.Vm
        public String a(Void r1) {
            return CrashpadHelper.getLibraryVersion();
        }
    }

    public C2823i8(Context context, U3 u3) {
        this(context, u3, new L0(), new a());
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public String a() {
        return "appmetrica_native_crashes";
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void b() {
        CrashpadHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public String c() {
        return "appmetrica-native";
    }

    private C2823i8(Context context, U3 u3, L0 l0, Um<Bundle> um) {
        this(context, u3, new C2773g8(context, l0, Y.g().d().b()), um, new C2922m8(), new C3022q8(), new b());
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void a(String str, String str2, String str3) {
        C2872k8 c2872k8B = this.c.b();
        if (c2872k8B != null) {
            if (TextUtils.isEmpty(c2872k8B.a) && c2872k8B.d == null) {
                return;
            }
            this.f.a(str3);
            String strEncodeToString = null;
            this.f.b(this.g.a(null));
            Um<Bundle> um = this.d;
            String strA = this.f.a();
            Bundle bundle = new Bundle();
            C2922m8 c2922m8 = this.e;
            U3 u3 = this.b;
            c2922m8.getClass();
            try {
                strEncodeToString = Base64.encodeToString(new JSONObject().put("arg_cd", new JSONObject().put("arg_ak", str).put("arg_pn", u3.f()).put("arg_pd", u3.g()).put("arg_ps", u3.h()).put("arg_rt", "main")).toString().getBytes(), 0);
            } catch (Throwable unused) {
            }
            bundle.putString("arg_cd", strEncodeToString);
            bundle.putString("arg_rc", strA);
            bundle.putString("arg_dd", str2);
            bundle.putString("arg_hp", c2872k8B.a);
            bundle.putBoolean("arg_i64", c2872k8B.b);
            bundle.putBoolean("arg_ul", c2872k8B.c);
            bundle.putString("arg_sn", this.a.getPackageName() + "-crashpad_new_crash_socket");
            if (c2872k8B.d == null) {
                bundle.putBoolean("arg_ap", false);
            } else {
                bundle.putBoolean("arg_ap", true);
                Objects.requireNonNull(c2872k8B.d);
                bundle.putString("arg_mc", "com.yandex.metrica.impl.ac.HandlerRunner");
                bundle.putString("arg_akp", c2872k8B.d.a);
                bundle.putString("arg_lp", c2872k8B.d.b);
                bundle.putString("arg_dp", c2872k8B.d.c);
            }
            um.b(bundle);
        }
    }

    public C2823i8(Context context, U3 u3, C2773g8 c2773g8, Um<Bundle> um, C2922m8 c2922m8, C3022q8 c3022q8, Vm<Void, String> vm) {
        this.a = context;
        this.b = u3;
        this.c = c2773g8;
        this.d = um;
        this.e = c2922m8;
        this.f = c3022q8;
        this.g = vm;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void a(boolean z) {
        CrashpadHelper.logsEnabled(z);
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void a(String str) {
        this.f.a(str);
        CrashpadHelper.updateRuntimeConfig(this.f.a());
    }
}
