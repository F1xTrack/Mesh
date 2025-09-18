package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class CT implements D90 {
    public static EnumSet c(Context context, String str) throws IOException {
        EnumSet enumSetNoneOf;
        Object next;
        OA0 oa0 = OA0.b;
        OA0 oa02 = OA0.a;
        O90.f(context, "context");
        O90.f(str, "path");
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            Iterator it = AbstractC8259yu.f(context.getFilesDir().getCanonicalPath(), context.getCacheDir().getCanonicalPath()).iterator();
            while (true) {
                enumSetNoneOf = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str2 = (String) next;
                O90.c(canonicalPath);
                if (D51.o(canonicalPath, str2 + "/", false) || O90.a(str2, canonicalPath)) {
                    break;
                }
            }
            if (((String) next) != null) {
                enumSetNoneOf = EnumSet.of(oa02, oa0);
            }
        } catch (IOException unused) {
            enumSetNoneOf = EnumSet.noneOf(OA0.class);
        }
        if (enumSetNoneOf == null) {
            File file = new File(str);
            enumSetNoneOf = EnumSet.noneOf(OA0.class);
            if (file.canRead()) {
                enumSetNoneOf.add(oa02);
            }
            if (file.canWrite()) {
                enumSetNoneOf.add(oa0);
            }
            O90.e(enumSetNoneOf, "apply(...)");
        }
        return enumSetNoneOf;
    }

    @Override // defpackage.D90
    public final List a() {
        return AbstractC8259yu.e(CT.class);
    }

    @Override // defpackage.D90
    public final /* synthetic */ void b(C0777Js0 c0777Js0) {
    }

    @Override // defpackage.D90
    public final /* synthetic */ void onDestroy() {
    }
}
