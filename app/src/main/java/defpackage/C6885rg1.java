package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: rg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6885rg1 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
    }
}
