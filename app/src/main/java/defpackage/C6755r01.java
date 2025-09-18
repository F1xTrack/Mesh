package defpackage;

import android.content.Context;
import java.util.UUID;

/* renamed from: r01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6755r01 {
    public static final C7119sv b;
    public final Context a;

    static {
        C6928rv c6928rvB = C7119sv.b(C6755r01.class);
        c6928rvB.a(RH.c(C2406bs0.class));
        c6928rvB.a(RH.c(Context.class));
        c6928rvB.g = new C6235oG1(4);
        b = c6928rvB.b();
    }

    public C6755r01(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
