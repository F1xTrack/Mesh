package p000;

import android.content.Context;
import java.util.HashMap;

/* renamed from: Ow */
/* loaded from: classes.dex */
public final class C0940Ow {

    /* renamed from: c */
    public static final HashMap f8689c = new HashMap();

    /* renamed from: a */
    public final Context f8690a;

    /* renamed from: b */
    public final String f8691b;

    public C0940Ow(Context context, String str) {
        this.f8690a = context;
        this.f8691b = str;
    }

    /* renamed from: a */
    public final synchronized void m6186a() {
        this.f8690a.deleteFile(this.f8691b);
    }
}
