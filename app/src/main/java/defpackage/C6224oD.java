package defpackage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: oD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6224oD extends AbstractC7067sd1 {
    public static final E8 c = new E8(1);
    public final /* synthetic */ int a = 0;
    public final Object b;

    public C6224oD() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC0570Hb0.a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException {
        String str;
        switch (this.a) {
            case 0:
                Date date = (Date) obj;
                if (date == null) {
                    c0885Lc0.J();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                synchronized (((ArrayList) this.b)) {
                    str = dateFormat.format(date);
                }
                c0885Lc0.d0(str);
                return;
            default:
                ((C8210yd1) this.b).c.a(c0885Lc0, obj);
                return;
        }
    }

    public C6224oD(C8210yd1 c8210yd1) {
        this.b = c8210yd1;
    }
}
