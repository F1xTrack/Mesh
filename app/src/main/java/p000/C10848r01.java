package p000;

import android.content.Context;
import java.util.UUID;

/* renamed from: r01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10848r01 {

    /* renamed from: b */
    public static final C6853sv f41282b;

    /* renamed from: a */
    public final Context f41283a;

    static {
        C6790rv c6790rvM24810b = C6853sv.m24810b(C10848r01.class);
        c6790rvM24810b.m24548a(C1087RH.m6929c(C8906bs0.class));
        c6790rvM24810b.m24548a(C1087RH.m6929c(Context.class));
        c6790rvM24810b.f42157g = new C10500oG1(4);
        f41282b = c6790rvM24810b.m24549b();
    }

    public C10848r01(Context context) {
        this.f41283a = context;
    }

    /* renamed from: a */
    public final synchronized String m24142a() {
        String string = this.f41283a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f41283a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
