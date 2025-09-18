package defpackage;

import android.content.Context;
import java.util.HashMap;

/* renamed from: Ow, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177Ow {
    public static final HashMap c = new HashMap();
    public final Context a;
    public final String b;

    public C1177Ow(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final synchronized void a() {
        this.a.deleteFile(this.b);
    }
}
