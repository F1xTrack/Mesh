package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: mc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5918mc0 implements InterfaceC1368Rh1 {
    public static final SimpleDateFormat a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // defpackage.InterfaceC2505cO
    public final void a(Object obj, Object obj2) {
        ((InterfaceC1446Sh1) obj2).b(a.format((Date) obj));
    }
}
