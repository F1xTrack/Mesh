package p000;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: oD */
/* loaded from: classes.dex */
public final class C6538oD extends AbstractC11058sd1 {

    /* renamed from: c */
    public static final C0261E8 f38886c = new C0261E8(1);

    /* renamed from: a */
    public final /* synthetic */ int f38887a = 0;

    /* renamed from: b */
    public final Object f38888b;

    public C6538oD() {
        ArrayList arrayList = new ArrayList();
        this.f38888b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC7680Hb0.f4358a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException {
        String str;
        switch (this.f38887a) {
            case 0:
                Date date = (Date) obj;
                if (date == null) {
                    c7890Lc0.m5034J();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f38888b).get(0);
                synchronized (((ArrayList) this.f38888b)) {
                    str = dateFormat.format(date);
                }
                c7890Lc0.m5040d0(str);
                return;
            default:
                ((C11823yd1) this.f38888b).f46366c.mo246a(c7890Lc0, obj);
                return;
        }
    }

    public C6538oD(C11823yd1 c11823yd1) {
        this.f38888b = c11823yd1;
    }
}
