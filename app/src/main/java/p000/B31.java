package p000;

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
public final class B31 extends AbstractC10930rd1 {

    /* renamed from: c */
    public static final C0198D8 f530c = new C0198D8(2);

    /* renamed from: d */
    public static final C0198D8 f531d = new C0198D8(3);

    /* renamed from: e */
    public static final C0198D8 f532e = new C0198D8(1);

    /* renamed from: a */
    public final /* synthetic */ int f533a;

    /* renamed from: b */
    public final Object f534b;

    public B31(int i) {
        this.f533a = i;
        switch (i) {
            case 1:
                this.f534b = new SimpleDateFormat("hh:mm:ss a");
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f534b = arrayList;
                Locale locale = Locale.US;
                arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
                if (!Locale.getDefault().equals(locale)) {
                    arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                }
                if (AbstractC7628Gb0.f3815a >= 9) {
                    arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
                    break;
                }
                break;
            default:
                this.f534b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    /* renamed from: c */
    private final Object m476c(C11820yc0 c11820yc0) {
        Date date;
        if (c11820yc0.m26194p0() == 9) {
            c11820yc0.m26186i0();
            return null;
        }
        String strM26190n0 = c11820yc0.m26190n0();
        try {
            synchronized (this) {
                date = ((SimpleDateFormat) this.f534b).parse(strM26190n0);
            }
            return new java.sql.Date(date.getTime());
        } catch (ParseException e) {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("Failed parsing '", strM26190n0, "' as SQL Date; at path ");
            sbM26240q.append(c11820yc0.m26176D(true));
            throw new C10799qc0(sbM26240q.toString(), e);
        }
    }

    /* renamed from: d */
    private final Object m477d(C11820yc0 c11820yc0) {
        Time time;
        if (c11820yc0.m26194p0() == 9) {
            c11820yc0.m26186i0();
            return null;
        }
        String strM26190n0 = c11820yc0.m26190n0();
        try {
            synchronized (this) {
                time = new Time(((SimpleDateFormat) this.f534b).parse(strM26190n0).getTime());
            }
            return time;
        } catch (ParseException e) {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("Failed parsing '", strM26190n0, "' as SQL Time; at path ");
            sbM26240q.append(c11820yc0.m26176D(true));
            throw new C10799qc0(sbM26240q.toString(), e);
        }
    }

    /* renamed from: e */
    private final void m478e(C7838Kc0 c7838Kc0, Object obj) throws IOException {
        String str;
        java.sql.Date date = (java.sql.Date) obj;
        if (date == null) {
            c7838Kc0.m4680J();
            return;
        }
        synchronized (this) {
            str = ((SimpleDateFormat) this.f534b).format((Date) date);
        }
        c7838Kc0.m4686d0(str);
    }

    /* renamed from: f */
    private final void m479f(C7838Kc0 c7838Kc0, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c7838Kc0.m4680J();
            return;
        }
        synchronized (this) {
            str = ((SimpleDateFormat) this.f534b).format((Date) time);
        }
        c7838Kc0.m4686d0(str);
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) {
        Date dateM3263b;
        switch (this.f533a) {
            case 0:
                return m476c(c11820yc0);
            case 1:
                return m477d(c11820yc0);
            default:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                String strM26190n0 = c11820yc0.m26190n0();
                synchronized (((ArrayList) this.f534b)) {
                    try {
                        Iterator it = ((ArrayList) this.f534b).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                try {
                                    dateM3263b = ((DateFormat) it.next()).parse(strM26190n0);
                                } catch (ParseException unused) {
                                }
                            } else {
                                try {
                                    dateM3263b = H50.m3263b(strM26190n0, new ParsePosition(0));
                                } catch (ParseException e) {
                                    StringBuilder sbM26240q = AbstractC7222ym.m26240q("Failed parsing '", strM26190n0, "' as Date; at path ");
                                    sbM26240q.append(c11820yc0.m26176D(true));
                                    throw new C10799qc0(sbM26240q.toString(), e);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return dateM3263b;
        }
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) throws IOException {
        String str;
        switch (this.f533a) {
            case 0:
                m478e(c7838Kc0, obj);
                return;
            case 1:
                m479f(c7838Kc0, obj);
                return;
            default:
                Date date = (Date) obj;
                if (date == null) {
                    c7838Kc0.m4680J();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f534b).get(0);
                synchronized (((ArrayList) this.f534b)) {
                    str = dateFormat.format(date);
                }
                c7838Kc0.m4686d0(str);
                return;
        }
    }
}
