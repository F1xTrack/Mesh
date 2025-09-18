package defpackage;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public final class C31 extends AbstractC7067sd1 {
    public static final E8 c = new E8(3);
    public static final E8 d = new E8(4);
    public final /* synthetic */ int a;
    public final SimpleDateFormat b;

    public C31(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    private final void b(C0885Lc0 c0885Lc0, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c0885Lc0.J();
            return;
        }
        synchronized (this) {
            str = this.b.format((java.util.Date) date);
        }
        c0885Lc0.d0(str);
    }

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException {
        String str;
        switch (this.a) {
            case 0:
                b(c0885Lc0, obj);
                return;
            default:
                Time time = (Time) obj;
                if (time == null) {
                    c0885Lc0.J();
                    return;
                }
                synchronized (this) {
                    str = this.b.format((java.util.Date) time);
                }
                c0885Lc0.d0(str);
                return;
        }
    }
}
