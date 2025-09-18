package defpackage;

import io.sentry.AbstractC5149o;
import io.sentry.android.replay.j;
import io.sentry.android.replay.k;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class GT implements FilenameFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ GT(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith((String) this.b);
            case 1:
                return ((AbstractC5149o) this.b).a(str);
            default:
                j jVar = (j) this.b;
                O90.e(str, "name");
                if (!D51.i(str, ".jpg")) {
                    return false;
                }
                File file2 = new File(file, str);
                String name = file2.getName();
                O90.e(name, "getName(...)");
                Long lG = C51.g(AbstractC7538v51.W(name, name));
                if (lG == null) {
                    return false;
                }
                jVar.g.add(new k(file2, lG.longValue(), null));
                return false;
        }
    }
}
