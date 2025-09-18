package p000;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: Av1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7357Av1 {

    /* renamed from: a */
    public final String f470a;

    public C7357Av1(String str) {
        this.f470a = AbstractC7222ym.m26233j("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat(str);
    }

    /* renamed from: b */
    public static String m408b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC1374Vq.m8589h(str, " : ", str2);
    }

    /* renamed from: a */
    public final void m409a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            m408b(this.f470a, str, objArr);
        }
    }
}
