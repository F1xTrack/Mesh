package p000;

import android.content.Context;

/* loaded from: classes.dex */
public final class F21 extends G21 {
    /* renamed from: a */
    public static F21 m2489a(String str, Context context, H21[] h21Arr) {
        StringBuilder sbM26240q = AbstractC7222ym.m26240q("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < h21Arr.length; i++) {
            sbM26240q.append("\n\t\tSoSource ");
            sbM26240q.append(i);
            sbM26240q.append(": ");
            sbM26240q.append(h21Arr[i].toString());
        }
        if (context != null) {
            sbM26240q.append("\n\tNative lib dir: ");
            sbM26240q.append(context.getApplicationInfo().nativeLibraryDir);
            sbM26240q.append("\n");
        }
        return new F21(str, sbM26240q.toString());
    }
}
