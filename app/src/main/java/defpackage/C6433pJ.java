package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.ReactApplicationContext;
import com.learnium.RNDeviceInfo.RNDeviceModule;

/* renamed from: pJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6433pJ {
    public final ReactApplicationContext a;

    public C6433pJ(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
    }

    public static String a() {
        Object objInvoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getDeclaredMethod("getInstance", null).invoke(null, null);
        return (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
    }

    public final String b() {
        Object objInvoke = Class.forName("com.google.android.gms.iid.InstanceID").getDeclaredMethod("getInstance", Context.class).invoke(null, this.a.getApplicationContext());
        return (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
    }

    public final void c(String str) {
        SharedPreferences.Editor editorEdit = RNDeviceModule.getRNDISharedPreferences(this.a).edit();
        editorEdit.putString("instanceId", str);
        editorEdit.apply();
    }
}
