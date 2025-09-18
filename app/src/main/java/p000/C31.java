package p000;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public final class C31 extends AbstractC11058sd1 {

    /* renamed from: c */
    public static final C0261E8 f1161c = new C0261E8(3);

    /* renamed from: d */
    public static final C0261E8 f1162d = new C0261E8(4);

    /* renamed from: a */
    public final /* synthetic */ int f1163a;

    /* renamed from: b */
    public final SimpleDateFormat f1164b;

    public C31(int i) {
        this.f1163a = i;
        switch (i) {
            case 1:
                this.f1164b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f1164b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    /* renamed from: b */
    private final void m966b(C7890Lc0 c7890Lc0, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c7890Lc0.m5034J();
            return;
        }
        synchronized (this) {
            str = this.f1164b.format((java.util.Date) date);
        }
        c7890Lc0.m5040d0(str);
    }

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException {
        String str;
        switch (this.f1163a) {
            case 0:
                m966b(c7890Lc0, obj);
                return;
            default:
                Time time = (Time) obj;
                if (time == null) {
                    c7890Lc0.m5034J();
                    return;
                }
                synchronized (this) {
                    str = this.f1164b.format((java.util.Date) time);
                }
                c7890Lc0.m5040d0(str);
                return;
        }
    }
}
