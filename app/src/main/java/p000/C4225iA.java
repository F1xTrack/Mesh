package p000;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: iA */
/* loaded from: classes.dex */
public final /* synthetic */ class C4225iA implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ int f28864a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f28864a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
