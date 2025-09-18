package defpackage;

import android.os.Build;
import com.my.tracker.obfuscated.f0;
import com.my.tracker.obfuscated.x1;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8009xa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC8009xa(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        String strA;
        long j = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                CC0 cc0 = (CC0) obj;
                cc0.getClass();
                int i = AbstractC0277Dh1.a;
                C8323zE c8323zE = ((UQ) cc0.c).a.r;
                Y3 y3P = c8323zE.P();
                c8323zE.Q(y3P, 1010, new C4403il(y3P, j));
                break;
            case 1:
                C3501e11 c3501e11 = (C3501e11) obj;
                c3501e11.getClass();
                Calendar calendarF = AbstractC6316oh1.f();
                Calendar calendarG = AbstractC6316oh1.g(null);
                calendarG.setTimeInMillis(j);
                if (calendarF.get(1) == calendarG.get(1)) {
                    Locale locale = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        strA = AbstractC6316oh1.c("MMMd", locale).format(new Date(j));
                    } else {
                        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) AbstractC6316oh1.e(2, locale);
                        String pattern = simpleDateFormat.toPattern();
                        int iB = AbstractC6316oh1.b(1, pattern, 0, "yY");
                        if (iB < pattern.length()) {
                            int iB2 = AbstractC6316oh1.b(1, pattern, iB, "EMd");
                            pattern = pattern.replace(pattern.substring(AbstractC6316oh1.b(-1, pattern, iB, iB2 < pattern.length() ? "EMd," : "EMd") + 1, iB2), " ").trim();
                        }
                        simpleDateFormat.applyPattern(pattern);
                        strA = simpleDateFormat.format(new Date(j));
                    }
                } else {
                    strA = AbstractC6292oZ1.a(j);
                }
                c3501e11.a.setError(String.format(c3501e11.e, strA.replace(' ', (char) 160)));
                c3501e11.j.getError();
                c3501e11.k.getClass();
                c3501e11.i.a();
                break;
            case 2:
                ((f0) obj).a(j);
                break;
            case 3:
                ((AppComponentsBreadcrumbsIntegration) obj).a(j, null);
                break;
            default:
                ((x1) obj).b(j);
                break;
        }
    }
}
