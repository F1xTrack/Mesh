package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.utils.PushPreferences;
import java.util.Map;
import p000.AbstractC0852NX;

/* renamed from: com.huawei.hms.opendevice.i */
/* loaded from: classes.dex */
public class C2205i extends PushPreferences {

    /* renamed from: c */
    private static final String f19338c = "i";

    /* renamed from: b */
    private Context f19339b;

    private C2205i(Context context) {
        super(context, "push_client_self_info");
        this.f19339b = context;
    }

    /* renamed from: a */
    public static C2205i m12355a(Context context) {
        return new C2205i(context);
    }

    /* renamed from: b */
    public String m12359b(String str) {
        try {
            return TextUtils.isEmpty(str) ? m12356a("token_info_v2") : m12356a(str);
        } catch (Exception e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("getSecureData"), f19338c);
            return "";
        }
    }

    /* renamed from: c */
    public boolean m12361c(String str) {
        try {
            return TextUtils.isEmpty(str) ? removeKey("token_info_v2") : removeKey(str);
        } catch (Exception e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("removeToken"), f19338c);
            return false;
        }
    }

    /* renamed from: a */
    public String m12356a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return PushEncrypter.decrypter(this.f19339b, getString(str));
        } catch (Exception e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("getSecureData"), f19338c);
            return "";
        }
    }

    /* renamed from: a */
    public boolean m12358a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return saveString(str, PushEncrypter.encrypter(this.f19339b, str2));
        } catch (Exception e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("saveSecureData"), f19338c);
            return false;
        }
    }

    /* renamed from: b */
    public boolean m12360b(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return m12358a("token_info_v2", str2);
            }
            return m12358a(str, str2);
        } catch (Exception e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("saveSecureData"), f19338c);
            return false;
        }
    }

    /* renamed from: a */
    public void m12357a() {
        Map<String, ?> all = getAll();
        if (all.isEmpty() || all.keySet().isEmpty()) {
            return;
        }
        for (String str : all.keySet()) {
            if (!"push_kit_auto_init_enabled".equals(str) && !"_proxy_init".equals(str)) {
                removeKey(str);
            }
        }
    }
}
