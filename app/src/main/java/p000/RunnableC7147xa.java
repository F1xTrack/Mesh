package p000;

import android.os.Build;
import com.p018my.tracker.obfuscated.C2313f0;
import com.p018my.tracker.obfuscated.C2386x1;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: xa */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7147xa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f45681a;

    /* renamed from: b */
    public final /* synthetic */ long f45682b;

    /* renamed from: c */
    public final /* synthetic */ Object f45683c;

    public /* synthetic */ RunnableC7147xa(Object obj, long j, int i) {
        this.f45681a = i;
        this.f45683c = obj;
        this.f45682b = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        String strM23503a;
        long j = this.f45682b;
        Object obj = this.f45683c;
        switch (this.f45681a) {
            case 0:
                CC0 cc0 = (CC0) obj;
                cc0.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a.f13736r;
                C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                c7251zE.m26334Q(c1514y3M26333P, 1010, new C4262il(c1514y3M26333P, j));
                break;
            case 1:
                C9187e11 c9187e11 = (C9187e11) obj;
                c9187e11.getClass();
                Calendar calendarM23525f = AbstractC10554oh1.m23525f();
                Calendar calendarM23526g = AbstractC10554oh1.m23526g(null);
                calendarM23526g.setTimeInMillis(j);
                if (calendarM23525f.get(1) == calendarM23526g.get(1)) {
                    Locale locale = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        strM23503a = AbstractC10554oh1.m23522c("MMMd", locale).format(new Date(j));
                    } else {
                        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) AbstractC10554oh1.m23524e(2, locale);
                        String pattern = simpleDateFormat.toPattern();
                        int iM23521b = AbstractC10554oh1.m23521b(1, pattern, 0, "yY");
                        if (iM23521b < pattern.length()) {
                            int iM23521b2 = AbstractC10554oh1.m23521b(1, pattern, iM23521b, "EMd");
                            pattern = pattern.replace(pattern.substring(AbstractC10554oh1.m23521b(-1, pattern, iM23521b, iM23521b2 < pattern.length() ? "EMd," : "EMd") + 1, iM23521b2), " ").trim();
                        }
                        simpleDateFormat.applyPattern(pattern);
                        strM23503a = simpleDateFormat.format(new Date(j));
                    }
                } else {
                    strM23503a = AbstractC10538oZ1.m23503a(j);
                }
                c9187e11.f26491a.setError(String.format(c9187e11.f26495e, strM23503a.replace(' ', (char) 160)));
                c9187e11.f26500j.getError();
                c9187e11.f26501k.getClass();
                c9187e11.f26499i.m21929a();
                break;
            case 2:
                ((C2313f0) obj).m12985a(j);
                break;
            case 3:
                ((AppComponentsBreadcrumbsIntegration) obj).m21508a(j, null);
                break;
            default:
                ((C2386x1) obj).m13539b(j);
                break;
        }
    }
}
