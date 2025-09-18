package p000;

import android.content.Context;
import java.util.Arrays;

/* renamed from: dU1 */
/* loaded from: classes.dex */
public abstract class AbstractC9120dU1 {

    /* renamed from: a */
    public static Context f26123a;

    /* renamed from: a */
    public static final void m17691a(P81 p81, C8689a91 c8689a91, String str) {
        C8817b91.f16829i.fine(c8689a91.f15334b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + p81.f8871a);
    }

    /* renamed from: b */
    public static final String m17692b(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? AbstractC0852NX.m5760i(new StringBuilder(), (j - 500000000) / 1000000000, " s ") : j <= -999500 ? AbstractC0852NX.m5760i(new StringBuilder(), (j - 500000) / 1000000, " ms") : j <= 0 ? AbstractC0852NX.m5760i(new StringBuilder(), (j - 500) / 1000, " µs") : j < 999500 ? AbstractC0852NX.m5760i(new StringBuilder(), (j + 500) / 1000, " µs") : j < 999500000 ? AbstractC0852NX.m5760i(new StringBuilder(), (j + 500000) / 1000000, " ms") : AbstractC0852NX.m5760i(new StringBuilder(), (j + 500000000) / 1000000000, " s ")}, 1));
    }
}
