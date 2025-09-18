package defpackage;

import android.net.Uri;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ah1 */
/* loaded from: classes.dex */
public final class C2183ah1 implements InterfaceC7302ts0 {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", RemoteMessageConst.Notification.CONTENT)));
    public final Object a;

    public C2183ah1(C1989Zg1 c1989Zg1) {
        this.a = c1989Zg1;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.InterfaceC7302ts0
    public final C7111ss0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        KC c2079a9;
        Uri uri = (Uri) obj;
        C1958Yw0 c1958Yw0 = new C1958Yw0(uri);
        C1989Zg1 c1989Zg1 = (C1989Zg1) this.a;
        switch (c1989Zg1.a) {
            case 0:
                c2079a9 = new C2079a9(c1989Zg1.b, uri, 0);
                break;
            case 1:
                c2079a9 = new C2079a9(c1989Zg1.b, uri, 1);
                break;
            default:
                c2079a9 = new C3707f51(1, uri, c1989Zg1.b);
                break;
        }
        return new C7111ss0(c1958Yw0, c2079a9);
    }
}
