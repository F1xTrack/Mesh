package p000;

import io.sentry.AbstractC6070o;
import io.sentry.android.replay.C5950j;
import io.sentry.android.replay.C5951k;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: GT */
/* loaded from: classes.dex */
public final /* synthetic */ class C0408GT implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ int f3755a;

    /* renamed from: b */
    public final /* synthetic */ Object f3756b;

    public /* synthetic */ C0408GT(int i, Object obj) {
        this.f3755a = i;
        this.f3756b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f3755a) {
            case 0:
                return str.startsWith((String) this.f3756b);
            case 1:
                return ((AbstractC6070o) this.f3756b).mo21359a(str);
            default:
                C5950j c5950j = (C5950j) this.f3756b;
                O90.m5967e(str, "name");
                if (!D51.m1550i(str, ".jpg")) {
                    return false;
                }
                File file2 = new File(file, str);
                String name = file2.getName();
                O90.m5967e(name, "getName(...)");
                Long lM980g = C51.m980g(AbstractC11374v51.m25348W(name, name));
                if (lM980g == null) {
                    return false;
                }
                c5950j.f33994g.add(new C5951k(file2, lM980g.longValue(), null));
                return false;
        }
    }
}
