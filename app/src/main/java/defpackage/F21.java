package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class F21 extends G21 {
    public static F21 a(String str, Context context, H21[] h21Arr) {
        StringBuilder sbQ = AbstractC8235ym.q("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < h21Arr.length; i++) {
            sbQ.append("\n\t\tSoSource ");
            sbQ.append(i);
            sbQ.append(": ");
            sbQ.append(h21Arr[i].toString());
        }
        if (context != null) {
            sbQ.append("\n\tNative lib dir: ");
            sbQ.append(context.getApplicationInfo().nativeLibraryDir);
            sbQ.append("\n");
        }
        return new F21(str, sbQ.toString());
    }
}
