package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.ReactApplicationContext;
import com.learnium.RNDeviceInfo.RNDeviceModule;

/* renamed from: pJ */
/* loaded from: classes2.dex */
public final class C6609pJ {

    /* renamed from: a */
    public final ReactApplicationContext f40016a;

    public C6609pJ(ReactApplicationContext reactApplicationContext) {
        this.f40016a = reactApplicationContext;
    }

    /* renamed from: a */
    public static String m23722a() {
        Object objInvoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getDeclaredMethod("getInstance", null).invoke(null, null);
        return (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
    }

    /* renamed from: b */
    public final String m23723b() {
        Object objInvoke = Class.forName("com.google.android.gms.iid.InstanceID").getDeclaredMethod("getInstance", Context.class).invoke(null, this.f40016a.getApplicationContext());
        return (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
    }

    /* renamed from: c */
    public final void m23724c(String str) {
        SharedPreferences.Editor editorEdit = RNDeviceModule.getRNDISharedPreferences(this.f40016a).edit();
        editorEdit.putString("instanceId", str);
        editorEdit.apply();
    }
}
