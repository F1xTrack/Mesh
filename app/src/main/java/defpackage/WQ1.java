package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class WQ1 {
    public static final C6082nT0 a(Context context, String str, Class cls) {
        O90.f(context, "context");
        if (AbstractC7538v51.C(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new C6082nT0(context, str, cls);
    }
}
