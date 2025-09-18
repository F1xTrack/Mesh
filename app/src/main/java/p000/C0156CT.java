package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: CT */
/* loaded from: classes2.dex */
public final class C0156CT implements D90 {
    /* renamed from: c */
    public static EnumSet m1190c(Context context, String str) throws IOException {
        EnumSet enumSetNoneOf;
        Object next;
        OA0 oa0 = OA0.f8265b;
        OA0 oa02 = OA0.f8264a;
        O90.m5968f(context, "context");
        O90.m5968f(str, "path");
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            Iterator it = AbstractC7230yu.m26275f(context.getFilesDir().getCanonicalPath(), context.getCacheDir().getCanonicalPath()).iterator();
            while (true) {
                enumSetNoneOf = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str2 = (String) next;
                O90.m5965c(canonicalPath);
                if (D51.m1556o(canonicalPath, str2 + "/", false) || O90.m5963a(str2, canonicalPath)) {
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
            O90.m5967e(enumSetNoneOf, "apply(...)");
        }
        return enumSetNoneOf;
    }

    @Override // p000.D90
    /* renamed from: a */
    public final List mo174a() {
        return AbstractC7230yu.m26274e(C0156CT.class);
    }

    @Override // p000.D90
    /* renamed from: b */
    public final /* synthetic */ void mo175b(C7818Js0 c7818Js0) {
    }

    @Override // p000.D90
    public final /* synthetic */ void onDestroy() {
    }
}
