package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class P01 extends AbstractC5371jl {
    public static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Removed duplicated region for block: B:90:0x009d A[PHI: r2
  0x009d: PHI (r2v16 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:88:0x0093, B:84:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.P01 b(java.io.File r16, long r17, long r19, defpackage.C1241Pr0 r21) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.P01.b(java.io.File, long, long, Pr0):P01");
    }

    public static File c(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, NX.i(sb, j2, ".v3.exo"));
    }
}
