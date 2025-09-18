package defpackage;

import android.os.Build;

/* renamed from: fE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3734fE1 {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
