package defpackage;

import android.content.Context;
import java.util.Arrays;

/* renamed from: dU1 */
/* loaded from: classes.dex */
public abstract class AbstractC3401dU1 {
    public static Context a;

    public static final void a(P81 p81, C2081a91 c2081a91, String str) {
        C2272b91.i.fine(c2081a91.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + p81.a);
    }

    public static final String b(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? NX.i(new StringBuilder(), (j - 500000000) / 1000000000, " s ") : j <= -999500 ? NX.i(new StringBuilder(), (j - 500000) / 1000000, " ms") : j <= 0 ? NX.i(new StringBuilder(), (j - 500) / 1000, " µs") : j < 999500 ? NX.i(new StringBuilder(), (j + 500) / 1000, " µs") : j < 999500000 ? NX.i(new StringBuilder(), (j + 500000) / 1000000, " ms") : NX.i(new StringBuilder(), (j + 500000000) / 1000000000, " s ")}, 1));
    }
}
