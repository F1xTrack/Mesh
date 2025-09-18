package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: mc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10287mc0 implements InterfaceC8213Rh1 {

    /* renamed from: a */
    public static final SimpleDateFormat f37792a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f37792a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // p000.InterfaceC1844cO
    /* renamed from: a */
    public final void mo104a(Object obj, Object obj2) {
        ((InterfaceC8265Sh1) obj2).mo4360b(f37792a.format((Date) obj));
    }
}
