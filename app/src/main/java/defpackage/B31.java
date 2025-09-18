package defpackage;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class B31 extends AbstractC6876rd1 {
    public static final D8 c = new D8(2);
    public static final D8 d = new D8(3);
    public static final D8 e = new D8(1);
    public final /* synthetic */ int a;
    public final Object b;

    public B31(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                Locale locale = Locale.US;
                arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
                if (!Locale.getDefault().equals(locale)) {
                    arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                }
                if (AbstractC0492Gb0.a >= 9) {
                    arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
                    break;
                }
                break;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    private final Object c(C8206yc0 c8206yc0) {
        Date date;
        if (c8206yc0.p0() == 9) {
            c8206yc0.i0();
            return null;
        }
        String strN0 = c8206yc0.n0();
        try {
            synchronized (this) {
                date = ((SimpleDateFormat) this.b).parse(strN0);
            }
            return new java.sql.Date(date.getTime());
        } catch (ParseException e2) {
            StringBuilder sbQ = AbstractC8235ym.q("Failed parsing '", strN0, "' as SQL Date; at path ");
            sbQ.append(c8206yc0.D(true));
            throw new C6682qc0(sbQ.toString(), e2);
        }
    }

    private final Object d(C8206yc0 c8206yc0) {
        Time time;
        if (c8206yc0.p0() == 9) {
            c8206yc0.i0();
            return null;
        }
        String strN0 = c8206yc0.n0();
        try {
            synchronized (this) {
                time = new Time(((SimpleDateFormat) this.b).parse(strN0).getTime());
            }
            return time;
        } catch (ParseException e2) {
            StringBuilder sbQ = AbstractC8235ym.q("Failed parsing '", strN0, "' as SQL Time; at path ");
            sbQ.append(c8206yc0.D(true));
            throw new C6682qc0(sbQ.toString(), e2);
        }
    }

    private final void e(C0807Kc0 c0807Kc0, Object obj) throws IOException {
        String str;
        java.sql.Date date = (java.sql.Date) obj;
        if (date == null) {
            c0807Kc0.J();
            return;
        }
        synchronized (this) {
            str = ((SimpleDateFormat) this.b).format((Date) date);
        }
        c0807Kc0.d0(str);
    }

    private final void f(C0807Kc0 c0807Kc0, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c0807Kc0.J();
            return;
        }
        synchronized (this) {
            str = ((SimpleDateFormat) this.b).format((Date) time);
        }
        c0807Kc0.d0(str);
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) {
        Date dateB;
        switch (this.a) {
            case 0:
                return c(c8206yc0);
            case 1:
                return d(c8206yc0);
            default:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                String strN0 = c8206yc0.n0();
                synchronized (((ArrayList) this.b)) {
                    try {
                        Iterator it = ((ArrayList) this.b).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                try {
                                    dateB = ((DateFormat) it.next()).parse(strN0);
                                } catch (ParseException unused) {
                                }
                            } else {
                                try {
                                    dateB = H50.b(strN0, new ParsePosition(0));
                                } catch (ParseException e2) {
                                    StringBuilder sbQ = AbstractC8235ym.q("Failed parsing '", strN0, "' as Date; at path ");
                                    sbQ.append(c8206yc0.D(true));
                                    throw new C6682qc0(sbQ.toString(), e2);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return dateB;
        }
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) throws IOException {
        String str;
        switch (this.a) {
            case 0:
                e(c0807Kc0, obj);
                return;
            case 1:
                f(c0807Kc0, obj);
                return;
            default:
                Date date = (Date) obj;
                if (date == null) {
                    c0807Kc0.J();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                synchronized (((ArrayList) this.b)) {
                    str = dateFormat.format(date);
                }
                c0807Kc0.d0(str);
                return;
        }
    }
}
