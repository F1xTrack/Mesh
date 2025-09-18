package defpackage;

import android.content.Context;
import android.os.UserManager;

/* renamed from: nh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6125nh1 {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
