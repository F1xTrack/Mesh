package p000;

import android.content.Context;
import android.os.UserManager;

/* renamed from: nh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10426nh1 {
    /* renamed from: a */
    public static boolean m23170a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
