package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.metrica.impl.p021ac.CrashpadHelper;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i8 */
/* loaded from: classes2.dex */
public class C3332i8 implements InterfaceC2923S7 {

    /* renamed from: a */
    private final Context f23627a;

    /* renamed from: b */
    private final C2969U3 f23628b;

    /* renamed from: c */
    private C3280g8 f23629c;

    /* renamed from: d */
    private final InterfaceC2988Um<Bundle> f23630d;

    /* renamed from: e */
    private final C3436m8 f23631e;

    /* renamed from: f */
    private final C3540q8 f23632f;

    /* renamed from: g */
    private final InterfaceC3013Vm<Void, String> f23633g;

    /* renamed from: com.yandex.metrica.impl.ob.i8$a */
    public class a implements InterfaceC2988Um<Bundle> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(Bundle bundle) {
            CrashpadHelper.setUpNativeUncaughtExceptionHandler(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.i8$b */
    public class b implements InterfaceC3013Vm<Void, String> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public String mo13948a(Void r1) {
            return CrashpadHelper.getLibraryVersion();
        }
    }

    public C3332i8(Context context, C2969U3 c2969u3) {
        this(context, c2969u3, new C2742L0(), new a());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: a */
    public String mo15107a() {
        return "appmetrica_native_crashes";
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: b */
    public void mo15111b() {
        CrashpadHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: c */
    public String mo15112c() {
        return "appmetrica-native";
    }

    private C3332i8(Context context, C2969U3 c2969u3, C2742L0 c2742l0, InterfaceC2988Um<Bundle> interfaceC2988Um) {
        this(context, c2969u3, new C3280g8(context, c2742l0, C3065Y.m15442g().m15446d().m16638b()), interfaceC2988Um, new C3436m8(), new C3540q8(), new b());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: a */
    public void mo15109a(String str, String str2, String str3) {
        C3384k8 c3384k8M15987b = this.f23629c.m15987b();
        if (c3384k8M15987b != null) {
            if (TextUtils.isEmpty(c3384k8M15987b.f23912a) && c3384k8M15987b.f23915d == null) {
                return;
            }
            this.f23632f.m16604a(str3);
            String strEncodeToString = null;
            this.f23632f.m16605b(this.f23633g.mo13948a(null));
            InterfaceC2988Um<Bundle> interfaceC2988Um = this.f23630d;
            String strM16603a = this.f23632f.m16603a();
            Bundle bundle = new Bundle();
            C3436m8 c3436m8 = this.f23631e;
            C2969U3 c2969u3 = this.f23628b;
            c3436m8.getClass();
            try {
                strEncodeToString = Base64.encodeToString(new JSONObject().put("arg_cd", new JSONObject().put("arg_ak", str).put("arg_pn", c2969u3.m15264f()).put("arg_pd", c2969u3.m15265g()).put("arg_ps", c2969u3.m15266h()).put("arg_rt", "main")).toString().getBytes(), 0);
            } catch (Throwable unused) {
            }
            bundle.putString("arg_cd", strEncodeToString);
            bundle.putString("arg_rc", strM16603a);
            bundle.putString("arg_dd", str2);
            bundle.putString("arg_hp", c3384k8M15987b.f23912a);
            bundle.putBoolean("arg_i64", c3384k8M15987b.f23913b);
            bundle.putBoolean("arg_ul", c3384k8M15987b.f23914c);
            bundle.putString("arg_sn", this.f23627a.getPackageName() + "-crashpad_new_crash_socket");
            if (c3384k8M15987b.f23915d == null) {
                bundle.putBoolean("arg_ap", false);
            } else {
                bundle.putBoolean("arg_ap", true);
                Objects.requireNonNull(c3384k8M15987b.f23915d);
                bundle.putString("arg_mc", "com.yandex.metrica.impl.ac.HandlerRunner");
                bundle.putString("arg_akp", c3384k8M15987b.f23915d.f22777a);
                bundle.putString("arg_lp", c3384k8M15987b.f23915d.f22778b);
                bundle.putString("arg_dp", c3384k8M15987b.f23915d.f22779c);
            }
            interfaceC2988Um.mo13904b(bundle);
        }
    }

    public C3332i8(Context context, C2969U3 c2969u3, C3280g8 c3280g8, InterfaceC2988Um<Bundle> interfaceC2988Um, C3436m8 c3436m8, C3540q8 c3540q8, InterfaceC3013Vm<Void, String> interfaceC3013Vm) {
        this.f23627a = context;
        this.f23628b = c2969u3;
        this.f23629c = c3280g8;
        this.f23630d = interfaceC2988Um;
        this.f23631e = c3436m8;
        this.f23632f = c3540q8;
        this.f23633g = interfaceC3013Vm;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: a */
    public void mo15110a(boolean z) {
        CrashpadHelper.logsEnabled(z);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2923S7
    /* renamed from: a */
    public void mo15108a(String str) {
        this.f23632f.m16604a(str);
        CrashpadHelper.updateRuntimeConfig(this.f23632f.m16603a());
    }
}
