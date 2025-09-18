package p000;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class WQ1 {
    /* renamed from: a */
    public static final C10397nT0 m8759a(Context context, String str, Class cls) {
        O90.m5968f(context, "context");
        if (AbstractC11374v51.m25328C(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new C10397nT0(context, str, cls);
    }
}
